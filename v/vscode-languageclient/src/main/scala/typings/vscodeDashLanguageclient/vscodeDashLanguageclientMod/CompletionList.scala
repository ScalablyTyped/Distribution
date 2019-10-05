package typings.vscodeDashLanguageclient.vscodeDashLanguageclientMod

import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.CompletionItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient", "CompletionList")
@js.native
object CompletionList extends js.Object {
  /**
    * Creates a new completion list.
    *
    * @param items The completion items.
    * @param isIncomplete The list is not complete.
    */
  def create(): typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.CompletionList = js.native
  def create(items: js.Array[CompletionItem]): typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.CompletionList = js.native
  def create(items: js.Array[CompletionItem], isIncomplete: Boolean): typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.CompletionList = js.native
}

