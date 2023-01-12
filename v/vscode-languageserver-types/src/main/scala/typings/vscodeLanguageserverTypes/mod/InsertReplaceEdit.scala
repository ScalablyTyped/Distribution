package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsertReplaceEdit extends StObject {
  
  /**
    * The range if the insert is requested
    */
  var insert: Range
  
  /**
    * The string to be inserted.
    */
  var newText: String
  
  /**
    * The range if the replace is requested.
    */
  var replace: Range
}
object InsertReplaceEdit {
  
  inline def apply(insert: Range, newText: String, replace: Range): InsertReplaceEdit = {
    val __obj = js.Dynamic.literal(insert = insert.asInstanceOf[js.Any], newText = newText.asInstanceOf[js.Any], replace = replace.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertReplaceEdit]
  }
  
  @JSImport("vscode-languageserver-types", "InsertReplaceEdit")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new insert / replace edit
    */
  inline def create(newText: String, insert: Range, replace: Range): InsertReplaceEdit = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(newText.asInstanceOf[js.Any], insert.asInstanceOf[js.Any], replace.asInstanceOf[js.Any])).asInstanceOf[InsertReplaceEdit]
  
  inline def is(value: InsertReplaceEdit): /* is vscode-languageserver-types.vscode-languageserver-types.InsertReplaceEdit */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.InsertReplaceEdit */ Boolean]
  /**
    * Checks whether the given literal conforms to the [InsertReplaceEdit](#InsertReplaceEdit) interface.
    */
  inline def is(value: TextEdit): /* is vscode-languageserver-types.vscode-languageserver-types.InsertReplaceEdit */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.InsertReplaceEdit */ Boolean]
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InsertReplaceEdit] (val x: Self) extends AnyVal {
    
    inline def setInsert(value: Range): Self = StObject.set(x, "insert", value.asInstanceOf[js.Any])
    
    inline def setNewText(value: String): Self = StObject.set(x, "newText", value.asInstanceOf[js.Any])
    
    inline def setReplace(value: Range): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
  }
}
