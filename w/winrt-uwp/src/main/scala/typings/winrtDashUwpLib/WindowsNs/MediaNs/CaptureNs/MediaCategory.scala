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
  
  val communications: communications with java.lang.String = js.native
  val gameChat: gameChat with java.lang.String = js.native
  val media: media with java.lang.String = js.native
  val other: other with java.lang.String = js.native
  val speech: speech with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.MediaCategory with java.lang.String] = js.native
}

