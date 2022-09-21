package typings.winrtUwp.Windows.Networking.Proximity

import typings.winrtUwp.Windows.WinRTEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/** Describes the method that handles the DeviceArrived event. */
type DeviceArrivedEventHandler = js.Function1[/* ev */ WinRTEvent[ProximityDevice], Unit]

/** Describes the method that handles the DeviceDeparted event. */
type DeviceDepartedEventHandler = js.Function1[/* ev */ WinRTEvent[ProximityDevice], Unit]

/** Describes the method that will handle the event that's fired when a message that has been subscribed to has been received. */
type MessageReceivedHandler = js.Function2[/* sender */ ProximityDevice, /* message */ ProximityMessage, Unit]

/** Describes the method that will handle the event that's fired when a published message has been transmitted. */
type MessageTransmittedHandler = js.Function2[/* sender */ ProximityDevice, /* messageId */ Double, Unit]
