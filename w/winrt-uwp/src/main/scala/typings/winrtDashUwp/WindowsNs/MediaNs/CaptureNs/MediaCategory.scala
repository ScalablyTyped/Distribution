package typings.winrtDashUwp.WindowsNs.MediaNs.CaptureNs

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
  sealed trait communications extends MediaCategory
  
  /** Media is game chat. */
  @js.native
  sealed trait gameChat extends MediaCategory
  
  /** General media. */
  @js.native
  sealed trait media extends MediaCategory
  
  /** Media category is other. */
  @js.native
  sealed trait other extends MediaCategory
  
  /** Media is speech. */
  @js.native
  sealed trait speech extends MediaCategory
  
  /* 1 */ val communications: typings.winrtDashUwp.WindowsNs.MediaNs.CaptureNs.MediaCategory.communications with Double = js.native
  /* 3 */ val gameChat: typings.winrtDashUwp.WindowsNs.MediaNs.CaptureNs.MediaCategory.gameChat with Double = js.native
  /* 2 */ val media: typings.winrtDashUwp.WindowsNs.MediaNs.CaptureNs.MediaCategory.media with Double = js.native
  /* 0 */ val other: typings.winrtDashUwp.WindowsNs.MediaNs.CaptureNs.MediaCategory.other with Double = js.native
  /* 4 */ val speech: typings.winrtDashUwp.WindowsNs.MediaNs.CaptureNs.MediaCategory.speech with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MediaCategory with Double] = js.native
}

