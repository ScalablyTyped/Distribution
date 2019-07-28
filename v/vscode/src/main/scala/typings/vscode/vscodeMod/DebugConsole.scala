package typings.vscode.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DebugConsole extends js.Object {
  /**
  		 * Append the given value to the debug console.
  		 *
  		 * @param value A string, falsy values will not be printed.
  		 */
  def append(value: String): Unit
  /**
  		 * Append the given value and a line feed character
  		 * to the debug console.
  		 *
  		 * @param value A string, falsy values will be printed.
  		 */
  def appendLine(value: String): Unit
}

object DebugConsole {
  @scala.inline
  def apply(append: String => Unit, appendLine: String => Unit): DebugConsole = {
    val __obj = js.Dynamic.literal(append = js.Any.fromFunction1(append), appendLine = js.Any.fromFunction1(appendLine))
  
    __obj.asInstanceOf[DebugConsole]
  }
}

