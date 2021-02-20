package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverTypes.mod.Position
import typings.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenameParams extends WorkDoneProgressParams {
  
  /**
    * The new name of the symbol. If the given name is not valid the
    * request must return a [ResponseError](#ResponseError) with an
    * appropriate message set.
    */
  var newName: String = js.native
  
  /**
    * The position at which this request was sent.
    */
  var position: Position = js.native
  
  /**
    * The document to rename.
    */
  var textDocument: TextDocumentIdentifier = js.native
}
object RenameParams {
  
  @scala.inline
  def apply(newName: String, position: Position, textDocument: TextDocumentIdentifier): RenameParams = {
    val __obj = js.Dynamic.literal(newName = newName.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], textDocument = textDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenameParams]
  }
  
  @scala.inline
  implicit class RenameParamsMutableBuilder[Self <: RenameParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewName(value: String): Self = StObject.set(x, "newName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextDocument(value: TextDocumentIdentifier): Self = StObject.set(x, "textDocument", value.asInstanceOf[js.Any])
  }
}
