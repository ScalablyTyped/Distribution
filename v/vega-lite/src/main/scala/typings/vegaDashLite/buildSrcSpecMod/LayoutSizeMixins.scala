package typings.vegaDashLite.buildSrcSpecMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayoutSizeMixins extends js.Object {
  /**
    * The height of a visualization.
    *
    * __Default value:__
    * - If a view's [`autosize`](https://vega.github.io/vega-lite/docs/size.html#autosize) type is `"fit"` or its y-channel has a [continuous scale](https://vega.github.io/vega-lite/docs/scale.html#continuous), the height will be the value of [`config.view.height`](https://vega.github.io/vega-lite/docs/spec.html#config).
    * - For y-axis with a band or point scale: if [`rangeStep`](https://vega.github.io/vega-lite/docs/scale.html#band) is a numeric value or unspecified, the height is [determined by the range step, paddings, and the cardinality of the field mapped to y-channel](https://vega.github.io/vega-lite/docs/scale.html#band). Otherwise, if the `rangeStep` is `null`, the height will be the value of [`config.view.height`](https://vega.github.io/vega-lite/docs/spec.html#config).
    * - If no field is mapped to `y` channel, the `height` will be the value of `rangeStep`.
    *
    * __Note__: For plots with [`row` and `column` channels](https://vega.github.io/vega-lite/docs/encoding.html#facet), this represents the height of a single view.
    *
    * __See also:__ The documentation for [width and height](https://vega.github.io/vega-lite/docs/size.html) contains more examples.
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * The width of a visualization.
    *
    * __Default value:__ This will be determined by the following rules:
    *
    * - If a view's [`autosize`](https://vega.github.io/vega-lite/docs/size.html#autosize) type is `"fit"` or its x-channel has a [continuous scale](https://vega.github.io/vega-lite/docs/scale.html#continuous), the width will be the value of [`config.view.width`](https://vega.github.io/vega-lite/docs/spec.html#config).
    * - For x-axis with a band or point scale: if [`rangeStep`](https://vega.github.io/vega-lite/docs/scale.html#band) is a numeric value or unspecified, the width is [determined by the range step, paddings, and the cardinality of the field mapped to x-channel](https://vega.github.io/vega-lite/docs/scale.html#band).   Otherwise, if the `rangeStep` is `null`, the width will be the value of [`config.view.width`](https://vega.github.io/vega-lite/docs/spec.html#config).
    * - If no field is mapped to `x` channel, the `width` will be the value of [`config.scale.textXRangeStep`](https://vega.github.io/vega-lite/docs/size.html#default-width-and-height) for `text` mark and the value of `rangeStep` for other marks.
    *
    * __Note:__ For plots with [`row` and `column` channels](https://vega.github.io/vega-lite/docs/encoding.html#facet), this represents the width of a single view.
    *
    * __See also:__ The documentation for [width and height](https://vega.github.io/vega-lite/docs/size.html) contains more examples.
    */
  var width: js.UndefOr[Double] = js.undefined
}

object LayoutSizeMixins {
  @scala.inline
  def apply(height: Int | Double = null, width: Int | Double = null): LayoutSizeMixins = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutSizeMixins]
  }
}

