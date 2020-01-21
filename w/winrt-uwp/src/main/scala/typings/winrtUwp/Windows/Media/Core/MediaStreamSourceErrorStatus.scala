package typings.winrtUwp.Windows.Media.Core

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MediaStreamSourceErrorStatus extends js.Object

/** Specifies errors related to MediaStreamSource . */
@JSGlobal("Windows.Media.Core.MediaStreamSourceErrorStatus")
@js.native
object MediaStreamSourceErrorStatus extends js.Object {
  /** The network connection to the server was lost. */
  @js.native
  sealed trait connectionToServerLost extends MediaStreamSourceErrorStatus
  
  /** The application encountered an error while attempting to decode the media data. */
  @js.native
  sealed trait decodeError extends MediaStreamSourceErrorStatus
  
  /** The application failed to connect to a streaming media server or web server. */
  @js.native
  sealed trait failedToConnectToServer extends MediaStreamSourceErrorStatus
  
  /** The application failed to open a file */
  @js.native
  sealed trait failedToOpenFile extends MediaStreamSourceErrorStatus
  
  /** An unspecified error has occurred in the application. */
  @js.native
  sealed trait other extends MediaStreamSourceErrorStatus
  
  /** The application ran out of memory. */
  @js.native
  sealed trait outOfMemory extends MediaStreamSourceErrorStatus
  
  /** An unspecified network related error has occurred. */
  @js.native
  sealed trait unspecifiedNetworkError extends MediaStreamSourceErrorStatus
  
  /** The application does not support the media storage format or media encoding format. */
  @js.native
  sealed trait unsupportedMediaFormat extends MediaStreamSourceErrorStatus
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MediaStreamSourceErrorStatus with Double] = js.native
  /* 4 */ @js.native
  object connectionToServerLost extends TopLevel[connectionToServerLost with Double]
  
  /* 6 */ @js.native
  object decodeError extends TopLevel[decodeError with Double]
  
  /* 3 */ @js.native
  object failedToConnectToServer extends TopLevel[failedToConnectToServer with Double]
  
  /* 2 */ @js.native
  object failedToOpenFile extends TopLevel[failedToOpenFile with Double]
  
  /* 0 */ @js.native
  object other extends TopLevel[other with Double]
  
  /* 1 */ @js.native
  object outOfMemory extends TopLevel[outOfMemory with Double]
  
  /* 5 */ @js.native
  object unspecifiedNetworkError extends TopLevel[unspecifiedNetworkError with Double]
  
  /* 7 */ @js.native
  object unsupportedMediaFormat extends TopLevel[unsupportedMediaFormat with Double]
  
}

