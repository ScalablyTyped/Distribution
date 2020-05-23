package typings.tensorflowTfjsConverter.compiledApiMod

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
  def apply(
    metaGraphs: js.UndefOr[Null | js.Array[IMetaGraphDef]] = js.undefined,
    savedModelSchemaVersion: js.UndefOr[Null | Double | String] = js.undefined
  ): ISavedModel = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(metaGraphs)) __obj.updateDynamic("metaGraphs")(metaGraphs.asInstanceOf[js.Any])
    if (!js.isUndefined(savedModelSchemaVersion)) __obj.updateDynamic("savedModelSchemaVersion")(savedModelSchemaVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISavedModel]
  }
}

