package typings
package swaggerDashParserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Schema extends js.Object {
  var schema: js.UndefOr[scala.Boolean] = js.undefined
  var spec: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Schema {
  @scala.inline
  def apply(schema: js.UndefOr[scala.Boolean] = js.undefined, spec: js.UndefOr[scala.Boolean] = js.undefined): Anon_Schema = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(schema)) __obj.updateDynamic("schema")(schema)
    if (!js.isUndefined(spec)) __obj.updateDynamic("spec")(spec)
    __obj.asInstanceOf[Anon_Schema]
  }
}

