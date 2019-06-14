package typings
package winrtDashUwpLib.WindowsNs.UINs.StartScreenNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TileSize extends js.Object

/** Specifies the size of tile to pin. Used by some secondary tile constructors. */
@JSGlobal("Windows.UI.StartScreen.TileSize")
@js.native
object TileSize extends js.Object {
  /** Use the default size of the app tile. */
  @js.native
  sealed trait default
    extends winrtDashUwpLib.WindowsNs.UINs.StartScreenNs.TileSize
  
  /** The medium tile. */
  @js.native
  sealed trait square150x150
    extends winrtDashUwpLib.WindowsNs.UINs.StartScreenNs.TileSize
  
  /** The small image size used in search results, the Apps list, and in some other parts of the UI. */
  @js.native
  sealed trait square30x30
    extends winrtDashUwpLib.WindowsNs.UINs.StartScreenNs.TileSize
  
  /** The large tile. */
  @js.native
  sealed trait square310x310
    extends winrtDashUwpLib.WindowsNs.UINs.StartScreenNs.TileSize
  
  /** The small image size used in search results, the Apps list, and in some other parts of the UI. */
  @js.native
  sealed trait square44x44
    extends winrtDashUwpLib.WindowsNs.UINs.StartScreenNs.TileSize
  
  /** The small tile used on the Start screen. */
  @js.native
  sealed trait square70x70
    extends winrtDashUwpLib.WindowsNs.UINs.StartScreenNs.TileSize
  
  /** Windows Phone 8.1 only: The small tile used on the Start screen. Note that you cannot specify the size of a pinned secondary tile on Windows Phone 8.1, so this value currently has no use. */
  @js.native
  sealed trait square71x71
    extends winrtDashUwpLib.WindowsNs.UINs.StartScreenNs.TileSize
  
  /** The wide tile. */
  @js.native
  sealed trait wide310x150
    extends winrtDashUwpLib.WindowsNs.UINs.StartScreenNs.TileSize
  
  /* 0 */ val default: default with scala.Double = js.native
  /* 3 */ val square150x150: square150x150 with scala.Double = js.native
  /* 1 */ val square30x30: square30x30 with scala.Double = js.native
  /* 5 */ val square310x310: square310x310 with scala.Double = js.native
  /* 7 */ val square44x44: square44x44 with scala.Double = js.native
  /* 2 */ val square70x70: square70x70 with scala.Double = js.native
  /* 6 */ val square71x71: square71x71 with scala.Double = js.native
  /* 4 */ val wide310x150: wide310x150 with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.UINs.StartScreenNs.TileSize with scala.Double] = js.native
}

