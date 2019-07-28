package typings.winrt.WindowsNs.StorageNs.FilePropertiesNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IIterable
import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IKeyValuePair
import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IMap
import typings.winrt.WindowsNs.FoundationNs.IAsyncAction
import typings.winrt.WindowsNs.FoundationNs.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStorageItemExtraProperties extends js.Object {
  def retrievePropertiesAsync(propertiesToRetrieve: IIterable[String]): IAsyncOperation[IMap[String, _]] = js.native
  def savePropertiesAsync(): IAsyncAction = js.native
  def savePropertiesAsync(propertiesToSave: IIterable[IKeyValuePair[String, _]]): IAsyncAction = js.native
}

