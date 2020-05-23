package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode", "CodeLens")
@js.native
class CodeLens protected () extends js.Object {
  /**
    * Creates a new code lens object.
    *
    * @param range The range to which this code lens applies.
    * @param command The command associated to this code lens.
    */
  def this(range: Range) = this()
  def this(range: Range, command: Command) = this()
  /**
    * The command this code lens represents.
    */
  var command: js.UndefOr[Command] = js.native
  /**
    * `true` when there is a command associated.
    */
  val isResolved: Boolean = js.native
  /**
    * The range in which this code lens is valid. Should only span a single line.
    */
  var range: Range = js.native
}

