package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode", "ThemeIcon")
@js.native
class ThemeIcon protected () extends StObject {
  /**
    * Creates a reference to a theme icon.
    * @param id id of the icon. The available icons are listed in https://microsoft.github.io/vscode-codicons/dist/codicon.html.
    * @param color optional `ThemeColor` for the icon. The color is currently only used in [TreeItem](#TreeItem).
    */
  def this(id: String) = this()
  def this(id: String, color: ThemeColor) = this()
  
  /**
    * The optional ThemeColor of the icon. The color is currently only used in [TreeItem](#TreeItem).
    */
  val color: js.UndefOr[ThemeColor] = js.native
  
  /**
    * The id of the icon. The available icons are listed in https://microsoft.github.io/vscode-codicons/dist/codicon.html.
    */
  val id: String = js.native
}
/* static members */
object ThemeIcon {
  
  /**
    * Reference to an icon representing a file. The icon is taken from the current file icon theme or a placeholder icon is used.
    */
  @JSImport("vscode", "ThemeIcon.File")
  @js.native
  val File: ThemeIcon = js.native
  
  /**
    * Reference to an icon representing a folder. The icon is taken from the current file icon theme or a placeholder icon is used.
    */
  @JSImport("vscode", "ThemeIcon.Folder")
  @js.native
  val Folder: ThemeIcon = js.native
}
