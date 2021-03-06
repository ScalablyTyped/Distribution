package typings.tensorflowTfjsCore.kernelNamesMod

import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import typings.std.ImageData
import typings.tensorflowTfjsCore.distTypesMod.PixelData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FromPixelsInputs extends StObject {
  
  var pixels: PixelData | ImageData | HTMLImageElement | HTMLCanvasElement | HTMLVideoElement = js.native
}
object FromPixelsInputs {
  
  @scala.inline
  def apply(pixels: PixelData | ImageData | HTMLImageElement | HTMLCanvasElement | HTMLVideoElement): FromPixelsInputs = {
    val __obj = js.Dynamic.literal(pixels = pixels.asInstanceOf[js.Any])
    __obj.asInstanceOf[FromPixelsInputs]
  }
  
  @scala.inline
  implicit class FromPixelsInputsMutableBuilder[Self <: FromPixelsInputs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPixels(value: PixelData | ImageData | HTMLImageElement | HTMLCanvasElement | HTMLVideoElement): Self = StObject.set(x, "pixels", value.asInstanceOf[js.Any])
  }
}
