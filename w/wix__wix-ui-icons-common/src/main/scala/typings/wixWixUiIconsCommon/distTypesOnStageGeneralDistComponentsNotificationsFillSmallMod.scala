package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesOnStageGeneralDistComponentsNotificationsFillSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/on-stage/general/dist/components/NotificationsFillSmall", JSImport.Default)
  @js.native
  val default: FC[NotificationsFillSmallProps] = js.native
  
  trait NotificationsFillSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object NotificationsFillSmallProps {
    
    inline def apply(): NotificationsFillSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotificationsFillSmallProps]
    }
    
    extension [Self <: NotificationsFillSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[NotificationsFillSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesOnStageGeneralDistComponentsNotificationsFillSmallMod.foo` */
  override def _to: FC[NotificationsFillSmallProps] = default
}
