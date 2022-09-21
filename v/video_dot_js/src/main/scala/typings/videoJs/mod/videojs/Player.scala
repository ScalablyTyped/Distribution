package typings.videoJs.mod.videojs

import org.scalablytyped.runtime.StringDictionary
import typings.videoJs.mod.videojs.Tech.SourceObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Player {
  
  /**
    * An object that describes a single piece of media.
    * Properties that are not part of this type description will be retained; so, this can be viewed as a generic metadata storage mechanism as well.
    */
  trait MediaObject
    extends StObject
       with /**
    * Properties that are not part of this type description will be retained; so, this can be viewed as a generic metadata storage mechanism as well.
    */
  /* key */ StringDictionary[Any] {
    
    /**
      * Unused, except if this object is passed to the MediaSession API.
      */
    var album: js.UndefOr[String] = js.undefined
    
    /**
      * Unused, except if this object is passed to the MediaSession API.
      */
    var artist: js.UndefOr[String] = js.undefined
    
    /**
      * Unused, except if this object is passed to the MediaSession API. If not specified, will be populated via the poster, if available.
      */
    var artwork: js.UndefOr[js.Array[Any]] = js.undefined
    
    /**
      * URL to an image that will display before playback.
      */
    var poster: js.UndefOr[String] = js.undefined
    
    /**
      * A single source object, an array of source objects, or a string referencing a URL to a media source.
      * It is highly recommended that an object or array of objects is used here, so that source selection algorithms can take the type into account.
      */
    var src: js.UndefOr[String | SourceObject | js.Array[SourceObject]] = js.undefined
    
    /**
      *  An array of objects to be used to create text tracks, following the native track element format.
      *  For ease of removal, these will be created as "remote" text tracks and set to automatically clean up on source changes.
      */
    var textTracks: js.UndefOr[js.Array[Any]] = js.undefined
    
    /**
      * Unused, except if this object is passed to the MediaSession API.
      */
    var title: js.UndefOr[String] = js.undefined
  }
  object MediaObject {
    
    inline def apply(): MediaObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MediaObject]
    }
    
    extension [Self <: MediaObject](x: Self) {
      
      inline def setAlbum(value: String): Self = StObject.set(x, "album", value.asInstanceOf[js.Any])
      
      inline def setAlbumUndefined: Self = StObject.set(x, "album", js.undefined)
      
      inline def setArtist(value: String): Self = StObject.set(x, "artist", value.asInstanceOf[js.Any])
      
      inline def setArtistUndefined: Self = StObject.set(x, "artist", js.undefined)
      
      inline def setArtwork(value: js.Array[Any]): Self = StObject.set(x, "artwork", value.asInstanceOf[js.Any])
      
      inline def setArtworkUndefined: Self = StObject.set(x, "artwork", js.undefined)
      
      inline def setArtworkVarargs(value: Any*): Self = StObject.set(x, "artwork", js.Array(value*))
      
      inline def setPoster(value: String): Self = StObject.set(x, "poster", value.asInstanceOf[js.Any])
      
      inline def setPosterUndefined: Self = StObject.set(x, "poster", js.undefined)
      
      inline def setSrc(value: String | SourceObject | js.Array[SourceObject]): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      inline def setSrcVarargs(value: SourceObject*): Self = StObject.set(x, "src", js.Array(value*))
      
      inline def setTextTracks(value: js.Array[Any]): Self = StObject.set(x, "textTracks", value.asInstanceOf[js.Any])
      
      inline def setTextTracksUndefined: Self = StObject.set(x, "textTracks", js.undefined)
      
      inline def setTextTracksVarargs(value: Any*): Self = StObject.set(x, "textTracks", js.Array(value*))
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
