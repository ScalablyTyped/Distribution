package typings.three.threeMod

import typings.three.srcPolyfillsMod.TypedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "DataTexture")
@js.native
class DataTexture protected ()
  extends typings.three.srcTexturesDataTextureMod.DataTexture {
  def this(
    data: TypedArray,
    width: Double,
    height: Double,
    format: js.UndefOr[typings.three.srcConstantsMod.PixelFormat],
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

