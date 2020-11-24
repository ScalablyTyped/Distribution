package typings.winrtUwp.Windows.Storage.FileProperties

import typings.std.Date
import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Foundation.Collections.IKeyValuePair
import typings.winrtUwp.Windows.Foundation.Collections.IMap
import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to the image-related properties of an item (like a file or folder). */
@js.native
trait ImageProperties extends js.Object {
  
  /** Gets or sets the manufacturer of the camera that took the photo. */
  var cameraManufacturer: String = js.native
  
  /** Gets or sets the model of the camera that took the photo. */
  var cameraModel: String = js.native
  
  /** Gets or sets the date when the image was taken. */
  var dateTaken: Date = js.native
  
  /** Gets the height of the image. */
  var height: Double = js.native
  
  /** Gets the collection of keywords associated with the image. */
  var keywords: IVector[String] = js.native
  
  /** Gets the latitude coordinate where the photo was taken. */
  var latitude: Double = js.native
  
  /** Gets the longitude coordinate where the photo was taken. */
  var longitude: Double = js.native
  
  /** Gets the Exchangeable Image File (EXIF) orientation flag of the photo. */
  var orientation: PhotoOrientation = js.native
  
  /** Gets the names of people who are tagged in the photo. */
  var peopleNames: IVectorView[String] = js.native
  
  /** Gets or sets the rating associated with an image file. */
  var rating: Double = js.native
  
  /**
    * Retrieves the specified properties associated with the item.
    * @param propertiesToRetrieve A collection that contains the names of the properties to retrieve.
    * @return When this method completes successfully, it returns a collection (type IMap ) that contains the specified properties and values as key-value pairs.
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
  
  /** Gets or sets the title of the image. */
  var title: String = js.native
  
  /** Gets the width of the image. */
  var width: Double = js.native
}
