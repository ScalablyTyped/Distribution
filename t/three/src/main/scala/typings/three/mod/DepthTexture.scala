package typings.three.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "DepthTexture")
@js.native
class DepthTexture protected ()
  extends typings.three.depthTextureMod.DepthTexture {
  def this(
    width: Double,
    heighht: Double,
    `type`: js.UndefOr[typings.three.constantsMod.TextureDataType],
    mapping: js.UndefOr[typings.three.constantsMod.Mapping],
    wrapS: js.UndefOr[typings.three.constantsMod.Wrapping],
    wrapT: js.UndefOr[typings.three.constantsMod.Wrapping],
    magFilter: js.UndefOr[typings.three.constantsMod.TextureFilter],
    minFilter: js.UndefOr[typings.three.constantsMod.TextureFilter],
    anisotropy: js.UndefOr[Double]
  ) = this()
}

