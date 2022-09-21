package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsWidgetBoldMod.WidgetBoldProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object widgetBoldMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/WidgetBold", JSImport.Default)
  @js.native
  val default: FC[WidgetBoldProps] = js.native
  
  type _To = FC[WidgetBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `widgetBoldMod.foo` */
  override def _to: FC[WidgetBoldProps] = default
}
