package typings
package winrtDashUwpLib.WindowsNs.StorageNs.FilePropertiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to the video-related properties of an item (like a file or folder). */
@JSGlobal("Windows.Storage.FileProperties.VideoProperties")
@js.native
abstract class VideoProperties () extends js.Object {
  /** Gets the sum audio and video bitrate of the video. */
  var bitrate: scala.Double = js.native
  /** Gets the directors of the video. */
  var directors: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[java.lang.String] = js.native
  /** Gets the duration of the video. */
  var duration: scala.Double = js.native
  /** Gets the height of the video. */
  var height: scala.Double = js.native
  /** Gets the collection of keywords associated with the video. */
  var keywords: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[java.lang.String] = js.native
  /** Gets the latitude coordinate where the video was shot. */
  var latitude: scala.Double = js.native
  /** Gets the longitude coordinate where the video was shot. */
  var longitude: scala.Double = js.native
  /** Gets a VideoOrientation value that indicates how the video should be rotated to display it correctly. */
  var orientation: VideoOrientation = js.native
  /** Gets the producers of the video. */
  var producers: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[java.lang.String] = js.native
  /** Gets or sets the publisher of the video. */
  var publisher: java.lang.String = js.native
  /** Gets or sets the rating associated with a video file. */
  var rating: scala.Double = js.native
  /** Gets or sets the subtitle of the video. */
  var subtitle: java.lang.String = js.native
  /** Gets or sets the title of the video. */
  var title: java.lang.String = js.native
  /** Gets the width of the video. */
  var width: scala.Double = js.native
  /** Gets the script writers for the video. */
  var writers: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[java.lang.String] = js.native
  /** Gets or sets the year that the video was shot or released. */
  var year: scala.Double = js.native
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

