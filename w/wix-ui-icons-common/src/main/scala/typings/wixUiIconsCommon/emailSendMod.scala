package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object emailSendMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/EmailSend", JSImport.Default)
  @js.native
  val default: SFC[EmailSendProps] = js.native
  
  trait EmailSendProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object EmailSendProps {
    
    @scala.inline
    def apply(): EmailSendProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EmailSendProps]
    }
    
    @scala.inline
    implicit class EmailSendPropsMutableBuilder[Self <: EmailSendProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[EmailSendProps]
  
  /* This means you don't have to write `default`, but can instead just say `emailSendMod.foo` */
  override def _to: SFC[EmailSendProps] = default
}
