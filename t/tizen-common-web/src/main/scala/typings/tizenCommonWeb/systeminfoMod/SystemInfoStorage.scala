package typings.tizenCommonWeb.systeminfoMod

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
  implicit class SystemInfoStorageOps[Self <: SystemInfoStorage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setUnitsVarargs(value: SystemInfoStorageUnit*): Self = this.set("units", js.Array(value :_*))
    
    @scala.inline
    def setUnits(value: js.Array[SystemInfoStorageUnit]): Self = this.set("units", value.asInstanceOf[js.Any])
  }
}
