package typings.webBluetooth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AcceptAllDevices extends RequestDeviceOptions {
    
    var acceptAllDevices: Boolean = js.native
    
    var optionalServices: js.UndefOr[js.Array[BluetoothServiceUUID]] = js.native
  }
  object AcceptAllDevices {
    
    @scala.inline
    def apply(acceptAllDevices: Boolean): AcceptAllDevices = {
      val __obj = js.Dynamic.literal(acceptAllDevices = acceptAllDevices.asInstanceOf[js.Any])
      __obj.asInstanceOf[AcceptAllDevices]
    }
    
    @scala.inline
    implicit class AcceptAllDevicesMutableBuilder[Self <: AcceptAllDevices] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAcceptAllDevices(value: Boolean): Self = StObject.set(x, "acceptAllDevices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionalServices(value: js.Array[BluetoothServiceUUID]): Self = StObject.set(x, "optionalServices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionalServicesUndefined: Self = StObject.set(x, "optionalServices", js.undefined)
      
      @scala.inline
      def setOptionalServicesVarargs(value: BluetoothServiceUUID*): Self = StObject.set(x, "optionalServices", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Filters extends RequestDeviceOptions {
    
    var filters: js.Array[BluetoothRequestDeviceFilter] = js.native
    
    var optionalServices: js.UndefOr[js.Array[BluetoothServiceUUID]] = js.native
  }
  object Filters {
    
    @scala.inline
    def apply(filters: js.Array[BluetoothRequestDeviceFilter]): Filters = {
      val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any])
      __obj.asInstanceOf[Filters]
    }
    
    @scala.inline
    implicit class FiltersMutableBuilder[Self <: Filters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilters(value: js.Array[BluetoothRequestDeviceFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersVarargs(value: BluetoothRequestDeviceFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setOptionalServices(value: js.Array[BluetoothServiceUUID]): Self = StObject.set(x, "optionalServices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionalServicesUndefined: Self = StObject.set(x, "optionalServices", js.undefined)
      
      @scala.inline
      def setOptionalServicesVarargs(value: BluetoothServiceUUID*): Self = StObject.set(x, "optionalServices", js.Array(value :_*))
    }
  }
}
