package typings.vegaDashLite.buildSrcSelectionMod

import typings.vegaDashLite.buildSrcChannelMod.SingleDefChannel
import typings.vegaDashLite.buildSrcVegaDotSchemaMod.VgEventStream
import typings.vegaDashLite.vegaDashLiteStrings.all
import typings.vegaDashLite.vegaDashLiteStrings.multi
import typings.vegaDashLite.vegaDashLiteStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiSelection
  extends MultiSelectionConfig
     with SelectionDef {
  var `type`: multi
}

object MultiSelection {
  @scala.inline
  def apply(
    `type`: multi,
    empty: all | none = null,
    encodings: js.Array[SingleDefChannel] = null,
    fields: js.Array[String] = null,
    nearest: js.UndefOr[Boolean] = js.undefined,
    on: VgEventStream = null,
    resolve: SelectionResolution = null,
    toggle: String | Boolean = null
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

