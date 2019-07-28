package typings.winrtDashUwp.WindowsNs.MediaNs.CoreNs

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
  sealed trait closed extends MediaSourceState
  
  /** The MediaSource failed to open the associated media content. */
  @js.native
  sealed trait failed extends MediaSourceState
  
  /** The MediaSource has been initialized. */
  @js.native
  sealed trait initial extends MediaSourceState
  
  /** The MediaSource has successfully opened the associated media content. */
  @js.native
  sealed trait opened extends MediaSourceState
  
  /** The MediaSource is in the process of opening the associated media content. */
  @js.native
  sealed trait opening extends MediaSourceState
  
  /* 4 */ val closed: typings.winrtDashUwp.WindowsNs.MediaNs.CoreNs.MediaSourceState.closed with Double = js.native
  /* 3 */ val failed: typings.winrtDashUwp.WindowsNs.MediaNs.CoreNs.MediaSourceState.failed with Double = js.native
  /* 0 */ val initial: typings.winrtDashUwp.WindowsNs.MediaNs.CoreNs.MediaSourceState.initial with Double = js.native
  /* 2 */ val opened: typings.winrtDashUwp.WindowsNs.MediaNs.CoreNs.MediaSourceState.opened with Double = js.native
  /* 1 */ val opening: typings.winrtDashUwp.WindowsNs.MediaNs.CoreNs.MediaSourceState.opening with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MediaSourceState with Double] = js.native
}

