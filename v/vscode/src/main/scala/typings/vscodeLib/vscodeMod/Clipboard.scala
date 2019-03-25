package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Clipboard extends js.Object {
  /**
  		 * Read the current clipboard contents as text.
  		 * @returns A thenable that resolves to a string.
  		 */
  def readText(): vscodeLib.Thenable[java.lang.String]
  /**
  		 * Writes text into the clipboard.
  		 * @returns A thenable that resolves when writing happened.
  		 */
  def writeText(value: java.lang.String): vscodeLib.Thenable[scala.Unit]
}

object Clipboard {
  @scala.inline
  def apply(
    readText: () => vscodeLib.Thenable[java.lang.String],
    writeText: java.lang.String => vscodeLib.Thenable[scala.Unit]
  ): Clipboard = {
    val __obj = js.Dynamic.literal(readText = js.Any.fromFunction0(readText), writeText = js.Any.fromFunction1(writeText))
  
    __obj.asInstanceOf[Clipboard]
  }
}

