package typings.vscodeLanguageserver.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CompletionList {
  
  /**
    * Creates a new completion list.
    *
    * @param items The completion items.
    * @param isIncomplete The list is not complete.
    */
  @JSImport("vscode-languageserver", "CompletionList.create")
  @js.native
  def create(): typings.vscodeLanguageserverTypes.mod.CompletionList = js.native
  @JSImport("vscode-languageserver", "CompletionList.create")
  @js.native
  def create(items: js.UndefOr[scala.Nothing], isIncomplete: Boolean): typings.vscodeLanguageserverTypes.mod.CompletionList = js.native
  @JSImport("vscode-languageserver", "CompletionList.create")
  @js.native
  def create(items: js.Array[typings.vscodeLanguageserverTypes.mod.CompletionItem]): typings.vscodeLanguageserverTypes.mod.CompletionList = js.native
  @JSImport("vscode-languageserver", "CompletionList.create")
  @js.native
  def create(items: js.Array[typings.vscodeLanguageserverTypes.mod.CompletionItem], isIncomplete: Boolean): typings.vscodeLanguageserverTypes.mod.CompletionList = js.native
}
