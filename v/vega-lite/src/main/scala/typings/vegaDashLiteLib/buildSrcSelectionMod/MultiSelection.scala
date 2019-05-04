package typings
package vegaDashLiteLib.buildSrcSelectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiSelection
  extends MultiSelectionConfig
     with SelectionDef {
  var `type`: vegaDashLiteLib.vegaDashLiteLibStrings.multi
}

object MultiSelection {
  @scala.inline
  def apply(
    `type`: vegaDashLiteLib.vegaDashLiteLibStrings.multi,
    empty: vegaDashLiteLib.vegaDashLiteLibStrings.all | vegaDashLiteLib.vegaDashLiteLibStrings.none = null,
    encodings: js.Array[vegaDashLiteLib.buildSrcChannelMod.SingleDefChannel] = null,
    fields: js.Array[java.lang.String] = null,
    nearest: js.UndefOr[scala.Boolean] = js.undefined,
    on: vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgEventStream = null,
    resolve: SelectionResolution = null,
    toggle: java.lang.String | scala.Boolean = null
  ): MultiSelection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (empty != null) __obj.updateDynamic("empty")(empty.asInstanceOf[js.Any])
    if (encodings != null) __obj.updateDynamic("encodings")(encodings)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (!js.isUndefined(nearest)) __obj.updateDynamic("nearest")(nearest)
    if (on != null) __obj.updateDynamic("on")(on)
    if (resolve != null) __obj.updateDynamic("resolve")(resolve)
    if (toggle != null) __obj.updateDynamic("toggle")(toggle.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiSelection]
  }
}

