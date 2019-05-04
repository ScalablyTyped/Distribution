package typings
package vegaDashLiteLib.buildSrcSelectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiSelectionConfig extends BaseSelectionDef {
  /**
    * When true, an invisible voronoi diagram is computed to accelerate discrete
    * selection. The data value _nearest_ the mouse cursor is added to the selection.
    *
    * See the [nearest transform](https://vega.github.io/vega-lite/docs/nearest.html) documentation for more information.
    */
  var nearest: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Controls whether data values should be toggled or only ever inserted into
    * multi selections. Can be `true`, `false` (for insertion only), or a
    * [Vega expression](https://vega.github.io/vega/docs/expressions/).
    *
    * __Default value:__ `true`, which corresponds to `event.shiftKey` (i.e.,
    * data values are toggled when a user interacts with the shift-key pressed).
    *
    * See the [toggle transform](https://vega.github.io/vega-lite/docs/toggle.html) documentation for more information.
    */
  var toggle: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
}

object MultiSelectionConfig {
  @scala.inline
  def apply(
    empty: vegaDashLiteLib.vegaDashLiteLibStrings.all | vegaDashLiteLib.vegaDashLiteLibStrings.none = null,
    encodings: js.Array[vegaDashLiteLib.buildSrcChannelMod.SingleDefChannel] = null,
    fields: js.Array[java.lang.String] = null,
    nearest: js.UndefOr[scala.Boolean] = js.undefined,
    on: vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgEventStream = null,
    resolve: SelectionResolution = null,
    toggle: java.lang.String | scala.Boolean = null
  ): MultiSelectionConfig = {
    val __obj = js.Dynamic.literal()
    if (empty != null) __obj.updateDynamic("empty")(empty.asInstanceOf[js.Any])
    if (encodings != null) __obj.updateDynamic("encodings")(encodings)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (!js.isUndefined(nearest)) __obj.updateDynamic("nearest")(nearest)
    if (on != null) __obj.updateDynamic("on")(on)
    if (resolve != null) __obj.updateDynamic("resolve")(resolve)
    if (toggle != null) __obj.updateDynamic("toggle")(toggle.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiSelectionConfig]
  }
}

