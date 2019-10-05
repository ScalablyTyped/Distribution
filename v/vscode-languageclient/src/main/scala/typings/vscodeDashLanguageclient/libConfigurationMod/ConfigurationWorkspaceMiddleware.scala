package typings.vscodeDashLanguageclient.libConfigurationMod

import typings.vscodeDashJsonrpc.libCancellationMod.CancellationToken
import typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.HandlerResult
import typings.vscodeDashLanguageserverDashProtocol.libProtocolDotConfigurationMod.ConfigurationParams
import typings.vscodeDashLanguageserverDashProtocol.libProtocolDotConfigurationMod.ConfigurationRequest.HandlerSignature
import typings.vscodeDashLanguageserverDashProtocol.libProtocolDotConfigurationMod.ConfigurationRequest.MiddlewareSignature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigurationWorkspaceMiddleware extends js.Object {
  var configuration: js.UndefOr[MiddlewareSignature] = js.undefined
}

object ConfigurationWorkspaceMiddleware {
  @scala.inline
  def apply(
    configuration: (/* params */ ConfigurationParams, /* token */ CancellationToken, /* next */ HandlerSignature) => HandlerResult[js.Array[js.Any], Unit] = null
  ): ConfigurationWorkspaceMiddleware = {
    val __obj = js.Dynamic.literal()
    if (configuration != null) __obj.updateDynamic("configuration")(js.Any.fromFunction3(configuration))
    __obj.asInstanceOf[ConfigurationWorkspaceMiddleware]
  }
}

