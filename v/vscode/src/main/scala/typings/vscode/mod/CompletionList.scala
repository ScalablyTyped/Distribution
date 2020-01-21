package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode", "CompletionList")
@js.native
/**
		 * Creates a new completion list.
		 *
		 * @param items The completion items.
		 * @param isIncomplete The list is not complete.
		 */
class CompletionList () extends js.Object {
  def this(items: js.Array[CompletionItem]) = this()
  def this(items: js.Array[CompletionItem], isIncomplete: Boolean) = this()
  /**
  		 * This list is not complete. Further typing should result in recomputing
  		 * this list.
  		 */
  var isIncomplete: js.UndefOr[Boolean] = js.native
  /**
  		 * The completion items.
  		 */
  var items: js.Array[CompletionItem] = js.native
}

