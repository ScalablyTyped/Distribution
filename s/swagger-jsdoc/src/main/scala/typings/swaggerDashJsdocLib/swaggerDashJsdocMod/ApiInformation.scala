package typings
package swaggerDashJsdocLib.swaggerDashJsdocMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApiInformation extends js.Object {
  var description: js.UndefOr[java.lang.String] = js.undefined
  var title: java.lang.String
  var version: java.lang.String
}

object ApiInformation {
  @scala.inline
  def apply(title: java.lang.String, version: java.lang.String, description: java.lang.String = null): ApiInformation = {
    val __obj = js.Dynamic.literal(title = title, version = version)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[ApiInformation]
  }
}

