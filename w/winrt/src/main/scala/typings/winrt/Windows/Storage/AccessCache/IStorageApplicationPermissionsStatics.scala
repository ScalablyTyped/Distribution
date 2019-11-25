package typings.winrt.Windows.Storage.AccessCache

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStorageApplicationPermissionsStatics extends js.Object {
  var futureAccessList: StorageItemAccessList
  var mostRecentlyUsedList: StorageItemMostRecentlyUsedList
}

object IStorageApplicationPermissionsStatics {
  @scala.inline
  def apply(futureAccessList: StorageItemAccessList, mostRecentlyUsedList: StorageItemMostRecentlyUsedList): IStorageApplicationPermissionsStatics = {
    val __obj = js.Dynamic.literal(futureAccessList = futureAccessList.asInstanceOf[js.Any], mostRecentlyUsedList = mostRecentlyUsedList.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IStorageApplicationPermissionsStatics]
  }
}

