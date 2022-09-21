package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chatDisabledMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/ChatDisabled", JSImport.Default)
  @js.native
  val default: FC[ChatDisabledProps] = js.native
  
  trait ChatDisabledProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ChatDisabledProps {
    
    inline def apply(): ChatDisabledProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChatDisabledProps]
    }
    
    extension [Self <: ChatDisabledProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ChatDisabledProps]
  
  /* This means you don't have to write `default`, but can instead just say `chatDisabledMod.foo` */
  override def _to: FC[ChatDisabledProps] = default
}
