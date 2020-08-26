package typings.winrt.global.Windows.Devices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Devices.Geolocation")
@js.native
object Geolocation extends js.Object {
  @js.native
  class CivicAddress ()
    extends typings.winrt.Windows.Devices.Geolocation.CivicAddress
  
  @js.native
  class Geocoordinate ()
    extends typings.winrt.Windows.Devices.Geolocation.Geocoordinate
  
  @js.native
  class Geolocator ()
    extends typings.winrt.Windows.Devices.Geolocation.Geolocator
  
  @js.native
  class Geoposition ()
    extends typings.winrt.Windows.Devices.Geolocation.Geoposition
  
  @js.native
  class PositionChangedEventArgs ()
    extends typings.winrt.Windows.Devices.Geolocation.PositionChangedEventArgs
  
  @js.native
  class StatusChangedEventArgs ()
    extends typings.winrt.Windows.Devices.Geolocation.StatusChangedEventArgs
  
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

