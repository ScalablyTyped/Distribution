package typings
package vegaDashLiteLib.buildSrcMarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkDefMixins extends js.Object {
  /**
    * Whether a mark be clipped to the enclosing group’s width and height.
    */
  var clip: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A string or array of strings indicating the name of custom styles to apply to the mark. A style is a named collection of mark property defaults defined within the [style configuration](https://vega.github.io/vega-lite/docs/mark.html#style-config). If style is an array, later styles will override earlier styles. Any [mark properties](https://vega.github.io/vega-lite/docs/encoding.html#mark-prop) explicitly defined within the `encoding` will override a style default.
    *
    * __Default value:__ The mark's name.  For example, a bar mark will have style `"bar"` by default.
    * __Note:__ Any specified style will augment the default style. For example, a bar mark with `"style": "foo"` will receive from `config.style.bar` and `config.style.foo` (the specified style `"foo"` has higher precedence).
    */
  var style: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /**
    * Offset for x2-position.
    */
  var x2Offset: js.UndefOr[scala.Double] = js.undefined
  /**
    * Offset for x-position.
    */
  var xOffset: js.UndefOr[scala.Double] = js.undefined
  /**
    * Offset for y2-position.
    */
  var y2Offset: js.UndefOr[scala.Double] = js.undefined
  /**
    * Offset for y-position.
    */
  var yOffset: js.UndefOr[scala.Double] = js.undefined
}

object MarkDefMixins {
  @scala.inline
  def apply(
    clip: js.UndefOr[scala.Boolean] = js.undefined,
    style: java.lang.String | js.Array[java.lang.String] = null,
    x2Offset: scala.Int | scala.Double = null,
    xOffset: scala.Int | scala.Double = null,
    y2Offset: scala.Int | scala.Double = null,
    yOffset: scala.Int | scala.Double = null
  ): MarkDefMixins = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clip)) __obj.updateDynamic("clip")(clip)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (x2Offset != null) __obj.updateDynamic("x2Offset")(x2Offset.asInstanceOf[js.Any])
    if (xOffset != null) __obj.updateDynamic("xOffset")(xOffset.asInstanceOf[js.Any])
    if (y2Offset != null) __obj.updateDynamic("y2Offset")(y2Offset.asInstanceOf[js.Any])
    if (yOffset != null) __obj.updateDynamic("yOffset")(yOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkDefMixins]
  }
}

