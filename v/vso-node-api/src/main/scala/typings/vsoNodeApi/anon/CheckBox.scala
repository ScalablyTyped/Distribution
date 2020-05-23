package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckBox extends js.Object {
  var checkBox: scala.Double
  var combo: scala.Double
  var none: scala.Double
  var passwordBox: scala.Double
  var radioButtons: scala.Double
  var textArea: scala.Double
  var textBox: scala.Double
}

object CheckBox {
  @scala.inline
  def apply(
    checkBox: scala.Double,
    combo: scala.Double,
    none: scala.Double,
    passwordBox: scala.Double,
    radioButtons: scala.Double,
    textArea: scala.Double,
    textBox: scala.Double
  ): CheckBox = {
    val __obj = js.Dynamic.literal(checkBox = checkBox.asInstanceOf[js.Any], combo = combo.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], passwordBox = passwordBox.asInstanceOf[js.Any], radioButtons = radioButtons.asInstanceOf[js.Any], textArea = textArea.asInstanceOf[js.Any], textBox = textBox.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckBox]
  }
}

