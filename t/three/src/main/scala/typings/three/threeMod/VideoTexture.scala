package typings.three.threeMod

import typings.std.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "VideoTexture")
@js.native
class VideoTexture protected ()
  extends typings.three.srcTexturesVideoTextureMod.VideoTexture {
  def this(
    video: HTMLVideoElement,
    mapping: js.UndefOr[typings.three.srcConstantsMod.Mapping],
    wrapS: js.UndefOr[typings.three.srcConstantsMod.Wrapping],
    wrapT: js.UndefOr[typings.three.srcConstantsMod.Wrapping],
    magFilter: js.UndefOr[typings.three.srcConstantsMod.TextureFilter],
    minFilter: js.UndefOr[typings.three.srcConstantsMod.TextureFilter],
    format: js.UndefOr[typings.three.srcConstantsMod.PixelFormat],
    `type`: js.UndefOr[typings.three.srcConstantsMod.TextureDataType],
    anisotropy: js.UndefOr[Double]
  ) = this()
}

