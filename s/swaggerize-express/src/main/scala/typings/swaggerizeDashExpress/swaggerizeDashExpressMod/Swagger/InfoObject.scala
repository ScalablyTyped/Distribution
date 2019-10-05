package typings.swaggerizeDashExpress.swaggerizeDashExpressMod.Swagger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InfoObject extends js.Object {
  var contact: js.UndefOr[ContactObject] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var license: js.UndefOr[LicenseObject] = js.undefined
  var termsOfService: js.UndefOr[String] = js.undefined
  var title: String
  var version: String
}

object InfoObject {
  @scala.inline
  def apply(
    title: String,
    version: String,
    contact: ContactObject = null,
    description: String = null,
    license: LicenseObject = null,
    termsOfService: String = null
  ): InfoObject = {
    val __obj = js.Dynamic.literal(title = title, version = version)
    if (contact != null) __obj.updateDynamic("contact")(contact)
    if (description != null) __obj.updateDynamic("description")(description)
    if (license != null) __obj.updateDynamic("license")(license)
    if (termsOfService != null) __obj.updateDynamic("termsOfService")(termsOfService)
    __obj.asInstanceOf[InfoObject]
  }
}

