package typings.vscodeLanguageserver.mod

import typings.vscodeLanguageserver.vscodeLanguageserverStrings.textDocumentSlashlinkedEditingRange
import typings.vscodeLanguageserverProtocol.protocolLinkedEditingRangeMod.LinkedEditingRangeParams
import typings.vscodeLanguageserverProtocol.protocolLinkedEditingRangeMod.LinkedEditingRangeRegistrationOptions
import typings.vscodeLanguageserverProtocol.protocolLinkedEditingRangeMod.LinkedEditingRanges
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LinkedEditingRangeRequest {
  
  @JSImport("vscode-languageserver", "LinkedEditingRangeRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.messagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver", "LinkedEditingRangeRequest.method")
  @js.native
  val method: textDocumentSlashlinkedEditingRange = js.native
  
  @JSImport("vscode-languageserver", "LinkedEditingRangeRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType[
    LinkedEditingRangeParams, 
    LinkedEditingRanges | Null, 
    Unit, 
    Unit, 
    LinkedEditingRangeRegistrationOptions
  ] = js.native
}
