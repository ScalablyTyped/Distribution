package typings
package winrtLib.WindowsNs.StorageNs.FilePropertiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStorageItemExtraProperties extends js.Object {
  def retrievePropertiesAsync(propertiesToRetrieve: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String]): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.FoundationNs.CollectionsNs.IMap[java.lang.String, _]] = js.native
  def savePropertiesAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
  def savePropertiesAsync(
    propertiesToSave: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[winrtLib.WindowsNs.FoundationNs.CollectionsNs.IKeyValuePair[java.lang.String, _]]
  ): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
}

