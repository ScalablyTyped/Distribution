package typings.winrt.Windows.Media.PlayTo

import typings.std.Date
import typings.winrt.Windows.Foundation.Collections.IMapView
import typings.winrt.Windows.Storage.Streams.IRandomAccessStreamReference
import typings.winrt.Windows.Storage.Streams.IRandomAccessStreamWithContentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceChangeRequestedEventArgs
  extends StObject
     with ISourceChangeRequestedEventArgs
object SourceChangeRequestedEventArgs {
  
  @scala.inline
  def apply(
    album: String,
    author: String,
    date: Date,
    description: String,
    genre: String,
    properties: IMapView[String, js.Any],
    rating: Double,
    stream: IRandomAccessStreamWithContentType,
    thumbnail: IRandomAccessStreamReference,
    title: String
  ): SourceChangeRequestedEventArgs = {
    val __obj = js.Dynamic.literal(album = album.asInstanceOf[js.Any], author = author.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], genre = genre.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], rating = rating.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceChangeRequestedEventArgs]
  }
}
