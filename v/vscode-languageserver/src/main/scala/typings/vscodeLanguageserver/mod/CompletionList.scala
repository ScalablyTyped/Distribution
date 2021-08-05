package typings.vscodeLanguageserver.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CompletionList {
  
  @JSImport("vscode-languageserver", "CompletionList")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new completion list.
    *
    * @param items The completion items.
    * @param isIncomplete The list is not complete.
    */
  inline def create(): typings.vscodeLanguageserverTypes.mod.CompletionList = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.vscodeLanguageserverTypes.mod.CompletionList]
  inline def create(items: js.Array[typings.vscodeLanguageserverTypes.mod.CompletionItem]): typings.vscodeLanguageserverTypes.mod.CompletionList = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(items.asInstanceOf[js.Any]).asInstanceOf[typings.vscodeLanguageserverTypes.mod.CompletionList]
  inline def create(items: js.Array[typings.vscodeLanguageserverTypes.mod.CompletionItem], isIncomplete: Boolean): typings.vscodeLanguageserverTypes.mod.CompletionList = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(items.asInstanceOf[js.Any], isIncomplete.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.CompletionList]
  inline def create(items: Unit, isIncomplete: Boolean): typings.vscodeLanguageserverTypes.mod.CompletionList = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(items.asInstanceOf[js.Any], isIncomplete.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.CompletionList]
}
