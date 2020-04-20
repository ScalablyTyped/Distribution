package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TerminalDimensions extends js.Object {
  /**
  		 * The number of columns in the terminal.
  		 */
  val columns: Double
  /**
  		 * The number of rows in the terminal.
  		 */
  val rows: Double
}

object TerminalDimensions {
  @scala.inline
  def apply(columns: Double, rows: Double): TerminalDimensions = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[TerminalDimensions]
  }
}

