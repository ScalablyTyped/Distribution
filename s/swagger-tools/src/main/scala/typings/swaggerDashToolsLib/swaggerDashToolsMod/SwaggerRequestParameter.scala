package typings
package swaggerDashToolsLib.swaggerDashToolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SwaggerRequestParameter[T] extends js.Object {
  var originalValue: js.Any
  var path: js.Array[java.lang.String]
  var schema: SwaggerParameterSchema
  var value: T
}

