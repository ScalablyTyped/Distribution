package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statusAlertPlainSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/StatusAlertPlainSmall", JSImport.Default)
  @js.native
  val default: FC[StatusAlertPlainSmallProps] = js.native
  
  trait StatusAlertPlainSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object StatusAlertPlainSmallProps {
    
    inline def apply(): StatusAlertPlainSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatusAlertPlainSmallProps]
    }
    
    extension [Self <: StatusAlertPlainSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[StatusAlertPlainSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `statusAlertPlainSmallMod.foo` */
  override def _to: FC[StatusAlertPlainSmallProps] = default
}
