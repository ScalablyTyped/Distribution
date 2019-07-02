package typings
package swaggerDashSchemaDashOfficialLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllowEmptyValueCollectionFormat extends js.Object {
  var allowEmptyValue: js.UndefOr[scala.Boolean] = js.undefined
  var collectionFormat: js.UndefOr[
    swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialMod.ParameterCollectionFormat
  ] = js.undefined
  var in: swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialLibStrings.formData
  var `type`: swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialMod.ParameterType | swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialLibStrings.file
}

object Anon_AllowEmptyValueCollectionFormat {
  @scala.inline
  def apply(
    in: swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialLibStrings.formData,
    `type`: swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialMod.ParameterType | swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialLibStrings.file,
    allowEmptyValue: js.UndefOr[scala.Boolean] = js.undefined,
    collectionFormat: swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialMod.ParameterCollectionFormat = null
  ): Anon_AllowEmptyValueCollectionFormat = {
    val __obj = js.Dynamic.literal(in = in)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(allowEmptyValue)) __obj.updateDynamic("allowEmptyValue")(allowEmptyValue)
    if (collectionFormat != null) __obj.updateDynamic("collectionFormat")(collectionFormat)
    __obj.asInstanceOf[Anon_AllowEmptyValueCollectionFormat]
  }
}

