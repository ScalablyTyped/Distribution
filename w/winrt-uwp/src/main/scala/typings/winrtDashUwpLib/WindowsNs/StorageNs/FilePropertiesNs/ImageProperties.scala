package typings
package winrtDashUwpLib.WindowsNs.StorageNs.FilePropertiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to the image-related properties of an item (like a file or folder). */
@JSGlobal("Windows.Storage.FileProperties.ImageProperties")
@js.native
abstract class ImageProperties () extends js.Object {
  /** Gets or sets the manufacturer of the camera that took the photo. */
  var cameraManufacturer: java.lang.String = js.native
  /** Gets or sets the model of the camera that took the photo. */
  var cameraModel: java.lang.String = js.native
  /** Gets or sets the date when the image was taken. */
  var dateTaken: stdLib.Date = js.native
  /** Gets the height of the image. */
  var height: scala.Double = js.native
  /** Gets the collection of keywords associated with the image. */
  var keywords: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[java.lang.String] = js.native
  /** Gets the latitude coordinate where the photo was taken. */
  var latitude: scala.Double = js.native
  /** Gets the longitude coordinate where the photo was taken. */
  var longitude: scala.Double = js.native
  /** Gets the Exchangeable Image File (EXIF) orientation flag of the photo. */
  var orientation: PhotoOrientation = js.native
  /** Gets the names of people who are tagged in the photo. */
  var peopleNames: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String] = js.native
  /** Gets or sets the rating associated with an image file. */
  var rating: scala.Double = js.native
  /** Gets or sets the title of the image. */
  var title: java.lang.String = js.native
  /** Gets the width of the image. */
  var width: scala.Double = js.native
  /**
                   * Retrieves the specified properties associated with the item.
                   * @param propertiesToRetrieve A collection that contains the names of the properties to retrieve.
                   * @return When this method completes successfully, it returns a collection (type IMap ) that contains the specified properties and values as key-value pairs.
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

