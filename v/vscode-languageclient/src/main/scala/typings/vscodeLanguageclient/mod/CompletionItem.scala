package typings.vscodeLanguageclient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CompletionItem {
  
  @JSImport("vscode-languageclient", "CompletionItem")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Create a completion item and seed it with a label.
    * @param label The completion item's label
    */
  @scala.inline
  def create(label: String): typings.vscodeLanguageserverTypes.mod.CompletionItem = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(label.asInstanceOf[js.Any]).asInstanceOf[typings.vscodeLanguageserverTypes.mod.CompletionItem]
}
