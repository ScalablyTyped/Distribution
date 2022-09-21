package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.seatRowMod.SeatRowProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixUiIconsCommonSeatRowMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/SeatRow", JSImport.Default)
  @js.native
  val default: FC[SeatRowProps] = js.native
  
  type _To = FC[SeatRowProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixUiIconsCommonSeatRowMod.foo` */
  override def _to: FC[SeatRowProps] = default
}
