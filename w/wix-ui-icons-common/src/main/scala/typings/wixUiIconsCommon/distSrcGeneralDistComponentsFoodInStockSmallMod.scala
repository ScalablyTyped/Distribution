package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsFoodInStockSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/FoodInStockSmall", JSImport.Default)
  @js.native
  val default: FC[FoodInStockSmallProps] = js.native
  
  trait FoodInStockSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object FoodInStockSmallProps {
    
    inline def apply(): FoodInStockSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FoodInStockSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FoodInStockSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[FoodInStockSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsFoodInStockSmallMod.foo` */
  override def _to: FC[FoodInStockSmallProps] = default
}
