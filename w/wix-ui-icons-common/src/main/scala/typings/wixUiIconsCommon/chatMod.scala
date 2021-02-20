package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chatMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Chat", JSImport.Default)
  @js.native
  val default: SFC[ChatProps] = js.native
  
  @js.native
  trait ChatProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object ChatProps {
    
    @scala.inline
    def apply(): ChatProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChatProps]
    }
    
    @scala.inline
    implicit class ChatPropsMutableBuilder[Self <: ChatProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[ChatProps]
  
  /* This means you don't have to write `default`, but can instead just say `chatMod.foo` */
  override def _to: SFC[ChatProps] = default
}
