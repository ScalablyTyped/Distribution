package typings
package winrtDashUwpLib.WindowsNs.MediaNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MediaSourceState extends js.Object

/** Specifies the state of a MediaSource . */
@JSGlobal("Windows.Media.Core.MediaSourceState")
@js.native
object MediaSourceState extends js.Object {
  /** The MediaSource has been closed. */
  @js.native
  sealed trait closed
    extends winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.MediaSourceState
  
  /** The MediaSource failed to open the associated media content. */
  @js.native
  sealed trait failed
    extends winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.MediaSourceState
  
  /** The MediaSource has been initialized. */
  @js.native
  sealed trait initial
    extends winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.MediaSourceState
  
  /** The MediaSource has successfully opened the associated media content. */
  @js.native
  sealed trait opened
    extends winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.MediaSourceState
  
  /** The MediaSource is in the process of opening the associated media content. */
  @js.native
  sealed trait opening
    extends winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.MediaSourceState
  
  /* 4 */ val closed: closed with scala.Double = js.native
  /* 3 */ val failed: failed with scala.Double = js.native
  /* 0 */ val initial: initial with scala.Double = js.native
  /* 2 */ val opened: opened with scala.Double = js.native
  /* 1 */ val opening: opening with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.MediaSourceState with scala.Double] = js.native
}

