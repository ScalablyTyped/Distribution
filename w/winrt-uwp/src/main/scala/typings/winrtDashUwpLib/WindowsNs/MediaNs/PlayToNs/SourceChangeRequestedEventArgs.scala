package typings
package winrtDashUwpLib.WindowsNs.MediaNs.PlayToNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about the SourceChangeRequested event. */
@JSGlobal("Windows.Media.PlayTo.SourceChangeRequestedEventArgs")
@js.native
abstract class SourceChangeRequestedEventArgs () extends js.Object {
  /** Gets the name of the album that contains the song in the audio stream. */
  var album: java.lang.String = js.native
  /** Gets the author of the content in the media stream. */
  var author: java.lang.String = js.native
  /** Gets the date that the content in the media stream was published. */
  var date: stdLib.Date = js.native
  /** Gets the description of the content in the media stream. */
  var description: java.lang.String = js.native
  /** Gets the names of the genres that the content in the media stream belongs to. */
  var genre: java.lang.String = js.native
  /** Gets custom property names and values for the content in the media stream. */
  var properties: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[java.lang.String, _] = js.native
  /** Gets the rating for the content in the media stream. */
  var rating: scala.Double = js.native
  /** Gets the media stream for the Play To receiver. */
  var stream: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamWithContentType = js.native
  /** Gets the thumbnail image for the content in the media stream. */
  var thumbnail: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamReference = js.native
  /** Gets the title of the content in the media stream. */
  var title: java.lang.String = js.native
}

