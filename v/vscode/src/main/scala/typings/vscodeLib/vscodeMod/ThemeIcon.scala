package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode", "ThemeIcon")
@js.native
class ThemeIcon protected () extends js.Object {
  protected def this(id: java.lang.String) = this()
}

/* static members */
@JSImport("vscode", "ThemeIcon")
@js.native
object ThemeIcon extends js.Object {
  /**
  		 * Reference to a icon representing a file. The icon is taken from the current file icon theme or a placeholder icon.
  		 */
  val File: vscodeLib.vscodeMod.ThemeIcon = js.native
  /**
  		 * Reference to a icon representing a folder. The icon is taken from the current file icon theme or a placeholder icon.
  		 */
  val Folder: vscodeLib.vscodeMod.ThemeIcon = js.native
}

