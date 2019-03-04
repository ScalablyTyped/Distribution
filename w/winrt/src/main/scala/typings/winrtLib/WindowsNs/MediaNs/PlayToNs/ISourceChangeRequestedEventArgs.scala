package typings
package winrtLib.WindowsNs.MediaNs.PlayToNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISourceChangeRequestedEventArgs extends js.Object {
  var album: java.lang.String
  var author: java.lang.String
  var date: stdLib.Date
  var description: java.lang.String
  var genre: java.lang.String
  var properties: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[java.lang.String, _]
  var rating: scala.Double
  var stream: winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamWithContentType
  var thumbnail: winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamReference
  var title: java.lang.String
}

object ISourceChangeRequestedEventArgs {
  @scala.inline
  def apply(
    album: java.lang.String,
    author: java.lang.String,
    date: stdLib.Date,
    description: java.lang.String,
    genre: java.lang.String,
    properties: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[java.lang.String, _],
    rating: scala.Double,
    stream: winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamWithContentType,
    thumbnail: winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamReference,
    title: java.lang.String
  ): ISourceChangeRequestedEventArgs = {
    val __obj = js.Dynamic.literal(album = album, author = author, date = date, description = description, genre = genre, properties = properties, rating = rating, stream = stream, thumbnail = thumbnail, title = title)
  
    __obj.asInstanceOf[ISourceChangeRequestedEventArgs]
  }
}

