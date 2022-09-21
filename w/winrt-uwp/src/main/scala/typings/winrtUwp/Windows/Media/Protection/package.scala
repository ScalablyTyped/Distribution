package typings.winrtUwp.Windows.Media.Protection

import typings.winrtUwp.Windows.WinRTEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/** Represents the method that handles the data passed by the MediaProtectionManager when a load of binary data fails. */
type ComponentLoadFailedEventHandler = js.Function1[/* ev */ ComponentLoadFailedEventArgs & WinRTEvent[MediaProtectionManager], Unit]

/** Represents the method that handles the data passed by the MediaProtectionManager that requires a reboot. */
type RebootNeededEventHandler = js.Function1[/* ev */ WinRTEvent[MediaProtectionManager], Unit]

/** Represents the method that handles the data passed by the MediaProtectionManager when the resume operation is completed. */
type ServiceRequestedEventHandler = js.Function1[/* ev */ ServiceRequestedEventArgs & WinRTEvent[MediaProtectionManager], Unit]
