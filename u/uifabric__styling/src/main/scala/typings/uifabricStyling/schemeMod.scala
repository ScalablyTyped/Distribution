package typings.uifabricStyling

import typings.fluentuiTheme.ischemeMod.ISchemeNames
import typings.fluentuiTheme.ithemeMod.ITheme
import typings.uifabricUtilities.customizerContextMod.ICustomizerContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uifabric/styling/lib/styles/scheme", JSImport.Namespace)
@js.native
object schemeMod extends js.Object {
  
  def getThemedContext(context: ICustomizerContext): ICustomizerContext = js.native
  def getThemedContext(context: ICustomizerContext, scheme: js.UndefOr[scala.Nothing], theme: ITheme): ICustomizerContext = js.native
  def getThemedContext(context: ICustomizerContext, scheme: ISchemeNames): ICustomizerContext = js.native
  def getThemedContext(context: ICustomizerContext, scheme: ISchemeNames, theme: ITheme): ICustomizerContext = js.native
}
