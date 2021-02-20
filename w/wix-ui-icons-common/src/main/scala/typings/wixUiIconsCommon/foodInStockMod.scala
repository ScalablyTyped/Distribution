package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object foodInStockMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/FoodInStock", JSImport.Default)
  @js.native
  val default: SFC[FoodInStockProps] = js.native
  
  @js.native
  trait FoodInStockProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object FoodInStockProps {
    
    @scala.inline
    def apply(): FoodInStockProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FoodInStockProps]
    }
    
    @scala.inline
    implicit class FoodInStockPropsMutableBuilder[Self <: FoodInStockProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[FoodInStockProps]
  
  /* This means you don't have to write `default`, but can instead just say `foodInStockMod.foo` */
  override def _to: SFC[FoodInStockProps] = default
}
