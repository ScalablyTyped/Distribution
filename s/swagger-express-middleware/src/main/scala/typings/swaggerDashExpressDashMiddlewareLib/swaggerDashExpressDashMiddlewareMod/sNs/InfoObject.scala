package typings
package swaggerDashExpressDashMiddlewareLib.swaggerDashExpressDashMiddlewareMod.sNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InfoObject extends js.Object {
  var contact: js.UndefOr[ContactObject] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var license: js.UndefOr[LicenseObject] = js.undefined
  var termsOfService: js.UndefOr[java.lang.String] = js.undefined
  var title: java.lang.String
  var version: java.lang.String
}

object InfoObject {
  @scala.inline
  def apply(
    title: java.lang.String,
    version: java.lang.String,
    contact: ContactObject = null,
    description: java.lang.String = null,
    license: LicenseObject = null,
    termsOfService: java.lang.String = null
  ): InfoObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("title")(title)
    __obj.updateDynamic("version")(version)
    if (contact != null) __obj.updateDynamic("contact")(contact)
    if (description != null) __obj.updateDynamic("description")(description)
    if (license != null) __obj.updateDynamic("license")(license)
    if (termsOfService != null) __obj.updateDynamic("termsOfService")(termsOfService)
    __obj.asInstanceOf[InfoObject]
  }
}

