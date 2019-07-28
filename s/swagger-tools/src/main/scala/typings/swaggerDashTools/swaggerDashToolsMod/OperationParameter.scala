package typings.swaggerDashTools.swaggerDashToolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationParameter extends js.Object {
  var path: js.Array[String]
  var schema: SwaggerParameterSchema
}

object OperationParameter {
  @scala.inline
  def apply(path: js.Array[String], schema: SwaggerParameterSchema): OperationParameter = {
    val __obj = js.Dynamic.literal(path = path, schema = schema)
  
    __obj.asInstanceOf[OperationParameter]
  }
}

