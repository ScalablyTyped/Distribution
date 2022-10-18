package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsCancelOrderMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/CancelOrder", JSImport.Default)
  @js.native
  val default: FC[CancelOrderProps] = js.native
  
  trait CancelOrderProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object CancelOrderProps {
    
    inline def apply(): CancelOrderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CancelOrderProps]
    }
    
    extension [Self <: CancelOrderProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[CancelOrderProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsCancelOrderMod.foo` */
  override def _to: FC[CancelOrderProps] = default
}
