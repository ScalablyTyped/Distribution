package typings.vscodeLanguageserverProtocol.mod

import typings.vscodeLanguageserverProtocol.libCommonProtocolDotinlineValueMod.InlineValueParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotinlineValueMod.InlineValueRegistrationOptions
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashinlineValue
import typings.vscodeLanguageserverTypes.mod.InlineValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InlineValueRequest {
  
  @JSImport("vscode-languageserver-protocol", "InlineValueRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol", "InlineValueRequest.method")
  @js.native
  val method: textDocumentSlashinlineValue = js.native
  
  @JSImport("vscode-languageserver-protocol", "InlineValueRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[
    InlineValueParams, 
    js.Array[InlineValue] | Null, 
    js.Array[InlineValue], 
    Unit, 
    InlineValueRegistrationOptions
  ] = js.native
}
