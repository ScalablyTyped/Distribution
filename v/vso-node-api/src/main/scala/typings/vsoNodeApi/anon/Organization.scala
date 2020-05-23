package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Organization extends js.Object {
  var organization: scala.Double
  var `private`: scala.Double
  var public: scala.Double
  var unchanged: scala.Double
}

object Organization {
  @scala.inline
  def apply(organization: scala.Double, `private`: scala.Double, public: scala.Double, unchanged: scala.Double): Organization = {
    val __obj = js.Dynamic.literal(organization = organization.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any], unchanged = unchanged.asInstanceOf[js.Any])
    __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Organization]
  }
}

