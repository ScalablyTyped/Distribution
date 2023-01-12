package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsChatReplySmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ChatReplySmall", JSImport.Default)
  @js.native
  val default: FC[ChatReplySmallProps] = js.native
  
  trait ChatReplySmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ChatReplySmallProps {
    
    inline def apply(): ChatReplySmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChatReplySmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChatReplySmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ChatReplySmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsChatReplySmallMod.foo` */
  override def _to: FC[ChatReplySmallProps] = default
}
