package typings
package swaggerDashToolsLib.swaggerDashToolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationParameter extends js.Object {
  var path: js.Array[java.lang.String]
  var schema: SwaggerParameterSchema
}

object OperationParameter {
  @scala.inline
  def apply(path: js.Array[java.lang.String], schema: SwaggerParameterSchema): OperationParameter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("schema")(schema)
    __obj.asInstanceOf[OperationParameter]
  }
}

