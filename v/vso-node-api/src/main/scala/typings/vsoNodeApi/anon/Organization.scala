package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Organization extends js.Object {
  var organization: scala.Double = js.native
  var `private`: scala.Double = js.native
  var public: scala.Double = js.native
  var unchanged: scala.Double = js.native
}

object Organization {
  @scala.inline
  def apply(organization: scala.Double, `private`: scala.Double, public: scala.Double, unchanged: scala.Double): Organization = {
    val __obj = js.Dynamic.literal(organization = organization.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any], unchanged = unchanged.asInstanceOf[js.Any])
    __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Organization]
  }
  @scala.inline
  implicit class OrganizationOps[Self <: Organization] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOrganization(value: scala.Double): Self = this.set("organization", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrivate(value: scala.Double): Self = this.set("private", value.asInstanceOf[js.Any])
    @scala.inline
    def setPublic(value: scala.Double): Self = this.set("public", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnchanged(value: scala.Double): Self = this.set("unchanged", value.asInstanceOf[js.Any])
  }
  
}

