package typings
package swaggerDashJsdocLib.swaggerDashJsdocMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwaggerDefinition
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var basePath: js.UndefOr[java.lang.String] = js.undefined
  var host: js.UndefOr[java.lang.String] = js.undefined
  var info: ApiInformation
  var openapi: js.UndefOr[java.lang.String] = js.undefined
  var servers: js.UndefOr[js.Array[ServerInformation]] = js.undefined
}

object SwaggerDefinition {
  @scala.inline
  def apply(
    info: ApiInformation,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    basePath: java.lang.String = null,
    host: java.lang.String = null,
    openapi: java.lang.String = null,
    servers: js.Array[ServerInformation] = null
  ): SwaggerDefinition = {
    val __obj = js.Dynamic.literal(info = info)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (basePath != null) __obj.updateDynamic("basePath")(basePath)
    if (host != null) __obj.updateDynamic("host")(host)
    if (openapi != null) __obj.updateDynamic("openapi")(openapi)
    if (servers != null) __obj.updateDynamic("servers")(servers)
    __obj.asInstanceOf[SwaggerDefinition]
  }
}

