package typings
package vegaDashLiteLib.buildSrcSelectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntervalSelection
  extends IntervalSelectionConfig
     with SelectionDef {
  var `type`: vegaDashLiteLib.vegaDashLiteLibStrings.interval
}

object IntervalSelection {
  @scala.inline
  def apply(
    `type`: vegaDashLiteLib.vegaDashLiteLibStrings.interval,
    bind: vegaDashLiteLib.vegaDashLiteLibStrings.scales = null,
    empty: vegaDashLiteLib.vegaDashLiteLibStrings.all | vegaDashLiteLib.vegaDashLiteLibStrings.none = null,
    encodings: js.Array[vegaDashLiteLib.buildSrcChannelMod.SingleDefChannel] = null,
    fields: js.Array[java.lang.String] = null,
    mark: BrushConfig = null,
    on: vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgEventStream = null,
    resolve: SelectionResolution = null,
    translate: java.lang.String | scala.Boolean = null,
    zoom: java.lang.String | scala.Boolean = null
  ): IntervalSelection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (bind != null) __obj.updateDynamic("bind")(bind)
    if (empty != null) __obj.updateDynamic("empty")(empty.asInstanceOf[js.Any])
    if (encodings != null) __obj.updateDynamic("encodings")(encodings)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (mark != null) __obj.updateDynamic("mark")(mark)
    if (on != null) __obj.updateDynamic("on")(on)
    if (resolve != null) __obj.updateDynamic("resolve")(resolve)
    if (translate != null) __obj.updateDynamic("translate")(translate.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntervalSelection]
  }
}

