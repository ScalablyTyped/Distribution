package typings.swaggerJsdoc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApiInformation extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var title: String
  var version: String
}

object ApiInformation {
  @scala.inline
  def apply(title: String, version: String, description: String = null): ApiInformation = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiInformation]
  }
}

