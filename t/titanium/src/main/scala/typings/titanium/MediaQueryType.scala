package typings.titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A specifier for a media library query. By default, filters perform an exact match.
  */
@js.native
trait MediaQueryType extends StObject {
  
  /**
    * The album artist to filter on. Value should be a String.
    */
  var albumArtist: js.UndefOr[MediaQueryInfoType | String] = js.native
  
  /**
    * The album artist persistent ID to filter on. Value should be a Number.
    */
  var albumArtistPersistentID: js.UndefOr[MediaQueryInfoType | Double] = js.native
  
  /**
    * The album persistent ID to filter on. Value should be a Number.
    */
  var albumPersistentID: js.UndefOr[MediaQueryInfoType | Double] = js.native
  
  /**
    * The album title to filter on. Value should be a String.
    */
  var albumTitle: js.UndefOr[MediaQueryInfoType | String] = js.native
  
  /**
    * The artist to filter on. Value should be a String.
    */
  var artist: js.UndefOr[MediaQueryInfoType | String] = js.native
  
  /**
    * The composer to filter on. Value should be a String.
    */
  var composer: js.UndefOr[MediaQueryInfoType | String] = js.native
  
  /**
    * The composer persistent ID to filter on. Value should be a Number.
    */
  var composerPersistentID: js.UndefOr[MediaQueryInfoType | Double] = js.native
  
  /**
    * The genre to filter on. Value should be a String.
    */
  var genre: js.UndefOr[MediaQueryInfoType | String] = js.native
  
  /**
    * The genre persistent ID to filter on. Value should be a Number.
    */
  var genrePersistentID: js.UndefOr[MediaQueryInfoType | Double] = js.native
  
  /**
    * A constant that specifies the ordering of the result array.
    */
  var grouping: js.UndefOr[Double] = js.native
  
  /**
    * Filter by whether or not the item is a protected asset.
    * Value should be a Boolean.
    */
  var hasProtectedAsset: js.UndefOr[MediaQueryInfoType | Boolean] = js.native
  
  /**
    * Filter by whether or not the item is a cloud item.
    * Value should be a Boolean.
    */
  var isCloudItem: js.UndefOr[MediaQueryInfoType | Boolean] = js.native
  
  /**
    * Filter by whether or not the item is a compilation.
    * The value should be a Boolean.
    */
  var isCompilation: js.UndefOr[MediaQueryInfoType | Boolean] = js.native
  
  /**
    * The media type to filter on.
    */
  var mediaType: js.UndefOr[MediaQueryInfoType | Double] = js.native
  
  /**
    * The persistent ID to filter on. Value should be a Number.
    */
  var persistentID: js.UndefOr[MediaQueryInfoType | Double] = js.native
  
  /**
    * The play count to filter on. Value should be a Number.
    */
  var playCount: js.UndefOr[MediaQueryInfoType | Double] = js.native
  
  /**
    * The podcast persistent ID to filter on. Value should be a Number.
    */
  var podcastPersistentID: js.UndefOr[MediaQueryInfoType | Double] = js.native
  
  /**
    * The podcast title to filter on. Value should be a String.
    */
  var podcastTitle: js.UndefOr[MediaQueryInfoType | String] = js.native
  
  /**
    * The title to filter on. Value should be a String.
    */
  var title: js.UndefOr[MediaQueryInfoType | String] = js.native
}
object MediaQueryType {
  
  @scala.inline
  def apply(): MediaQueryType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaQueryType]
  }
  
  @scala.inline
  implicit class MediaQueryTypeMutableBuilder[Self <: MediaQueryType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlbumArtist(value: MediaQueryInfoType | String): Self = StObject.set(x, "albumArtist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlbumArtistPersistentID(value: MediaQueryInfoType | Double): Self = StObject.set(x, "albumArtistPersistentID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlbumArtistPersistentIDUndefined: Self = StObject.set(x, "albumArtistPersistentID", js.undefined)
    
    @scala.inline
    def setAlbumArtistUndefined: Self = StObject.set(x, "albumArtist", js.undefined)
    
    @scala.inline
    def setAlbumPersistentID(value: MediaQueryInfoType | Double): Self = StObject.set(x, "albumPersistentID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlbumPersistentIDUndefined: Self = StObject.set(x, "albumPersistentID", js.undefined)
    
    @scala.inline
    def setAlbumTitle(value: MediaQueryInfoType | String): Self = StObject.set(x, "albumTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlbumTitleUndefined: Self = StObject.set(x, "albumTitle", js.undefined)
    
    @scala.inline
    def setArtist(value: MediaQueryInfoType | String): Self = StObject.set(x, "artist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtistUndefined: Self = StObject.set(x, "artist", js.undefined)
    
    @scala.inline
    def setComposer(value: MediaQueryInfoType | String): Self = StObject.set(x, "composer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComposerPersistentID(value: MediaQueryInfoType | Double): Self = StObject.set(x, "composerPersistentID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComposerPersistentIDUndefined: Self = StObject.set(x, "composerPersistentID", js.undefined)
    
    @scala.inline
    def setComposerUndefined: Self = StObject.set(x, "composer", js.undefined)
    
    @scala.inline
    def setGenre(value: MediaQueryInfoType | String): Self = StObject.set(x, "genre", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenrePersistentID(value: MediaQueryInfoType | Double): Self = StObject.set(x, "genrePersistentID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenrePersistentIDUndefined: Self = StObject.set(x, "genrePersistentID", js.undefined)
    
    @scala.inline
    def setGenreUndefined: Self = StObject.set(x, "genre", js.undefined)
    
    @scala.inline
    def setGrouping(value: Double): Self = StObject.set(x, "grouping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupingUndefined: Self = StObject.set(x, "grouping", js.undefined)
    
    @scala.inline
    def setHasProtectedAsset(value: MediaQueryInfoType | Boolean): Self = StObject.set(x, "hasProtectedAsset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasProtectedAssetUndefined: Self = StObject.set(x, "hasProtectedAsset", js.undefined)
    
    @scala.inline
    def setIsCloudItem(value: MediaQueryInfoType | Boolean): Self = StObject.set(x, "isCloudItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCloudItemUndefined: Self = StObject.set(x, "isCloudItem", js.undefined)
    
    @scala.inline
    def setIsCompilation(value: MediaQueryInfoType | Boolean): Self = StObject.set(x, "isCompilation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCompilationUndefined: Self = StObject.set(x, "isCompilation", js.undefined)
    
    @scala.inline
    def setMediaType(value: MediaQueryInfoType | Double): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaTypeUndefined: Self = StObject.set(x, "mediaType", js.undefined)
    
    @scala.inline
    def setPersistentID(value: MediaQueryInfoType | Double): Self = StObject.set(x, "persistentID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersistentIDUndefined: Self = StObject.set(x, "persistentID", js.undefined)
    
    @scala.inline
    def setPlayCount(value: MediaQueryInfoType | Double): Self = StObject.set(x, "playCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayCountUndefined: Self = StObject.set(x, "playCount", js.undefined)
    
    @scala.inline
    def setPodcastPersistentID(value: MediaQueryInfoType | Double): Self = StObject.set(x, "podcastPersistentID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPodcastPersistentIDUndefined: Self = StObject.set(x, "podcastPersistentID", js.undefined)
    
    @scala.inline
    def setPodcastTitle(value: MediaQueryInfoType | String): Self = StObject.set(x, "podcastTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPodcastTitleUndefined: Self = StObject.set(x, "podcastTitle", js.undefined)
    
    @scala.inline
    def setTitle(value: MediaQueryInfoType | String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
