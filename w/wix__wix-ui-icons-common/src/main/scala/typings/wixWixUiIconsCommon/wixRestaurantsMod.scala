package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixRestaurantsMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/classic-editor/general/dist/components/WixRestaurants", JSImport.Default)
  @js.native
  val default: FC[WixRestaurantsProps] = js.native
  
  trait WixRestaurantsProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object WixRestaurantsProps {
    
    inline def apply(): WixRestaurantsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WixRestaurantsProps]
    }
    
    extension [Self <: WixRestaurantsProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[WixRestaurantsProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixRestaurantsMod.foo` */
  override def _to: FC[WixRestaurantsProps] = default
}
