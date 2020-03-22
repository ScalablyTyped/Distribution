package typings.swaggerSchemaOfficial

import typings.swaggerSchemaOfficial.mod.ParameterCollectionFormat
import typings.swaggerSchemaOfficial.mod.ParameterType
import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.file
import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.formData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCollectionFormat extends js.Object {
  var allowEmptyValue: js.UndefOr[Boolean] = js.undefined
  var collectionFormat: js.UndefOr[ParameterCollectionFormat] = js.undefined
  var in: formData
  var `type`: ParameterType | file
}

object AnonCollectionFormat {
  @scala.inline
  def apply(
    in: formData,
    `type`: ParameterType | file,
    allowEmptyValue: js.UndefOr[Boolean] = js.undefined,
    collectionFormat: ParameterCollectionFormat = null
  ): AnonCollectionFormat = {
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(allowEmptyValue)) __obj.updateDynamic("allowEmptyValue")(allowEmptyValue.asInstanceOf[js.Any])
    if (collectionFormat != null) __obj.updateDynamic("collectionFormat")(collectionFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCollectionFormat]
  }
}

