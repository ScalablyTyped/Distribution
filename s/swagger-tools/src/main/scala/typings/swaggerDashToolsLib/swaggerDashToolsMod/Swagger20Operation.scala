package typings
package swaggerDashToolsLib.swaggerDashToolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Swagger20Operation extends js.Object {
  var operationId: js.UndefOr[java.lang.String] = js.undefined
  var parameters: js.UndefOr[js.Array[SwaggerParameterSchema]] = js.undefined
  var responses: org.scalablytyped.runtime.StringDictionary[Swagger20Response]
  var security: js.UndefOr[js.Array[Swagger20Security]] = js.undefined
  var summary: js.UndefOr[java.lang.String] = js.undefined
  var tags: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

