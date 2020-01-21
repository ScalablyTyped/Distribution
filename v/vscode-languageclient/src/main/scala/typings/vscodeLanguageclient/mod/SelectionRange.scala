package typings.vscodeLanguageclient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient", "SelectionRange")
@js.native
object SelectionRange extends js.Object {
  /**
    * Creates a new SelectionRange
    * @param range the range.
    * @param parent an optional parent.
    */
  def create(range: typings.vscodeLanguageserverTypes.mod.Range): typings.vscodeLanguageserverTypes.mod.SelectionRange = js.native
  def create(
    range: typings.vscodeLanguageserverTypes.mod.Range,
    parent: typings.vscodeLanguageserverTypes.mod.SelectionRange
  ): typings.vscodeLanguageserverTypes.mod.SelectionRange = js.native
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.SelectionRange */ Boolean = js.native
}

