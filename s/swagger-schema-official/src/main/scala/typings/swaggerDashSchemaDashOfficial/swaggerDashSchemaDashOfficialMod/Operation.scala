package typings.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Operation extends js.Object {
  var consumes: js.UndefOr[js.Array[String]] = js.undefined
  var deprecated: js.UndefOr[Boolean] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var externalDocs: js.UndefOr[ExternalDocs] = js.undefined
  var operationId: js.UndefOr[String] = js.undefined
  var parameters: js.UndefOr[js.Array[Parameter | Reference]] = js.undefined
  var produces: js.UndefOr[js.Array[String]] = js.undefined
  var responses: StringDictionary[Response | Reference]
  var schemes: js.UndefOr[js.Array[String]] = js.undefined
  var security: js.UndefOr[js.Array[Security]] = js.undefined
  var summary: js.UndefOr[String] = js.undefined
  var tags: js.UndefOr[js.Array[String]] = js.undefined
}

object Operation {
  @scala.inline
  def apply(
    responses: StringDictionary[Response | Reference],
    consumes: js.Array[String] = null,
    deprecated: js.UndefOr[Boolean] = js.undefined,
    description: String = null,
    externalDocs: ExternalDocs = null,
    operationId: String = null,
    parameters: js.Array[Parameter | Reference] = null,
    produces: js.Array[String] = null,
    schemes: js.Array[String] = null,
    security: js.Array[Security] = null,
    summary: String = null,
    tags: js.Array[String] = null
  ): Operation = {
    val __obj = js.Dynamic.literal(responses = responses.asInstanceOf[js.Any])
    if (consumes != null) __obj.updateDynamic("consumes")(consumes.asInstanceOf[js.Any])
    if (!js.isUndefined(deprecated)) __obj.updateDynamic("deprecated")(deprecated.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (externalDocs != null) __obj.updateDynamic("externalDocs")(externalDocs.asInstanceOf[js.Any])
    if (operationId != null) __obj.updateDynamic("operationId")(operationId.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    if (produces != null) __obj.updateDynamic("produces")(produces.asInstanceOf[js.Any])
    if (schemes != null) __obj.updateDynamic("schemes")(schemes.asInstanceOf[js.Any])
    if (security != null) __obj.updateDynamic("security")(security.asInstanceOf[js.Any])
    if (summary != null) __obj.updateDynamic("summary")(summary.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Operation]
  }
}

