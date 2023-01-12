package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SystemInfoStorage
  extends StObject
     with SystemInfoProperty {
  
  /**
    * The array of storage units connected to this device.
    */
  val units: js.Array[SystemInfoStorageUnit]
}
object SystemInfoStorage {
  
  inline def apply(units: js.Array[SystemInfoStorageUnit]): SystemInfoStorage = {
    val __obj = js.Dynamic.literal(units = units.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemInfoStorage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SystemInfoStorage] (val x: Self) extends AnyVal {
    
    inline def setUnits(value: js.Array[SystemInfoStorageUnit]): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
    
    inline def setUnitsVarargs(value: SystemInfoStorageUnit*): Self = StObject.set(x, "units", js.Array(value*))
  }
}
