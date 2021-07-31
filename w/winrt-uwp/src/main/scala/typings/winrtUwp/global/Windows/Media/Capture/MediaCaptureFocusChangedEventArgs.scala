package typings.winrtUwp.global.Windows.Media.Capture

import typings.winrtUwp.Windows.Media.Devices.MediaCaptureFocusState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the FocusChanged event. */
@JSGlobal("Windows.Media.Capture.MediaCaptureFocusChangedEventArgs")
@js.native
abstract class MediaCaptureFocusChangedEventArgs ()
  extends StObject
     with typings.winrtUwp.Windows.Media.Capture.MediaCaptureFocusChangedEventArgs {
  
  /** Gets the current focus state of the capture device. */
  /* CompleteClass */
  var focusState: MediaCaptureFocusState = js.native
}
