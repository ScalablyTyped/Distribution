package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.couponMod.CouponProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixUiIconsCommonCouponMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/Coupon", JSImport.Default)
  @js.native
  val default: FC[CouponProps] = js.native
  
  type _To = FC[CouponProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixUiIconsCommonCouponMod.foo` */
  override def _to: FC[CouponProps] = default
}
