package typings.winrtUwp.Windows.Media.PlayTo

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PlayToConnectionError extends js.Object

/** Describes an error on a Play To connection. */
@JSGlobal("Windows.Media.PlayTo.PlayToConnectionError")
@js.native
object PlayToConnectionError extends js.Object {
  /** The Play To target device has encountered an error. */
  @js.native
  sealed trait deviceError extends PlayToConnectionError
  
  /** The Play To target device is locked. */
  @js.native
  sealed trait deviceLocked extends PlayToConnectionError
  
  /** The Play To target device has not responded for at least 5 seconds. */
  @js.native
  sealed trait deviceNotResponding extends PlayToConnectionError
  
  /** No error occurred. */
  @js.native
  sealed trait none extends PlayToConnectionError
  
  /** The Play To target device failed to play the protected content. */
  @js.native
  sealed trait protectedPlaybackFailed extends PlayToConnectionError
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PlayToConnectionError with Double] = js.native
  /* 2 */ @js.native
  object deviceError extends TopLevel[deviceError with Double]
  
  /* 3 */ @js.native
  object deviceLocked extends TopLevel[deviceLocked with Double]
  
  /* 1 */ @js.native
  object deviceNotResponding extends TopLevel[deviceNotResponding with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 4 */ @js.native
  object protectedPlaybackFailed extends TopLevel[protectedPlaybackFailed with Double]
  
}

