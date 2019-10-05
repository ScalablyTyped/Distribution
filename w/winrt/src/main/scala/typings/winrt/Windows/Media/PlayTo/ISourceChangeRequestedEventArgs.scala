package typings.winrt.Windows.Media.PlayTo

import typings.std.Date
import typings.winrt.Windows.Foundation.Collections.IMapView
import typings.winrt.Windows.Storage.Streams.IRandomAccessStreamReference
import typings.winrt.Windows.Storage.Streams.IRandomAccessStreamWithContentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISourceChangeRequestedEventArgs extends js.Object {
  var album: String
  var author: String
  var date: Date
  var description: String
  var genre: String
  var properties: IMapView[String, _]
  var rating: Double
  var stream: IRandomAccessStreamWithContentType
  var thumbnail: IRandomAccessStreamReference
  var title: String
}

object ISourceChangeRequestedEventArgs {
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
  ): ISourceChangeRequestedEventArgs = {
    val __obj = js.Dynamic.literal(album = album, author = author, date = date, description = description, genre = genre, properties = properties, rating = rating, stream = stream, thumbnail = thumbnail, title = title)
  
    __obj.asInstanceOf[ISourceChangeRequestedEventArgs]
  }
}

