package typings.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod

import typings.vscodeJsonrpc.mod.RequestHandler
import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashprepareCallHierarchy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver-protocol/lib/protocol.callHierarchy.proposed", "CallHierarchyPrepareRequest")
@js.native
object CallHierarchyPrepareRequest extends js.Object {
  
  val method: textDocumentSlashprepareCallHierarchy = js.native
  
  val `type`: ProtocolRequestType[
    CallHierarchyPrepareParams, 
    js.Array[CallHierarchyItem] | Null, 
    scala.Nothing, 
    Unit, 
    CallHierarchyRegistrationOptions
  ] = js.native
  
  type HandlerSignature = RequestHandler[CallHierarchyPrepareParams, js.Array[CallHierarchyItem] | Null, Unit]
}
