package typings.vscodeLanguageserverTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionRange extends js.Object {
  /**
    * The parent selection range containing this range. Therefore `parent.range` must contain `this.range`.
    */
  var parent: js.UndefOr[SelectionRange] = js.undefined
  /**
    * The [range](#Range) of this selection range.
    */
  var range: Range
}

@JSImport("vscode-languageserver-types", "SelectionRange")
@js.native
object SelectionRange extends js.Object {
  /**
    * Creates a new SelectionRange
    * @param range the range.
    * @param parent an optional parent.
    */
  def create(range: Range): SelectionRange = js.native
  def create(range: Range, parent: SelectionRange): SelectionRange = js.native
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.SelectionRange */ Boolean = js.native
}

