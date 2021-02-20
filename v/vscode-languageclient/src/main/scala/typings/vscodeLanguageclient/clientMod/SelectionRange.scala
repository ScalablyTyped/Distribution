package typings.vscodeLanguageclient.clientMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SelectionRange {
  
  /**
    * Creates a new SelectionRange
    * @param range the range.
    * @param parent an optional parent.
    */
  @JSImport("vscode-languageclient/lib/client", "SelectionRange.create")
  @js.native
  def create(range: typings.vscodeLanguageserverTypes.mod.Range): typings.vscodeLanguageserverTypes.mod.SelectionRange = js.native
  @JSImport("vscode-languageclient/lib/client", "SelectionRange.create")
  @js.native
  def create(
    range: typings.vscodeLanguageserverTypes.mod.Range,
    parent: typings.vscodeLanguageserverTypes.mod.SelectionRange
  ): typings.vscodeLanguageserverTypes.mod.SelectionRange = js.native
  
  @JSImport("vscode-languageclient/lib/client", "SelectionRange.is")
  @js.native
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.SelectionRange */ Boolean = js.native
}
