package typings.three

import typings.three.anon.Beauty
import typings.three.examplesJsmObjectsReflectorForSSRPassMod.ReflectorForSSRPass
import typings.three.examplesJsmPostprocessingPassMod.FullScreenQuad
import typings.three.examplesJsmPostprocessingPassMod.Pass
import typings.three.srcThreeMod.BufferGeometry
import typings.three.srcThreeMod.Camera
import typings.three.srcThreeMod.Color
import typings.three.srcThreeMod.Material
import typings.three.srcThreeMod.Mesh
import typings.three.srcThreeMod.MeshBasicMaterial
import typings.three.srcThreeMod.MeshNormalMaterial
import typings.three.srcThreeMod.Scene
import typings.three.srcThreeMod.ShaderMaterial
import typings.three.srcThreeMod.WebGLRenderTarget
import typings.three.srcThreeMod.WebGLRenderer
import typings.three.srcUtilsMod.ColorRepresentation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmPostprocessingSsrpassMod {
  
  @JSImport("three/examples/jsm/postprocessing/SSRPass", "SSRPass")
  @js.native
  open class SSRPass protected () extends Pass {
    def this(params: SSRPassParams) = this()
    
    var beautyRenderTarget: WebGLRenderTarget = js.native
    
    var blur: Boolean = js.native
    
    var blurMaterial: ShaderMaterial = js.native
    
    var blurMaterial2: ShaderMaterial = js.native
    
    var blurRenderTarget: WebGLRenderTarget = js.native
    
    var blurRenderTarget2: WebGLRenderTarget = js.native
    
    var camera: Camera = js.native
    
    var copyMaterial: ShaderMaterial = js.native
    
    var depthRenderMaterial: ShaderMaterial = js.native
    
    var fsQuad: FullScreenQuad = js.native
    
    var groundReflector: ReflectorForSSRPass[BufferGeometry] | Null = js.native
    
    var height: Double = js.native
    
    def isBouncing: Boolean = js.native
    def isBouncing_=(`val`: Boolean): Unit = js.native
    
    def isDistanceAttenuation: Boolean = js.native
    def isDistanceAttenuation_=(`val`: Boolean): Unit = js.native
    
    def isFresnel: Boolean = js.native
    def isFresnel_=(`val`: Boolean): Unit = js.native
    
    def isInfiniteThick: Boolean = js.native
    def isInfiniteThick_=(`val`: Boolean): Unit = js.native
    
    var maxDistance: Double = js.native
    
    var metalnessOffMaterial: MeshBasicMaterial = js.native
    
    var metalnessOnMaterial: MeshBasicMaterial = js.native
    
    var metalnessRenderTarget: WebGLRenderTarget = js.native
    
    var normalMaterial: MeshNormalMaterial = js.native
    
    var normalRenderTarget: WebGLRenderTarget = js.native
    
    var opacity: Double = js.native
    
    var originalClearColor: Color = js.native
    
    var output: Double = js.native
    
    var prevRenderTarget: WebGLRenderTarget = js.native
    
    def renderMetalness(
      renderer: WebGLRenderer,
      passMaterial: Material,
      renderTarget: WebGLRenderTarget,
      clearColor: ColorRepresentation,
      clearAlpha: ColorRepresentation
    ): Unit = js.native
    
    def renderOverride(
      renderer: WebGLRenderer,
      passMaterial: Material,
      renderTarget: WebGLRenderTarget,
      clearColor: ColorRepresentation,
      clearAlpha: ColorRepresentation
    ): Unit = js.native
    
    def renderPass(
      renderer: WebGLRenderer,
      passMaterial: Material,
      renderTarget: WebGLRenderTarget,
      clearColor: ColorRepresentation,
      clearAlpha: ColorRepresentation
    ): Unit = js.native
    
    var renderer: WebGLRenderer = js.native
    
    var scene: Scene = js.native
    
    var selective: Boolean = js.native
    
    def selects: (js.Array[
        Mesh[
          typings.three.srcCoreBufferGeometryMod.BufferGeometry, 
          typings.three.srcMaterialsMaterialMod.Material | js.Array[typings.three.srcMaterialsMaterialMod.Material]
        ]
      ]) | Null = js.native
    def selects_=(
      `val`: (js.Array[
          Mesh[
            typings.three.srcCoreBufferGeometryMod.BufferGeometry, 
            typings.three.srcMaterialsMaterialMod.Material | js.Array[typings.three.srcMaterialsMaterialMod.Material]
          ]
        ]) | Null
    ): Unit = js.native
    
    var ssrMaterial: ShaderMaterial = js.native
    
    var ssrRenderTarget: WebGLRenderTarget = js.native
    
    var tempColor: Color = js.native
    
    var thickTolerance: Double = js.native
    
    var thickness: Double = js.native
    
    var width: Double = js.native
  }
  /* static members */
  object SSRPass {
    
    @JSImport("three/examples/jsm/postprocessing/SSRPass", "SSRPass")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("three/examples/jsm/postprocessing/SSRPass", "SSRPass.OUTPUT")
    @js.native
    def OUTPUT: Beauty = js.native
    inline def OUTPUT_=(x: Beauty): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OUTPUT")(x.asInstanceOf[js.Any])
  }
  
  trait SSRPassParams extends StObject {
    
    var camera: Camera
    
    var groundReflector: ReflectorForSSRPass[BufferGeometry] | Null
    
    var height: js.UndefOr[Double] = js.undefined
    
    var isBouncing: js.UndefOr[Boolean] = js.undefined
    
    var isPerspectiveCamera: js.UndefOr[Boolean] = js.undefined
    
    var renderer: WebGLRenderer
    
    var scene: Scene
    
    var selects: (js.Array[
        Mesh[
          typings.three.srcCoreBufferGeometryMod.BufferGeometry, 
          typings.three.srcMaterialsMaterialMod.Material | js.Array[typings.three.srcMaterialsMaterialMod.Material]
        ]
      ]) | Null
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object SSRPassParams {
    
    inline def apply(camera: Camera, renderer: WebGLRenderer, scene: Scene): SSRPassParams = {
      val __obj = js.Dynamic.literal(camera = camera.asInstanceOf[js.Any], renderer = renderer.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any], groundReflector = null, selects = null)
      __obj.asInstanceOf[SSRPassParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SSRPassParams] (val x: Self) extends AnyVal {
      
      inline def setCamera(value: Camera): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
      
      inline def setGroundReflector(value: ReflectorForSSRPass[BufferGeometry]): Self = StObject.set(x, "groundReflector", value.asInstanceOf[js.Any])
      
      inline def setGroundReflectorNull: Self = StObject.set(x, "groundReflector", null)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setIsBouncing(value: Boolean): Self = StObject.set(x, "isBouncing", value.asInstanceOf[js.Any])
      
      inline def setIsBouncingUndefined: Self = StObject.set(x, "isBouncing", js.undefined)
      
      inline def setIsPerspectiveCamera(value: Boolean): Self = StObject.set(x, "isPerspectiveCamera", value.asInstanceOf[js.Any])
      
      inline def setIsPerspectiveCameraUndefined: Self = StObject.set(x, "isPerspectiveCamera", js.undefined)
      
      inline def setRenderer(value: WebGLRenderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
      
      inline def setScene(value: Scene): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
      
      inline def setSelects(
        value: js.Array[
              Mesh[
                typings.three.srcCoreBufferGeometryMod.BufferGeometry, 
                typings.three.srcMaterialsMaterialMod.Material | js.Array[typings.three.srcMaterialsMaterialMod.Material]
              ]
            ]
      ): Self = StObject.set(x, "selects", value.asInstanceOf[js.Any])
      
      inline def setSelectsNull: Self = StObject.set(x, "selects", null)
      
      inline def setSelectsVarargs(
        value: (Mesh[
              typings.three.srcCoreBufferGeometryMod.BufferGeometry, 
              typings.three.srcMaterialsMaterialMod.Material | js.Array[typings.three.srcMaterialsMaterialMod.Material]
            ])*
      ): Self = StObject.set(x, "selects", js.Array(value*))
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
