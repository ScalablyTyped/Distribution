package typings.winrtDashUwp.WindowsNs.UINs.StartScreenNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.Uri
import typings.winrtDashUwp.WindowsNs.UINs.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains properties through which you can get or set a secondary tile's background color, foreground text, tile images, and app name display options. The properties in this class replace these SecondaryTile properties: */
@JSGlobal("Windows.UI.StartScreen.SecondaryTileVisualElements")
@js.native
abstract class SecondaryTileVisualElements () extends js.Object {
  /** Gets or sets the secondary tile's background color. */
  var backgroundColor: Color = js.native
  /** Specifies whether the tile should use dark or light text. */
  var foregroundText: ForegroundText = js.native
  /** Specifies whether the display name should be shown on the medium secondary tile. */
  var showNameOnSquare150x150Logo: Boolean = js.native
  /** Specifies whether the display name should be shown on the large secondary tile. */
  var showNameOnSquare310x310Logo: Boolean = js.native
  /** Specifies whether the display name should be shown on the wide secondary tile. */
  var showNameOnWide310x150Logo: Boolean = js.native
  /** Gets or sets the medium secondary tile image. */
  var square150x150Logo: Uri = js.native
  /** Gets or sets the square30x30 secondary tile image. */
  var square30x30Logo: Uri = js.native
  /** Gets or sets the large secondary tile image. */
  var square310x310Logo: Uri = js.native
  /** Gets or sets the square44x44 secondary tile image. */
  var square44x44Logo: Uri = js.native
  /** Gets or sets the small secondary tile image. */
  var square70x70Logo: Uri = js.native
  /** Gets or sets the small secondary tile image. */
  var square71x71Logo: Uri = js.native
  /** Gets or sets the wide secondary tile image. */
  var wide310x150Logo: Uri = js.native
}

