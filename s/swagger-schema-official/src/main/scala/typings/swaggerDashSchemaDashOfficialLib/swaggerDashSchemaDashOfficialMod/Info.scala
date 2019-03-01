package typings
package swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Info extends js.Object {
  var contact: js.UndefOr[Contact] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var license: js.UndefOr[License] = js.undefined
  var termsOfService: js.UndefOr[java.lang.String] = js.undefined
  var title: java.lang.String
  var version: java.lang.String
}

object Info {
  @scala.inline
  def apply(
    title: java.lang.String,
    version: java.lang.String,
    contact: Contact = null,
    description: java.lang.String = null,
    license: License = null,
    termsOfService: java.lang.String = null
  ): Info = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("title")(title)
    __obj.updateDynamic("version")(version)
    if (contact != null) __obj.updateDynamic("contact")(contact)
    if (description != null) __obj.updateDynamic("description")(description)
    if (license != null) __obj.updateDynamic("license")(license)
    if (termsOfService != null) __obj.updateDynamic("termsOfService")(termsOfService)
    __obj.asInstanceOf[Info]
  }
}

