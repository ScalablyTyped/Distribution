package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolNumbers.`1`
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolNumbers.`2`
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolNumbers.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolNumbers.`1`
  - typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolNumbers.`2`
  - typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolNumbers.`3`
*/
trait TextDocumentSaveReason extends StObject
object TextDocumentSaveReason {
  
  /**
    * Automatic after a delay.
    */
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "TextDocumentSaveReason.AfterDelay")
  @js.native
  val AfterDelay: `2` = js.native
  
  /**
    * When the editor lost focus.
    */
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "TextDocumentSaveReason.FocusOut")
  @js.native
  val FocusOut: `3` = js.native
  
  /**
    * Manually triggered, e.g. by the user pressing save, by starting debugging,
    * or by an API call.
    */
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "TextDocumentSaveReason.Manual")
  @js.native
  val Manual: `1` = js.native
}
