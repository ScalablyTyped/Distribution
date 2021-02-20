package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object documentSendMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/DocumentSend", JSImport.Default)
  @js.native
  val default: SFC[DocumentSendProps] = js.native
  
  @js.native
  trait DocumentSendProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object DocumentSendProps {
    
    @scala.inline
    def apply(): DocumentSendProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DocumentSendProps]
    }
    
    @scala.inline
    implicit class DocumentSendPropsMutableBuilder[Self <: DocumentSendProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[DocumentSendProps]
  
  /* This means you don't have to write `default`, but can instead just say `documentSendMod.foo` */
  override def _to: SFC[DocumentSendProps] = default
}
