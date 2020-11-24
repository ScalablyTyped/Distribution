package typings.vscodeLanguageserverProtocol.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StaticRegistrationOptions extends js.Object {
  
  /**
    * The id used to register the request. The id can be used to deregister
    * the request again. See also Registration#id.
    */
  var id: js.UndefOr[String] = js.native
}
@JSImport("vscode-languageserver-protocol/lib/protocol", "StaticRegistrationOptions")
@js.native
object StaticRegistrationOptions extends js.Object {
  
  def hasId(value: js.Object): /* is vscode-languageserver-protocol.anon.Id */ Boolean = js.native
}
