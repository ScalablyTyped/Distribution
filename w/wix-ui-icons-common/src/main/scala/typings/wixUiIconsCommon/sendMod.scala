package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sendMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Send", JSImport.Default)
  @js.native
  val default: SFC[SendProps] = js.native
  
  trait SendProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object SendProps {
    
    @scala.inline
    def apply(): SendProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SendProps]
    }
    
    @scala.inline
    implicit class SendPropsMutableBuilder[Self <: SendProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[SendProps]
  
  /* This means you don't have to write `default`, but can instead just say `sendMod.foo` */
  override def _to: SFC[SendProps] = default
}
