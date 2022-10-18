package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsChatReplyMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ChatReply", JSImport.Default)
  @js.native
  val default: FC[ChatReplyProps] = js.native
  
  trait ChatReplyProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ChatReplyProps {
    
    inline def apply(): ChatReplyProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChatReplyProps]
    }
    
    extension [Self <: ChatReplyProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ChatReplyProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsChatReplyMod.foo` */
  override def _to: FC[ChatReplyProps] = default
}
