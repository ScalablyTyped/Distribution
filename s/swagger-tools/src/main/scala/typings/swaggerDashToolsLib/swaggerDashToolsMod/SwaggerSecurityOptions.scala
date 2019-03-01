package typings
package swaggerDashToolsLib.swaggerDashToolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwaggerSecurityOptions
  extends /* securityDefinitionName */ org.scalablytyped.runtime.StringDictionary[SwaggerSecurityHandler]

object SwaggerSecurityOptions {
  @scala.inline
  def apply(
    StringDictionary: /* securityDefinitionName */ org.scalablytyped.runtime.StringDictionary[SwaggerSecurityHandler] = null
  ): SwaggerSecurityOptions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[SwaggerSecurityOptions]
  }
}

