package typings.swaggerStats.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait APIOperationDefinition extends js.Object {
  var deprecated: Boolean
  var description: js.UndefOr[String] = js.undefined
  var operationId: js.UndefOr[String] = js.undefined
  var summary: js.UndefOr[String] = js.undefined
  var swagger: Boolean
  var tags: js.UndefOr[js.Any] = js.undefined
}

object APIOperationDefinition {
  @scala.inline
  def apply(
    deprecated: Boolean,
    swagger: Boolean,
    description: String = null,
    operationId: String = null,
    summary: String = null,
    tags: js.Any = null
  ): APIOperationDefinition = {
    val __obj = js.Dynamic.literal(deprecated = deprecated.asInstanceOf[js.Any], swagger = swagger.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (operationId != null) __obj.updateDynamic("operationId")(operationId.asInstanceOf[js.Any])
    if (summary != null) __obj.updateDynamic("summary")(summary.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIOperationDefinition]
  }
}

