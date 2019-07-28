package typings.vegaDashLite.buildSrcVegaDotSchemaMod

import typings.std.Number
import typings.vegaDashLite.buildSrcTransformMod.WindowOnlyOp
import typings.vegaDashLite.vegaDashLiteStrings.window
import typings.vegaDashTypings.typesSpecTransformMod.AggregateOp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VgWindowTransform extends VgTransform {
  var as: js.UndefOr[js.Array[String]] = js.undefined
  var fields: js.UndefOr[js.Array[String]] = js.undefined
  var frame: js.UndefOr[js.Array[Number]] = js.undefined
  var groupby: js.UndefOr[js.Array[String]] = js.undefined
  var ignorePeers: js.UndefOr[Boolean] = js.undefined
  var ops: js.UndefOr[js.Array[AggregateOp | WindowOnlyOp]] = js.undefined
  var params: js.UndefOr[js.Array[Number]] = js.undefined
  var sort: js.UndefOr[VgComparator] = js.undefined
  var `type`: window
}

object VgWindowTransform {
  @scala.inline
  def apply(
    `type`: window,
    as: js.Array[String] = null,
    fields: js.Array[String] = null,
    frame: js.Array[Number] = null,
    groupby: js.Array[String] = null,
    ignorePeers: js.UndefOr[Boolean] = js.undefined,
    ops: js.Array[AggregateOp | WindowOnlyOp] = null,
    params: js.Array[Number] = null,
    sort: VgComparator = null
  ): VgWindowTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (as != null) __obj.updateDynamic("as")(as)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (frame != null) __obj.updateDynamic("frame")(frame)
    if (groupby != null) __obj.updateDynamic("groupby")(groupby)
    if (!js.isUndefined(ignorePeers)) __obj.updateDynamic("ignorePeers")(ignorePeers)
    if (ops != null) __obj.updateDynamic("ops")(ops)
    if (params != null) __obj.updateDynamic("params")(params)
    if (sort != null) __obj.updateDynamic("sort")(sort)
    __obj.asInstanceOf[VgWindowTransform]
  }
}

