package typings.winrtUwp.global.Windows.Media

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides properties for video information that is displayed by SystemMediaTransportControlsDisplayUpdater class. */
@JSGlobal("Windows.Media.VideoDisplayProperties")
@js.native
abstract class VideoDisplayProperties ()
  extends typings.winrtUwp.Windows.Media.VideoDisplayProperties {
  /** Gets a modifiable list of strings representing genre names. */
  /* CompleteClass */
  override var genres: IVector[String] = js.native
  /** Gets or sets the subtitle of the video. */
  /* CompleteClass */
  override var subtitle: String = js.native
  /** Gets or sets the title of the video. */
  /* CompleteClass */
  override var title: String = js.native
}

