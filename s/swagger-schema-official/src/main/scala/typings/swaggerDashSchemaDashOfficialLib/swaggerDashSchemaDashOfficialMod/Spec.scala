package typings
package swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Spec extends js.Object {
  var basePath: js.UndefOr[java.lang.String] = js.undefined
  var consumes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var definitions: js.UndefOr[ScalablyTyped.runtime.StringDictionary[Schema]] = js.undefined
  var externalDocs: js.UndefOr[ExternalDocs] = js.undefined
  var host: js.UndefOr[java.lang.String] = js.undefined
  var info: Info
  var parameters: js.UndefOr[ScalablyTyped.runtime.StringDictionary[BodyParameter | QueryParameter]] = js.undefined
  var paths: ScalablyTyped.runtime.StringDictionary[Path]
  var produces: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var responses: js.UndefOr[ScalablyTyped.runtime.StringDictionary[Response]] = js.undefined
  var schemes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var security: js.UndefOr[js.Array[ScalablyTyped.runtime.StringDictionary[js.Array[java.lang.String]]]] = js.undefined
  var securityDefinitions: js.UndefOr[ScalablyTyped.runtime.StringDictionary[Security]] = js.undefined
  var swagger: java.lang.String
  var tags: js.UndefOr[js.Array[Tag]] = js.undefined
}

