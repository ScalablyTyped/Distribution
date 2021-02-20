package typings.titanium.Titanium.Media

import typings.std.Date
import typings.titanium.Titanium.Blob
import typings.titanium.Titanium.Proxy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A representation of a media item returned by [openMusicLibrary](Titanium.Media.openMusicLibrary) or [queryMusicLibrary](Titanium.Media.queryMusicLibrary).
  */
@js.native
trait Item extends Proxy {
  
  /**
    * Artist credited for the album containing this item.
    */
  val albumArtist: String = js.native
  
  /**
    * The persistent identifier for an album artist.
    */
  val albumArtistPersistentID: Double = js.native
  
  /**
    * The key for the persistent identifier for an album.
    */
  val albumPersistentID: Double = js.native
  
  /**
    * Title of the album containing this item.
    */
  val albumTitle: String = js.native
  
  /**
    * Number of tracks for the album containing this item.
    */
  val albumTrackCount: Double = js.native
  
  /**
    * Track number for this item.
    */
  val albumTrackNumber: Double = js.native
  
  /**
    * Artist credited for this item.
    */
  val artist: String = js.native
  
  /**
    * Image for the item's artwork as a `Blob` object,  or `null` if no artwork is
    * available.
    */
  val artwork: Blob = js.native
  
  /**
    * A URL pointing to the media item.
    */
  val assetURL: String = js.native
  
  /**
    * The number of musical beats per minute for the media item, corresponding
    * to the "BPM" field in the Info tab in the "Get Info" dialog in iTunes.
    */
  val beatsPerMinute: Double = js.native
  
  /**
    * The user's place in the media item the most recent time it was played.
    */
  val bookmarkTime: String = js.native
  
  /**
    * Textual information about the media item, corresponding to the "Comments"
    * field in in the Info tab in the Get Info dialog in iTunes.
    */
  val comments: String = js.native
  
  /**
    * Composer of this item.
    */
  val composer: String = js.native
  
  /**
    * Date when the item was added to the music library.
    */
  val dateAdded: Date = js.native
  
  /**
    * Total number of discs for the album containing this item.
    */
  val discCount: Double = js.native
  
  /**
    * Disc number for this item in the album.
    */
  val discNumber: Double = js.native
  
  /**
    * Genre of this item.
    */
  val genre: String = js.native
  
  /**
    * The persistent identifier for a genre.
    */
  val genrePersistentID: Double = js.native
  
  /**
    * Gets the value of the <Titanium.Media.Item.albumArtist> property.
    * @deprecated Access <Titanium.Media.Item.albumArtist> instead.
    */
  def getAlbumArtist(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Media.Item.albumArtistPersistentID> property.
    * @deprecated Access <Titanium.Media.Item.albumArtistPersistentID> instead.
    */
  def getAlbumArtistPersistentID(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.Media.Item.albumPersistentID> property.
    * @deprecated Access <Titanium.Media.Item.albumPersistentID> instead.
    */
  def getAlbumPersistentID(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.Media.Item.albumTitle> property.
    * @deprecated Access <Titanium.Media.Item.albumTitle> instead.
    */
  def getAlbumTitle(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Media.Item.albumTrackCount> property.
    * @deprecated Access <Titanium.Media.Item.albumTrackCount> instead.
    */
  def getAlbumTrackCount(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.Media.Item.albumTrackNumber> property.
    * @deprecated Access <Titanium.Media.Item.albumTrackNumber> instead.
    */
  def getAlbumTrackNumber(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.Media.Item.artist> property.
    * @deprecated Access <Titanium.Media.Item.artist> instead.
    */
  def getArtist(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Media.Item.artwork> property.
    * @deprecated Access <Titanium.Media.Item.artwork> instead.
    */
  def getArtwork(): Blob = js.native
  
  /**
    * Gets the value of the <Titanium.Media.Item.assetURL> property.
    * @deprecated Access <Titanium.Media.Item.assetURL> instead.
    */
  def getAssetURL(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Media.Item.beatsPerMinute> property.
    * @deprecated Access <Titanium.Media.Item.beatsPerMinute> instead.
    */
  def getBeatsPerMinute(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.Media.Item.bookmarkTime> property.
    * @deprecated Access <Titanium.Media.Item.bookmarkTime> instead.
    */
  def getBookmarkTime(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Media.Item.comments> property.
    * @deprecated Access <Titanium.Media.Item.comments> instead.
    */
  def getComments(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Media.Item.composer> property.
    * @deprecated Access <Titanium.Media.Item.composer> instead.
    */
  def getComposer(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Media.Item.dateAdded> property.
    * @deprecated Access <Titanium.Media.Item.dateAdded> instead.
    */
  def getDateAdded(): Date = js.native
  
  /**
    * Gets the value of the <Titanium.Media.Item.discCount> property.
    * @deprecated Access <Titanium.Media.Item.discCount> instead.
    */
  def getDiscCount(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.Media.Item.discNumber> property.
    * @deprecated Access <Titanium.Media.Item.discNumber> instead.
    */
  def getDiscNumber(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.Media.Item.genre> property.
    * @deprecated Access <Titanium.Media.Item.genre> instead.
    */
  def getGenre(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Media.Item.genrePersistentID> property.
    * @deprecated Access <Titanium.Media.Item.genrePersistentID> instead.
    */
  def getGenrePersistentID(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.Media.Item.hasProtectedAsset> property.
    * @deprecated Access <Titanium.Media.Item.hasProtectedAsset> instead.
    */
  def getHasProtectedAsset(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.Media.Item.isCloudItem> property.
    * @deprecated Access <Titanium.Media.Item.isCloudItem> instead.
    */
  def getIsCloudItem(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.Media.Item.isCompilation> property.
    * @deprecated Access <Titanium.Media.Item.isCompilation> instead.
    */
  def getIsCompilation(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.Media.Item.isExplicit> property.
    * @deprecated Access <Titanium.Media.Item.isExplicit> instead.
    */
  def getIsExplicit(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.Media.Item.lastPlayedDate> property.
    * @deprecated Access <Titanium.Media.Item.lastPlayedDate> instead.
    */
  def getLastPlayedDate(): Date = js.native
  
  /**
    * Gets the value of the <Titanium.Media.Item.lyrics> property.
    * @deprecated Access <Titanium.Media.Item.lyrics> instead.
    */
  def getLyrics(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Media.Item.mediaType> property.
    * @deprecated Access <Titanium.Media.Item.mediaType> instead.
    */
  def getMediaType(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.Media.Item.persistentID> property.
    * @deprecated Access <Titanium.Media.Item.persistentID> instead.
    */
  def getPersistentID(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Media.Item.playCount> property.
    * @deprecated Access <Titanium.Media.Item.playCount> instead.
    */
  def getPlayCount(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.Media.Item.playbackDuration> property.
    * @deprecated Access <Titanium.Media.Item.playbackDuration> instead.
    */
  def getPlaybackDuration(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.Media.Item.playbackStoreID> property.
    * @deprecated Access <Titanium.Media.Item.playbackStoreID> instead.
    */
  def getPlaybackStoreID(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.Media.Item.podcastPersistentID> property.
    * @deprecated Access <Titanium.Media.Item.podcastPersistentID> instead.
    */
  def getPodcastPersistentID(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.Media.Item.podcastTitle> property.
    * @deprecated Access <Titanium.Media.Item.podcastTitle> instead.
    */
  def getPodcastTitle(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Media.Item.rating> property.
    * @deprecated Access <Titanium.Media.Item.rating> instead.
    */
  def getRating(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.Media.Item.releaseDate> property.
    * @deprecated Access <Titanium.Media.Item.releaseDate> instead.
    */
  def getReleaseDate(): Date = js.native
  
  /**
    * Gets the value of the <Titanium.Media.Item.skipCount> property.
    * @deprecated Access <Titanium.Media.Item.skipCount> instead.
    */
  def getSkipCount(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.Media.Item.title> property.
    * @deprecated Access <Titanium.Media.Item.title> instead.
    */
  def getTitle(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Media.Item.userGrouping> property.
    * @deprecated Access <Titanium.Media.Item.userGrouping> instead.
    */
  def getUserGrouping(): String = js.native
  
  /**
    * True if the item represents a protected asset.
    */
  val hasProtectedAsset: Boolean = js.native
  
  /**
    * True if the media item is an iCloud item.
    */
  val isCloudItem: Boolean = js.native
  
  /**
    * True if this item is part of a compilation album.
    */
  val isCompilation: Boolean = js.native
  
  /**
    * True if this item is marked as "Explicit".
    */
  val isExplicit: Boolean = js.native
  
  /**
    * The most recent calendar date on which the user played the media item.
    */
  val lastPlayedDate: Date = js.native
  
  /**
    * Lyrics for this item.
    */
  val lyrics: String = js.native
  
  /**
    * The type of the media.
    */
  val mediaType: Double = js.native
  
  /**
    * The key for the persistent identifier for the media item.
    */
  val persistentID: String = js.native
  
  /**
    * Number of times the item has been played.
    */
  val playCount: Double = js.native
  
  /**
    * Length (in seconds) of this item.
    */
  val playbackDuration: Double = js.native
  
  /**
    * Used to enqueue store tracks by their ID.
    */
  val playbackStoreID: Double = js.native
  
  /**
    * The persistent identifier for an audio podcast.
    */
  val podcastPersistentID: Double = js.native
  
  /**
    * Title of a podcast item.
    */
  val podcastTitle: String = js.native
  
  /**
    * Rating for this item.
    */
  val rating: Double = js.native
  
  /**
    * Date when this this item was released.
    */
  val releaseDate: Date = js.native
  
  /**
    * Number of times this item has been skipped.
    */
  val skipCount: Double = js.native
  
  /**
    * Title of this item.
    */
  val title: String = js.native
  
  /**
    * Corresponds to the "Grouping" field in the Info tab in the "Get Info"
    * dialog in iTunes.
    */
  val userGrouping: String = js.native
}
