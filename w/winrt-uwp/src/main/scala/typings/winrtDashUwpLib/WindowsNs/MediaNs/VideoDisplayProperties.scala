package typings
package winrtDashUwpLib.WindowsNs.MediaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides properties for video information that is displayed by SystemMediaTransportControlsDisplayUpdater class. */
@JSGlobal("Windows.Media.VideoDisplayProperties")
@js.native
abstract class VideoDisplayProperties () extends js.Object {
  /** Gets a modifiable list of strings representing genre names. */
  var genres: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[java.lang.String] = js.native
  /** Gets or sets the subtitle of the video. */
  var subtitle: java.lang.String = js.native
  /** Gets or sets the title of the video. */
  var title: java.lang.String = js.native
}

