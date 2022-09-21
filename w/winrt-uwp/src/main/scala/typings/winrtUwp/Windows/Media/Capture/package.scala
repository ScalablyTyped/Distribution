package typings.winrtUwp.Windows.Media.Capture

import typings.winrtUwp.Windows.WinRTEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/** Represents the method that will handle the MediaCapture.Failed event. */
type MediaCaptureFailedEventHandler = js.Function1[/* ev */ MediaCaptureFailedEventArgs & WinRTEvent[MediaCapture], Unit]

/** Represents the method that will handle RecordLimitationExceeded and related events. */
type RecordLimitationExceededEventHandler = js.Function1[/* ev */ WinRTEvent[MediaCapture], Unit]
