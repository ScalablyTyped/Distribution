package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object couponSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/CouponSmall", JSImport.Default)
  @js.native
  val default: SFC[CouponSmallProps] = js.native
  
  trait CouponSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object CouponSmallProps {
    
    @scala.inline
    def apply(): CouponSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CouponSmallProps]
    }
    
    @scala.inline
    implicit class CouponSmallPropsMutableBuilder[Self <: CouponSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[CouponSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `couponSmallMod.foo` */
  override def _to: SFC[CouponSmallProps] = default
}
