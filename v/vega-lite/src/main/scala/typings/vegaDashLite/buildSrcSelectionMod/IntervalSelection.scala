package typings.vegaDashLite.buildSrcSelectionMod

import typings.vegaDashLite.buildSrcChannelMod.SingleDefChannel
import typings.vegaDashLite.buildSrcVegaDotSchemaMod.VgEventStream
import typings.vegaDashLite.vegaDashLiteStrings.all
import typings.vegaDashLite.vegaDashLiteStrings.interval
import typings.vegaDashLite.vegaDashLiteStrings.none
import typings.vegaDashLite.vegaDashLiteStrings.scales
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntervalSelection
  extends IntervalSelectionConfig
     with SelectionDef {
  var `type`: interval
}

object IntervalSelection {
  @scala.inline
  def apply(
    `type`: interval,
    bind: scales = null,
    empty: all | none = null,
    encodings: js.Array[SingleDefChannel] = null,
    fields: js.Array[String] = null,
    mark: BrushConfig = null,
    on: VgEventStream = null,
    resolve: SelectionResolution = null,
    translate: String | Boolean = null,
    zoom: String | Boolean = null
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

