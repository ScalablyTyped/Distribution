package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.wixUiIconsCommon.hotelMod.HotelProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixUiIconsCommonHotelMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/Hotel", JSImport.Default)
  @js.native
  val default: SFC[HotelProps] = js.native
  
  type _To = SFC[HotelProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixUiIconsCommonHotelMod.foo` */
  override def _to: SFC[HotelProps] = default
}
