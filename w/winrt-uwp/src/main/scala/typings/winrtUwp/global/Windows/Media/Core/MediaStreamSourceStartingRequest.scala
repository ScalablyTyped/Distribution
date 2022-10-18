package typings.winrtUwp.global.Windows.Media.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a request from the MediaStreamSource.Starting event for the application to start accumulating MediaStreamSample objects from a specific position in the media. */
/* note: abstract class */ @JSGlobal("Windows.Media.Core.MediaStreamSourceStartingRequest")
@js.native
open class MediaStreamSourceStartingRequest ()
  extends StObject
     with typings.winrtUwp.Windows.Media.Core.MediaStreamSourceStartingRequest {
  
  /**
    * Defers completing the MediaStreamSource.Starting event.
    * @return The deferral.
    */
  /* CompleteClass */
  override def getDeferral(): typings.winrtUwp.Windows.Media.Core.MediaStreamSourceStartingRequestDeferral = js.native
  
  /**
    * Specifies the starting position in the media time-line for subsequent MediaStreamSamples that will be delivered to the MediaStreamSource .
    * @param position The actual starting point in the media time-line chosen by the application.
    */
  /* CompleteClass */
  override def setActualStartPosition(position: Double): Unit = js.native
  
  /** Specifies a reference to a TimeSpan object which represents a time position in the media time-line from which the application should return MediaStreamSample objects. */
  /* CompleteClass */
  var startPosition: Double = js.native
}
