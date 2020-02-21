package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode", "ThemeIcon")
@js.native
class ThemeIcon protected () extends js.Object {
  /**
  		 * Creates a reference to a theme icon.
  		 * @param id id of the icon. The avaiable icons are listed in https://microsoft.github.io/vscode-codicons/dist/codicon.html.
  		 */
  def this(id: String) = this()
}

/* static members */
@JSImport("vscode", "ThemeIcon")
@js.native
object ThemeIcon extends js.Object {
  /**
  		 * Reference to an icon representing a file. The icon is taken from the current file icon theme or a placeholder icon is used.
  		 */
  val File: ThemeIcon = js.native
  /**
  		 * Reference to an icon representing a folder. The icon is taken from the current file icon theme or a placeholder icon is used.
  		 */
  val Folder: ThemeIcon = js.native
}

