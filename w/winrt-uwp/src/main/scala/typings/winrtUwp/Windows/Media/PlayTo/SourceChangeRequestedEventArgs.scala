package typings.winrtUwp.Windows.Media.PlayTo

import typings.std.Date
import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamWithContentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about the SourceChangeRequested event. */
trait SourceChangeRequestedEventArgs extends js.Object {
  /** Gets the name of the album that contains the song in the audio stream. */
  var album: String
  /** Gets the author of the content in the media stream. */
  var author: String
  /** Gets the date that the content in the media stream was published. */
  var date: Date
  /** Gets the description of the content in the media stream. */
  var description: String
  /** Gets the names of the genres that the content in the media stream belongs to. */
  var genre: String
  /** Gets custom property names and values for the content in the media stream. */
  var properties: IMapView[String, _]
  /** Gets the rating for the content in the media stream. */
  var rating: Double
  /** Gets the media stream for the Play To receiver. */
  var stream: IRandomAccessStreamWithContentType
  /** Gets the thumbnail image for the content in the media stream. */
  var thumbnail: IRandomAccessStreamReference
  /** Gets the title of the content in the media stream. */
  var title: String
}

object SourceChangeRequestedEventArgs {
  @scala.inline
  def apply(
    album: String,
    author: String,
    date: Date,
    description: String,
    genre: String,
    properties: IMapView[String, _],
    rating: Double,
    stream: IRandomAccessStreamWithContentType,
    thumbnail: IRandomAccessStreamReference,
    title: String
  ): SourceChangeRequestedEventArgs = {
    val __obj = js.Dynamic.literal(album = album.asInstanceOf[js.Any], author = author.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], genre = genre.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], rating = rating.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceChangeRequestedEventArgs]
  }
}

