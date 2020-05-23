package typings.swaggerStats.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Deprecated extends js.Object {
  var deprecated: js.UndefOr[String] = js.undefined
  var operationId: js.UndefOr[String] = js.undefined
  var params: js.UndefOr[String] = js.undefined
  var path: String
  var query: String
  var swagger: js.UndefOr[String] = js.undefined
  var tags: js.UndefOr[String] = js.undefined
}

object Deprecated {
  @scala.inline
  def apply(
    path: String,
    query: String,
    deprecated: String = null,
    operationId: String = null,
    params: String = null,
    swagger: String = null,
    tags: String = null
  ): Deprecated = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    if (deprecated != null) __obj.updateDynamic("deprecated")(deprecated.asInstanceOf[js.Any])
    if (operationId != null) __obj.updateDynamic("operationId")(operationId.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (swagger != null) __obj.updateDynamic("swagger")(swagger.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deprecated]
  }
}

