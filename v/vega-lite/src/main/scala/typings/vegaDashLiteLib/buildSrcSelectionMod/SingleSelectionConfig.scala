package typings
package vegaDashLiteLib.buildSrcSelectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SingleSelectionConfig extends BaseSelectionDef {
  /**
    * Establish a two-way binding between a single selection and input elements
    * (also known as dynamic query widgets). A binding takes the form of
    * Vega's [input element binding definition](https://vega.github.io/vega/docs/signals/#bind)
    * or can be a mapping between projected field/encodings and binding definitions.
    *
    * See the [bind transform](https://vega.github.io/vega-lite/docs/bind.html) documentation for more information.
    */
  var bind: js.UndefOr[
    vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgBinding | org.scalablytyped.runtime.StringDictionary[vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgBinding]
  ] = js.undefined
  /**
    * When true, an invisible voronoi diagram is computed to accelerate discrete
    * selection. The data value _nearest_ the mouse cursor is added to the selection.
    *
    * See the [nearest transform](https://vega.github.io/vega-lite/docs/nearest.html) documentation for more information.
    */
  var nearest: js.UndefOr[scala.Boolean] = js.undefined
}

object SingleSelectionConfig {
  @scala.inline
  def apply(
    bind: vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgBinding | org.scalablytyped.runtime.StringDictionary[vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgBinding] = null,
    empty: vegaDashLiteLib.vegaDashLiteLibStrings.all | vegaDashLiteLib.vegaDashLiteLibStrings.none = null,
    encodings: js.Array[vegaDashLiteLib.buildSrcChannelMod.SingleDefChannel] = null,
    fields: js.Array[java.lang.String] = null,
    nearest: js.UndefOr[scala.Boolean] = js.undefined,
    on: vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgEventStream = null,
    resolve: SelectionResolution = null
  ): SingleSelectionConfig = {
    val __obj = js.Dynamic.literal()
    if (bind != null) __obj.updateDynamic("bind")(bind.asInstanceOf[js.Any])
    if (empty != null) __obj.updateDynamic("empty")(empty.asInstanceOf[js.Any])
    if (encodings != null) __obj.updateDynamic("encodings")(encodings)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (!js.isUndefined(nearest)) __obj.updateDynamic("nearest")(nearest)
    if (on != null) __obj.updateDynamic("on")(on)
    if (resolve != null) __obj.updateDynamic("resolve")(resolve)
    __obj.asInstanceOf[SingleSelectionConfig]
  }
}

