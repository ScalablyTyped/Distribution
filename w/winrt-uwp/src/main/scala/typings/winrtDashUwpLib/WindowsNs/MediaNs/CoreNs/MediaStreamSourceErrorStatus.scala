package typings
package winrtDashUwpLib.WindowsNs.MediaNs.CoreNs

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
  sealed trait connectionToServerLost
    extends winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.MediaStreamSourceErrorStatus
  
  /** The application encountered an error while attempting to decode the media data. */
  @js.native
  sealed trait decodeError
    extends winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.MediaStreamSourceErrorStatus
  
  /** The application failed to connect to a streaming media server or web server. */
  @js.native
  sealed trait failedToConnectToServer
    extends winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.MediaStreamSourceErrorStatus
  
  /** The application failed to open a file */
  @js.native
  sealed trait failedToOpenFile
    extends winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.MediaStreamSourceErrorStatus
  
  /** An unspecified error has occurred in the application. */
  @js.native
  sealed trait other
    extends winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.MediaStreamSourceErrorStatus
  
  /** The application ran out of memory. */
  @js.native
  sealed trait outOfMemory
    extends winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.MediaStreamSourceErrorStatus
  
  /** An unspecified network related error has occurred. */
  @js.native
  sealed trait unspecifiedNetworkError
    extends winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.MediaStreamSourceErrorStatus
  
  /** The application does not support the media storage format or media encoding format. */
  @js.native
  sealed trait unsupportedMediaFormat
    extends winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.MediaStreamSourceErrorStatus
  
  /* 4 */ val connectionToServerLost: connectionToServerLost with scala.Double = js.native
  /* 6 */ val decodeError: decodeError with scala.Double = js.native
  /* 3 */ val failedToConnectToServer: failedToConnectToServer with scala.Double = js.native
  /* 2 */ val failedToOpenFile: failedToOpenFile with scala.Double = js.native
  /* 0 */ val other: other with scala.Double = js.native
  /* 1 */ val outOfMemory: outOfMemory with scala.Double = js.native
  /* 5 */ val unspecifiedNetworkError: unspecifiedNetworkError with scala.Double = js.native
  /* 7 */ val unsupportedMediaFormat: unsupportedMediaFormat with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.MediaStreamSourceErrorStatus with scala.Double
  ] = js.native
}

