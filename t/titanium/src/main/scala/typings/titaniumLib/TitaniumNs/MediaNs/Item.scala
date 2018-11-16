package typings
package titaniumLib.TitaniumNs.MediaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * A representation of a media item returned by [openMusicLibrary](Titanium.Media.openMusicLibrary) or [queryMusicLibrary](Titanium.Media.queryMusicLibrary).
		 */

trait Item
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  			 * Artist credited for the album containing this item.
  			 */
  val albumArtist: java.lang.String
  /**
  			 * The persistent identifier for an album artist.
  			 */
  val albumArtistPersistentID: scala.Double
  /**
  			 * The key for the persistent identifier for an album.
  			 */
  val albumPersistentID: scala.Double
  /**
  			 * Title of the album containing this item.
  			 */
  val albumTitle: java.lang.String
  /**
  			 * Number of tracks for the album containing this item.
  			 */
  val albumTrackCount: scala.Double
  /**
  			 * Track number for this item.
  			 */
  val albumTrackNumber: scala.Double
  /**
  			 * Artist credited for this item.
  			 */
  val artist: java.lang.String
  /**
  			 * Image for the item's artwork as a `Blob` object,  or `null` if no artwork is
  			 * available.
  			 */
  val artwork: titaniumLib.TitaniumNs.Blob
  /**
  			 * A URL pointing to the media item.
  			 */
  val assetURL: java.lang.String
  /**
  			 * The number of musical beats per minute for the media item, corresponding
  			 * to the "BPM" field in the Info tab in the "Get Info" dialog in iTunes.
  			 */
  val beatsPerMinute: scala.Double
  /**
  			 * The user's place in the media item the most recent time it was played.
  			 */
  val bookmarkTime: java.lang.String
  /**
  			 * Textual information about the media item, corresponding to the "Comments"
  			 * field in in the Info tab in the Get Info dialog in iTunes.
  			 */
  val comments: java.lang.String
  /**
  			 * Composer of this item.
  			 */
  val composer: java.lang.String
  /**
  			 * Date when the item was added to the music library.
  			 */
  val dateAdded: stdLib.Date
  /**
  			 * Total number of discs for the album containing this item.
  			 */
  val discCount: scala.Double
  /**
  			 * Disc number for this item in the album.
  			 */
  val discNumber: scala.Double
  /**
  			 * Genre of this item.
  			 */
  val genre: java.lang.String
  /**
  			 * The persistent identifier for a genre.
  			 */
  val genrePersistentID: scala.Double
  /**
  			 * True if the item represents a protected asset.
  			 */
  val hasProtectedAsset: scala.Boolean
  /**
  			 * True if the media item is an iCloud item.
  			 */
  val isCloudItem: scala.Boolean
  /**
  			 * True if this item is part of a compilation album.
  			 */
  val isCompilation: scala.Boolean
  /**
  			 * True if this item is marked as "Explicit".
  			 */
  val isExplicit: scala.Boolean
  /**
  			 * The most recent calendar date on which the user played the media item.
  			 */
  val lastPlayedDate: stdLib.Date
  /**
  			 * Lyrics for this item.
  			 */
  val lyrics: java.lang.String
  /**
  			 * The type of the media.
  			 */
  val mediaType: scala.Double
  /**
  			 * The key for the persistent identifier for the media item.
  			 */
  val persistentID: java.lang.String
  /**
  			 * Number of times the item has been played.
  			 */
  val playCount: scala.Double
  /**
  			 * Length (in seconds) of this item.
  			 */
  val playbackDuration: scala.Double
  /**
  			 * Used to enqueue store tracks by their ID.
  			 */
  val playbackStoreID: scala.Double
  /**
  			 * The persistent identifier for an audio podcast.
  			 */
  val podcastPersistentID: scala.Double
  /**
  			 * Title of a podcast item.
  			 */
  val podcastTitle: java.lang.String
  /**
  			 * Rating for this item.
  			 */
  val rating: scala.Double
  /**
  			 * Date when this this item was released.
  			 */
  val releaseDate: stdLib.Date
  /**
  			 * Number of times this item has been skipped.
  			 */
  val skipCount: scala.Double
  /**
  			 * Title of this item.
  			 */
  val title: java.lang.String
  /**
  			 * Corresponds to the "Grouping" field in the Info tab in the "Get Info"
  			 * dialog in iTunes.
  			 */
  val userGrouping: java.lang.String
  /**
  			 * Gets the value of the <Titanium.Media.Item.albumArtist> property.
  			 */
  def getAlbumArtist(): java.lang.String
  /**
  			 * Gets the value of the <Titanium.Media.Item.albumArtistPersistentID> property.
  			 */
  def getAlbumArtistPersistentID(): scala.Double
  /**
  			 * Gets the value of the <Titanium.Media.Item.albumPersistentID> property.
  			 */
  def getAlbumPersistentID(): scala.Double
  /**
  			 * Gets the value of the <Titanium.Media.Item.albumTitle> property.
  			 */
  def getAlbumTitle(): java.lang.String
  /**
  			 * Gets the value of the <Titanium.Media.Item.albumTrackCount> property.
  			 */
  def getAlbumTrackCount(): scala.Double
  /**
  			 * Gets the value of the <Titanium.Media.Item.albumTrackNumber> property.
  			 */
  def getAlbumTrackNumber(): scala.Double
  /**
  			 * Gets the value of the <Titanium.Media.Item.artist> property.
  			 */
  def getArtist(): java.lang.String
  /**
  			 * Gets the value of the <Titanium.Media.Item.artwork> property.
  			 */
  def getArtwork(): titaniumLib.TitaniumNs.Blob
  /**
  			 * Gets the value of the <Titanium.Media.Item.assetURL> property.
  			 */
  def getAssetURL(): java.lang.String
  /**
  			 * Gets the value of the <Titanium.Media.Item.beatsPerMinute> property.
  			 */
  def getBeatsPerMinute(): scala.Double
  /**
  			 * Gets the value of the <Titanium.Media.Item.bookmarkTime> property.
  			 */
  def getBookmarkTime(): java.lang.String
  /**
  			 * Gets the value of the <Titanium.Media.Item.comments> property.
  			 */
  def getComments(): java.lang.String
  /**
  			 * Gets the value of the <Titanium.Media.Item.composer> property.
  			 */
  def getComposer(): java.lang.String
  /**
  			 * Gets the value of the <Titanium.Media.Item.dateAdded> property.
  			 */
  def getDateAdded(): stdLib.Date
  /**
  			 * Gets the value of the <Titanium.Media.Item.discCount> property.
  			 */
  def getDiscCount(): scala.Double
  /**
  			 * Gets the value of the <Titanium.Media.Item.discNumber> property.
  			 */
  def getDiscNumber(): scala.Double
  /**
  			 * Gets the value of the <Titanium.Media.Item.genre> property.
  			 */
  def getGenre(): java.lang.String
  /**
  			 * Gets the value of the <Titanium.Media.Item.genrePersistentID> property.
  			 */
  def getGenrePersistentID(): scala.Double
  /**
  			 * Gets the value of the <Titanium.Media.Item.hasProtectedAsset> property.
  			 */
  def getHasProtectedAsset(): scala.Boolean
  /**
  			 * Gets the value of the <Titanium.Media.Item.isCloudItem> property.
  			 */
  def getIsCloudItem(): scala.Boolean
  /**
  			 * Gets the value of the <Titanium.Media.Item.isCompilation> property.
  			 */
  def getIsCompilation(): scala.Boolean
  /**
  			 * Gets the value of the <Titanium.Media.Item.isExplicit> property.
  			 */
  def getIsExplicit(): scala.Boolean
  /**
  			 * Gets the value of the <Titanium.Media.Item.lastPlayedDate> property.
  			 */
  def getLastPlayedDate(): stdLib.Date
  /**
  			 * Gets the value of the <Titanium.Media.Item.lyrics> property.
  			 */
  def getLyrics(): java.lang.String
  /**
  			 * Gets the value of the <Titanium.Media.Item.mediaType> property.
  			 */
  def getMediaType(): scala.Double
  /**
  			 * Gets the value of the <Titanium.Media.Item.persistentID> property.
  			 */
  def getPersistentID(): java.lang.String
  /**
  			 * Gets the value of the <Titanium.Media.Item.playCount> property.
  			 */
  def getPlayCount(): scala.Double
  /**
  			 * Gets the value of the <Titanium.Media.Item.playbackDuration> property.
  			 */
  def getPlaybackDuration(): scala.Double
  /**
  			 * Gets the value of the <Titanium.Media.Item.playbackStoreID> property.
  			 */
  def getPlaybackStoreID(): scala.Double
  /**
  			 * Gets the value of the <Titanium.Media.Item.podcastPersistentID> property.
  			 */
  def getPodcastPersistentID(): scala.Double
  /**
  			 * Gets the value of the <Titanium.Media.Item.podcastTitle> property.
  			 */
  def getPodcastTitle(): java.lang.String
  /**
  			 * Gets the value of the <Titanium.Media.Item.rating> property.
  			 */
  def getRating(): scala.Double
  /**
  			 * Gets the value of the <Titanium.Media.Item.releaseDate> property.
  			 */
  def getReleaseDate(): stdLib.Date
  /**
  			 * Gets the value of the <Titanium.Media.Item.skipCount> property.
  			 */
  def getSkipCount(): scala.Double
  /**
  			 * Gets the value of the <Titanium.Media.Item.title> property.
  			 */
  def getTitle(): java.lang.String
  /**
  			 * Gets the value of the <Titanium.Media.Item.userGrouping> property.
  			 */
  def getUserGrouping(): java.lang.String
}

