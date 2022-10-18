package typings.winrtUwp.global.Windows.Media.Core

import typings.winrtUwp.Windows.Media.Core.IMediaStreamDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an object to be used by the MediaStreamSource.SwitchStreamsRequest event to provide information to the application. */
/* note: abstract class */ @JSGlobal("Windows.Media.Core.MediaStreamSourceSwitchStreamsRequest")
@js.native
open class MediaStreamSourceSwitchStreamsRequest ()
  extends StObject
     with typings.winrtUwp.Windows.Media.Core.MediaStreamSourceSwitchStreamsRequest {
  
  /**
    * Defers completing the MediaStreamSource.SwitchStreamsRequested event.
    * @return The deferral.
    */
  /* CompleteClass */
  override def getDeferral(): typings.winrtUwp.Windows.Media.Core.MediaStreamSourceSwitchStreamsRequestDeferral = js.native
  
  /** Gets the stream descriptor for the stream that is now selected by the MediaStreamSource . */
  /* CompleteClass */
  var newStreamDescriptor: IMediaStreamDescriptor = js.native
  
  /** Gets the stream descriptor for the stream which is no longer selected by the MediaStreamSource . */
  /* CompleteClass */
  var oldStreamDescriptor: IMediaStreamDescriptor = js.native
}
