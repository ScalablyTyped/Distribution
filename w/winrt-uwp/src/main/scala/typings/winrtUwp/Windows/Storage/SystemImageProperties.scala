package typings.winrtUwp.Windows.Storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A helper object that provides indexing names for Windows image file properties. */
trait SystemImageProperties extends js.Object {
  /** Gets the name of the System.Image.HorizontalSize property (one of the Windows image file properties). */
  var horizontalSize: String
  /** Gets the name of the System.Image.VerticalSize property (one of the Windows image file properties). */
  var verticalSize: String
}

object SystemImageProperties {
  @scala.inline
  def apply(horizontalSize: String, verticalSize: String): SystemImageProperties = {
    val __obj = js.Dynamic.literal(horizontalSize = horizontalSize.asInstanceOf[js.Any], verticalSize = verticalSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemImageProperties]
  }
}

