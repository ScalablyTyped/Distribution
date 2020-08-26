package typings.three.mod

import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "CanvasTexture")
@js.native
class CanvasTexture protected ()
  extends typings.three.canvasTextureMod.CanvasTexture {
  def this(
    canvas: HTMLImageElement | HTMLCanvasElement | HTMLVideoElement,
    mapping: js.UndefOr[typings.three.constantsMod.Mapping],
    wrapS: js.UndefOr[typings.three.constantsMod.Wrapping],
    wrapT: js.UndefOr[typings.three.constantsMod.Wrapping],
    magFilter: js.UndefOr[typings.three.constantsMod.TextureFilter],
    minFilter: js.UndefOr[typings.three.constantsMod.TextureFilter],
    format: js.UndefOr[typings.three.constantsMod.PixelFormat],
    `type`: js.UndefOr[typings.three.constantsMod.TextureDataType],
    anisotropy: js.UndefOr[Double]
  ) = this()
}

