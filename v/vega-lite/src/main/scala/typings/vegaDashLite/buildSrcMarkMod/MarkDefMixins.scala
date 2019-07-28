package typings.vegaDashLite.buildSrcMarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkDefMixins extends js.Object {
  /**
    * Whether a mark be clipped to the enclosing group’s width and height.
    */
  var clip: js.UndefOr[Boolean] = js.undefined
  /**
    * A string or array of strings indicating the name of custom styles to apply to the mark. A style is a named collection of mark property defaults defined within the [style configuration](https://vega.github.io/vega-lite/docs/mark.html#style-config). If style is an array, later styles will override earlier styles. Any [mark properties](https://vega.github.io/vega-lite/docs/encoding.html#mark-prop) explicitly defined within the `encoding` will override a style default.
    *
    * __Default value:__ The mark's name.  For example, a bar mark will have style `"bar"` by default.
    * __Note:__ Any specified style will augment the default style. For example, a bar mark with `"style": "foo"` will receive from `config.style.bar` and `config.style.foo` (the specified style `"foo"` has higher precedence).
    */
  var style: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * Offset for x2-position.
    */
  var x2Offset: js.UndefOr[Double] = js.undefined
  /**
    * Offset for x-position.
    */
  var xOffset: js.UndefOr[Double] = js.undefined
  /**
    * Offset for y2-position.
    */
  var y2Offset: js.UndefOr[Double] = js.undefined
  /**
    * Offset for y-position.
    */
  var yOffset: js.UndefOr[Double] = js.undefined
}

object MarkDefMixins {
  @scala.inline
  def apply(
    clip: js.UndefOr[Boolean] = js.undefined,
    style: String | js.Array[String] = null,
    x2Offset: Int | Double = null,
    xOffset: Int | Double = null,
    y2Offset: Int | Double = null,
    yOffset: Int | Double = null
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

