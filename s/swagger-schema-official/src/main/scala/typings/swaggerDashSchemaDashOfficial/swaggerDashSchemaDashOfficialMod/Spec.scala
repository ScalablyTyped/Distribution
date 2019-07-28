package typings.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Spec extends js.Object {
  var basePath: js.UndefOr[String] = js.undefined
  var consumes: js.UndefOr[js.Array[String]] = js.undefined
  var definitions: js.UndefOr[StringDictionary[Schema]] = js.undefined
  var externalDocs: js.UndefOr[ExternalDocs] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var info: Info
  var parameters: js.UndefOr[StringDictionary[BodyParameter | QueryParameter]] = js.undefined
  var paths: StringDictionary[Path]
  var produces: js.UndefOr[js.Array[String]] = js.undefined
  var responses: js.UndefOr[StringDictionary[Response]] = js.undefined
  var schemes: js.UndefOr[js.Array[String]] = js.undefined
  var security: js.UndefOr[js.Array[StringDictionary[js.Array[String]]]] = js.undefined
  var securityDefinitions: js.UndefOr[StringDictionary[Security]] = js.undefined
  var swagger: String
  var tags: js.UndefOr[js.Array[Tag]] = js.undefined
}

object Spec {
  @scala.inline
  def apply(
    info: Info,
    paths: StringDictionary[Path],
    swagger: String,
    basePath: String = null,
    consumes: js.Array[String] = null,
    definitions: StringDictionary[Schema] = null,
    externalDocs: ExternalDocs = null,
    host: String = null,
    parameters: StringDictionary[BodyParameter | QueryParameter] = null,
    produces: js.Array[String] = null,
    responses: StringDictionary[Response] = null,
    schemes: js.Array[String] = null,
    security: js.Array[StringDictionary[js.Array[String]]] = null,
    securityDefinitions: StringDictionary[Security] = null,
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

