package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashfoldingRange
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotfoldingRangeMod.FoldingRangeParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotfoldingRangeMod.FoldingRangeRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FoldingRangeRequest {
  
  @JSImport("vscode-languageclient", "FoldingRangeRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageclient", "FoldingRangeRequest.method")
  @js.native
  val method: textDocumentSlashfoldingRange = js.native
  
  @JSImport("vscode-languageclient", "FoldingRangeRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[
    FoldingRangeParams, 
    js.Array[typings.vscodeLanguageserverTypes.mod.FoldingRange] | Null, 
    js.Array[typings.vscodeLanguageserverTypes.mod.FoldingRange], 
    Unit, 
    FoldingRangeRegistrationOptions
  ] = js.native
}
