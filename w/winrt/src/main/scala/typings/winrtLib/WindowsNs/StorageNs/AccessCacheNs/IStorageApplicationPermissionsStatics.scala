package typings
package winrtLib.WindowsNs.StorageNs.AccessCacheNs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("futureAccessList")(futureAccessList)
    __obj.updateDynamic("mostRecentlyUsedList")(mostRecentlyUsedList)
    __obj.asInstanceOf[IStorageApplicationPermissionsStatics]
  }
}

