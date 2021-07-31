package typings.winrtUwp.Windows.Media.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MediaStreamSourceErrorStatus extends StObject
/** Specifies errors related to MediaStreamSource . */
@JSGlobal("Windows.Media.Core.MediaStreamSourceErrorStatus")
@js.native
object MediaStreamSourceErrorStatus extends StObject {
  
  /** The network connection to the server was lost. */
  @js.native
  sealed trait connectionToServerLost
    extends StObject
       with MediaStreamSourceErrorStatus
  
  /** The application encountered an error while attempting to decode the media data. */
  @js.native
  sealed trait decodeError
    extends StObject
       with MediaStreamSourceErrorStatus
  
  /** The application failed to connect to a streaming media server or web server. */
  @js.native
  sealed trait failedToConnectToServer
    extends StObject
       with MediaStreamSourceErrorStatus
  
  /** The application failed to open a file */
  @js.native
  sealed trait failedToOpenFile
    extends StObject
       with MediaStreamSourceErrorStatus
  
  /** An unspecified error has occurred in the application. */
  @js.native
  sealed trait other
    extends StObject
       with MediaStreamSourceErrorStatus
  
  /** The application ran out of memory. */
  @js.native
  sealed trait outOfMemory
    extends StObject
       with MediaStreamSourceErrorStatus
  
  /** An unspecified network related error has occurred. */
  @js.native
  sealed trait unspecifiedNetworkError
    extends StObject
       with MediaStreamSourceErrorStatus
  
  /** The application does not support the media storage format or media encoding format. */
  @js.native
  sealed trait unsupportedMediaFormat
    extends StObject
       with MediaStreamSourceErrorStatus
}
