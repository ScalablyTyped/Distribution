package typings
package swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response extends js.Object {
  var description: java.lang.String
  var examples: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Object]] = js.undefined
  var headers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[Header]] = js.undefined
  var schema: js.UndefOr[Schema] = js.undefined
}

object Response {
  @scala.inline
  def apply(
    description: java.lang.String,
    examples: org.scalablytyped.runtime.StringDictionary[js.Object] = null,
    headers: org.scalablytyped.runtime.StringDictionary[Header] = null,
    schema: Schema = null
  ): Response = {
    val __obj = js.Dynamic.literal(description = description)
    if (examples != null) __obj.updateDynamic("examples")(examples)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (schema != null) __obj.updateDynamic("schema")(schema)
    __obj.asInstanceOf[Response]
  }
}

