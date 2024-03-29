package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsFoodOutOfStockMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/FoodOutOfStock", JSImport.Default)
  @js.native
  val default: FC[FoodOutOfStockProps] = js.native
  
  trait FoodOutOfStockProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object FoodOutOfStockProps {
    
    inline def apply(): FoodOutOfStockProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FoodOutOfStockProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FoodOutOfStockProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[FoodOutOfStockProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsFoodOutOfStockMod.foo` */
  override def _to: FC[FoodOutOfStockProps] = default
}
