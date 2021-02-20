package typings.tizenCommonWeb.systeminfoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SystemInfoStorage extends SystemInfoProperty {
  
  /**
    * The array of storage units connected to this device.
    */
  val units: js.Array[SystemInfoStorageUnit] = js.native
}
object SystemInfoStorage {
  
  @scala.inline
  def apply(units: js.Array[SystemInfoStorageUnit]): SystemInfoStorage = {
    val __obj = js.Dynamic.literal(units = units.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemInfoStorage]
  }
  
  @scala.inline
  implicit class SystemInfoStorageMutableBuilder[Self <: SystemInfoStorage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUnits(value: js.Array[SystemInfoStorageUnit]): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitsVarargs(value: SystemInfoStorageUnit*): Self = StObject.set(x, "units", js.Array(value :_*))
  }
}
