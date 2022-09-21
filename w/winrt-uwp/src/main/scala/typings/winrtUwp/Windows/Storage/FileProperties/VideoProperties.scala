package typings.winrtUwp.Windows.Storage.FileProperties

import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Foundation.Collections.IKeyValuePair
import typings.winrtUwp.Windows.Foundation.Collections.IMap
import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to the video-related properties of an item (like a file or folder). */
@js.native
trait VideoProperties extends StObject {
  
  /** Gets the sum audio and video bitrate of the video. */
  var bitrate: Double = js.native
  
  /** Gets the directors of the video. */
  var directors: IVector[String] = js.native
  
  /** Gets the duration of the video. */
  var duration: Double = js.native
  
  /** Gets the height of the video. */
  var height: Double = js.native
  
  /** Gets the collection of keywords associated with the video. */
  var keywords: IVector[String] = js.native
  
  /** Gets the latitude coordinate where the video was shot. */
  var latitude: Double = js.native
  
  /** Gets the longitude coordinate where the video was shot. */
  var longitude: Double = js.native
  
  /** Gets a VideoOrientation value that indicates how the video should be rotated to display it correctly. */
  var orientation: VideoOrientation = js.native
  
  /** Gets the producers of the video. */
  var producers: IVector[String] = js.native
  
  /** Gets or sets the publisher of the video. */
  var publisher: String = js.native
  
  /** Gets or sets the rating associated with a video file. */
  var rating: Double = js.native
  
  /**
    * Retrieves the specified properties associated with the item.
    * @param propertiesToRetrieve A collection that contains the names of the properties to retrieve.
    * @return When this method completes successfully, it returns a collection (type IMap ) that contains the specified properties and values as key-value pairs.
    */
  def retrievePropertiesAsync(propertiesToRetrieve: IIterable[String]): IPromiseWithIAsyncOperation[IMap[Any, Any]] = js.native
  
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
  def savePropertiesAsync(propertiesToSave: IIterable[IKeyValuePair[Any, Any]]): IPromiseWithIAsyncAction = js.native
  
  /** Gets or sets the subtitle of the video. */
  var subtitle: String = js.native
  
  /** Gets or sets the title of the video. */
  var title: String = js.native
  
  /** Gets the width of the video. */
  var width: Double = js.native
  
  /** Gets the script writers for the video. */
  var writers: IVector[String] = js.native
  
  /** Gets or sets the year that the video was shot or released. */
  var year: Double = js.native
}
