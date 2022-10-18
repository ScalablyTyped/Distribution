package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.distSrcGeneralDistComponentsShippingMod.ShippingProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shippingMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/Shipping", JSImport.Default)
  @js.native
  val default: FC[ShippingProps] = js.native
  
  type _To = FC[ShippingProps]
  
  /* This means you don't have to write `default`, but can instead just say `shippingMod.foo` */
  override def _to: FC[ShippingProps] = default
}
