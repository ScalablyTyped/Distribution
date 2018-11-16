package typings
package winrtLib.WindowsNs.StorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStorageItem extends js.Object {
  var attributes: FileAttributes = js.native
  var dateCreated: stdLib.Date = js.native
  var name: java.lang.String = js.native
  var path: java.lang.String = js.native
  def deleteAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
  def deleteAsync(option: StorageDeleteOption): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
  def getBasicPropertiesAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.StorageNs.FilePropertiesNs.BasicProperties] = js.native
  def isOfType(`type`: StorageItemTypes): scala.Boolean = js.native
  def renameAsync(desiredName: java.lang.String): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
  def renameAsync(desiredName: java.lang.String, option: NameCollisionOption): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
}

