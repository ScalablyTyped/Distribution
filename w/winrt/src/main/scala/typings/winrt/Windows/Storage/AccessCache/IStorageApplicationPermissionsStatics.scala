package typings.winrt.Windows.Storage.AccessCache

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStorageApplicationPermissionsStatics extends js.Object {
  
  var futureAccessList: StorageItemAccessList = js.native
  
  var mostRecentlyUsedList: StorageItemMostRecentlyUsedList = js.native
}
object IStorageApplicationPermissionsStatics {
  
  @scala.inline
  def apply(futureAccessList: StorageItemAccessList, mostRecentlyUsedList: StorageItemMostRecentlyUsedList): IStorageApplicationPermissionsStatics = {
    val __obj = js.Dynamic.literal(futureAccessList = futureAccessList.asInstanceOf[js.Any], mostRecentlyUsedList = mostRecentlyUsedList.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStorageApplicationPermissionsStatics]
  }
  
  @scala.inline
  implicit class IStorageApplicationPermissionsStaticsOps[Self <: IStorageApplicationPermissionsStatics] (val x: Self) extends AnyVal {
    
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
    def setFutureAccessList(value: StorageItemAccessList): Self = this.set("futureAccessList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMostRecentlyUsedList(value: StorageItemMostRecentlyUsedList): Self = this.set("mostRecentlyUsedList", value.asInstanceOf[js.Any])
  }
}
