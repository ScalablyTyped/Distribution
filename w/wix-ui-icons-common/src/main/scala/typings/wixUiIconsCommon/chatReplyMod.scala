package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chatReplyMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ChatReply", JSImport.Default)
  @js.native
  val default: SFC[ChatReplyProps] = js.native
  
  trait ChatReplyProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object ChatReplyProps {
    
    @scala.inline
    def apply(): ChatReplyProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChatReplyProps]
    }
    
    @scala.inline
    implicit class ChatReplyPropsMutableBuilder[Self <: ChatReplyProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[ChatReplyProps]
  
  /* This means you don't have to write `default`, but can instead just say `chatReplyMod.foo` */
  override def _to: SFC[ChatReplyProps] = default
}
