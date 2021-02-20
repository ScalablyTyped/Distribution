package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notificationSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/NotificationSmall", JSImport.Default)
  @js.native
  val default: SFC[NotificationSmallProps] = js.native
  
  @js.native
  trait NotificationSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object NotificationSmallProps {
    
    @scala.inline
    def apply(): NotificationSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotificationSmallProps]
    }
    
    @scala.inline
    implicit class NotificationSmallPropsMutableBuilder[Self <: NotificationSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[NotificationSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `notificationSmallMod.foo` */
  override def _to: SFC[NotificationSmallProps] = default
}
