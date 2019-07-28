package typings.vegaDashLite.buildSrcSelectionMod

import typings.vegaDashLite.buildSrcChannelMod.SingleDefChannel
import typings.vegaDashLite.buildSrcVegaDotSchemaMod.VgEventStream
import typings.vegaDashLite.vegaDashLiteStrings.all
import typings.vegaDashLite.vegaDashLiteStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseSelectionDef extends js.Object {
  /**
    * By default, all data values are considered to lie within an empty selection.
    * When set to `none`, empty selections contain no data values.
    */
  var empty: js.UndefOr[all | none] = js.undefined
  /**
    * An array of encoding channels. The corresponding data field values
    * must match for a data tuple to fall within the selection.
    */
  var encodings: js.UndefOr[js.Array[SingleDefChannel]] = js.undefined
  /**
    * An array of field names whose values must match for a data tuple to
    * fall within the selection.
    */
  var fields: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * A [Vega event stream](https://vega.github.io/vega/docs/event-streams/) (object or selector) that triggers the selection.
    * For interval selections, the event stream must specify a [start and end](https://vega.github.io/vega/docs/event-streams/#between-filters).
    */
  var on: js.UndefOr[VgEventStream] = js.undefined
  /**
    * With layered and multi-view displays, a strategy that determines how
    * selections' data queries are resolved when applied in a filter transform,
    * conditional encoding rule, or scale domain.
    *
    */
  var resolve: js.UndefOr[SelectionResolution] = js.undefined
}

object BaseSelectionDef {
  @scala.inline
  def apply(
    empty: all | none = null,
    encodings: js.Array[SingleDefChannel] = null,
    fields: js.Array[String] = null,
    on: VgEventStream = null,
    resolve: SelectionResolution = null
  ): BaseSelectionDef = {
    val __obj = js.Dynamic.literal()
    if (empty != null) __obj.updateDynamic("empty")(empty.asInstanceOf[js.Any])
    if (encodings != null) __obj.updateDynamic("encodings")(encodings)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (on != null) __obj.updateDynamic("on")(on)
    if (resolve != null) __obj.updateDynamic("resolve")(resolve)
    __obj.asInstanceOf[BaseSelectionDef]
  }
}

