package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IncludeEmailAddress extends js.Object {
  var includeEmailAddress: scala.Double
  var includeExtensions: scala.Double
  var none: scala.Double
}

object Anon_IncludeEmailAddress {
  @scala.inline
  def apply(includeEmailAddress: scala.Double, includeExtensions: scala.Double, none: scala.Double): Anon_IncludeEmailAddress = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("includeEmailAddress")(includeEmailAddress)
    __obj.updateDynamic("includeExtensions")(includeExtensions)
    __obj.updateDynamic("none")(none)
    __obj.asInstanceOf[Anon_IncludeEmailAddress]
  }
}

