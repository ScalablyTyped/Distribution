package typings.three.mod

import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "Texture")
@js.native
class Texture protected ()
  extends typings.three.textureMod.Texture {
  def this(
    image: js.UndefOr[HTMLCanvasElement | HTMLImageElement | HTMLVideoElement],
    mapping: js.UndefOr[typings.three.constantsMod.Mapping],
    wrapS: js.UndefOr[typings.three.constantsMod.Wrapping],
    wrapT: js.UndefOr[typings.three.constantsMod.Wrapping],
    magFilter: js.UndefOr[typings.three.constantsMod.TextureFilter],
    minFilter: js.UndefOr[typings.three.constantsMod.TextureFilter],
    format: js.UndefOr[typings.three.constantsMod.PixelFormat],
    `type`: js.UndefOr[typings.three.constantsMod.TextureDataType],
    anisotropy: js.UndefOr[Double],
    encoding: js.UndefOr[typings.three.constantsMod.TextureEncoding]
  ) = this()
}

/* static members */
@JSImport("three", "Texture")
@js.native
object Texture extends js.Object {
  var DEFAULT_IMAGE: js.Any = js.native
  var DEFAULT_MAPPING: js.Any = js.native
}

