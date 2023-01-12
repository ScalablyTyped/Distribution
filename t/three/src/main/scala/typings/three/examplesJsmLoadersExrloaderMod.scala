package typings.three

import typings.three.srcConstantsMod.PixelFormat
import typings.three.srcConstantsMod.TextureDataType
import typings.three.srcThreeMod.DataTextureLoader
import typings.three.srcThreeMod.LoadingManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmLoadersExrloaderMod {
  
  @JSImport("three/examples/jsm/loaders/EXRLoader", "EXRLoader")
  @js.native
  open class EXRLoader () extends DataTextureLoader {
    def this(manager: LoadingManager) = this()
    
    def parse(buffer: js.typedarray.ArrayBuffer): EXR = js.native
    
    def setDataType(`type`: TextureDataType): this.type = js.native
    
    var `type`: TextureDataType = js.native
  }
  
  trait EXR extends StObject {
    
    var data: js.typedarray.Float32Array
    
    var format: PixelFormat
    
    var header: js.Object
    
    var height: Double
    
    var `type`: TextureDataType
    
    var width: Double
  }
  object EXR {
    
    inline def apply(
      data: js.typedarray.Float32Array,
      format: PixelFormat,
      header: js.Object,
      height: Double,
      `type`: TextureDataType,
      width: Double
    ): EXR = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[EXR]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EXR] (val x: Self) extends AnyVal {
      
      inline def setData(value: js.typedarray.Float32Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setFormat(value: PixelFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setHeader(value: js.Object): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setType(value: TextureDataType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
