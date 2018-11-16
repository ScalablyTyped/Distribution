package typings
package swaggerizeDashExpressLib.swaggerizeDashExpressMod.swaggerizeNs.SwaggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ApiDefinition extends js.Object {
  var basePath: js.UndefOr[java.lang.String] = js.undefined
  var consumes: js.UndefOr[MimeTypes] = js.undefined
  var definitions: js.UndefOr[DefinitionsObject] = js.undefined
  var externalDocs: js.UndefOr[ExternalDocumentationObject] = js.undefined
  var host: js.UndefOr[java.lang.String] = js.undefined
  var info: InfoObject
  var parameters: js.UndefOr[ParametersDefinitionsObject] = js.undefined
  var paths: PathsObject
  var produces: js.UndefOr[MimeTypes] = js.undefined
  var responses: js.UndefOr[ResponsesDefinitionsObject] = js.undefined
  var schemes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var security: js.UndefOr[js.Array[SecurityRequirementObject]] = js.undefined
  var securityDefinitions: js.UndefOr[SecurityDefinitionsObject] = js.undefined
  var swagger: java.lang.String
  var tags: js.UndefOr[js.Array[TagObject]] = js.undefined
}

