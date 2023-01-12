package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsFoodMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/Food", JSImport.Default)
  @js.native
  val default: FC[FoodProps] = js.native
  
  trait FoodProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object FoodProps {
    
    inline def apply(): FoodProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FoodProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FoodProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[FoodProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsFoodMod.foo` */
  override def _to: FC[FoodProps] = default
}
