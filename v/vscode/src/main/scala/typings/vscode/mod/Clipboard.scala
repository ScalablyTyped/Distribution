package typings.vscode.mod

import typings.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Clipboard extends js.Object {
  /**
  		 * Read the current clipboard contents as text.
  		 * @returns A thenable that resolves to a string.
  		 */
  def readText(): Thenable[String]
  /**
  		 * Writes text into the clipboard.
  		 * @returns A thenable that resolves when writing happened.
  		 */
  def writeText(value: String): Thenable[Unit]
}

object Clipboard {
  @scala.inline
  def apply(readText: () => Thenable[String], writeText: String => Thenable[Unit]): Clipboard = {
    val __obj = js.Dynamic.literal(readText = js.Any.fromFunction0(readText), writeText = js.Any.fromFunction1(writeText))
  
    __obj.asInstanceOf[Clipboard]
  }
}

