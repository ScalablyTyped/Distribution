package typings.vscodeLanguageclient.clientMod

import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.protocolMod.InitializeResult
import typings.vscodeLanguageserverProtocol.protocolMod.WorkDoneProgressParams
import typings.vscodeLanguageserverProtocol.protocolMod._InitializeParams
import typings.vscodeLanguageserverProtocol.protocolWorkspaceFoldersMod.WorkspaceFoldersInitializeParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InitializeRequest {
  
  @JSImport("vscode-languageclient/lib/client", "InitializeRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    _InitializeParams & WorkspaceFoldersInitializeParams & WorkDoneProgressParams, 
    InitializeResult[js.Any], 
    scala.Nothing, 
    typings.vscodeLanguageserverProtocol.protocolMod.InitializeError, 
    Unit
  ] = js.native
}
