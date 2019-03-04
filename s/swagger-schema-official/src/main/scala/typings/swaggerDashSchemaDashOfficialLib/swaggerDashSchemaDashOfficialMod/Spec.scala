package typings
package swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Spec extends js.Object {
  var basePath: js.UndefOr[java.lang.String] = js.undefined
  var consumes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var definitions: js.UndefOr[org.scalablytyped.runtime.StringDictionary[Schema]] = js.undefined
  var externalDocs: js.UndefOr[ExternalDocs] = js.undefined
  var host: js.UndefOr[java.lang.String] = js.undefined
  var info: Info
  var parameters: js.UndefOr[org.scalablytyped.runtime.StringDictionary[BodyParameter | QueryParameter]] = js.undefined
  var paths: org.scalablytyped.runtime.StringDictionary[Path]
  var produces: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var responses: js.UndefOr[org.scalablytyped.runtime.StringDictionary[Response]] = js.undefined
  var schemes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var security: js.UndefOr[js.Array[org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]]] = js.undefined
  var securityDefinitions: js.UndefOr[org.scalablytyped.runtime.StringDictionary[Security]] = js.undefined
  var swagger: java.lang.String
  var tags: js.UndefOr[js.Array[Tag]] = js.undefined
}

object Spec {
  @scala.inline
  def apply(
    info: Info,
    paths: org.scalablytyped.runtime.StringDictionary[Path],
    swagger: java.lang.String,
    basePath: java.lang.String = null,
    consumes: js.Array[java.lang.String] = null,
    definitions: org.scalablytyped.runtime.StringDictionary[Schema] = null,
    externalDocs: ExternalDocs = null,
    host: java.lang.String = null,
    parameters: org.scalablytyped.runtime.StringDictionary[BodyParameter | QueryParameter] = null,
    produces: js.Array[java.lang.String] = null,
    responses: org.scalablytyped.runtime.StringDictionary[Response] = null,
    schemes: js.Array[java.lang.String] = null,
    security: js.Array[org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]] = null,
    securityDefinitions: org.scalablytyped.runtime.StringDictionary[Security] = null,
    tags: js.Array[Tag] = null
  ): Spec = {
    val __obj = js.Dynamic.literal(info = info, paths = paths, swagger = swagger)
    if (basePath != null) __obj.updateDynamic("basePath")(basePath)
    if (consumes != null) __obj.updateDynamic("consumes")(consumes)
    if (definitions != null) __obj.updateDynamic("definitions")(definitions)
    if (externalDocs != null) __obj.updateDynamic("externalDocs")(externalDocs)
    if (host != null) __obj.updateDynamic("host")(host)
    if (parameters != null) __obj.updateDynamic("parameters")(parameters)
    if (produces != null) __obj.updateDynamic("produces")(produces)
    if (responses != null) __obj.updateDynamic("responses")(responses)
    if (schemes != null) __obj.updateDynamic("schemes")(schemes)
    if (security != null) __obj.updateDynamic("security")(security)
    if (securityDefinitions != null) __obj.updateDynamic("securityDefinitions")(securityDefinitions)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[Spec]
  }
}

