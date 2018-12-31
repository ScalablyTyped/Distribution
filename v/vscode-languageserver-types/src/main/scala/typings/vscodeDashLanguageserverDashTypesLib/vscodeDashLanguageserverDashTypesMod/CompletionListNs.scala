package typings
package vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-types", "CompletionList")
@js.native
object CompletionListNs extends js.Object {
  /**
    * Creates a new completion list.
    *
    * @param items The completion items.
    * @param isIncomplete The list is not complete.
    */
  def create(): vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.CompletionList = js.native
  def create(
    items: js.Array[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.CompletionItem
    ]
  ): vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.CompletionList = js.native
  def create(
    items: js.Array[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.CompletionItem
    ],
    isIncomplete: scala.Boolean
  ): vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.CompletionList = js.native
}

