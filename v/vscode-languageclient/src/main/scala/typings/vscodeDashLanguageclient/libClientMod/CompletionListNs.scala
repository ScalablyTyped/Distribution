package typings.vscodeDashLanguageclient.libClientMod

import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.CompletionItem
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.CompletionList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "CompletionList")
@js.native
object CompletionListNs extends js.Object {
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

