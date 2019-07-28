package typings.typesettable.buildSrcContextsCanvasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICanvasFontStyle extends js.Object {
  /**
    * An optional fill color.
    *
    * If `null` the text will not be filled. But, if `undefined` we will
    * default to `#444` filled text.
    */
  var fill: js.UndefOr[String] = js.undefined
  /**
    * An optional CSS font string.
    *
    * If `null` or `undefined`, we will not set the font before writing text,
    * but there may already be a font style defined on the canvas rendering
    * context.
    */
  var font: js.UndefOr[String] = js.undefined
  /**
    * An optional stroke color.
    *
    * If `null` or `undefined` the text will not be stroked.
    */
  var stroke: js.UndefOr[String] = js.undefined
}

object ICanvasFontStyle {
  @scala.inline
  def apply(fill: String = null, font: String = null, stroke: String = null): ICanvasFontStyle = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (font != null) __obj.updateDynamic("font")(font)
    if (stroke != null) __obj.updateDynamic("stroke")(stroke)
    __obj.asInstanceOf[ICanvasFontStyle]
  }
}

