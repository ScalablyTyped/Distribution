package typings.winrt.global.Windows.Devices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Geolocation {
  
  @JSGlobal("Windows.Devices.Geolocation.CivicAddress")
  @js.native
  class CivicAddress ()
    extends typings.winrt.Windows.Devices.Geolocation.CivicAddress
  
  @JSGlobal("Windows.Devices.Geolocation.Geocoordinate")
  @js.native
  class Geocoordinate ()
    extends typings.winrt.Windows.Devices.Geolocation.Geocoordinate
  
  @JSGlobal("Windows.Devices.Geolocation.Geolocator")
  @js.native
  class Geolocator ()
    extends typings.winrt.Windows.Devices.Geolocation.Geolocator
  
  @JSGlobal("Windows.Devices.Geolocation.Geoposition")
  @js.native
  class Geoposition ()
    extends typings.winrt.Windows.Devices.Geolocation.Geoposition
  
  @JSGlobal("Windows.Devices.Geolocation.PositionAccuracy")
  @js.native
  object PositionAccuracy extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Devices.Geolocation.PositionAccuracy with Double] = js.native
    
    /* 0 */ val default: typings.winrt.Windows.Devices.Geolocation.PositionAccuracy.default with Double = js.native
    
    /* 1 */ val high: typings.winrt.Windows.Devices.Geolocation.PositionAccuracy.high with Double = js.native
  }
  
  @JSGlobal("Windows.Devices.Geolocation.PositionChangedEventArgs")
  @js.native
  class PositionChangedEventArgs ()
    extends typings.winrt.Windows.Devices.Geolocation.PositionChangedEventArgs
  
  @JSGlobal("Windows.Devices.Geolocation.PositionStatus")
  @js.native
  object PositionStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Devices.Geolocation.PositionStatus with Double] = js.native
    
    /* 3 */ val disabled: typings.winrt.Windows.Devices.Geolocation.PositionStatus.disabled with Double = js.native
    
    /* 1 */ val initializing: typings.winrt.Windows.Devices.Geolocation.PositionStatus.initializing with Double = js.native
    
    /* 2 */ val noData: typings.winrt.Windows.Devices.Geolocation.PositionStatus.noData with Double = js.native
    
    /* 5 */ val notAvailable: typings.winrt.Windows.Devices.Geolocation.PositionStatus.notAvailable with Double = js.native
    
    /* 4 */ val notInitialized: typings.winrt.Windows.Devices.Geolocation.PositionStatus.notInitialized with Double = js.native
    
    /* 0 */ val ready: typings.winrt.Windows.Devices.Geolocation.PositionStatus.ready with Double = js.native
  }
  
  @JSGlobal("Windows.Devices.Geolocation.StatusChangedEventArgs")
  @js.native
  class StatusChangedEventArgs ()
    extends typings.winrt.Windows.Devices.Geolocation.StatusChangedEventArgs
}
