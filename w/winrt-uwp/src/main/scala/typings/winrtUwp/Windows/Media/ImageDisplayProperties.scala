package typings.winrtUwp.Windows.Media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides properties for image information that is displayed by SystemMediaTransportControlsDisplayUpdater class. */
trait ImageDisplayProperties extends js.Object {
  /** Gets or sets the subtitle of the image. */
  var subtitle: String
  /** Gets or sets the title of the image. */
  var title: String
}

object ImageDisplayProperties {
  @scala.inline
  def apply(subtitle: String, title: String): ImageDisplayProperties = {
    val __obj = js.Dynamic.literal(subtitle = subtitle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageDisplayProperties]
  }
}

