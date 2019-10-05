package typings.winrtDashUwp.Windows.Media.Core

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
  
  /* 4 */ val closed: typings.winrtDashUwp.Windows.Media.Core.MediaSourceState.closed with Double = js.native
  /* 3 */ val failed: typings.winrtDashUwp.Windows.Media.Core.MediaSourceState.failed with Double = js.native
  /* 0 */ val initial: typings.winrtDashUwp.Windows.Media.Core.MediaSourceState.initial with Double = js.native
  /* 2 */ val opened: typings.winrtDashUwp.Windows.Media.Core.MediaSourceState.opened with Double = js.native
  /* 1 */ val opening: typings.winrtDashUwp.Windows.Media.Core.MediaSourceState.opening with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MediaSourceState with Double] = js.native
}

