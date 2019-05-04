package typings
package vegaDashLiteLib.buildSrcSelectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionConfig extends js.Object {
  /**
    * The default definition for an [`interval`](https://vega.github.io/vega-lite/docs/selection.html#type) selection. All properties and transformations
    * for an interval selection definition (except `type`) may be specified here.
    *
    * For instance, setting `interval` to `{"translate": false}` disables the ability to move
    * interval selections by default.
    */
  var interval: js.UndefOr[IntervalSelectionConfig] = js.undefined
  /**
    * The default definition for a [`multi`](https://vega.github.io/vega-lite/docs/selection.html#type) selection. All properties and transformations
    * for a multi selection definition (except `type`) may be specified here.
    *
    * For instance, setting `multi` to `{"toggle": "event.altKey"}` adds additional values to
    * multi selections when clicking with the alt-key pressed by default.
    */
  var multi: js.UndefOr[MultiSelectionConfig] = js.undefined
  /**
    * The default definition for a [`single`](https://vega.github.io/vega-lite/docs/selection.html#type) selection. All properties and transformations
    *  for a single selection definition (except `type`) may be specified here.
    *
    * For instance, setting `single` to `{"on": "dblclick"}` populates single selections on double-click by default.
    */
  var single: js.UndefOr[SingleSelectionConfig] = js.undefined
}

object SelectionConfig {
  @scala.inline
  def apply(
    interval: IntervalSelectionConfig = null,
    multi: MultiSelectionConfig = null,
    single: SingleSelectionConfig = null
  ): SelectionConfig = {
    val __obj = js.Dynamic.literal()
    if (interval != null) __obj.updateDynamic("interval")(interval)
    if (multi != null) __obj.updateDynamic("multi")(multi)
    if (single != null) __obj.updateDynamic("single")(single)
    __obj.asInstanceOf[SelectionConfig]
  }
}

