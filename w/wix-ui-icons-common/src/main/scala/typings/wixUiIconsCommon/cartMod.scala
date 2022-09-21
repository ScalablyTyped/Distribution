package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cartMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Cart", JSImport.Default)
  @js.native
  val default: FC[CartProps] = js.native
  
  trait CartProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object CartProps {
    
    inline def apply(): CartProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CartProps]
    }
    
    extension [Self <: CartProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[CartProps]
  
  /* This means you don't have to write `default`, but can instead just say `cartMod.foo` */
  override def _to: FC[CartProps] = default
}
