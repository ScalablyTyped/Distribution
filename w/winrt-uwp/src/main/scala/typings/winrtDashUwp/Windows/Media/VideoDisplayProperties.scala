package typings.winrtDashUwp.Windows.Media

import typings.winrtDashUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides properties for video information that is displayed by SystemMediaTransportControlsDisplayUpdater class. */
@JSGlobal("Windows.Media.VideoDisplayProperties")
@js.native
abstract class VideoDisplayProperties () extends js.Object {
  /** Gets a modifiable list of strings representing genre names. */
  var genres: IVector[String] = js.native
  /** Gets or sets the subtitle of the video. */
  var subtitle: String = js.native
  /** Gets or sets the title of the video. */
  var title: String = js.native
}

