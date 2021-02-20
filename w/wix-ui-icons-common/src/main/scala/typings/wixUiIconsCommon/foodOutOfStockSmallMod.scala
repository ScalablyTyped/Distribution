package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object foodOutOfStockSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/FoodOutOfStockSmall", JSImport.Default)
  @js.native
  val default: SFC[FoodOutOfStockSmallProps] = js.native
  
  @js.native
  trait FoodOutOfStockSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object FoodOutOfStockSmallProps {
    
    @scala.inline
    def apply(): FoodOutOfStockSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FoodOutOfStockSmallProps]
    }
    
    @scala.inline
    implicit class FoodOutOfStockSmallPropsMutableBuilder[Self <: FoodOutOfStockSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[FoodOutOfStockSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `foodOutOfStockSmallMod.foo` */
  override def _to: SFC[FoodOutOfStockSmallProps] = default
}
