package typings.winrtUwp.Windows.Media

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides properties for video information that is displayed by SystemMediaTransportControlsDisplayUpdater class. */
trait VideoDisplayProperties extends js.Object {
  /** Gets a modifiable list of strings representing genre names. */
  var genres: IVector[String]
  /** Gets or sets the subtitle of the video. */
  var subtitle: String
  /** Gets or sets the title of the video. */
  var title: String
}

object VideoDisplayProperties {
  @scala.inline
  def apply(genres: IVector[String], subtitle: String, title: String): VideoDisplayProperties = {
    val __obj = js.Dynamic.literal(genres = genres.asInstanceOf[js.Any], subtitle = subtitle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoDisplayProperties]
  }
}

