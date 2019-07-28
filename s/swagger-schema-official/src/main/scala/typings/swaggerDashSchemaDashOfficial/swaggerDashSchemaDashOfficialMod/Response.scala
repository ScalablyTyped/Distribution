package typings.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response extends js.Object {
  var description: String
  var examples: js.UndefOr[StringDictionary[js.Object]] = js.undefined
  var headers: js.UndefOr[StringDictionary[Header]] = js.undefined
  var schema: js.UndefOr[Schema] = js.undefined
}

object Response {
  @scala.inline
  def apply(
    description: String,
    examples: StringDictionary[js.Object] = null,
    headers: StringDictionary[Header] = null,
    schema: Schema = null
  ): Response = {
    val __obj = js.Dynamic.literal(description = description)
    if (examples != null) __obj.updateDynamic("examples")(examples)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (schema != null) __obj.updateDynamic("schema")(schema)
    __obj.asInstanceOf[Response]
  }
}

