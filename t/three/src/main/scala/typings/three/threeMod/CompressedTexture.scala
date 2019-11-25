package typings.three.threeMod

import typings.std.ImageData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "CompressedTexture")
@js.native
class CompressedTexture protected ()
  extends typings.three.srcTexturesCompressedTextureMod.CompressedTexture {
  def this(
    mipmaps: js.Array[ImageData],
    width: Double,
    height: Double,
    format: js.UndefOr[typings.three.srcConstantsMod.CompressedPixelFormat],
    `type`: js.UndefOr[typings.three.srcConstantsMod.TextureDataType],
    mapping: js.UndefOr[typings.three.srcConstantsMod.Mapping],
    wrapS: js.UndefOr[typings.three.srcConstantsMod.Wrapping],
    wrapT: js.UndefOr[typings.three.srcConstantsMod.Wrapping],
    magFilter: js.UndefOr[typings.three.srcConstantsMod.TextureFilter],
    minFilter: js.UndefOr[typings.three.srcConstantsMod.TextureFilter],
    anisotropy: js.UndefOr[Double],
    encoding: js.UndefOr[typings.three.srcConstantsMod.TextureEncoding]
  ) = this()
}

