package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object orderAddSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/OrderAddSmall", JSImport.Default)
  @js.native
  val default: SFC[OrderAddSmallProps] = js.native
  
  @js.native
  trait OrderAddSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object OrderAddSmallProps {
    
    @scala.inline
    def apply(): OrderAddSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OrderAddSmallProps]
    }
    
    @scala.inline
    implicit class OrderAddSmallPropsMutableBuilder[Self <: OrderAddSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[OrderAddSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `orderAddSmallMod.foo` */
  override def _to: SFC[OrderAddSmallProps] = default
}
