package typings
package sweDashValidationLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cin extends js.Object {
  def cin(number: scala.Double): sweDashValidationLib.sweDashValidationMod.cin
  def ssn(number: scala.Double): sweDashValidationLib.sweDashValidationMod.ssn
}

object Anon_Cin {
  @scala.inline
  def apply(
    cin: js.Function1[scala.Double, sweDashValidationLib.sweDashValidationMod.cin],
    ssn: js.Function1[scala.Double, sweDashValidationLib.sweDashValidationMod.ssn]
  ): Anon_Cin = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cin")(cin)
    __obj.updateDynamic("ssn")(ssn)
    __obj.asInstanceOf[Anon_Cin]
  }
}

