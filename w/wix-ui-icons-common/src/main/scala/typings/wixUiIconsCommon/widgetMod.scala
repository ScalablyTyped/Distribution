package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsWidgetMod.WidgetProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object widgetMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/Widget", JSImport.Default)
  @js.native
  val default: FC[WidgetProps] = js.native
  
  type _To = FC[WidgetProps]
  
  /* This means you don't have to write `default`, but can instead just say `widgetMod.foo` */
  override def _to: FC[WidgetProps] = default
}
