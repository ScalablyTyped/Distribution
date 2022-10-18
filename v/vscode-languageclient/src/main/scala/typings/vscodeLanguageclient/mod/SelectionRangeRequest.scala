package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashselectionRange
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotselectionRangeMod.SelectionRangeParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotselectionRangeMod.SelectionRangeRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SelectionRangeRequest {
  
  @JSImport("vscode-languageclient", "SelectionRangeRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageclient", "SelectionRangeRequest.method")
  @js.native
  val method: textDocumentSlashselectionRange = js.native
  
  @JSImport("vscode-languageclient", "SelectionRangeRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[
    SelectionRangeParams, 
    js.Array[typings.vscodeLanguageserverTypes.mod.SelectionRange] | Null, 
    js.Array[typings.vscodeLanguageserverTypes.mod.SelectionRange], 
    Unit, 
    SelectionRangeRegistrationOptions
  ] = js.native
}
