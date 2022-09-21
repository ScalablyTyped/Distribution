package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shoppingBagMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/on-stage/general/dist/components/ShoppingBag", JSImport.Default)
  @js.native
  val default: FC[ShoppingBagProps] = js.native
  
  trait ShoppingBagProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ShoppingBagProps {
    
    inline def apply(): ShoppingBagProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShoppingBagProps]
    }
    
    extension [Self <: ShoppingBagProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ShoppingBagProps]
  
  /* This means you don't have to write `default`, but can instead just say `shoppingBagMod.foo` */
  override def _to: FC[ShoppingBagProps] = default
}
