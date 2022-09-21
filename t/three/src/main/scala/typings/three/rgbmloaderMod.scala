package typings.three

import typings.std.ErrorEvent
import typings.std.EventTarget
import typings.std.ProgressEvent
import typings.three.srcConstantsMod.PixelFormat
import typings.three.srcConstantsMod.TextureDataType
import typings.three.threeMod.CubeTexture
import typings.three.threeMod.DataTextureLoader
import typings.three.threeMod.LoadingManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rgbmloaderMod {
  
  @JSImport("three/examples/jsm/loaders/RGBMLoader", "RGBMLoader")
  @js.native
  open class RGBMLoader () extends DataTextureLoader {
    def this(manager: LoadingManager) = this()
    
    def loadCubemap(urls: js.Array[String]): CubeTexture = js.native
    def loadCubemap(urls: js.Array[String], onLoad: js.Function1[/* texture */ CubeTexture, Unit]): CubeTexture = js.native
    def loadCubemap(
      urls: js.Array[String],
      onLoad: js.Function1[/* texture */ CubeTexture, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]
    ): CubeTexture = js.native
    def loadCubemap(
      urls: js.Array[String],
      onLoad: js.Function1[/* texture */ CubeTexture, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): CubeTexture = js.native
    def loadCubemap(
      urls: js.Array[String],
      onLoad: js.Function1[/* texture */ CubeTexture, Unit],
      onProgress: Unit,
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): CubeTexture = js.native
    def loadCubemap(
      urls: js.Array[String],
      onLoad: Unit,
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]
    ): CubeTexture = js.native
    def loadCubemap(
      urls: js.Array[String],
      onLoad: Unit,
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): CubeTexture = js.native
    def loadCubemap(
      urls: js.Array[String],
      onLoad: Unit,
      onProgress: Unit,
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): CubeTexture = js.native
    
    var maxRange: Double = js.native
    
    def parse(buffer: js.typedarray.ArrayBuffer): RGBM = js.native
    
    def setDataType(dataType: TextureDataType): this.type = js.native
    
    def setMaxRange(value: Double): this.type = js.native
    
    var `type`: TextureDataType = js.native
  }
  
  trait RGBM extends StObject {
    
    var data: js.typedarray.Uint16Array | js.typedarray.Float32Array
    
    var flipY: Boolean
    
    var format: PixelFormat
    
    var header: String
    
    var height: Double
    
    var `type`: TextureDataType
    
    var width: Double
  }
  object RGBM {
    
    inline def apply(
      data: js.typedarray.Uint16Array | js.typedarray.Float32Array,
      flipY: Boolean,
      format: PixelFormat,
      header: String,
      height: Double,
      `type`: TextureDataType,
      width: Double
    ): RGBM = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], flipY = flipY.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RGBM]
    }
    
    extension [Self <: RGBM](x: Self) {
      
      inline def setData(value: js.typedarray.Uint16Array | js.typedarray.Float32Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setFlipY(value: Boolean): Self = StObject.set(x, "flipY", value.asInstanceOf[js.Any])
      
      inline def setFormat(value: PixelFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setType(value: TextureDataType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
