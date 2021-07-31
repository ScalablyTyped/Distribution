package typings.vscodeLanguageserverProtocol.protocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextDocumentRegistrationOptions extends StObject {
  
  /**
    * A document selector to identify the scope of the registration. If set to null
    * the document selector provided on the client side will be used.
    */
  var documentSelector: DocumentSelector | Null
}
object TextDocumentRegistrationOptions {
  
  @scala.inline
  def apply(): TextDocumentRegistrationOptions = {
    val __obj = js.Dynamic.literal(documentSelector = null)
    __obj.asInstanceOf[TextDocumentRegistrationOptions]
  }
  
  @JSImport("vscode-languageserver-protocol/lib/protocol", "TextDocumentRegistrationOptions")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def is(value: js.Any): /* is vscode-languageserver-protocol.vscode-languageserver-protocol/lib/protocol.TextDocumentRegistrationOptions */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-protocol.vscode-languageserver-protocol/lib/protocol.TextDocumentRegistrationOptions */ Boolean]
  
  @scala.inline
  implicit class TextDocumentRegistrationOptionsMutableBuilder[Self <: TextDocumentRegistrationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocumentSelector(value: DocumentSelector): Self = StObject.set(x, "documentSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentSelectorNull: Self = StObject.set(x, "documentSelector", null)
    
    @scala.inline
    def setDocumentSelectorVarargs(value: (String | DocumentFilter)*): Self = StObject.set(x, "documentSelector", js.Array(value :_*))
  }
}
