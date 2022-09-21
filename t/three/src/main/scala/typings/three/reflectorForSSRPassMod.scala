package typings.three

import org.scalablytyped.runtime.StringDictionary
import typings.three.anon.DISTANCEATTENUATION
import typings.three.materialMod.Material
import typings.three.threeMod.BufferGeometry
import typings.three.threeMod.Camera
import typings.three.threeMod.Mesh
import typings.three.threeMod.Scene
import typings.three.threeMod.ShaderMaterial
import typings.three.threeMod.WebGLRenderTarget
import typings.three.threeMod.WebGLRenderer
import typings.three.uniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reflectorForSSRPassMod {
  
  @JSImport("three/examples/jsm/objects/ReflectorForSSRPass", "ReflectorForSSRPass")
  @js.native
  open class ReflectorForSSRPass[TGeometry /* <: BufferGeometry */] protected ()
    extends Mesh[TGeometry, Material | js.Array[Material]] {
    def this(geometry: TGeometry, options: ReflectorForSSRPassOptions) = this()
    
    def distanceAttenuation: Boolean = js.native
    def distanceAttenuation_=(`val`: Boolean): Unit = js.native
    
    def doRender(renderer: WebGLRenderer, scene: Scene, camera: Camera): Unit = js.native
    
    def fresnel: Boolean = js.native
    def fresnel_=(`val`: Boolean): Unit = js.native
    
    def getRenderTarget(): WebGLRenderTarget = js.native
    
    @JSName("material")
    var material_ReflectorForSSRPass: ShaderMaterial = js.native
    
    var maxDistance: Double = js.native
    
    var needsUpdate: Boolean = js.native
    
    var opacity: Double = js.native
    
    var options: ReflectorForSSRPassOptions = js.native
    
    var renderTarget: WebGLRenderTarget = js.native
    
    @JSName("type")
    var type_ReflectorForSSRPass: typings.three.threeStrings.ReflectorForSSRPass = js.native
  }
  /* static members */
  object ReflectorForSSRPass {
    
    @JSImport("three/examples/jsm/objects/ReflectorForSSRPass", "ReflectorForSSRPass")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("three/examples/jsm/objects/ReflectorForSSRPass", "ReflectorForSSRPass.ReflectorShader")
    @js.native
    def ReflectorShader: typings.three.reflectorForSSRPassMod.ReflectorShader = js.native
    inline def ReflectorShader_=(x: ReflectorShader): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ReflectorShader")(x.asInstanceOf[js.Any])
  }
  
  trait ReflectorForSSRPassOptions extends StObject {
    
    var clipBias: js.UndefOr[Double] = js.undefined
    
    var color: js.UndefOr[Double] = js.undefined
    
    var shader: js.UndefOr[ReflectorShader] = js.undefined
    
    var textureHeight: js.UndefOr[Double] = js.undefined
    
    var textureWidth: js.UndefOr[Double] = js.undefined
    
    var useDepthTexture: js.UndefOr[Boolean] = js.undefined
  }
  object ReflectorForSSRPassOptions {
    
    inline def apply(): ReflectorForSSRPassOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReflectorForSSRPassOptions]
    }
    
    extension [Self <: ReflectorForSSRPassOptions](x: Self) {
      
      inline def setClipBias(value: Double): Self = StObject.set(x, "clipBias", value.asInstanceOf[js.Any])
      
      inline def setClipBiasUndefined: Self = StObject.set(x, "clipBias", js.undefined)
      
      inline def setColor(value: Double): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setShader(value: ReflectorShader): Self = StObject.set(x, "shader", value.asInstanceOf[js.Any])
      
      inline def setShaderUndefined: Self = StObject.set(x, "shader", js.undefined)
      
      inline def setTextureHeight(value: Double): Self = StObject.set(x, "textureHeight", value.asInstanceOf[js.Any])
      
      inline def setTextureHeightUndefined: Self = StObject.set(x, "textureHeight", js.undefined)
      
      inline def setTextureWidth(value: Double): Self = StObject.set(x, "textureWidth", value.asInstanceOf[js.Any])
      
      inline def setTextureWidthUndefined: Self = StObject.set(x, "textureWidth", js.undefined)
      
      inline def setUseDepthTexture(value: Boolean): Self = StObject.set(x, "useDepthTexture", value.asInstanceOf[js.Any])
      
      inline def setUseDepthTextureUndefined: Self = StObject.set(x, "useDepthTexture", js.undefined)
    }
  }
  
  trait ReflectorShader extends StObject {
    
    var defines: DISTANCEATTENUATION
    
    var fragmentShader: String
    
    var uniforms: StringDictionary[IUniform[Any]]
    
    var vertexShader: String
  }
  object ReflectorShader {
    
    inline def apply(
      defines: DISTANCEATTENUATION,
      fragmentShader: String,
      uniforms: StringDictionary[IUniform[Any]],
      vertexShader: String
    ): ReflectorShader = {
      val __obj = js.Dynamic.literal(defines = defines.asInstanceOf[js.Any], fragmentShader = fragmentShader.asInstanceOf[js.Any], uniforms = uniforms.asInstanceOf[js.Any], vertexShader = vertexShader.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReflectorShader]
    }
    
    extension [Self <: ReflectorShader](x: Self) {
      
      inline def setDefines(value: DISTANCEATTENUATION): Self = StObject.set(x, "defines", value.asInstanceOf[js.Any])
      
      inline def setFragmentShader(value: String): Self = StObject.set(x, "fragmentShader", value.asInstanceOf[js.Any])
      
      inline def setUniforms(value: StringDictionary[IUniform[Any]]): Self = StObject.set(x, "uniforms", value.asInstanceOf[js.Any])
      
      inline def setVertexShader(value: String): Self = StObject.set(x, "vertexShader", value.asInstanceOf[js.Any])
    }
  }
}
