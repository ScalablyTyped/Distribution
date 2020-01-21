package typings.three.mod

import typings.three.polyfillsMod.TypedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "DataTexture")
@js.native
class DataTexture protected ()
  extends typings.three.dataTextureMod.DataTexture {
  def this(
    data: TypedArray,
    width: Double,
    height: Double,
    format: js.UndefOr[typings.three.constantsMod.PixelFormat],
    `type`: js.UndefOr[typings.three.constantsMod.TextureDataType],
    mapping: js.UndefOr[typings.three.constantsMod.Mapping],
    wrapS: js.UndefOr[typings.three.constantsMod.Wrapping],
    wrapT: js.UndefOr[typings.three.constantsMod.Wrapping],
    magFilter: js.UndefOr[typings.three.constantsMod.TextureFilter],
    minFilter: js.UndefOr[typings.three.constantsMod.TextureFilter],
    anisotropy: js.UndefOr[Double],
    encoding: js.UndefOr[typings.three.constantsMod.TextureEncoding]
  ) = this()
}

