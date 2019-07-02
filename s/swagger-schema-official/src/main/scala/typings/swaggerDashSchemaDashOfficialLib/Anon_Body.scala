package typings
package swaggerDashSchemaDashOfficialLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Body extends js.Object {
  var in: swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialLibStrings.body
  var schema: js.UndefOr[swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialMod.Schema] = js.undefined
}

object Anon_Body {
  @scala.inline
  def apply(
    in: swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialLibStrings.body,
    schema: swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialMod.Schema = null
  ): Anon_Body = {
    val __obj = js.Dynamic.literal(in = in)
    if (schema != null) __obj.updateDynamic("schema")(schema)
    __obj.asInstanceOf[Anon_Body]
  }
}

