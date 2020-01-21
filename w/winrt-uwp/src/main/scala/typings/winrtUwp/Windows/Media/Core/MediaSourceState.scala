package typings.winrtUwp.Windows.Media.Core

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MediaSourceState with Double] = js.native
  /* 4 */ @js.native
  object closed extends TopLevel[closed with Double]
  
  /* 3 */ @js.native
  object failed extends TopLevel[failed with Double]
  
  /* 0 */ @js.native
  object initial extends TopLevel[initial with Double]
  
  /* 2 */ @js.native
  object opened extends TopLevel[opened with Double]
  
  /* 1 */ @js.native
  object opening extends TopLevel[opening with Double]
  
}

