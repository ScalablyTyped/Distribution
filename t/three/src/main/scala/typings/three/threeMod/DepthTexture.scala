package typings.three.threeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "DepthTexture")
@js.native
class DepthTexture protected ()
  extends typings.three.srcTexturesDepthTextureMod.DepthTexture {
  def this(
    width: Double,
    heighht: Double,
    `type`: js.UndefOr[typings.three.srcConstantsMod.TextureDataType],
    mapping: js.UndefOr[typings.three.srcConstantsMod.Mapping],
    wrapS: js.UndefOr[typings.three.srcConstantsMod.Wrapping],
    wrapT: js.UndefOr[typings.three.srcConstantsMod.Wrapping],
    magFilter: js.UndefOr[typings.three.srcConstantsMod.TextureFilter],
    minFilter: js.UndefOr[typings.three.srcConstantsMod.TextureFilter],
    anisotropy: js.UndefOr[Double]
  ) = this()
}

