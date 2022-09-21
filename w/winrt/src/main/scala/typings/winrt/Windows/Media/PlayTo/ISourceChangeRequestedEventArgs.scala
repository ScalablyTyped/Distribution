package typings.winrt.Windows.Media.PlayTo

import typings.winrt.Windows.Foundation.Collections.IMapView
import typings.winrt.Windows.Storage.Streams.IRandomAccessStreamReference
import typings.winrt.Windows.Storage.Streams.IRandomAccessStreamWithContentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISourceChangeRequestedEventArgs extends StObject {
  
  var album: String
  
  var author: String
  
  var date: js.Date
  
  var description: String
  
  var genre: String
  
  var properties: IMapView[String, Any]
  
  var rating: Double
  
  var stream: IRandomAccessStreamWithContentType
  
  var thumbnail: IRandomAccessStreamReference
  
  var title: String
}
object ISourceChangeRequestedEventArgs {
  
  inline def apply(
    album: String,
    author: String,
    date: js.Date,
    description: String,
    genre: String,
    properties: IMapView[String, Any],
    rating: Double,
    stream: IRandomAccessStreamWithContentType,
    thumbnail: IRandomAccessStreamReference,
    title: String
  ): ISourceChangeRequestedEventArgs = {
    val __obj = js.Dynamic.literal(album = album.asInstanceOf[js.Any], author = author.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], genre = genre.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], rating = rating.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISourceChangeRequestedEventArgs]
  }
  
  extension [Self <: ISourceChangeRequestedEventArgs](x: Self) {
    
    inline def setAlbum(value: String): Self = StObject.set(x, "album", value.asInstanceOf[js.Any])
    
    inline def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setGenre(value: String): Self = StObject.set(x, "genre", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: IMapView[String, Any]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setRating(value: Double): Self = StObject.set(x, "rating", value.asInstanceOf[js.Any])
    
    inline def setStream(value: IRandomAccessStreamWithContentType): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    
    inline def setThumbnail(value: IRandomAccessStreamReference): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
