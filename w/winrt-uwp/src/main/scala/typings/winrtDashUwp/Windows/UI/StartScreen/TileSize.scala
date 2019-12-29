package typings.winrtDashUwp.Windows.UI.StartScreen

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TileSize with Double] = js.native
  /* 0 */ @js.native
  object default extends TopLevel[default with Double]
  
  /* 3 */ @js.native
  object square150x150 extends TopLevel[square150x150 with Double]
  
  /* 1 */ @js.native
  object square30x30 extends TopLevel[square30x30 with Double]
  
  /* 5 */ @js.native
  object square310x310 extends TopLevel[square310x310 with Double]
  
  /* 7 */ @js.native
  object square44x44 extends TopLevel[square44x44 with Double]
  
  /* 2 */ @js.native
  object square70x70 extends TopLevel[square70x70 with Double]
  
  /* 6 */ @js.native
  object square71x71 extends TopLevel[square71x71 with Double]
  
  /* 4 */ @js.native
  object wide310x150 extends TopLevel[wide310x150 with Double]
  
}

