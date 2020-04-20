package typings.tensorflowTfjsCore.kernelNamesMod

import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import typings.std.ImageData
import typings.tensorflowTfjsCore.distTypesMod.PixelData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FromPixelsInputs extends js.Object {
  var pixels: PixelData | ImageData | HTMLImageElement | HTMLCanvasElement | HTMLVideoElement
}

object FromPixelsInputs {
  @scala.inline
  def apply(pixels: PixelData | ImageData | HTMLImageElement | HTMLCanvasElement | HTMLVideoElement): FromPixelsInputs = {
    val __obj = js.Dynamic.literal(pixels = pixels.asInstanceOf[js.Any])
    __obj.asInstanceOf[FromPixelsInputs]
  }
}

