package typings.webBluetooth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AcceptAllDevices
    extends StObject
       with RequestDeviceOptions {
    
    var acceptAllDevices: Boolean
    
    var optionalManufacturerData: js.UndefOr[js.Array[Double]] = js.undefined
    
    var optionalServices: js.UndefOr[js.Array[BluetoothServiceUUID]] = js.undefined
  }
  object AcceptAllDevices {
    
    inline def apply(acceptAllDevices: Boolean): AcceptAllDevices = {
      val __obj = js.Dynamic.literal(acceptAllDevices = acceptAllDevices.asInstanceOf[js.Any])
      __obj.asInstanceOf[AcceptAllDevices]
    }
    
    extension [Self <: AcceptAllDevices](x: Self) {
      
      inline def setAcceptAllDevices(value: Boolean): Self = StObject.set(x, "acceptAllDevices", value.asInstanceOf[js.Any])
      
      inline def setOptionalManufacturerData(value: js.Array[Double]): Self = StObject.set(x, "optionalManufacturerData", value.asInstanceOf[js.Any])
      
      inline def setOptionalManufacturerDataUndefined: Self = StObject.set(x, "optionalManufacturerData", js.undefined)
      
      inline def setOptionalManufacturerDataVarargs(value: Double*): Self = StObject.set(x, "optionalManufacturerData", js.Array(value*))
      
      inline def setOptionalServices(value: js.Array[BluetoothServiceUUID]): Self = StObject.set(x, "optionalServices", value.asInstanceOf[js.Any])
      
      inline def setOptionalServicesUndefined: Self = StObject.set(x, "optionalServices", js.undefined)
      
      inline def setOptionalServicesVarargs(value: BluetoothServiceUUID*): Self = StObject.set(x, "optionalServices", js.Array(value*))
    }
  }
  
  trait Filters
    extends StObject
       with RequestDeviceOptions {
    
    var filters: js.Array[BluetoothLEScanFilter]
    
    var optionalManufacturerData: js.UndefOr[js.Array[Double]] = js.undefined
    
    var optionalServices: js.UndefOr[js.Array[BluetoothServiceUUID]] = js.undefined
  }
  object Filters {
    
    inline def apply(filters: js.Array[BluetoothLEScanFilter]): Filters = {
      val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any])
      __obj.asInstanceOf[Filters]
    }
    
    extension [Self <: Filters](x: Self) {
      
      inline def setFilters(value: js.Array[BluetoothLEScanFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersVarargs(value: BluetoothLEScanFilter*): Self = StObject.set(x, "filters", js.Array(value*))
      
      inline def setOptionalManufacturerData(value: js.Array[Double]): Self = StObject.set(x, "optionalManufacturerData", value.asInstanceOf[js.Any])
      
      inline def setOptionalManufacturerDataUndefined: Self = StObject.set(x, "optionalManufacturerData", js.undefined)
      
      inline def setOptionalManufacturerDataVarargs(value: Double*): Self = StObject.set(x, "optionalManufacturerData", js.Array(value*))
      
      inline def setOptionalServices(value: js.Array[BluetoothServiceUUID]): Self = StObject.set(x, "optionalServices", value.asInstanceOf[js.Any])
      
      inline def setOptionalServicesUndefined: Self = StObject.set(x, "optionalServices", js.undefined)
      
      inline def setOptionalServicesVarargs(value: BluetoothServiceUUID*): Self = StObject.set(x, "optionalServices", js.Array(value*))
    }
  }
}
