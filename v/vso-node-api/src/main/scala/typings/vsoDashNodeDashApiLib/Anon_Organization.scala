package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Organization extends js.Object {
  var organization: scala.Double
  var `private`: scala.Double
  var public: scala.Double
  var unchanged: scala.Double
}

object Anon_Organization {
  @scala.inline
  def apply(organization: scala.Double, `private`: scala.Double, public: scala.Double, unchanged: scala.Double): Anon_Organization = {
    val __obj = js.Dynamic.literal(`private` = `private`)
    __obj.updateDynamic("organization")(organization)
    __obj.updateDynamic("public")(public)
    __obj.updateDynamic("unchanged")(unchanged)
    __obj.asInstanceOf[Anon_Organization]
  }
}

