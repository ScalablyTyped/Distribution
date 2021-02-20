package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chatDisabledSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ChatDisabledSmall", JSImport.Default)
  @js.native
  val default: SFC[ChatDisabledSmallProps] = js.native
  
  @js.native
  trait ChatDisabledSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object ChatDisabledSmallProps {
    
    @scala.inline
    def apply(): ChatDisabledSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChatDisabledSmallProps]
    }
    
    @scala.inline
    implicit class ChatDisabledSmallPropsMutableBuilder[Self <: ChatDisabledSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[ChatDisabledSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `chatDisabledSmallMod.foo` */
  override def _to: SFC[ChatDisabledSmallProps] = default
}
