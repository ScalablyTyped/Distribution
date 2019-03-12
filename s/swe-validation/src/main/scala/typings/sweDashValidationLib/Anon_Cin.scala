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
    cin: scala.Double => sweDashValidationLib.sweDashValidationMod.cin,
    ssn: scala.Double => sweDashValidationLib.sweDashValidationMod.ssn
  ): Anon_Cin = {
    val __obj = js.Dynamic.literal(cin = js.Any.fromFunction1(cin), ssn = js.Any.fromFunction1(ssn))
  
    __obj.asInstanceOf[Anon_Cin]
  }
}

