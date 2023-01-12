package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsInvoiceSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/InvoiceSmall", JSImport.Default)
  @js.native
  val default: FC[InvoiceSmallProps] = js.native
  
  trait InvoiceSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object InvoiceSmallProps {
    
    inline def apply(): InvoiceSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InvoiceSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InvoiceSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[InvoiceSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsInvoiceSmallMod.foo` */
  override def _to: FC[InvoiceSmallProps] = default
}
