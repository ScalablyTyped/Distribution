package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CheckBox extends js.Object {
  var checkBox: scala.Double
  var combo: scala.Double
  var none: scala.Double
  var passwordBox: scala.Double
  var radioButtons: scala.Double
  var textArea: scala.Double
  var textBox: scala.Double
}

object Anon_CheckBox {
  @scala.inline
  def apply(
    checkBox: scala.Double,
    combo: scala.Double,
    none: scala.Double,
    passwordBox: scala.Double,
    radioButtons: scala.Double,
    textArea: scala.Double,
    textBox: scala.Double
  ): Anon_CheckBox = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("checkBox")(checkBox)
    __obj.updateDynamic("combo")(combo)
    __obj.updateDynamic("none")(none)
    __obj.updateDynamic("passwordBox")(passwordBox)
    __obj.updateDynamic("radioButtons")(radioButtons)
    __obj.updateDynamic("textArea")(textArea)
    __obj.updateDynamic("textBox")(textBox)
    __obj.asInstanceOf[Anon_CheckBox]
  }
}

