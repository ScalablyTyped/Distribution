package typings.tensorflowTfjsConverter.compiledApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAssetFileDef extends js.Object {
  /** AssetFileDef filename */
  var filename: js.UndefOr[String | Null] = js.undefined
  /** AssetFileDef tensorInfo */
  var tensorInfo: js.UndefOr[ITensorInfo | Null] = js.undefined
}

object IAssetFileDef {
  @scala.inline
  def apply(
    filename: js.UndefOr[Null | String] = js.undefined,
    tensorInfo: js.UndefOr[Null | ITensorInfo] = js.undefined
  ): IAssetFileDef = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(filename)) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (!js.isUndefined(tensorInfo)) __obj.updateDynamic("tensorInfo")(tensorInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAssetFileDef]
  }
}

