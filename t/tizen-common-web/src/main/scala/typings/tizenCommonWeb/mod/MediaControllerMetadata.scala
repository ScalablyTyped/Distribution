package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaControllerMetadata extends StObject {
  
  /**
    * Media album.
    */
  var album: String
  
  /**
    * Media artist.
    */
  var artist: String
  
  /**
    * Media author.
    */
  var author: String
  
  /**
    * Media copyright.
    */
  var copyright: String
  
  /**
    * Media date.
    */
  var date: String
  
  /**
    * Media description.
    */
  var description: String
  
  /**
    * Media duration.
    */
  var duration: String
  
  /**
    * Episode number. Default value is 0.
    *
    * @since 5.5
    */
  var episodeNumber: Double
  
  /**
    * Episode title. Default value is null.
    *
    * @since 5.5
    */
  var episodeTitle: String | Null
  
  /**
    * Media genre.
    */
  var genre: String
  
  /**
    * Media picture.
    */
  var picture: String
  
  /**
    * Resolution height. Default value is 0. It cannot be changed to less than 0. Setting inappropriate values has no effect on the attribute.
    *
    * @since 5.5
    */
  var resolutionHeight: Double
  
  /**
    * Resolution width. Default value is 0. It cannot be changed to less than 0. Setting inappropriate values has no effect on the attribute.
    *
    * @since 5.5
    */
  var resolutionWidth: Double
  
  /**
    * Season number. Default value is 0.
    *
    * @since 5.5
    */
  var seasonNumber: Double
  
  /**
    * Season title. Default value is null.
    *
    * @since 5.5
    */
  var seasonTitle: String | Null
  
  /**
    * Media title.
    */
  var title: String
  
  /**
    * Media track number.
    */
  var trackNum: String
}
object MediaControllerMetadata {
  
  inline def apply(
    album: String,
    artist: String,
    author: String,
    copyright: String,
    date: String,
    description: String,
    duration: String,
    episodeNumber: Double,
    genre: String,
    picture: String,
    resolutionHeight: Double,
    resolutionWidth: Double,
    seasonNumber: Double,
    title: String,
    trackNum: String
  ): MediaControllerMetadata = {
    val __obj = js.Dynamic.literal(album = album.asInstanceOf[js.Any], artist = artist.asInstanceOf[js.Any], author = author.asInstanceOf[js.Any], copyright = copyright.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], episodeNumber = episodeNumber.asInstanceOf[js.Any], genre = genre.asInstanceOf[js.Any], picture = picture.asInstanceOf[js.Any], resolutionHeight = resolutionHeight.asInstanceOf[js.Any], resolutionWidth = resolutionWidth.asInstanceOf[js.Any], seasonNumber = seasonNumber.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], trackNum = trackNum.asInstanceOf[js.Any], episodeTitle = null, seasonTitle = null)
    __obj.asInstanceOf[MediaControllerMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaControllerMetadata] (val x: Self) extends AnyVal {
    
    inline def setAlbum(value: String): Self = StObject.set(x, "album", value.asInstanceOf[js.Any])
    
    inline def setArtist(value: String): Self = StObject.set(x, "artist", value.asInstanceOf[js.Any])
    
    inline def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setCopyright(value: String): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setEpisodeNumber(value: Double): Self = StObject.set(x, "episodeNumber", value.asInstanceOf[js.Any])
    
    inline def setEpisodeTitle(value: String): Self = StObject.set(x, "episodeTitle", value.asInstanceOf[js.Any])
    
    inline def setEpisodeTitleNull: Self = StObject.set(x, "episodeTitle", null)
    
    inline def setGenre(value: String): Self = StObject.set(x, "genre", value.asInstanceOf[js.Any])
    
    inline def setPicture(value: String): Self = StObject.set(x, "picture", value.asInstanceOf[js.Any])
    
    inline def setResolutionHeight(value: Double): Self = StObject.set(x, "resolutionHeight", value.asInstanceOf[js.Any])
    
    inline def setResolutionWidth(value: Double): Self = StObject.set(x, "resolutionWidth", value.asInstanceOf[js.Any])
    
    inline def setSeasonNumber(value: Double): Self = StObject.set(x, "seasonNumber", value.asInstanceOf[js.Any])
    
    inline def setSeasonTitle(value: String): Self = StObject.set(x, "seasonTitle", value.asInstanceOf[js.Any])
    
    inline def setSeasonTitleNull: Self = StObject.set(x, "seasonTitle", null)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTrackNum(value: String): Self = StObject.set(x, "trackNum", value.asInstanceOf[js.Any])
  }
}
