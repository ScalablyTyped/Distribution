package typings.styledDashComponents.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.styledDashComponents.styledDashComponentsMod.ThemeProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ThemeProvider
  extends ExternalComponentWithAttributesWithRefType[tag.type, typings.styledDashComponents.macroMod.ThemeProvider] {
  override val component: String | js.Object = js.constructorOf[typings.styledDashComponents.macroMod.ThemeProvider].asInstanceOf[String | js.Object]
  def apply[T /* <: js.Object */, U /* <: js.Object */](theme: T | (js.Function1[/* theme */ U, T])): BuildingComponent[tag.type, typings.styledDashComponents.macroMod.ThemeProvider] = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
  
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ThemeProviderProps[js.Any, js.Any]
}

