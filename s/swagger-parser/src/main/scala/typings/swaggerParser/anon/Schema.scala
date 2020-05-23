package typings.swaggerParser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Schema extends js.Object {
  /**
    * If set to `false`, then validating against the Swagger 2.0 Schema or OpenAPI 3.0 Schema is disabled.
    */
  var schema: js.UndefOr[Boolean] = js.undefined
  /**
    * If set to `false`, then validating against the Swagger 2.0 Specification is disabled.
    */
  var spec: js.UndefOr[Boolean] = js.undefined
}

object Schema {
  @scala.inline
  def apply(schema: js.UndefOr[Boolean] = js.undefined, spec: js.UndefOr[Boolean] = js.undefined): Schema = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(schema)) __obj.updateDynamic("schema")(schema.get.asInstanceOf[js.Any])
    if (!js.isUndefined(spec)) __obj.updateDynamic("spec")(spec.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema]
  }
}

