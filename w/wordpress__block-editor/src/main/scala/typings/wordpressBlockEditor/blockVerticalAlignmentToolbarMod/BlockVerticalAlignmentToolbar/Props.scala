package typings.wordpressBlockEditor.blockVerticalAlignmentToolbarMod.BlockVerticalAlignmentToolbar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var value: Value
  def onChange(newValue: Value): Unit
}

object Props {
  @scala.inline
  def apply(onChange: Value => Unit, value: Value = null): Props = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

