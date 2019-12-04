package typings.atTensorflowTfjsDashConverter.distSrcDataCompiledUnderscoreApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISavedModel extends js.Object {
  /** SavedModel metaGraphs */
  var metaGraphs: js.UndefOr[js.Array[IMetaGraphDef] | Null] = js.undefined
  /** SavedModel savedModelSchemaVersion */
  var savedModelSchemaVersion: js.UndefOr[Double | String | Null] = js.undefined
}

object ISavedModel {
  @scala.inline
  def apply(metaGraphs: js.Array[IMetaGraphDef] = null, savedModelSchemaVersion: Double | String = null): ISavedModel = {
    val __obj = js.Dynamic.literal()
    if (metaGraphs != null) __obj.updateDynamic("metaGraphs")(metaGraphs.asInstanceOf[js.Any])
    if (savedModelSchemaVersion != null) __obj.updateDynamic("savedModelSchemaVersion")(savedModelSchemaVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISavedModel]
  }
}

