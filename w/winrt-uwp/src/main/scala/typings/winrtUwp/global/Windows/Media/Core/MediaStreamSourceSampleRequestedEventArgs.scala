package typings.winrtUwp.global.Windows.Media.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides the data for the SampleRequested event. */
/* note: abstract class */ @JSGlobal("Windows.Media.Core.MediaStreamSourceSampleRequestedEventArgs")
@js.native
open class MediaStreamSourceSampleRequestedEventArgs ()
  extends StObject
     with typings.winrtUwp.Windows.Media.Core.MediaStreamSourceSampleRequestedEventArgs {
  
  /** Gets the object that represents the request for a MediaStreamSample . */
  /* CompleteClass */
  var request: typings.winrtUwp.Windows.Media.Core.MediaStreamSourceSampleRequest = js.native
}
