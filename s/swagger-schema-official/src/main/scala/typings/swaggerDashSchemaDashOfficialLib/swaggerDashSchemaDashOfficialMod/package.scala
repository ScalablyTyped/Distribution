package typings
package swaggerDashSchemaDashOfficialLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object swaggerDashSchemaDashOfficialMod {
  type BaseFormatContrainedParameter = BaseParameter with SchemaFormatConstraints
  type BodyParameter = BaseParameter with swaggerDashSchemaDashOfficialLib.Anon_Body
  type FormDataParameter = BaseFormatContrainedParameter with BaseSchema with swaggerDashSchemaDashOfficialLib.Anon_AllowEmptyValueCollectionFormat
  type HeaderParameter = BaseFormatContrainedParameter with BaseSchema with swaggerDashSchemaDashOfficialLib.Anon_Header
  type OAuthScope = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type Parameter = BodyParameter | FormDataParameter | QueryParameter | PathParameter | HeaderParameter
  type PathParameter = BaseFormatContrainedParameter with BaseSchema with swaggerDashSchemaDashOfficialLib.Anon_In
  type QueryParameter = BaseFormatContrainedParameter with BaseSchema with swaggerDashSchemaDashOfficialLib.Anon_AllowEmptyValue
}
