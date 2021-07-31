package typings.uifabricStyling

import typings.fluentuiTheme.ischemeMod.ISchemeNames
import typings.fluentuiTheme.ithemeMod.ITheme
import typings.uifabricUtilities.customizerContextMod.ICustomizerContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object schemeMod {
  
  @JSImport("@uifabric/styling/lib/styles/scheme", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getThemedContext(context: ICustomizerContext): ICustomizerContext = ^.asInstanceOf[js.Dynamic].applyDynamic("getThemedContext")(context.asInstanceOf[js.Any]).asInstanceOf[ICustomizerContext]
  @scala.inline
  def getThemedContext(context: ICustomizerContext, scheme: Unit, theme: ITheme): ICustomizerContext = (^.asInstanceOf[js.Dynamic].applyDynamic("getThemedContext")(context.asInstanceOf[js.Any], scheme.asInstanceOf[js.Any], theme.asInstanceOf[js.Any])).asInstanceOf[ICustomizerContext]
  @scala.inline
  def getThemedContext(context: ICustomizerContext, scheme: ISchemeNames): ICustomizerContext = (^.asInstanceOf[js.Dynamic].applyDynamic("getThemedContext")(context.asInstanceOf[js.Any], scheme.asInstanceOf[js.Any])).asInstanceOf[ICustomizerContext]
  @scala.inline
  def getThemedContext(context: ICustomizerContext, scheme: ISchemeNames, theme: ITheme): ICustomizerContext = (^.asInstanceOf[js.Dynamic].applyDynamic("getThemedContext")(context.asInstanceOf[js.Any], scheme.asInstanceOf[js.Any], theme.asInstanceOf[js.Any])).asInstanceOf[ICustomizerContext]
}
