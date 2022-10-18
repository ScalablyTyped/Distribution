package typings.winrtUwp.global.Windows.Media.Core

import typings.winrtUwp.Windows.WinRTError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about an error that occurred with a timed metadata track. */
/* note: abstract class */ @JSGlobal("Windows.Media.Core.TimedMetadataTrackError")
@js.native
open class TimedMetadataTrackError ()
  extends StObject
     with typings.winrtUwp.Windows.Media.Core.TimedMetadataTrackError {
  
  /** Gets the error code associated with the timed metadata track error. */
  /* CompleteClass */
  var errorCode: typings.winrtUwp.Windows.Media.Core.TimedMetadataTrackErrorCode = js.native
  
  /** Gets the extended error code for the TimedMetadataTrackError . */
  /* CompleteClass */
  var extendedError: WinRTError = js.native
}
