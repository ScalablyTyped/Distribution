package typings.winrtUwp.global.Windows.Media.Core

import typings.winrtUwp.Windows.WinRTError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an error that occurred with a MediaSource . */
/* note: abstract class */ @JSGlobal("Windows.Media.Core.MediaSourceError")
@js.native
open class MediaSourceError ()
  extends StObject
     with typings.winrtUwp.Windows.Media.Core.MediaSourceError {
  
  /** Gets the extended error code for the MediaSourceError . */
  /* CompleteClass */
  var extendedError: WinRTError = js.native
}
