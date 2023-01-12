package typings.three

import typings.three.srcConstantsMod.PixelFormat
import typings.three.srcConstantsMod.TextureDataType
import typings.three.srcThreeMod.DataTextureLoader
import typings.three.srcThreeMod.LoadingManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmLoadersLogLuvLoaderMod {
  
  @JSImport("three/examples/jsm/loaders/LogLuvLoader", "LogLuvLoader")
  @js.native
  open class LogLuvLoader protected () extends DataTextureLoader {
    def this(manager: LoadingManager) = this()
    
    def parse(buffer: js.Iterable[Double]): LogLuv = js.native
    
    def setDataType(value: TextureDataType): this.type = js.native
    
    var `type`: TextureDataType = js.native
  }
  
  trait LogLuv extends StObject {
    
    var data: js.typedarray.Uint16Array | js.typedarray.Float32Array
    
    var flipY: Boolean
    
    var format: PixelFormat
    
    var height: Double
    
    var `type`: TextureDataType
    
    var width: Double
  }
  object LogLuv {
    
    inline def apply(
      data: js.typedarray.Uint16Array | js.typedarray.Float32Array,
      flipY: Boolean,
      format: PixelFormat,
      height: Double,
      `type`: TextureDataType,
      width: Double
    ): LogLuv = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], flipY = flipY.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogLuv]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LogLuv] (val x: Self) extends AnyVal {
      
      inline def setData(value: js.typedarray.Uint16Array | js.typedarray.Float32Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setFlipY(value: Boolean): Self = StObject.set(x, "flipY", value.asInstanceOf[js.Any])
      
      inline def setFormat(value: PixelFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setType(value: TextureDataType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
