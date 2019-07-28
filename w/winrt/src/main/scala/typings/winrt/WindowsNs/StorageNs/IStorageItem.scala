package typings.winrt.WindowsNs.StorageNs

import typings.std.Date
import typings.winrt.WindowsNs.FoundationNs.IAsyncAction
import typings.winrt.WindowsNs.FoundationNs.IAsyncOperation
import typings.winrt.WindowsNs.StorageNs.FilePropertiesNs.BasicProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStorageItem extends js.Object {
  var attributes: FileAttributes = js.native
  var dateCreated: Date = js.native
  var name: String = js.native
  var path: String = js.native
  def deleteAsync(): IAsyncAction = js.native
  def deleteAsync(option: StorageDeleteOption): IAsyncAction = js.native
  def getBasicPropertiesAsync(): IAsyncOperation[BasicProperties] = js.native
  def isOfType(`type`: StorageItemTypes): Boolean = js.native
  def renameAsync(desiredName: String): IAsyncAction = js.native
  def renameAsync(desiredName: String, option: NameCollisionOption): IAsyncAction = js.native
}

