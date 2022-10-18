package typings.winrtUwp.global.Windows.Media.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the MediaStreamSource.Starting event. */
/* note: abstract class */ @JSGlobal("Windows.Media.Core.MediaStreamSourceStartingEventArgs")
@js.native
open class MediaStreamSourceStartingEventArgs ()
  extends StObject
     with typings.winrtUwp.Windows.Media.Core.MediaStreamSourceStartingEventArgs {
  
  /** Gets the object that represents the request to start accumulating MediaStreamSample data. */
  /* CompleteClass */
  var request: typings.winrtUwp.Windows.Media.Core.MediaStreamSourceStartingRequest = js.native
}
