package typings.vscodeLanguageclient.configurationMod

import typings.vscodeJsonrpc.cancellationMod.CancellationToken
import typings.vscodeJsonrpc.mod.HandlerResult
import typings.vscodeLanguageserverProtocol.protocolConfigurationMod.ConfigurationParams
import typings.vscodeLanguageserverProtocol.protocolConfigurationMod.ConfigurationRequest.HandlerSignature
import typings.vscodeLanguageserverProtocol.protocolConfigurationMod.ConfigurationRequest.MiddlewareSignature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigurationWorkspaceMiddleware extends js.Object {
  
  var configuration: js.UndefOr[MiddlewareSignature] = js.native
}
object ConfigurationWorkspaceMiddleware {
  
  @scala.inline
  def apply(): ConfigurationWorkspaceMiddleware = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationWorkspaceMiddleware]
  }
  
  @scala.inline
  implicit class ConfigurationWorkspaceMiddlewareOps[Self <: ConfigurationWorkspaceMiddleware] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConfiguration(
      value: (/* params */ ConfigurationParams, /* token */ CancellationToken, /* next */ HandlerSignature) => HandlerResult[js.Array[js.Any], Unit]
    ): Self = this.set("configuration", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteConfiguration: Self = this.set("configuration", js.undefined)
  }
}
