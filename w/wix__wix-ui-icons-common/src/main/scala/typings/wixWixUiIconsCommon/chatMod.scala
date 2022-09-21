package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chatMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/classic-editor/general/dist/components/Chat", JSImport.Default)
  @js.native
  val default: FC[ChatProps] = js.native
  
  trait ChatProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ChatProps {
    
    inline def apply(): ChatProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChatProps]
    }
    
    extension [Self <: ChatProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ChatProps]
  
  /* This means you don't have to write `default`, but can instead just say `chatMod.foo` */
  override def _to: FC[ChatProps] = default
}
