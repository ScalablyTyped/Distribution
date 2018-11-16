package typings
package atUifabricStylingLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/styling/lib/styles/theme", JSImport.Namespace)
@js.native
object libStylesThemeMod extends js.Object {
  val ThemeSettingName: /* theme */ java.lang.String = js.native
  def createTheme(theme: atUifabricStylingLib.libInterfacesIThemeMod.IPartialTheme): atUifabricStylingLib.libInterfacesIThemeMod.ITheme = js.native
  def createTheme(theme: atUifabricStylingLib.libInterfacesIThemeMod.IPartialTheme, depComments: scala.Boolean): atUifabricStylingLib.libInterfacesIThemeMod.ITheme = js.native
  def getTheme(): atUifabricStylingLib.libInterfacesIThemeMod.ITheme = js.native
  def getTheme(depComments: scala.Boolean): atUifabricStylingLib.libInterfacesIThemeMod.ITheme = js.native
  def loadTheme(theme: atUifabricStylingLib.libInterfacesIThemeMod.IPartialTheme): atUifabricStylingLib.libInterfacesIThemeMod.ITheme = js.native
  def loadTheme(theme: atUifabricStylingLib.libInterfacesIThemeMod.IPartialTheme, depComments: scala.Boolean): atUifabricStylingLib.libInterfacesIThemeMod.ITheme = js.native
  def registerOnThemeChangeCallback(callback: js.Function1[/* theme */ atUifabricStylingLib.libInterfacesIThemeMod.ITheme, scala.Unit]): scala.Unit = js.native
  def removeOnThemeChangeCallback(callback: js.Function1[/* theme */ atUifabricStylingLib.libInterfacesIThemeMod.ITheme, scala.Unit]): scala.Unit = js.native
}

