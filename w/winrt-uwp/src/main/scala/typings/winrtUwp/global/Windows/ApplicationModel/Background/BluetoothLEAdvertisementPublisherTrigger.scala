package typings.winrtUwp.global.Windows.ApplicationModel.Background

import typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a trigger that is registered to advertise a Bluetooth LE advertisement in the background. */
@JSGlobal("Windows.ApplicationModel.Background.BluetoothLEAdvertisementPublisherTrigger")
@js.native
/** Creates a new instance of the BluetoothLEAdvertisementPublisherTrigger class. */
open class BluetoothLEAdvertisementPublisherTrigger ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Background.BluetoothLEAdvertisementPublisherTrigger {
  
  /** Gets the Bluetooth LE advertisement to configure and publish in the background. */
  /* CompleteClass */
  var advertisement: BluetoothLEAdvertisement = js.native
}
