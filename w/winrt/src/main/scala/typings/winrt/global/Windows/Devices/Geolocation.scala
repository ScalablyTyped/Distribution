package typings.winrt.global.Windows.Devices

import typings.std.Date
import typings.winrt.Windows.Devices.Geolocation.PositionStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Devices.Geolocation")
@js.native
object Geolocation extends js.Object {
  @js.native
  class CivicAddress ()
    extends typings.winrt.Windows.Devices.Geolocation.CivicAddress {
    /* CompleteClass */
    override var city: String = js.native
    /* CompleteClass */
    override var country: String = js.native
    /* CompleteClass */
    override var postalCode: String = js.native
    /* CompleteClass */
    override var state: String = js.native
    /* CompleteClass */
    override var timestamp: Date = js.native
  }
  
  @js.native
  class Geocoordinate ()
    extends typings.winrt.Windows.Devices.Geolocation.Geocoordinate {
    /* CompleteClass */
    override var accuracy: Double = js.native
    /* CompleteClass */
    override var altitude: Double = js.native
    /* CompleteClass */
    override var altitudeAccuracy: Double = js.native
    /* CompleteClass */
    override var heading: Double = js.native
    /* CompleteClass */
    override var latitude: Double = js.native
    /* CompleteClass */
    override var longitude: Double = js.native
    /* CompleteClass */
    override var speed: Double = js.native
    /* CompleteClass */
    override var timestamp: Date = js.native
  }
  
  @js.native
  class Geolocator ()
    extends typings.winrt.Windows.Devices.Geolocation.Geolocator
  
  @js.native
  class Geoposition ()
    extends typings.winrt.Windows.Devices.Geolocation.Geoposition {
    /* CompleteClass */
    override var civicAddress: typings.winrt.Windows.Devices.Geolocation.CivicAddress = js.native
    /* CompleteClass */
    override var coordinate: typings.winrt.Windows.Devices.Geolocation.Geocoordinate = js.native
  }
  
  @js.native
  class PositionChangedEventArgs ()
    extends typings.winrt.Windows.Devices.Geolocation.PositionChangedEventArgs {
    /* CompleteClass */
    override var position: typings.winrt.Windows.Devices.Geolocation.Geoposition = js.native
  }
  
  @js.native
  class StatusChangedEventArgs ()
    extends typings.winrt.Windows.Devices.Geolocation.StatusChangedEventArgs {
    /* CompleteClass */
    override var status: PositionStatus = js.native
  }
  
  @js.native
  object PositionAccuracy extends js.Object {
    /* 0 */ val default: typings.winrt.Windows.Devices.Geolocation.PositionAccuracy.default with Double = js.native
    /* 1 */ val high: typings.winrt.Windows.Devices.Geolocation.PositionAccuracy.high with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Devices.Geolocation.PositionAccuracy with Double] = js.native
  }
  
  @js.native
  object PositionStatus extends js.Object {
    /* 3 */ val disabled: typings.winrt.Windows.Devices.Geolocation.PositionStatus.disabled with Double = js.native
    /* 1 */ val initializing: typings.winrt.Windows.Devices.Geolocation.PositionStatus.initializing with Double = js.native
    /* 2 */ val noData: typings.winrt.Windows.Devices.Geolocation.PositionStatus.noData with Double = js.native
    /* 5 */ val notAvailable: typings.winrt.Windows.Devices.Geolocation.PositionStatus.notAvailable with Double = js.native
    /* 4 */ val notInitialized: typings.winrt.Windows.Devices.Geolocation.PositionStatus.notInitialized with Double = js.native
    /* 0 */ val ready: typings.winrt.Windows.Devices.Geolocation.PositionStatus.ready with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Devices.Geolocation.PositionStatus with Double] = js.native
  }
  
}

