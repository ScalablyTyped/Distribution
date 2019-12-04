package typings.atTensorflowTfjsDashConverter.distSrcDataCompiledUnderscoreApiMod.MetaGraphDef

import typings.atTensorflowTfjsDashConverter.distSrcDataCompiledUnderscoreApiMod.IAny
import typings.atTensorflowTfjsDashConverter.distSrcDataCompiledUnderscoreApiMod.IOpList
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
    anyInfo: IAny = null,
    metaGraphVersion: String = null,
    strippedOpList: IOpList = null,
    tags: js.Array[String] = null,
    tensorflowGitVersion: String = null,
    tensorflowVersion: String = null
  ): IMetaInfoDef = {
    val __obj = js.Dynamic.literal()
    if (anyInfo != null) __obj.updateDynamic("anyInfo")(anyInfo.asInstanceOf[js.Any])
    if (metaGraphVersion != null) __obj.updateDynamic("metaGraphVersion")(metaGraphVersion.asInstanceOf[js.Any])
    if (strippedOpList != null) __obj.updateDynamic("strippedOpList")(strippedOpList.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (tensorflowGitVersion != null) __obj.updateDynamic("tensorflowGitVersion")(tensorflowGitVersion.asInstanceOf[js.Any])
    if (tensorflowVersion != null) __obj.updateDynamic("tensorflowVersion")(tensorflowVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMetaInfoDef]
  }
}

