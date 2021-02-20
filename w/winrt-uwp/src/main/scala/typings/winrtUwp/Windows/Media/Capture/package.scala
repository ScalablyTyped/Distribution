package typings.winrtUwp.Windows.Media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Capture {
  
  /** Represents the method that will handle the MediaCapture.Failed event. */
  type MediaCaptureFailedEventHandler = js.Function1[
    /* ev */ typings.winrtUwp.Windows.Media.Capture.MediaCaptureFailedEventArgs with typings.winrtUwp.Windows.WinRTEvent[typings.winrtUwp.Windows.Media.Capture.MediaCapture], 
    scala.Unit
  ]
  
  /** Represents the method that will handle RecordLimitationExceeded and related events. */
  type RecordLimitationExceededEventHandler = js.Function1[
    /* ev */ typings.winrtUwp.Windows.WinRTEvent[typings.winrtUwp.Windows.Media.Capture.MediaCapture], 
    scala.Unit
  ]
}
