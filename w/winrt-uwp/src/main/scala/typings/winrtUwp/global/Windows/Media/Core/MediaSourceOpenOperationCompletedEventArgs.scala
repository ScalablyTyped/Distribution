package typings.winrtUwp.global.Windows.Media.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the MediaSource::MediaSourceOpenOperationCompleted event. */
/* note: abstract class */ @JSGlobal("Windows.Media.Core.MediaSourceOpenOperationCompletedEventArgs")
@js.native
open class MediaSourceOpenOperationCompletedEventArgs ()
  extends StObject
     with typings.winrtUwp.Windows.Media.Core.MediaSourceOpenOperationCompletedEventArgs {
  
  /** Represents the error that occurred while asynchronously opening the MediaSource . */
  /* CompleteClass */
  var error: typings.winrtUwp.Windows.Media.Core.MediaSourceError = js.native
}
