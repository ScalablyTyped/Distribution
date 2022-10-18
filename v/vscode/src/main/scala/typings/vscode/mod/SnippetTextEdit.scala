package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode", "SnippetTextEdit")
@js.native
open class SnippetTextEdit protected () extends StObject {
  /**
    * Create a new snippet edit.
    *
    * @param range A range.
    * @param snippet A snippet string.
    */
  def this(range: Range, snippet: SnippetString) = this()
  
  /**
    * The range this edit applies to.
    */
  var range: Range = js.native
  
  /**
    * The {@link SnippetString snippet} this edit will perform.
    */
  var snippet: SnippetString = js.native
}
/* static members */
object SnippetTextEdit {
  
  @JSImport("vscode", "SnippetTextEdit")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Utility to create an insert snippet edit.
    *
    * @param position A position, will become an empty range.
    * @param snippet A snippet string.
    * @return A new snippet edit object.
    */
  inline def insert(position: Position, snippet: SnippetString): SnippetTextEdit = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(position.asInstanceOf[js.Any], snippet.asInstanceOf[js.Any])).asInstanceOf[SnippetTextEdit]
  
  /**
    * Utility to create a replace snippet edit.
    *
    * @param range A range.
    * @param snippet A snippet string.
    * @return A new snippet edit object.
    */
  inline def replace(range: Range, snippet: SnippetString): SnippetTextEdit = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(range.asInstanceOf[js.Any], snippet.asInstanceOf[js.Any])).asInstanceOf[SnippetTextEdit]
}
