package typings.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Info extends js.Object {
  var contact: js.UndefOr[Contact] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var license: js.UndefOr[License] = js.undefined
  var termsOfService: js.UndefOr[String] = js.undefined
  var title: String
  var version: String
}

object Info {
  @scala.inline
  def apply(
    title: String,
    version: String,
    contact: Contact = null,
    description: String = null,
    license: License = null,
    termsOfService: String = null
  ): Info = {
    val __obj = js.Dynamic.literal(title = title, version = version)
    if (contact != null) __obj.updateDynamic("contact")(contact)
    if (description != null) __obj.updateDynamic("description")(description)
    if (license != null) __obj.updateDynamic("license")(license)
    if (termsOfService != null) __obj.updateDynamic("termsOfService")(termsOfService)
    __obj.asInstanceOf[Info]
  }
}

