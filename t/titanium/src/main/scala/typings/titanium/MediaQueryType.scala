package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A specifier for a media library query. By default, filters perform an exact match.
  */
@js.native
trait MediaQueryType extends js.Object {
  
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
  implicit class MediaQueryTypeOps[Self <: MediaQueryType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAlbumArtist(value: MediaQueryInfoType | String): Self = this.set("albumArtist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlbumArtist: Self = this.set("albumArtist", js.undefined)
    
    @scala.inline
    def setAlbumArtistPersistentID(value: MediaQueryInfoType | Double): Self = this.set("albumArtistPersistentID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlbumArtistPersistentID: Self = this.set("albumArtistPersistentID", js.undefined)
    
    @scala.inline
    def setAlbumPersistentID(value: MediaQueryInfoType | Double): Self = this.set("albumPersistentID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlbumPersistentID: Self = this.set("albumPersistentID", js.undefined)
    
    @scala.inline
    def setAlbumTitle(value: MediaQueryInfoType | String): Self = this.set("albumTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlbumTitle: Self = this.set("albumTitle", js.undefined)
    
    @scala.inline
    def setArtist(value: MediaQueryInfoType | String): Self = this.set("artist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArtist: Self = this.set("artist", js.undefined)
    
    @scala.inline
    def setComposer(value: MediaQueryInfoType | String): Self = this.set("composer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComposer: Self = this.set("composer", js.undefined)
    
    @scala.inline
    def setComposerPersistentID(value: MediaQueryInfoType | Double): Self = this.set("composerPersistentID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComposerPersistentID: Self = this.set("composerPersistentID", js.undefined)
    
    @scala.inline
    def setGenre(value: MediaQueryInfoType | String): Self = this.set("genre", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGenre: Self = this.set("genre", js.undefined)
    
    @scala.inline
    def setGenrePersistentID(value: MediaQueryInfoType | Double): Self = this.set("genrePersistentID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGenrePersistentID: Self = this.set("genrePersistentID", js.undefined)
    
    @scala.inline
    def setGrouping(value: Double): Self = this.set("grouping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrouping: Self = this.set("grouping", js.undefined)
    
    @scala.inline
    def setHasProtectedAsset(value: MediaQueryInfoType | Boolean): Self = this.set("hasProtectedAsset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasProtectedAsset: Self = this.set("hasProtectedAsset", js.undefined)
    
    @scala.inline
    def setIsCloudItem(value: MediaQueryInfoType | Boolean): Self = this.set("isCloudItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsCloudItem: Self = this.set("isCloudItem", js.undefined)
    
    @scala.inline
    def setIsCompilation(value: MediaQueryInfoType | Boolean): Self = this.set("isCompilation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsCompilation: Self = this.set("isCompilation", js.undefined)
    
    @scala.inline
    def setMediaType(value: MediaQueryInfoType | Double): Self = this.set("mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMediaType: Self = this.set("mediaType", js.undefined)
    
    @scala.inline
    def setPersistentID(value: MediaQueryInfoType | Double): Self = this.set("persistentID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePersistentID: Self = this.set("persistentID", js.undefined)
    
    @scala.inline
    def setPlayCount(value: MediaQueryInfoType | Double): Self = this.set("playCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlayCount: Self = this.set("playCount", js.undefined)
    
    @scala.inline
    def setPodcastPersistentID(value: MediaQueryInfoType | Double): Self = this.set("podcastPersistentID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePodcastPersistentID: Self = this.set("podcastPersistentID", js.undefined)
    
    @scala.inline
    def setPodcastTitle(value: MediaQueryInfoType | String): Self = this.set("podcastTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePodcastTitle: Self = this.set("podcastTitle", js.undefined)
    
    @scala.inline
    def setTitle(value: MediaQueryInfoType | String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
