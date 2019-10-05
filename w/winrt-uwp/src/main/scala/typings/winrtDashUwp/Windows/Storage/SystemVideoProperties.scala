package typings.winrtDashUwp.Windows.Storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A helper object that provides indexing names for video file properties. */
@JSGlobal("Windows.Storage.SystemVideoProperties")
@js.native
abstract class SystemVideoProperties () extends js.Object {
  /** Gets the name of the System.Video.Director property (one of the Windows video file properties). */
  var director: String = js.native
  /** Gets the name of the System.Video.FrameHeight property (one of the Windows video file properties). */
  var frameHeight: String = js.native
  /** Gets the name of the System.Video.FrameWidth property (one of the Windows video file properties). */
  var frameWidth: String = js.native
  /** Gets the name of the System.Video.Orientation property (one of the Windows video file properties). */
  var orientation: String = js.native
  /** Gets the name of the System.Video.TotalBitrate property (one of the Windows video file properties). */
  var totalBitrate: String = js.native
}

