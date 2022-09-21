package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object foodInStockMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/FoodInStock", JSImport.Default)
  @js.native
  val default: FC[FoodInStockProps] = js.native
  
  trait FoodInStockProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object FoodInStockProps {
    
    inline def apply(): FoodInStockProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FoodInStockProps]
    }
    
    extension [Self <: FoodInStockProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[FoodInStockProps]
  
  /* This means you don't have to write `default`, but can instead just say `foodInStockMod.foo` */
  override def _to: FC[FoodInStockProps] = default
}
