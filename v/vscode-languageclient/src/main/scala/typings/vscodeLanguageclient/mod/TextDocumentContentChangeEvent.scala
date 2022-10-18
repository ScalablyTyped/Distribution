package typings.vscodeLanguageclient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TextDocumentContentChangeEvent {
  
  @JSImport("vscode-languageclient", "TextDocumentContentChangeEvent")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Checks whether the information describes a full replacement event.
    */
  inline def isFull(event: typings.vscodeLanguageserverProtocol.libCommonProtocolMod.TextDocumentContentChangeEvent): /* is vscode-languageserver-protocol.anon.Text */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFull")(event.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-protocol.anon.Text */ Boolean]
  
  /**
    * Checks whether the information describes a delta event.
    */
  inline def isIncremental(event: typings.vscodeLanguageserverProtocol.libCommonProtocolMod.TextDocumentContentChangeEvent): /* is vscode-languageserver-protocol.anon.Range */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIncremental")(event.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-protocol.anon.Range */ Boolean]
}
