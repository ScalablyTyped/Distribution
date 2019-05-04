package typings
package vegaDashLiteLib.buildSrcToplevelpropsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TopLevelProperties extends js.Object {
  /**
    * Sets how the visualization size should be determined. If a string, should be one of `"pad"`, `"fit"` or `"none"`.
    * Object values can additionally specify parameters for content sizing and automatic resizing.
    * `"fit"` is only supported for single and layered views that don't use `rangeStep`.
    *
    * __Default value__: `pad`
    */
  var autosize: js.UndefOr[AutosizeType | AutoSizeParams] = js.undefined
  /**
    * CSS color property to use as the background of visualization.
    *
    * __Default value:__ none (transparent)
    */
  var background: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A global data store for named datasets. This is a mapping from names to inline datasets.
    * This can be an array of objects or primitive values or a string. Arrays of primitive values are ingested as objects with a `data` property.
    */
  var datasets: js.UndefOr[Datasets] = js.undefined
  /**
    * The default visualization padding, in pixels, from the edge of the visualization canvas to the data rectangle.  If a number, specifies padding for all sides.
    * If an object, the value should have the format `{"left": 5, "top": 5, "right": 5, "bottom": 5}` to specify padding for each side of the visualization.
    *
    * __Default value__: `5`
    */
  var padding: js.UndefOr[Padding] = js.undefined
}

object TopLevelProperties {
  @scala.inline
  def apply(
    autosize: AutosizeType | AutoSizeParams = null,
    background: java.lang.String = null,
    datasets: Datasets = null,
    padding: Padding = null
  ): TopLevelProperties = {
    val __obj = js.Dynamic.literal()
    if (autosize != null) __obj.updateDynamic("autosize")(autosize.asInstanceOf[js.Any])
    if (background != null) __obj.updateDynamic("background")(background)
    if (datasets != null) __obj.updateDynamic("datasets")(datasets)
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopLevelProperties]
  }
}

