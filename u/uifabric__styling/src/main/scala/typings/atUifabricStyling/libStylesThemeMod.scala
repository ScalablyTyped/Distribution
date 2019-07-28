package typings.atUifabricStyling

import typings.atUifabricStyling.atUifabricStylingStrings.theme
import typings.atUifabricStyling.libInterfacesIThemeMod.IPartialTheme
import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/styling/lib/styles/theme", JSImport.Namespace)
@js.native
object libStylesThemeMod extends js.Object {
  val ThemeSettingName: theme = js.native
  def createTheme(theme: IPartialTheme): ITheme = js.native
  def createTheme(theme: IPartialTheme, depComments: Boolean): ITheme = js.native
  def getTheme(): ITheme = js.native
  def getTheme(depComments: Boolean): ITheme = js.native
  def loadTheme(theme: IPartialTheme): ITheme = js.native
  def loadTheme(theme: IPartialTheme, depComments: Boolean): ITheme = js.native
  def registerOnThemeChangeCallback(callback: js.Function1[/* theme */ ITheme, Unit]): Unit = js.native
  def removeOnThemeChangeCallback(callback: js.Function1[/* theme */ ITheme, Unit]): Unit = js.native
}

