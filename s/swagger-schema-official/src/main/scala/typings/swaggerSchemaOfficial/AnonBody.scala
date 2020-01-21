package typings.swaggerSchemaOfficial

import typings.swaggerSchemaOfficial.mod.Schema
import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.body
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBody extends js.Object {
  var in: body
  var schema: js.UndefOr[Schema] = js.undefined
}

object AnonBody {
  @scala.inline
  def apply(in: body, schema: Schema = null): AnonBody = {
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBody]
  }
}

