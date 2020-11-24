package typings.webBluetooth.anon

import typings.webBluetooth.BluetoothRequestDeviceFilter
import typings.webBluetooth.BluetoothServiceUUID
import typings.webBluetooth.RequestDeviceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class FiltersOps[Self <: Filters] (val x: Self) extends AnyVal {
    
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
    def setFiltersVarargs(value: BluetoothRequestDeviceFilter*): Self = this.set("filters", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: js.Array[BluetoothRequestDeviceFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionalServicesVarargs(value: BluetoothServiceUUID*): Self = this.set("optionalServices", js.Array(value :_*))
    
    @scala.inline
    def setOptionalServices(value: js.Array[BluetoothServiceUUID]): Self = this.set("optionalServices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptionalServices: Self = this.set("optionalServices", js.undefined)
  }
}
