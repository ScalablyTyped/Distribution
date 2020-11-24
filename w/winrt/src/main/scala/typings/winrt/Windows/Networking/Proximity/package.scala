package typings.winrt.Windows.Networking

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Proximity {
  
  type DeviceArrivedEventHandler = js.Function1[
    /* sender */ typings.winrt.Windows.Networking.Proximity.ProximityDevice, 
    scala.Unit
  ]
  
  type DeviceDepartedEventHandler = js.Function1[
    /* sender */ typings.winrt.Windows.Networking.Proximity.ProximityDevice, 
    scala.Unit
  ]
  
  type MessageReceivedHandler = js.Function2[
    /* sender */ typings.winrt.Windows.Networking.Proximity.ProximityDevice, 
    /* message */ typings.winrt.Windows.Networking.Proximity.ProximityMessage, 
    scala.Unit
  ]
  
  type MessageTransmittedHandler = js.Function2[
    /* sender */ typings.winrt.Windows.Networking.Proximity.ProximityDevice, 
    /* messageId */ scala.Double, 
    scala.Unit
  ]
}
