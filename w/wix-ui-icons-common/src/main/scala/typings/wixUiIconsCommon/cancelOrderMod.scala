package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cancelOrderMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/CancelOrder", JSImport.Default)
  @js.native
  val default: SFC[CancelOrderProps] = js.native
  
  trait CancelOrderProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object CancelOrderProps {
    
    @scala.inline
    def apply(): CancelOrderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CancelOrderProps]
    }
    
    @scala.inline
    implicit class CancelOrderPropsMutableBuilder[Self <: CancelOrderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[CancelOrderProps]
  
  /* This means you don't have to write `default`, but can instead just say `cancelOrderMod.foo` */
  override def _to: SFC[CancelOrderProps] = default
}
