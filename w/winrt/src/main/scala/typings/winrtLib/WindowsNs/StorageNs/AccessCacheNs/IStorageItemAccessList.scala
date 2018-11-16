package typings
package winrtLib.WindowsNs.StorageNs.AccessCacheNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStorageItemAccessList extends js.Object {
  var entries: AccessListEntryView = js.native
  var maximumItemsAllowed: scala.Double = js.native
  def add(file: winrtLib.WindowsNs.StorageNs.IStorageItem): java.lang.String = js.native
  def add(file: winrtLib.WindowsNs.StorageNs.IStorageItem, metadata: java.lang.String): java.lang.String = js.native
  def addOrReplace(token: java.lang.String, file: winrtLib.WindowsNs.StorageNs.IStorageItem): scala.Unit = js.native
  def addOrReplace(
    token: java.lang.String,
    file: winrtLib.WindowsNs.StorageNs.IStorageItem,
    metadata: java.lang.String
  ): scala.Unit = js.native
  def checkAccess(file: winrtLib.WindowsNs.StorageNs.IStorageItem): scala.Boolean = js.native
  def clear(): scala.Unit = js.native
  def containsItem(token: java.lang.String): scala.Boolean = js.native
  def getFileAsync(token: java.lang.String): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.StorageNs.StorageFile] = js.native
  def getFileAsync(token: java.lang.String, options: AccessCacheOptions): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.StorageNs.StorageFile] = js.native
  def getFolderAsync(token: java.lang.String): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.StorageNs.StorageFolder] = js.native
  def getFolderAsync(token: java.lang.String, options: AccessCacheOptions): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.StorageNs.StorageFolder] = js.native
  def getItemAsync(token: java.lang.String): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.StorageNs.IStorageItem] = js.native
  def getItemAsync(token: java.lang.String, options: AccessCacheOptions): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.StorageNs.IStorageItem] = js.native
  def remove(token: java.lang.String): scala.Unit = js.native
}

