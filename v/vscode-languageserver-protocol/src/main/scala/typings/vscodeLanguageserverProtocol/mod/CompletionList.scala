package typings.vscodeLanguageserverProtocol.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol", "CompletionList")
@js.native
object CompletionList extends js.Object {
  /**
    * Creates a new completion list.
    *
    * @param items The completion items.
    * @param isIncomplete The list is not complete.
    */
  def create(): typings.vscodeLanguageserverTypes.mod.CompletionList = js.native
  def create(items: js.UndefOr[scala.Nothing], isIncomplete: Boolean): typings.vscodeLanguageserverTypes.mod.CompletionList = js.native
  def create(items: js.Array[typings.vscodeLanguageserverTypes.mod.CompletionItem]): typings.vscodeLanguageserverTypes.mod.CompletionList = js.native
  def create(items: js.Array[typings.vscodeLanguageserverTypes.mod.CompletionItem], isIncomplete: Boolean): typings.vscodeLanguageserverTypes.mod.CompletionList = js.native
}

