package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcOnStageSystemDistComponentsNotificationsLargeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/on-stage/system/dist/components/NotificationsLarge", JSImport.Default)
  @js.native
  val default: FC[NotificationsLargeProps] = js.native
  
  trait NotificationsLargeProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object NotificationsLargeProps {
    
    inline def apply(): NotificationsLargeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotificationsLargeProps]
    }
    
    extension [Self <: NotificationsLargeProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[NotificationsLargeProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcOnStageSystemDistComponentsNotificationsLargeMod.foo` */
  override def _to: FC[NotificationsLargeProps] = default
}
