package typings.winrtDashUwp.Windows.Media.Core

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
  
  /* 4 */ val connectionToServerLost: typings.winrtDashUwp.Windows.Media.Core.MediaStreamSourceErrorStatus.connectionToServerLost with Double = js.native
  /* 6 */ val decodeError: typings.winrtDashUwp.Windows.Media.Core.MediaStreamSourceErrorStatus.decodeError with Double = js.native
  /* 3 */ val failedToConnectToServer: typings.winrtDashUwp.Windows.Media.Core.MediaStreamSourceErrorStatus.failedToConnectToServer with Double = js.native
  /* 2 */ val failedToOpenFile: typings.winrtDashUwp.Windows.Media.Core.MediaStreamSourceErrorStatus.failedToOpenFile with Double = js.native
  /* 0 */ val other: typings.winrtDashUwp.Windows.Media.Core.MediaStreamSourceErrorStatus.other with Double = js.native
  /* 1 */ val outOfMemory: typings.winrtDashUwp.Windows.Media.Core.MediaStreamSourceErrorStatus.outOfMemory with Double = js.native
  /* 5 */ val unspecifiedNetworkError: typings.winrtDashUwp.Windows.Media.Core.MediaStreamSourceErrorStatus.unspecifiedNetworkError with Double = js.native
  /* 7 */ val unsupportedMediaFormat: typings.winrtDashUwp.Windows.Media.Core.MediaStreamSourceErrorStatus.unsupportedMediaFormat with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MediaStreamSourceErrorStatus with Double] = js.native
}

