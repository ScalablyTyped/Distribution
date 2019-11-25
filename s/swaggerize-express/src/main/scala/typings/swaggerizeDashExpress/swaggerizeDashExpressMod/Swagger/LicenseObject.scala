package typings.swaggerizeDashExpress.swaggerizeDashExpressMod.Swagger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LicenseObject extends js.Object {
  var name: String
  var url: js.UndefOr[String] = js.undefined
}

object LicenseObject {
  @scala.inline
  def apply(name: String, url: String = null): LicenseObject = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[LicenseObject]
  }
}

