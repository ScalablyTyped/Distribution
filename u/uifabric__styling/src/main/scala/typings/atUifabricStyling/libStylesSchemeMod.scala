package typings.atUifabricStyling

import typings.atUifabricStyling.libInterfacesIThemeMod.ISchemeNames
import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typings.atUifabricUtilities.libCustomizationsCustomizerContextMod.ICustomizerContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/styling/lib/styles/scheme", JSImport.Namespace)
@js.native
object libStylesSchemeMod extends js.Object {
  def getThemedContext(context: ICustomizerContext): ICustomizerContext = js.native
  def getThemedContext(context: ICustomizerContext, scheme: ISchemeNames): ICustomizerContext = js.native
  def getThemedContext(context: ICustomizerContext, scheme: ISchemeNames, theme: ITheme): ICustomizerContext = js.native
}

