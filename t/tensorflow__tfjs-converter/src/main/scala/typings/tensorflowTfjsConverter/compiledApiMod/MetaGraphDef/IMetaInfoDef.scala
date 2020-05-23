package typings.tensorflowTfjsConverter.compiledApiMod.MetaGraphDef

import typings.tensorflowTfjsConverter.compiledApiMod.IAny
import typings.tensorflowTfjsConverter.compiledApiMod.IOpList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a MetaInfoDef. */
trait IMetaInfoDef extends js.Object {
  /** MetaInfoDef anyInfo */
  var anyInfo: js.UndefOr[IAny | Null] = js.undefined
  /** MetaInfoDef metaGraphVersion */
  var metaGraphVersion: js.UndefOr[String | Null] = js.undefined
  /** MetaInfoDef strippedOpList */
  var strippedOpList: js.UndefOr[IOpList | Null] = js.undefined
  /** MetaInfoDef tags */
  var tags: js.UndefOr[js.Array[String] | Null] = js.undefined
  /** MetaInfoDef tensorflowGitVersion */
  var tensorflowGitVersion: js.UndefOr[String | Null] = js.undefined
  /** MetaInfoDef tensorflowVersion */
  var tensorflowVersion: js.UndefOr[String | Null] = js.undefined
}

object IMetaInfoDef {
  @scala.inline
  def apply(
    anyInfo: js.UndefOr[Null | IAny] = js.undefined,
    metaGraphVersion: js.UndefOr[Null | String] = js.undefined,
    strippedOpList: js.UndefOr[Null | IOpList] = js.undefined,
    tags: js.UndefOr[Null | js.Array[String]] = js.undefined,
    tensorflowGitVersion: js.UndefOr[Null | String] = js.undefined,
    tensorflowVersion: js.UndefOr[Null | String] = js.undefined
  ): IMetaInfoDef = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(anyInfo)) __obj.updateDynamic("anyInfo")(anyInfo.asInstanceOf[js.Any])
    if (!js.isUndefined(metaGraphVersion)) __obj.updateDynamic("metaGraphVersion")(metaGraphVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(strippedOpList)) __obj.updateDynamic("strippedOpList")(strippedOpList.asInstanceOf[js.Any])
    if (!js.isUndefined(tags)) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (!js.isUndefined(tensorflowGitVersion)) __obj.updateDynamic("tensorflowGitVersion")(tensorflowGitVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(tensorflowVersion)) __obj.updateDynamic("tensorflowVersion")(tensorflowVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMetaInfoDef]
  }
}

