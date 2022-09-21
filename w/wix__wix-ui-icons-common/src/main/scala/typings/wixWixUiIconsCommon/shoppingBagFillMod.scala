package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shoppingBagFillMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/on-stage/general/dist/components/ShoppingBagFill", JSImport.Default)
  @js.native
  val default: FC[ShoppingBagFillProps] = js.native
  
  trait ShoppingBagFillProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ShoppingBagFillProps {
    
    inline def apply(): ShoppingBagFillProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShoppingBagFillProps]
    }
    
    extension [Self <: ShoppingBagFillProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ShoppingBagFillProps]
  
  /* This means you don't have to write `default`, but can instead just say `shoppingBagFillMod.foo` */
  override def _to: FC[ShoppingBagFillProps] = default
}
