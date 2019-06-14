package typings
package winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MediaCategory extends js.Object

/** Defines values for types of media categories. */
@JSGlobal("Windows.Media.Capture.MediaCategory")
@js.native
object MediaCategory extends js.Object {
  /** Media is intended for real-time communications. */
  @js.native
  sealed trait communications
    extends winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.MediaCategory
  
  /** Media is game chat. */
  @js.native
  sealed trait gameChat
    extends winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.MediaCategory
  
  /** General media. */
  @js.native
  sealed trait media
    extends winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.MediaCategory
  
  /** Media category is other. */
  @js.native
  sealed trait other
    extends winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.MediaCategory
  
  /** Media is speech. */
  @js.native
  sealed trait speech
    extends winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.MediaCategory
  
  /* 1 */ val communications: communications with scala.Double = js.native
  /* 3 */ val gameChat: gameChat with scala.Double = js.native
  /* 2 */ val media: media with scala.Double = js.native
  /* 0 */ val other: other with scala.Double = js.native
  /* 4 */ val speech: speech with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.MediaCategory with scala.Double] = js.native
}

