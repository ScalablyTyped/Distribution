package typings.winrtDashUwp.WindowsNs.MediaNs.PlayToNs

import typings.std.Date
import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IMapView
import typings.winrtDashUwp.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamReference
import typings.winrtDashUwp.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamWithContentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about the SourceChangeRequested event. */
@JSGlobal("Windows.Media.PlayTo.SourceChangeRequestedEventArgs")
@js.native
abstract class SourceChangeRequestedEventArgs () extends js.Object {
  /** Gets the name of the album that contains the song in the audio stream. */
  var album: String = js.native
  /** Gets the author of the content in the media stream. */
  var author: String = js.native
  /** Gets the date that the content in the media stream was published. */
  var date: Date = js.native
  /** Gets the description of the content in the media stream. */
  var description: String = js.native
  /** Gets the names of the genres that the content in the media stream belongs to. */
  var genre: String = js.native
  /** Gets custom property names and values for the content in the media stream. */
  var properties: IMapView[String, _] = js.native
  /** Gets the rating for the content in the media stream. */
  var rating: Double = js.native
  /** Gets the media stream for the Play To receiver. */
  var stream: IRandomAccessStreamWithContentType = js.native
  /** Gets the thumbnail image for the content in the media stream. */
  var thumbnail: IRandomAccessStreamReference = js.native
  /** Gets the title of the content in the media stream. */
  var title: String = js.native
}

