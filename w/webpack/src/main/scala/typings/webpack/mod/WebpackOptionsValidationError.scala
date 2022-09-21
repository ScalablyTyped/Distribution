package typings.webpack.mod

import typings.schemaUtils.validationErrorMod.Schema
import typings.schemaUtils.validationErrorMod.SchemaUtilErrorObject
import typings.schemaUtils.validationErrorMod.ValidationErrorConfiguration
import typings.schemaUtils.validationErrorMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webpack", "WebpackOptionsValidationError")
@js.native
open class WebpackOptionsValidationError protected () extends default {
  /**
    * @param {Array<SchemaUtilErrorObject>} errors
    * @param {Schema} schema
    * @param {ValidationErrorConfiguration} configuration
    */
  def this(errors: js.Array[SchemaUtilErrorObject], schema: Schema) = this()
  def this(
    errors: js.Array[SchemaUtilErrorObject],
    schema: Schema,
    configuration: ValidationErrorConfiguration
  ) = this()
}
