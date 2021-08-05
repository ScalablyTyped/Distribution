package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notificationMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Notification", JSImport.Default)
  @js.native
  val default: SFC[NotificationProps] = js.native
  
  trait NotificationProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object NotificationProps {
    
    inline def apply(): NotificationProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotificationProps]
    }
    
    extension [Self <: NotificationProps](x: Self) {
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[NotificationProps]
  
  /* This means you don't have to write `default`, but can instead just say `notificationMod.foo` */
  override def _to: SFC[NotificationProps] = default
}
