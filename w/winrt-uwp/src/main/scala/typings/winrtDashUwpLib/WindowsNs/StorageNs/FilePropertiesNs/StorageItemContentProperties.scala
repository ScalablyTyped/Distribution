package typings
package winrtDashUwpLib.WindowsNs.StorageNs.FilePropertiesNs

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
  def getDocumentPropertiesAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[DocumentProperties] = js.native
  /**
                   * Retrieves the image properties of the item (like a file of folder).
                   * @return When this method completes successfully, it returns an imageProperties object.
                   */
  def getImagePropertiesAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[ImageProperties] = js.native
  /**
                   * Retrieves the music properties of the item (like a file of folder).
                   * @return When this method completes successfully, it returns a musicProperties object.
                   */
  def getMusicPropertiesAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[MusicProperties] = js.native
  /**
                   * Retrieves the video properties of the item (like a file of folder).
                   * @return When this method completes successfully, it returns a videoProperties object.
                   */
  def getVideoPropertiesAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[VideoProperties] = js.native
  /**
                   * Retrieves the specified properties associated with the item.
                   * @param propertiesToRetrieve A collection that contains the names of the properties to retrieve.
                   * @return When this method completes successfully, it returns a collection (type IMap ) that contains the specified properties and values as key-value pairs. The return value of properties can be null.
                   */
  def retrievePropertiesAsync(
    propertiesToRetrieve: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String]
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IMap[_, _]] = js.native
  /**
                   * Saves all properties associated with the item.
                   * @return No object or value is returned when this method completes.
                   */
  def savePropertiesAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
                   * Saves the specified properties and values associated with the item.
                   * @param propertiesToSave A collection that contains the names and values of the properties to save as key-value pairs (type IKeyValuePair ).
                   * @return No object or value is returned when this method completes.
                   */
  def savePropertiesAsync(
    propertiesToSave: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IKeyValuePair[_, _]]
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
}

