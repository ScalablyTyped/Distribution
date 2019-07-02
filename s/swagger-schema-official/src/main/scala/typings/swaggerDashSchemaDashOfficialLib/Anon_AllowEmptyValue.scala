package typings
package swaggerDashSchemaDashOfficialLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllowEmptyValue extends js.Object {
  var allowEmptyValue: js.UndefOr[scala.Boolean] = js.undefined
  var collectionFormat: js.UndefOr[
    swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialMod.ParameterCollectionFormat
  ] = js.undefined
  var in: swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialLibStrings.query
}

object Anon_AllowEmptyValue {
  @scala.inline
  def apply(
    in: swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialLibStrings.query,
    allowEmptyValue: js.UndefOr[scala.Boolean] = js.undefined,
    collectionFormat: swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialMod.ParameterCollectionFormat = null
  ): Anon_AllowEmptyValue = {
    val __obj = js.Dynamic.literal(in = in)
    if (!js.isUndefined(allowEmptyValue)) __obj.updateDynamic("allowEmptyValue")(allowEmptyValue)
    if (collectionFormat != null) __obj.updateDynamic("collectionFormat")(collectionFormat)
    __obj.asInstanceOf[Anon_AllowEmptyValue]
  }
}

