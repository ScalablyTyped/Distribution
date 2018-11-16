package typings
package swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Operation extends js.Object {
  var consumes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var deprecated: js.UndefOr[scala.Boolean] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var externalDocs: js.UndefOr[ExternalDocs] = js.undefined
  var operationId: js.UndefOr[java.lang.String] = js.undefined
  var parameters: js.UndefOr[js.Array[Parameter | Reference]] = js.undefined
  var produces: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var responses: ScalablyTyped.runtime.StringDictionary[Response | Reference]
  var schemes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var security: js.UndefOr[js.Array[Security]] = js.undefined
  var summary: js.UndefOr[java.lang.String] = js.undefined
  var tags: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

