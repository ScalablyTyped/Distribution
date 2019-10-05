package typings.three.threeMod

import typings.three.srcConstantsMod.Mapping
import typings.three.srcConstantsMod.TextureDataType
import typings.three.srcConstantsMod.TextureFilter
import typings.three.srcConstantsMod.Wrapping
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
    `type`: js.UndefOr[TextureDataType],
    mapping: js.UndefOr[Mapping],
    wrapS: js.UndefOr[Wrapping],
    wrapT: js.UndefOr[Wrapping],
    magFilter: js.UndefOr[TextureFilter],
    minFilter: js.UndefOr[TextureFilter],
    anisotropy: js.UndefOr[Double]
  ) = this()
}

