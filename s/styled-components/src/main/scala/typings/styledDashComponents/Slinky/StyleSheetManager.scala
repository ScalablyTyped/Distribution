package typings.styledDashComponents.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.std.HTMLElement
import typings.styledDashComponents.styledDashComponentsMod.ServerStyleSheet
import typings.styledDashComponents.styledDashComponentsMod.StyleSheetManagerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StyleSheetManager
  extends ExternalComponentWithAttributesWithRefType[tag.type, typings.styledDashComponents.macroMod.StyleSheetManager] {
  override val component: String | js.Object = js.constructorOf[typings.styledDashComponents.macroMod.StyleSheetManager].asInstanceOf[String | js.Object]
  def apply(sheet: ServerStyleSheet = null, target: HTMLElement = null): BuildingComponent[tag.type, typings.styledDashComponents.macroMod.StyleSheetManager] = {
    val __obj = js.Dynamic.literal()
    if (sheet != null) __obj.updateDynamic("sheet")(sheet)
    if (target != null) __obj.updateDynamic("target")(target)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = StyleSheetManagerProps
}

