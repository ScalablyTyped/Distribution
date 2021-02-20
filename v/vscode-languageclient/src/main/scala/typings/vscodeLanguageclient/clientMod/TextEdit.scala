package typings.vscodeLanguageclient.clientMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TextEdit {
  
  /**
    * Creates a delete text edit.
    * @param range The range of text to be deleted.
    */
  @JSImport("vscode-languageclient/lib/client", "TextEdit.del")
  @js.native
  def del(range: typings.vscodeLanguageserverTypes.mod.Range): typings.vscodeLanguageserverTypes.mod.TextEdit = js.native
  
  /**
    * Creates a insert text edit.
    * @param position The position to insert the text at.
    * @param newText The text to be inserted.
    */
  @JSImport("vscode-languageclient/lib/client", "TextEdit.insert")
  @js.native
  def insert(position: typings.vscodeLanguageserverTypes.mod.Position, newText: String): typings.vscodeLanguageserverTypes.mod.TextEdit = js.native
  
  @JSImport("vscode-languageclient/lib/client", "TextEdit.is")
  @js.native
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.TextEdit */ Boolean = js.native
  
  /**
    * Creates a replace text edit.
    * @param range The range of text to be replaced.
    * @param newText The new text.
    */
  @JSImport("vscode-languageclient/lib/client", "TextEdit.replace")
  @js.native
  def replace(range: typings.vscodeLanguageserverTypes.mod.Range, newText: String): typings.vscodeLanguageserverTypes.mod.TextEdit = js.native
}
