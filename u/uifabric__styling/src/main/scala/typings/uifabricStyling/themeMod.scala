package typings.uifabricStyling

import typings.fluentuiTheme.ithemeMod.IPartialTheme
import typings.fluentuiTheme.ithemeMod.ITheme
import typings.fluentuiTheme.themeMod.PartialTheme
import typings.fluentuiTheme.themeMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object themeMod {
  
  @JSImport("@uifabric/styling/lib/styles/theme", "ThemeSettingName")
  @js.native
  val ThemeSettingName: /* "theme" */ String = js.native
  
  @JSImport("@uifabric/styling/lib/styles/theme", "createTheme")
  @js.native
  def createTheme(): Theme = js.native
  @JSImport("@uifabric/styling/lib/styles/theme", "createTheme")
  @js.native
  def createTheme(theme: js.UndefOr[scala.Nothing], depComments: Boolean): Theme = js.native
  @JSImport("@uifabric/styling/lib/styles/theme", "createTheme")
  @js.native
  def createTheme(theme: PartialTheme): Theme = js.native
  @JSImport("@uifabric/styling/lib/styles/theme", "createTheme")
  @js.native
  def createTheme(theme: PartialTheme, depComments: Boolean): Theme = js.native
  
  @JSImport("@uifabric/styling/lib/styles/theme", "getTheme")
  @js.native
  def getTheme(): ITheme = js.native
  @JSImport("@uifabric/styling/lib/styles/theme", "getTheme")
  @js.native
  def getTheme(depComments: Boolean): ITheme = js.native
  
  @JSImport("@uifabric/styling/lib/styles/theme", "initializeThemeInCustomizations")
  @js.native
  def initializeThemeInCustomizations(): Unit = js.native
  
  @JSImport("@uifabric/styling/lib/styles/theme", "loadTheme")
  @js.native
  def loadTheme(theme: IPartialTheme): ITheme = js.native
  @JSImport("@uifabric/styling/lib/styles/theme", "loadTheme")
  @js.native
  def loadTheme(theme: IPartialTheme, depComments: Boolean): ITheme = js.native
  
  @JSImport("@uifabric/styling/lib/styles/theme", "registerOnThemeChangeCallback")
  @js.native
  def registerOnThemeChangeCallback(callback: js.Function1[/* theme */ ITheme, Unit]): Unit = js.native
  
  @JSImport("@uifabric/styling/lib/styles/theme", "removeOnThemeChangeCallback")
  @js.native
  def removeOnThemeChangeCallback(callback: js.Function1[/* theme */ ITheme, Unit]): Unit = js.native
}
