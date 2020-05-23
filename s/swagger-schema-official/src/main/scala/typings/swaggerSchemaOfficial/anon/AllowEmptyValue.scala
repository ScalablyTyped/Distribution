package typings.swaggerSchemaOfficial.anon

import typings.swaggerSchemaOfficial.mod.ParameterCollectionFormat
import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AllowEmptyValue extends js.Object {
  var allowEmptyValue: js.UndefOr[Boolean] = js.undefined
  var collectionFormat: js.UndefOr[ParameterCollectionFormat] = js.undefined
  var in: query
}

object AllowEmptyValue {
  @scala.inline
  def apply(
    in: query,
    allowEmptyValue: js.UndefOr[Boolean] = js.undefined,
    collectionFormat: ParameterCollectionFormat = null
  ): AllowEmptyValue = {
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any])
    if (!js.isUndefined(allowEmptyValue)) __obj.updateDynamic("allowEmptyValue")(allowEmptyValue.get.asInstanceOf[js.Any])
    if (collectionFormat != null) __obj.updateDynamic("collectionFormat")(collectionFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowEmptyValue]
  }
}

