package typings.swaggerParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSchema extends js.Object {
  /**
    * If set to `false`, then validating against the Swagger 2.0 Schema or OpenAPI 3.0 Schema is disabled.
    */
  var schema: js.UndefOr[Boolean] = js.undefined
  /**
    * If set to `false`, then validating against the Swagger 2.0 Specification is disabled.
    */
  var spec: js.UndefOr[Boolean] = js.undefined
}

object AnonSchema {
  @scala.inline
  def apply(schema: js.UndefOr[Boolean] = js.undefined, spec: js.UndefOr[Boolean] = js.undefined): AnonSchema = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(schema)) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    if (!js.isUndefined(spec)) __obj.updateDynamic("spec")(spec.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSchema]
  }
}

