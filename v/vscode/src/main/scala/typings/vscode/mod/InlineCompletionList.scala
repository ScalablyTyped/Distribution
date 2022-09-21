package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode", "InlineCompletionList")
@js.native
open class InlineCompletionList protected () extends StObject {
  /**
    * Creates a new list of inline completion items.
    */
  def this(items: js.Array[InlineCompletionItem]) = this()
  
  /**
    * The inline completion items.
    */
  var items: js.Array[InlineCompletionItem] = js.native
}
