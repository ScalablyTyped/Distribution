package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashlinkedEditingRange
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotlinkedEditingRangeMod.LinkedEditingRangeParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotlinkedEditingRangeMod.LinkedEditingRangeRegistrationOptions
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotlinkedEditingRangeMod.LinkedEditingRanges
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LinkedEditingRangeRequest {
  
  @JSImport("vscode-languageclient", "LinkedEditingRangeRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageclient", "LinkedEditingRangeRequest.method")
  @js.native
  val method: textDocumentSlashlinkedEditingRange = js.native
  
  @JSImport("vscode-languageclient", "LinkedEditingRangeRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[
    LinkedEditingRangeParams, 
    LinkedEditingRanges | Null, 
    Unit, 
    Unit, 
    LinkedEditingRangeRegistrationOptions
  ] = js.native
}
