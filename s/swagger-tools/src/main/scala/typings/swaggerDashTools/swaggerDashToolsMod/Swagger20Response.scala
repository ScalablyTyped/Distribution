package typings.swaggerDashTools.swaggerDashToolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Swagger20Response extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var schema: js.UndefOr[js.Any] = js.undefined
}

object Swagger20Response {
  @scala.inline
  def apply(description: String = null, schema: js.Any = null): Swagger20Response = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (schema != null) __obj.updateDynamic("schema")(schema)
    __obj.asInstanceOf[Swagger20Response]
  }
}

