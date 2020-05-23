package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode", "SelectionRange")
@js.native
class SelectionRange protected () extends js.Object {
  /**
    * Creates a new selection range.
    *
    * @param range The range of the selection range.
    * @param parent The parent of the selection range.
    */
  def this(range: Range) = this()
  def this(range: Range, parent: SelectionRange) = this()
  /**
    * The parent selection range containing this range.
    */
  var parent: js.UndefOr[SelectionRange] = js.native
  /**
    * The [range](#Range) of this selection range.
    */
  var range: Range = js.native
}

