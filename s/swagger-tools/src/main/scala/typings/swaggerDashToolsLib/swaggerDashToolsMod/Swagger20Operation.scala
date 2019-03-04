package typings
package swaggerDashToolsLib.swaggerDashToolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Swagger20Operation extends js.Object {
  var operationId: js.UndefOr[java.lang.String] = js.undefined
  var parameters: js.UndefOr[js.Array[SwaggerParameterSchema]] = js.undefined
  var responses: org.scalablytyped.runtime.StringDictionary[Swagger20Response]
  var security: js.UndefOr[js.Array[Swagger20Security]] = js.undefined
  var summary: js.UndefOr[java.lang.String] = js.undefined
  var tags: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Swagger20Operation {
  @scala.inline
  def apply(
    responses: org.scalablytyped.runtime.StringDictionary[Swagger20Response],
    operationId: java.lang.String = null,
    parameters: js.Array[SwaggerParameterSchema] = null,
    security: js.Array[Swagger20Security] = null,
    summary: java.lang.String = null,
    tags: js.Array[java.lang.String] = null
  ): Swagger20Operation = {
    val __obj = js.Dynamic.literal(responses = responses)
    if (operationId != null) __obj.updateDynamic("operationId")(operationId)
    if (parameters != null) __obj.updateDynamic("parameters")(parameters)
    if (security != null) __obj.updateDynamic("security")(security)
    if (summary != null) __obj.updateDynamic("summary")(summary)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[Swagger20Operation]
  }
}

