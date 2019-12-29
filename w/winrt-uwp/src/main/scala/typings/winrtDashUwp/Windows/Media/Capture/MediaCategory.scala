package typings.winrtDashUwp.Windows.Media.Capture

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MediaCategory with Double] = js.native
  /* 1 */ @js.native
  object communications extends TopLevel[communications with Double]
  
  /* 3 */ @js.native
  object gameChat extends TopLevel[gameChat with Double]
  
  /* 2 */ @js.native
  object media extends TopLevel[media with Double]
  
  /* 0 */ @js.native
  object other extends TopLevel[other with Double]
  
  /* 4 */ @js.native
  object speech extends TopLevel[speech with Double]
  
}

