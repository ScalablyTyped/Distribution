package typings.vscodeLanguageserverTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompletionList extends js.Object {
  /**
    * This list it not complete. Further typing results in recomputing this list.
    */
  var isIncomplete: Boolean
  /**
    * The completion items.
    */
  var items: js.Array[CompletionItem]
}

@JSImport("vscode-languageserver-types", "CompletionList")
@js.native
object CompletionList extends js.Object {
  /**
    * Creates a new completion list.
    *
    * @param items The completion items.
    * @param isIncomplete The list is not complete.
    */
  def create(): CompletionList = js.native
  def create(items: js.Array[CompletionItem]): CompletionList = js.native
  def create(items: js.Array[CompletionItem], isIncomplete: Boolean): CompletionList = js.native
}

