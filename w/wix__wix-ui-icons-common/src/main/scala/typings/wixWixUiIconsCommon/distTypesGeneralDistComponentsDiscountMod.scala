package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsDiscountMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/Discount", JSImport.Default)
  @js.native
  val default: FC[DiscountProps] = js.native
  
  trait DiscountProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object DiscountProps {
    
    inline def apply(): DiscountProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DiscountProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DiscountProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[DiscountProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsDiscountMod.foo` */
  override def _to: FC[DiscountProps] = default
}
