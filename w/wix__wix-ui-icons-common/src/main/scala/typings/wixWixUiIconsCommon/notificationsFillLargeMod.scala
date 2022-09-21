package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notificationsFillLargeMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/on-stage/system/dist/components/NotificationsFillLarge", JSImport.Default)
  @js.native
  val default: FC[NotificationsFillLargeProps] = js.native
  
  trait NotificationsFillLargeProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object NotificationsFillLargeProps {
    
    inline def apply(): NotificationsFillLargeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotificationsFillLargeProps]
    }
    
    extension [Self <: NotificationsFillLargeProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[NotificationsFillLargeProps]
  
  /* This means you don't have to write `default`, but can instead just say `notificationsFillLargeMod.foo` */
  override def _to: FC[NotificationsFillLargeProps] = default
}
