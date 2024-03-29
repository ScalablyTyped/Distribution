package typings.three

import typings.three.srcConstantsMod.TextureEncoding
import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcCoreBufferGeometryMod.NormalBufferAttributes
import typings.three.srcMaterialsMaterialMod.Material
import typings.three.srcMathColorMod.ColorRepresentation
import typings.three.srcThreeMod.Mesh
import typings.three.srcThreeMod.PerspectiveCamera
import typings.three.srcThreeMod.WebGLRenderTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmObjectsReflectorMod {
  
  @JSImport("three/examples/jsm/objects/Reflector", "Reflector")
  @js.native
  open class Reflector ()
    extends Mesh[BufferGeometry[NormalBufferAttributes], Material | js.Array[Material]] {
    def this(geometry: typings.three.srcThreeMod.BufferGeometry[NormalBufferAttributes]) = this()
    def this(geometry: Unit, options: ReflectorOptions) = this()
    def this(
      geometry: typings.three.srcThreeMod.BufferGeometry[NormalBufferAttributes],
      options: ReflectorOptions
    ) = this()
    
    var camera: PerspectiveCamera = js.native
    
    def dispose(): Unit = js.native
    
    def getRenderTarget(): WebGLRenderTarget = js.native
    
    @JSName("type")
    var type_Reflector: typings.three.threeStrings.Reflector = js.native
  }
  
  trait ReflectorOptions extends StObject {
    
    var clipBias: js.UndefOr[Double] = js.undefined
    
    var color: js.UndefOr[ColorRepresentation] = js.undefined
    
    var encoding: js.UndefOr[TextureEncoding] = js.undefined
    
    var multisample: js.UndefOr[Double] = js.undefined
    
    var shader: js.UndefOr[js.Object] = js.undefined
    
    var textureHeight: js.UndefOr[Double] = js.undefined
    
    var textureWidth: js.UndefOr[Double] = js.undefined
  }
  object ReflectorOptions {
    
    inline def apply(): ReflectorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReflectorOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReflectorOptions] (val x: Self) extends AnyVal {
      
      inline def setClipBias(value: Double): Self = StObject.set(x, "clipBias", value.asInstanceOf[js.Any])
      
      inline def setClipBiasUndefined: Self = StObject.set(x, "clipBias", js.undefined)
      
      inline def setColor(value: ColorRepresentation): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setEncoding(value: TextureEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setMultisample(value: Double): Self = StObject.set(x, "multisample", value.asInstanceOf[js.Any])
      
      inline def setMultisampleUndefined: Self = StObject.set(x, "multisample", js.undefined)
      
      inline def setShader(value: js.Object): Self = StObject.set(x, "shader", value.asInstanceOf[js.Any])
      
      inline def setShaderUndefined: Self = StObject.set(x, "shader", js.undefined)
      
      inline def setTextureHeight(value: Double): Self = StObject.set(x, "textureHeight", value.asInstanceOf[js.Any])
      
      inline def setTextureHeightUndefined: Self = StObject.set(x, "textureHeight", js.undefined)
      
      inline def setTextureWidth(value: Double): Self = StObject.set(x, "textureWidth", value.asInstanceOf[js.Any])
      
      inline def setTextureWidthUndefined: Self = StObject.set(x, "textureWidth", js.undefined)
    }
  }
}
