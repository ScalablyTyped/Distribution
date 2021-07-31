package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverTypes.mod.VersionedTextDocumentIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DidSaveTextDocumentParams extends StObject {
  
  /**
    * Optional the content when saved. Depends on the includeText value
    * when the save notification was requested.
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * The document that was closed.
    */
  var textDocument: VersionedTextDocumentIdentifier
}
object DidSaveTextDocumentParams {
  
  @scala.inline
  def apply(textDocument: VersionedTextDocumentIdentifier): DidSaveTextDocumentParams = {
    val __obj = js.Dynamic.literal(textDocument = textDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[DidSaveTextDocumentParams]
  }
  
  @scala.inline
  implicit class DidSaveTextDocumentParamsMutableBuilder[Self <: DidSaveTextDocumentParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextDocument(value: VersionedTextDocumentIdentifier): Self = StObject.set(x, "textDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
