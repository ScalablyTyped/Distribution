package typings.swaggerDashSchemaDashOfficial

import typings.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialMod.ParameterCollectionFormat
import typings.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialStrings.query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllowEmptyValue extends js.Object {
  var allowEmptyValue: js.UndefOr[Boolean] = js.undefined
  var collectionFormat: js.UndefOr[ParameterCollectionFormat] = js.undefined
  var in: query
}

object Anon_AllowEmptyValue {
  @scala.inline
  def apply(
    in: query,
    allowEmptyValue: js.UndefOr[Boolean] = js.undefined,
    collectionFormat: ParameterCollectionFormat = null
  ): Anon_AllowEmptyValue = {
    val __obj = js.Dynamic.literal(in = in)
    if (!js.isUndefined(allowEmptyValue)) __obj.updateDynamic("allowEmptyValue")(allowEmptyValue)
    if (collectionFormat != null) __obj.updateDynamic("collectionFormat")(collectionFormat)
    __obj.asInstanceOf[Anon_AllowEmptyValue]
  }
}

