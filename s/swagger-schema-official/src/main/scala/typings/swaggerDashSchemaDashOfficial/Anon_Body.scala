package typings.swaggerDashSchemaDashOfficial

import typings.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialMod.Schema
import typings.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialStrings.body
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Body extends js.Object {
  var in: body
  var schema: js.UndefOr[Schema] = js.undefined
}

object Anon_Body {
  @scala.inline
  def apply(in: body, schema: Schema = null): Anon_Body = {
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Body]
  }
}

