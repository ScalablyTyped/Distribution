package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCheckBox extends js.Object {
  var checkBox: Double
  var combo: Double
  var none: Double
  var passwordBox: Double
  var radioButtons: Double
  var textArea: Double
  var textBox: Double
}

object AnonCheckBox {
  @scala.inline
  def apply(
    checkBox: Double,
    combo: Double,
    none: Double,
    passwordBox: Double,
    radioButtons: Double,
    textArea: Double,
    textBox: Double
  ): AnonCheckBox = {
    val __obj = js.Dynamic.literal(checkBox = checkBox.asInstanceOf[js.Any], combo = combo.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], passwordBox = passwordBox.asInstanceOf[js.Any], radioButtons = radioButtons.asInstanceOf[js.Any], textArea = textArea.asInstanceOf[js.Any], textBox = textBox.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCheckBox]
  }
}

