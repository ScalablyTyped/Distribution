package typings
package waitDashOnLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Pass
  extends waitDashOnLib.waitDashOnMod.waitOnNs.WaitOnAuth {
  /**
    * Alias of password
    */
  var pass: java.lang.String
  /**
    * Alias of username
    */
  var user: java.lang.String
}

object Anon_Pass {
  @scala.inline
  def apply(pass: java.lang.String, user: java.lang.String): Anon_Pass = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pass")(pass)
    __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[Anon_Pass]
  }
}

