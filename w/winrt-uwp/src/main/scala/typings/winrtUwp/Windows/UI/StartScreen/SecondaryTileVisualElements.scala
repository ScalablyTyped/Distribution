package typings.winrtUwp.Windows.UI.StartScreen

import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.UI.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains properties through which you can get or set a secondary tile's background color, foreground text, tile images, and app name display options. The properties in this class replace these SecondaryTile properties: */
trait SecondaryTileVisualElements extends js.Object {
  /** Gets or sets the secondary tile's background color. */
  var backgroundColor: Color
  /** Specifies whether the tile should use dark or light text. */
  var foregroundText: ForegroundText
  /** Specifies whether the display name should be shown on the medium secondary tile. */
  var showNameOnSquare150x150Logo: Boolean
  /** Specifies whether the display name should be shown on the large secondary tile. */
  var showNameOnSquare310x310Logo: Boolean
  /** Specifies whether the display name should be shown on the wide secondary tile. */
  var showNameOnWide310x150Logo: Boolean
  /** Gets or sets the medium secondary tile image. */
  var square150x150Logo: Uri
  /** Gets or sets the square30x30 secondary tile image. */
  var square30x30Logo: Uri
  /** Gets or sets the large secondary tile image. */
  var square310x310Logo: Uri
  /** Gets or sets the square44x44 secondary tile image. */
  var square44x44Logo: Uri
  /** Gets or sets the small secondary tile image. */
  var square70x70Logo: Uri
  /** Gets or sets the small secondary tile image. */
  var square71x71Logo: Uri
  /** Gets or sets the wide secondary tile image. */
  var wide310x150Logo: Uri
}

object SecondaryTileVisualElements {
  @scala.inline
  def apply(
    backgroundColor: Color,
    foregroundText: ForegroundText,
    showNameOnSquare150x150Logo: Boolean,
    showNameOnSquare310x310Logo: Boolean,
    showNameOnWide310x150Logo: Boolean,
    square150x150Logo: Uri,
    square30x30Logo: Uri,
    square310x310Logo: Uri,
    square44x44Logo: Uri,
    square70x70Logo: Uri,
    square71x71Logo: Uri,
    wide310x150Logo: Uri
  ): SecondaryTileVisualElements = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], foregroundText = foregroundText.asInstanceOf[js.Any], showNameOnSquare150x150Logo = showNameOnSquare150x150Logo.asInstanceOf[js.Any], showNameOnSquare310x310Logo = showNameOnSquare310x310Logo.asInstanceOf[js.Any], showNameOnWide310x150Logo = showNameOnWide310x150Logo.asInstanceOf[js.Any], square150x150Logo = square150x150Logo.asInstanceOf[js.Any], square30x30Logo = square30x30Logo.asInstanceOf[js.Any], square310x310Logo = square310x310Logo.asInstanceOf[js.Any], square44x44Logo = square44x44Logo.asInstanceOf[js.Any], square70x70Logo = square70x70Logo.asInstanceOf[js.Any], square71x71Logo = square71x71Logo.asInstanceOf[js.Any], wide310x150Logo = wide310x150Logo.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecondaryTileVisualElements]
  }
}

