package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BuiltIn extends js.Object {
  var builtIn: scala.Double
  var trusted: scala.Double
}

object Anon_BuiltIn {
  @scala.inline
  def apply(builtIn: scala.Double, trusted: scala.Double): Anon_BuiltIn = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("builtIn")(builtIn)
    __obj.updateDynamic("trusted")(trusted)
    __obj.asInstanceOf[Anon_BuiltIn]
  }
}

