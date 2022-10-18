package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashinlineValue
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotinlineValueMod.InlineValueParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotinlineValueMod.InlineValueRegistrationOptions
import typings.vscodeLanguageserverTypes.mod.InlineValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InlineValueRequest {
  
  @JSImport("vscode-languageclient", "InlineValueRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageclient", "InlineValueRequest.method")
  @js.native
  val method: textDocumentSlashinlineValue = js.native
  
  @JSImport("vscode-languageclient", "InlineValueRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[
    InlineValueParams, 
    js.Array[InlineValue] | Null, 
    js.Array[InlineValue], 
    Unit, 
    InlineValueRegistrationOptions
  ] = js.native
}
