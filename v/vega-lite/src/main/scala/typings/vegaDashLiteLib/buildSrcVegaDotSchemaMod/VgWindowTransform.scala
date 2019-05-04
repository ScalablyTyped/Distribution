package typings
package vegaDashLiteLib.buildSrcVegaDotSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VgWindowTransform extends VgTransform {
  var as: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var fields: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var frame: js.UndefOr[js.Array[stdLib.Number]] = js.undefined
  var groupby: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var ignorePeers: js.UndefOr[scala.Boolean] = js.undefined
  var ops: js.UndefOr[
    js.Array[
      vegaDashTypingsLib.typesSpecTransformMod.AggregateOp | vegaDashLiteLib.buildSrcTransformMod.WindowOnlyOp
    ]
  ] = js.undefined
  var params: js.UndefOr[js.Array[stdLib.Number]] = js.undefined
  var sort: js.UndefOr[VgComparator] = js.undefined
  var `type`: vegaDashLiteLib.vegaDashLiteLibStrings.window
}

object VgWindowTransform {
  @scala.inline
  def apply(
    `type`: vegaDashLiteLib.vegaDashLiteLibStrings.window,
    as: js.Array[java.lang.String] = null,
    fields: js.Array[java.lang.String] = null,
    frame: js.Array[stdLib.Number] = null,
    groupby: js.Array[java.lang.String] = null,
    ignorePeers: js.UndefOr[scala.Boolean] = js.undefined,
    ops: js.Array[
      vegaDashTypingsLib.typesSpecTransformMod.AggregateOp | vegaDashLiteLib.buildSrcTransformMod.WindowOnlyOp
    ] = null,
    params: js.Array[stdLib.Number] = null,
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

