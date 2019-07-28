package typings.vscodeDashLanguageclient.libConfigurationMod

import typings.vscodeDashLanguageserverDashProtocol.libProtocolDotConfigurationMod.ConfigurationRequestNs.MiddlewareSignature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigurationWorkspaceMiddleware extends js.Object {
  var configuration: js.UndefOr[MiddlewareSignature] = js.undefined
}

object ConfigurationWorkspaceMiddleware {
  @scala.inline
  def apply(configuration: MiddlewareSignature = null): ConfigurationWorkspaceMiddleware = {
    val __obj = js.Dynamic.literal()
    if (configuration != null) __obj.updateDynamic("configuration")(configuration)
    __obj.asInstanceOf[ConfigurationWorkspaceMiddleware]
  }
}

