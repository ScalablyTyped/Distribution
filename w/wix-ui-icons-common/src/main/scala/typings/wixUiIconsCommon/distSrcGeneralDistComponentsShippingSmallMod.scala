package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsShippingSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ShippingSmall", JSImport.Default)
  @js.native
  val default: FC[ShippingSmallProps] = js.native
  
  trait ShippingSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ShippingSmallProps {
    
    inline def apply(): ShippingSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShippingSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ShippingSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ShippingSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsShippingSmallMod.foo` */
  override def _to: FC[ShippingSmallProps] = default
}
