package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object orderAddMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/OrderAdd", JSImport.Default)
  @js.native
  val default: SFC[OrderAddProps] = js.native
  
  @js.native
  trait OrderAddProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object OrderAddProps {
    
    @scala.inline
    def apply(): OrderAddProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OrderAddProps]
    }
    
    @scala.inline
    implicit class OrderAddPropsMutableBuilder[Self <: OrderAddProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[OrderAddProps]
  
  /* This means you don't have to write `default`, but can instead just say `orderAddMod.foo` */
  override def _to: SFC[OrderAddProps] = default
}
