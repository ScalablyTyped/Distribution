package typings.winrtUwp.Windows.Media.Core

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
  
}

