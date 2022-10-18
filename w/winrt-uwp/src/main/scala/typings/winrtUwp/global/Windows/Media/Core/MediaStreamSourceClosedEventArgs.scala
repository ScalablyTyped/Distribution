package typings.winrtUwp.global.Windows.Media.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the MediaStreamSource.Closed event. */
/* note: abstract class */ @JSGlobal("Windows.Media.Core.MediaStreamSourceClosedEventArgs")
@js.native
open class MediaStreamSourceClosedEventArgs ()
  extends StObject
     with typings.winrtUwp.Windows.Media.Core.MediaStreamSourceClosedEventArgs {
  
  /** Gets the object that represents the notification that the MediaStreamSource has been closed. */
  /* CompleteClass */
  var request: typings.winrtUwp.Windows.Media.Core.MediaStreamSourceClosedRequest = js.native
}
