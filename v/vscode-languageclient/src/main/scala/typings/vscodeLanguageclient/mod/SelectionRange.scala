package typings.vscodeLanguageclient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SelectionRange {
  
  @JSImport("vscode-languageclient", "SelectionRange")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new SelectionRange
    * @param range the range.
    * @param parent an optional parent.
    */
  @scala.inline
  def create(range: typings.vscodeLanguageserverTypes.mod.Range): typings.vscodeLanguageserverTypes.mod.SelectionRange = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any]).asInstanceOf[typings.vscodeLanguageserverTypes.mod.SelectionRange]
  @scala.inline
  def create(
    range: typings.vscodeLanguageserverTypes.mod.Range,
    parent: typings.vscodeLanguageserverTypes.mod.SelectionRange
  ): typings.vscodeLanguageserverTypes.mod.SelectionRange = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.SelectionRange]
  
  @scala.inline
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.SelectionRange */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.SelectionRange */ Boolean]
}
