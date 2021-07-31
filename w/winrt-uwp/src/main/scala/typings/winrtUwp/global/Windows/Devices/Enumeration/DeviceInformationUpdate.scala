package typings.winrtUwp.global.Windows.Devices.Enumeration

import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains updated properties for a DeviceInformation object. */
@JSGlobal("Windows.Devices.Enumeration.DeviceInformationUpdate")
@js.native
abstract class DeviceInformationUpdate ()
  extends StObject
     with typings.winrtUwp.Windows.Devices.Enumeration.DeviceInformationUpdate {
  
  /** The DeviceInformation ID of the updated device. */
  /* CompleteClass */
  var id: String = js.native
  
  /** Gets the type of device for the updated device. */
  /* CompleteClass */
  var kind: typings.winrtUwp.Windows.Devices.Enumeration.DeviceInformationKind = js.native
  
  /** The changed properties in a update to a DeviceInformation object. */
  /* CompleteClass */
  var properties: IMapView[String, js.Any] = js.native
}
