package typings.winrtDashUwp.Windows.UI.StartScreen

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
  sealed trait default extends TileSize
  
  /** The medium tile. */
  @js.native
  sealed trait square150x150 extends TileSize
  
  /** The small image size used in search results, the Apps list, and in some other parts of the UI. */
  @js.native
  sealed trait square30x30 extends TileSize
  
  /** The large tile. */
  @js.native
  sealed trait square310x310 extends TileSize
  
  /** The small image size used in search results, the Apps list, and in some other parts of the UI. */
  @js.native
  sealed trait square44x44 extends TileSize
  
  /** The small tile used on the Start screen. */
  @js.native
  sealed trait square70x70 extends TileSize
  
  /** Windows Phone 8.1 only: The small tile used on the Start screen. Note that you cannot specify the size of a pinned secondary tile on Windows Phone 8.1, so this value currently has no use. */
  @js.native
  sealed trait square71x71 extends TileSize
  
  /** The wide tile. */
  @js.native
  sealed trait wide310x150 extends TileSize
  
  /* 0 */ val default: typings.winrtDashUwp.Windows.UI.StartScreen.TileSize.default with Double = js.native
  /* 3 */ val square150x150: typings.winrtDashUwp.Windows.UI.StartScreen.TileSize.square150x150 with Double = js.native
  /* 1 */ val square30x30: typings.winrtDashUwp.Windows.UI.StartScreen.TileSize.square30x30 with Double = js.native
  /* 5 */ val square310x310: typings.winrtDashUwp.Windows.UI.StartScreen.TileSize.square310x310 with Double = js.native
  /* 7 */ val square44x44: typings.winrtDashUwp.Windows.UI.StartScreen.TileSize.square44x44 with Double = js.native
  /* 2 */ val square70x70: typings.winrtDashUwp.Windows.UI.StartScreen.TileSize.square70x70 with Double = js.native
  /* 6 */ val square71x71: typings.winrtDashUwp.Windows.UI.StartScreen.TileSize.square71x71 with Double = js.native
  /* 4 */ val wide310x150: typings.winrtDashUwp.Windows.UI.StartScreen.TileSize.wide310x150 with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TileSize with Double] = js.native
}

