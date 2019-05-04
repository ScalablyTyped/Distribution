package typings
package vegaDashLiteLib.buildSrcSelectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntervalSelectionConfig extends BaseSelectionDef {
  /**
    * Establishes a two-way binding between the interval selection and the scales
    * used within the same view. This allows a user to interactively pan and
    * zoom the view.
    */
  var bind: js.UndefOr[vegaDashLiteLib.vegaDashLiteLibStrings.scales] = js.undefined
  /**
    * An interval selection also adds a rectangle mark to depict the
    * extents of the interval. The `mark` property can be used to customize the
    * appearance of the mark.
    */
  var mark: js.UndefOr[BrushConfig] = js.undefined
  /**
    * When truthy, allows a user to interactively move an interval selection
    * back-and-forth. Can be `true`, `false` (to disable panning), or a
    * [Vega event stream definition](https://vega.github.io/vega/docs/event-streams/)
    * which must include a start and end event to trigger continuous panning.
    *
    * __Default value:__ `true`, which corresponds to
    * `[mousedown, window:mouseup] > window:mousemove!` which corresponds to
    * clicks and dragging within an interval selection to reposition it.
    */
  var translate: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  /**
    * When truthy, allows a user to interactively resize an interval selection.
    * Can be `true`, `false` (to disable zooming), or a [Vega event stream
    * definition](https://vega.github.io/vega/docs/event-streams/). Currently,
    * only `wheel` events are supported.
    *
    *
    * __Default value:__ `true`, which corresponds to `wheel!`.
    */
  var zoom: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
}

object IntervalSelectionConfig {
  @scala.inline
  def apply(
    bind: vegaDashLiteLib.vegaDashLiteLibStrings.scales = null,
    empty: vegaDashLiteLib.vegaDashLiteLibStrings.all | vegaDashLiteLib.vegaDashLiteLibStrings.none = null,
    encodings: js.Array[vegaDashLiteLib.buildSrcChannelMod.SingleDefChannel] = null,
    fields: js.Array[java.lang.String] = null,
    mark: BrushConfig = null,
    on: vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgEventStream = null,
    resolve: SelectionResolution = null,
    translate: java.lang.String | scala.Boolean = null,
    zoom: java.lang.String | scala.Boolean = null
  ): IntervalSelectionConfig = {
    val __obj = js.Dynamic.literal()
    if (bind != null) __obj.updateDynamic("bind")(bind)
    if (empty != null) __obj.updateDynamic("empty")(empty.asInstanceOf[js.Any])
    if (encodings != null) __obj.updateDynamic("encodings")(encodings)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (mark != null) __obj.updateDynamic("mark")(mark)
    if (on != null) __obj.updateDynamic("on")(on)
    if (resolve != null) __obj.updateDynamic("resolve")(resolve)
    if (translate != null) __obj.updateDynamic("translate")(translate.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntervalSelectionConfig]
  }
}

