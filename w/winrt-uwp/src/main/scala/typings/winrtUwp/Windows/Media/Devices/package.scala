package typings.winrtUwp.Windows.Media.Devices

import typings.winrtUwp.Windows.WinRTEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/** Handles the AnswerRequested and AudioTransferRequested events. */
type CallControlEventHandler = js.Function1[/* ev */ WinRTEvent[CallControl], Unit]

/** Handles the DialRequested event. */
type DialRequestedEventHandler = js.Function1[/* ev */ DialRequestedEventArgs & WinRTEvent[CallControl], Unit]

/** Handles the KeypadPressed event. */
type KeypadPressedEventHandler = js.Function1[/* ev */ KeypadPressedEventArgs & WinRTEvent[CallControl], Unit]

/** Handles the RedialRequested event. */
type RedialRequestedEventHandler = js.Function1[/* ev */ RedialRequestedEventArgs & WinRTEvent[CallControl], Unit]
