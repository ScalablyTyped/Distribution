package typings.winrtDashUwp.WindowsNs.StorageNs.FilePropertiesNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IIterable
import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IKeyValuePair
import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IMap
import typings.winrtDashUwp.WindowsNs.FoundationNs.IPromiseWithIAsyncAction
import typings.winrtDashUwp.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to the content-related properties of an item (like a file or folder). */
@JSGlobal("Windows.Storage.FileProperties.StorageItemContentProperties")
@js.native
abstract class StorageItemContentProperties () extends js.Object {
  /**
    * Retrieves the document properties of the item (like a file of folder).
    * @return When this method completes successfully, it returns a documentProperties object.
    */
  def getDocumentPropertiesAsync(): IPromiseWithIAsyncOperation[DocumentProperties] = js.native
  /**
    * Retrieves the image properties of the item (like a file of folder).
    * @return When this method completes successfully, it returns an imageProperties object.
    */
  def getImagePropertiesAsync(): IPromiseWithIAsyncOperation[ImageProperties] = js.native
  /**
    * Retrieves the music properties of the item (like a file of folder).
    * @return When this method completes successfully, it returns a musicProperties object.
    */
  def getMusicPropertiesAsync(): IPromiseWithIAsyncOperation[MusicProperties] = js.native
  /**
    * Retrieves the video properties of the item (like a file of folder).
    * @return When this method completes successfully, it returns a videoProperties object.
    */
  def getVideoPropertiesAsync(): IPromiseWithIAsyncOperation[VideoProperties] = js.native
  /**
    * Retrieves the specified properties associated with the item.
    * @param propertiesToRetrieve A collection that contains the names of the properties to retrieve.
    * @return When this method completes successfully, it returns a collection (type IMap ) that contains the specified properties and values as key-value pairs. The return value of properties can be null.
    */
  def retrievePropertiesAsync(propertiesToRetrieve: IIterable[String]): IPromiseWithIAsyncOperation[IMap[_, _]] = js.native
  /**
    * Saves all properties associated with the item.
    * @return No object or value is returned when this method completes.
    */
  def savePropertiesAsync(): IPromiseWithIAsyncAction = js.native
  /**
    * Saves the specified properties and values associated with the item.
    * @param propertiesToSave A collection that contains the names and values of the properties to save as key-value pairs (type IKeyValuePair ).
    * @return No object or value is returned when this method completes.
    */
  def savePropertiesAsync(propertiesToSave: IIterable[IKeyValuePair[_, _]]): IPromiseWithIAsyncAction = js.native
}

