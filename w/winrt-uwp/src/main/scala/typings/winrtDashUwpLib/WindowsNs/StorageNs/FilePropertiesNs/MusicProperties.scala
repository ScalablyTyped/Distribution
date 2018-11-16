package typings
package winrtDashUwpLib.WindowsNs.StorageNs.FilePropertiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to the music-related properties of an item (like a file or folder). */
@JSGlobal("Windows.Storage.FileProperties.MusicProperties")
@js.native
abstract class MusicProperties () extends js.Object {
  /** Gets or sets the name of the album that contains the song. */
  var album: java.lang.String = js.native
  /** Gets or sets the name of the album artist of the song. */
  var albumArtist: java.lang.String = js.native
  /** Gets the artists that contributed to the song. */
  var artist: java.lang.String = js.native
  /** Gets the bit rate of the song file. */
  var bitrate: scala.Double = js.native
  /** Gets the composers of the song. */
  var composers: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[java.lang.String] = js.native
  /** Gets the conductors of the song. */
  var conductors: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[java.lang.String] = js.native
  /** Gets the duration of the song in milliseconds. */
  var duration: scala.Double = js.native
  /** Gets the names of music genres that the song belongs to. */
  var genre: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[java.lang.String] = js.native
  /** Gets the producers of the song. */
  var producers: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[java.lang.String] = js.native
  /** Gets or sets the publisher of the song. */
  var publisher: java.lang.String = js.native
  /** Gets or sets the rating associated with a music file. */
  var rating: scala.Double = js.native
  /** Gets or sets the subtitle of the song. */
  var subtitle: java.lang.String = js.native
  /** Gets or sets the title of the song */
  var title: java.lang.String = js.native
  /** Gets or sets the track number of the song on the song's album. */
  var trackNumber: scala.Double = js.native
  /** Gets the songwriters. */
  var writers: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[java.lang.String] = js.native
  /** Gets or sets the year that the song was released. */
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

