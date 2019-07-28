package typings.winrtDashUwp.WindowsNs.StorageNs.AccessCacheNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides static properties for you to get your app's most recently used list (MRU) (use StorageApplicationPermissions.MostRecentlyUsedList ) and future-access list (use StorageApplicationPermissions.FutureAccessList . */
@JSGlobal("Windows.Storage.AccessCache.StorageApplicationPermissions")
@js.native
abstract class StorageApplicationPermissions () extends js.Object

/* static members */
@JSGlobal("Windows.Storage.AccessCache.StorageApplicationPermissions")
@js.native
object StorageApplicationPermissions extends js.Object {
  /** Gets an object that represents a list that an app maintains so that the app can store files and/or locations (like folders) and easily access these items in the future. */
  var futureAccessList: StorageItemAccessList = js.native
  /** Gets an object that represents a list that an app can use to track the files and/or locations (like folders) that the app has accessed most recently. */
  var mostRecentlyUsedList: StorageItemMostRecentlyUsedList = js.native
}

