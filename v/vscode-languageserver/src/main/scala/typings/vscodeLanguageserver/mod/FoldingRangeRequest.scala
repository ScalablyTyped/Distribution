package typings.vscodeLanguageserver.mod

import typings.vscodeLanguageserver.vscodeLanguageserverStrings.textDocumentSlashfoldingRange
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotfoldingRangeMod.FoldingRangeParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotfoldingRangeMod.FoldingRangeRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FoldingRangeRequest {
  
  @JSImport("vscode-languageserver", "FoldingRangeRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver", "FoldingRangeRequest.method")
  @js.native
  val method: textDocumentSlashfoldingRange = js.native
  
  @JSImport("vscode-languageserver", "FoldingRangeRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[
    FoldingRangeParams, 
    js.Array[typings.vscodeLanguageserverTypes.mod.FoldingRange] | Null, 
    js.Array[typings.vscodeLanguageserverTypes.mod.FoldingRange], 
    Unit, 
    FoldingRangeRegistrationOptions
  ] = js.native
}
