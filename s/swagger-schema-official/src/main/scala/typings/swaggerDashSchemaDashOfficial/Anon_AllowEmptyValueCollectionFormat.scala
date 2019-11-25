package typings.swaggerDashSchemaDashOfficial

import typings.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialMod.ParameterCollectionFormat
import typings.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialMod.ParameterType
import typings.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialStrings.file
import typings.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialStrings.formData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllowEmptyValueCollectionFormat extends js.Object {
  var allowEmptyValue: js.UndefOr[Boolean] = js.undefined
  var collectionFormat: js.UndefOr[ParameterCollectionFormat] = js.undefined
  var in: formData
  var `type`: ParameterType | file
}

object Anon_AllowEmptyValueCollectionFormat {
  @scala.inline
  def apply(
    in: formData,
    `type`: ParameterType | file,
    allowEmptyValue: js.UndefOr[Boolean] = js.undefined,
    collectionFormat: ParameterCollectionFormat = null
  ): Anon_AllowEmptyValueCollectionFormat = {
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(allowEmptyValue)) __obj.updateDynamic("allowEmptyValue")(allowEmptyValue.asInstanceOf[js.Any])
    if (collectionFormat != null) __obj.updateDynamic("collectionFormat")(collectionFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AllowEmptyValueCollectionFormat]
  }
}

