package typings
package winrtDashUwpLib.WindowsNs.MediaNs.EditingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VideoFramePrecision extends js.Object

/** Used to specify the frame precision algorithm when retrieving a thumbnail. */
@JSGlobal("Windows.Media.Editing.VideoFramePrecision")
@js.native
object VideoFramePrecision extends js.Object {
  /** Use a more precise algorithm to get a thumbnail to the nearest frame. */
  @js.native
  sealed trait nearestFrame
    extends winrtDashUwpLib.WindowsNs.MediaNs.EditingNs.VideoFramePrecision
  
  /** Use a faster but less precise algorithm to get the thumbnail. */
  @js.native
  sealed trait nearestKeyFrame
    extends winrtDashUwpLib.WindowsNs.MediaNs.EditingNs.VideoFramePrecision
  
  /* 0 */ val nearestFrame: nearestFrame with scala.Double = js.native
  /* 1 */ val nearestKeyFrame: nearestKeyFrame with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.EditingNs.VideoFramePrecision with scala.Double
  ] = js.native
}

