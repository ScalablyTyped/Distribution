package typings.swaggerExpressMiddleware.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InfoObject extends js.Object {
  var contact: js.UndefOr[ContactObject] = js.native
  var description: js.UndefOr[String] = js.native
  var license: js.UndefOr[LicenseObject] = js.native
  var termsOfService: js.UndefOr[String] = js.native
  var title: String = js.native
  var version: String = js.native
}

object InfoObject {
  @scala.inline
  def apply(title: String, version: String): InfoObject = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[InfoObject]
  }
  @scala.inline
  implicit class InfoObjectOps[Self <: InfoObject] (val x: Self) extends AnyVal {
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
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def setContact(value: ContactObject): Self = this.set("contact", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContact: Self = this.set("contact", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setLicense(value: LicenseObject): Self = this.set("license", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLicense: Self = this.set("license", js.undefined)
    @scala.inline
    def setTermsOfService(value: String): Self = this.set("termsOfService", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTermsOfService: Self = this.set("termsOfService", js.undefined)
  }
  
}

