package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsWixHotelsMod.WixHotelsProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixHotelsMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/WixHotels", JSImport.Default)
  @js.native
  val default: FC[WixHotelsProps] = js.native
  
  type _To = FC[WixHotelsProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixHotelsMod.foo` */
  override def _to: FC[WixHotelsProps] = default
}
