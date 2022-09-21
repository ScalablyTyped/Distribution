package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoContent
  extends StObject
     with Content_ {
  
  /**
    * The album name to which the video belongs.
    */
  val album: String | Null
  
  /**
    * The list of artists who created the video.
    */
  val artists: js.Array[String] | Null
  
  /**
    * The video duration in milliseconds.
    */
  val duration: Double
  
  /**
    * The geographical location where the video has been made.
    *
    * The attribute is marked as read-only since Tizen 5.5. Modifying it or its attributes has no effect.
    */
  val geolocation: SimpleCoordinates | Null
  
  /**
    * The height of the video in pixels.
    */
  val height: Double
  
  /**
    * The width of a video in pixels.
    */
  val width: Double
}
object VideoContent {
  
  inline def apply(
    contentURI: String,
    duration: Double,
    editableAttributes: js.Array[String],
    height: Double,
    id: ContentId,
    isFavorite: Boolean,
    mimeType: String,
    name: String,
    rating: Double,
    size: Double,
    title: String,
    `type`: ContentType,
    width: Double
  ): VideoContent = {
    val __obj = js.Dynamic.literal(contentURI = contentURI.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], editableAttributes = editableAttributes.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isFavorite = isFavorite.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], rating = rating.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], album = null, artists = null, description = null, geolocation = null, modifiedDate = null, releaseDate = null, thumbnailURIs = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoContent]
  }
  
  extension [Self <: VideoContent](x: Self) {
    
    inline def setAlbum(value: String): Self = StObject.set(x, "album", value.asInstanceOf[js.Any])
    
    inline def setAlbumNull: Self = StObject.set(x, "album", null)
    
    inline def setArtists(value: js.Array[String]): Self = StObject.set(x, "artists", value.asInstanceOf[js.Any])
    
    inline def setArtistsNull: Self = StObject.set(x, "artists", null)
    
    inline def setArtistsVarargs(value: String*): Self = StObject.set(x, "artists", js.Array(value*))
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setGeolocation(value: SimpleCoordinates): Self = StObject.set(x, "geolocation", value.asInstanceOf[js.Any])
    
    inline def setGeolocationNull: Self = StObject.set(x, "geolocation", null)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
