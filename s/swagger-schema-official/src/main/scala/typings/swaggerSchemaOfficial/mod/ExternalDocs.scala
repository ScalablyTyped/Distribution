package typings.swaggerSchemaOfficial.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExternalDocs extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var url: String
}

object ExternalDocs {
  @scala.inline
  def apply(url: String, description: String = null): ExternalDocs = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalDocs]
  }
}

