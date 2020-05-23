package typings.wordpressComponents.colorIndicatorMod.ColorIndicator

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.std.HTMLSpanElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props
  extends AllHTMLAttributes[HTMLSpanElement]
     with ClassAttributes[HTMLSpanElement] {
  /**
    * A string color value.
    */
  var colorValue: String
}

object Props {
  @scala.inline
  def apply(
    colorValue: String,
    AllHTMLAttributes: AllHTMLAttributes[HTMLSpanElement] = null,
    ClassAttributes: ClassAttributes[HTMLSpanElement] = null
  ): Props = {
    val __obj = js.Dynamic.literal(colorValue = colorValue.asInstanceOf[js.Any])
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    __obj.asInstanceOf[Props]
  }
}

