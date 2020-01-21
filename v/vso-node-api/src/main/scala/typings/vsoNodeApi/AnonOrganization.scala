package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOrganization extends js.Object {
  var organization: Double
  var `private`: Double
  var public: Double
  var unchanged: Double
}

object AnonOrganization {
  @scala.inline
  def apply(organization: Double, `private`: Double, public: Double, unchanged: Double): AnonOrganization = {
    val __obj = js.Dynamic.literal(organization = organization.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any], unchanged = unchanged.asInstanceOf[js.Any])
    __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOrganization]
  }
}

