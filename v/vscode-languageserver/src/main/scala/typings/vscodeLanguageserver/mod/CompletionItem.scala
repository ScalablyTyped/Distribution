package typings.vscodeLanguageserver.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CompletionItem {
  
  @JSImport("vscode-languageserver", "CompletionItem")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Create a completion item and seed it with a label.
    * @param label The completion item's label
    */
  inline def create(label: String): typings.vscodeLanguageserverTypes.mod.CompletionItem = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(label.asInstanceOf[js.Any]).asInstanceOf[typings.vscodeLanguageserverTypes.mod.CompletionItem]
}
