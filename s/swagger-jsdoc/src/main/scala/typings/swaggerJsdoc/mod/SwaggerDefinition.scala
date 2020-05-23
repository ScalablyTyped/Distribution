package typings.swaggerJsdoc.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwaggerDefinition
  extends /* key */ StringDictionary[js.Any] {
  var basePath: js.UndefOr[String] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var info: ApiInformation
  var openapi: js.UndefOr[String] = js.undefined
  var servers: js.UndefOr[js.Array[ServerInformation]] = js.undefined
}

object SwaggerDefinition {
  @scala.inline
  def apply(
    info: ApiInformation,
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    basePath: String = null,
    host: String = null,
    openapi: String = null,
    servers: js.Array[ServerInformation] = null
  ): SwaggerDefinition = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (basePath != null) __obj.updateDynamic("basePath")(basePath.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (openapi != null) __obj.updateDynamic("openapi")(openapi.asInstanceOf[js.Any])
    if (servers != null) __obj.updateDynamic("servers")(servers.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwaggerDefinition]
  }
}

