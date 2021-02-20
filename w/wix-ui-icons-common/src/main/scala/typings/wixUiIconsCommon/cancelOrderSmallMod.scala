package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cancelOrderSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/CancelOrderSmall", JSImport.Default)
  @js.native
  val default: SFC[CancelOrderSmallProps] = js.native
  
  @js.native
  trait CancelOrderSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object CancelOrderSmallProps {
    
    @scala.inline
    def apply(): CancelOrderSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CancelOrderSmallProps]
    }
    
    @scala.inline
    implicit class CancelOrderSmallPropsMutableBuilder[Self <: CancelOrderSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[CancelOrderSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `cancelOrderSmallMod.foo` */
  override def _to: SFC[CancelOrderSmallProps] = default
}
