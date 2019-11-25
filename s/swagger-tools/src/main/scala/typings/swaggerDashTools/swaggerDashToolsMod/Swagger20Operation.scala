package typings.swaggerDashTools.swaggerDashToolsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Swagger20Operation extends js.Object {
  var operationId: js.UndefOr[String] = js.undefined
  var parameters: js.UndefOr[js.Array[SwaggerParameterSchema]] = js.undefined
  var responses: StringDictionary[Swagger20Response]
  var security: js.UndefOr[js.Array[Swagger20Security]] = js.undefined
  var summary: js.UndefOr[String] = js.undefined
  var tags: js.UndefOr[js.Array[String]] = js.undefined
}

object Swagger20Operation {
  @scala.inline
  def apply(
    responses: StringDictionary[Swagger20Response],
    operationId: String = null,
    parameters: js.Array[SwaggerParameterSchema] = null,
    security: js.Array[Swagger20Security] = null,
    summary: String = null,
    tags: js.Array[String] = null
  ): Swagger20Operation = {
    val __obj = js.Dynamic.literal(responses = responses.asInstanceOf[js.Any])
    if (operationId != null) __obj.updateDynamic("operationId")(operationId.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    if (security != null) __obj.updateDynamic("security")(security.asInstanceOf[js.Any])
    if (summary != null) __obj.updateDynamic("summary")(summary.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Swagger20Operation]
  }
}

