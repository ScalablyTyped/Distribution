package typings.winrtUwp.Windows.UI.StartScreen

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TileSize extends StObject
/** Specifies the size of tile to pin. Used by some secondary tile constructors. */
@JSGlobal("Windows.UI.StartScreen.TileSize")
@js.native
object TileSize extends StObject {
  
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
}
