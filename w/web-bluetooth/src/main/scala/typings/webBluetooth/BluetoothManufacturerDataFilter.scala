package typings.webBluetooth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BluetoothManufacturerDataFilter
  extends StObject
     with BluetoothDataFilter {
  
  var companyIdentifier: Double
}
object BluetoothManufacturerDataFilter {
  
  inline def apply(companyIdentifier: Double): BluetoothManufacturerDataFilter = {
    val __obj = js.Dynamic.literal(companyIdentifier = companyIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[BluetoothManufacturerDataFilter]
  }
  
  extension [Self <: BluetoothManufacturerDataFilter](x: Self) {
    
    inline def setCompanyIdentifier(value: Double): Self = StObject.set(x, "companyIdentifier", value.asInstanceOf[js.Any])
  }
}
