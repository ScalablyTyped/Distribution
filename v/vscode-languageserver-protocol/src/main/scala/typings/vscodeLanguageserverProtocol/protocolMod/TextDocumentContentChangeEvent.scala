package typings.vscodeLanguageserverProtocol.protocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.vscodeLanguageserverProtocol.anon.Range
  - typings.vscodeLanguageserverProtocol.anon.Text
*/
trait TextDocumentContentChangeEvent extends StObject
object TextDocumentContentChangeEvent {
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "TextDocumentContentChangeEvent")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Checks whether the information describes a full replacement event.
    */
  inline def isFull(event: TextDocumentContentChangeEvent): /* is vscode-languageserver-protocol.anon.Text */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFull")(event.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-protocol.anon.Text */ Boolean]
  
  /**
    * Checks whether the information describes a delta event.
    */
  inline def isIncremental(event: TextDocumentContentChangeEvent): /* is vscode-languageserver-protocol.anon.Range */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIncremental")(event.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-protocol.anon.Range */ Boolean]
}
