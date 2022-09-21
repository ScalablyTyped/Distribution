package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chatFilledMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/ChatFilled", JSImport.Default)
  @js.native
  val default: FC[ChatFilledProps] = js.native
  
  trait ChatFilledProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ChatFilledProps {
    
    inline def apply(): ChatFilledProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChatFilledProps]
    }
    
    extension [Self <: ChatFilledProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ChatFilledProps]
  
  /* This means you don't have to write `default`, but can instead just say `chatFilledMod.foo` */
  override def _to: FC[ChatFilledProps] = default
}
