package typings.tensorflowTfjsCore.distKernelNamesMod

import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import typings.std.ImageBitmap
import typings.std.ImageData
import typings.tensorflowTfjsCore.distTypesMod.PixelData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FromPixelsInputs extends StObject {
  
  var pixels: PixelData | ImageData | HTMLImageElement | HTMLCanvasElement | HTMLVideoElement | ImageBitmap
}
object FromPixelsInputs {
  
  inline def apply(
    pixels: PixelData | ImageData | HTMLImageElement | HTMLCanvasElement | HTMLVideoElement | ImageBitmap
  ): FromPixelsInputs = {
    val __obj = js.Dynamic.literal(pixels = pixels.asInstanceOf[js.Any])
    __obj.asInstanceOf[FromPixelsInputs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FromPixelsInputs] (val x: Self) extends AnyVal {
    
    inline def setPixels(
      value: PixelData | ImageData | HTMLImageElement | HTMLCanvasElement | HTMLVideoElement | ImageBitmap
    ): Self = StObject.set(x, "pixels", value.asInstanceOf[js.Any])
  }
}
