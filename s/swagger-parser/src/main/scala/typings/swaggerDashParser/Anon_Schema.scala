package typings.swaggerDashParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Schema extends js.Object {
  /**
    * If set to `false`, then validating against the Swagger 2.0 Schema or OpenAPI 3.0 Schema is disabled.
    */
  var schema: js.UndefOr[Boolean] = js.undefined
  /**
    * If set to `false`, then validating against the Swagger 2.0 Specification is disabled.
    */
  var spec: js.UndefOr[Boolean] = js.undefined
}

object Anon_Schema {
  @scala.inline
  def apply(schema: js.UndefOr[Boolean] = js.undefined, spec: js.UndefOr[Boolean] = js.undefined): Anon_Schema = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(schema)) __obj.updateDynamic("schema")(schema)
    if (!js.isUndefined(spec)) __obj.updateDynamic("spec")(spec)
    __obj.asInstanceOf[Anon_Schema]
  }
}

