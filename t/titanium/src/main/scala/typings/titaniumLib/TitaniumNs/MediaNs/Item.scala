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

object Item {
  @scala.inline
  def apply(
    addEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    albumArtist: java.lang.String,
    albumArtistPersistentID: scala.Double,
    albumPersistentID: scala.Double,
    albumTitle: java.lang.String,
    albumTrackCount: scala.Double,
    albumTrackNumber: scala.Double,
    apiName: java.lang.String,
    applyProperties: js.Function1[js.Any, scala.Unit],
    artist: java.lang.String,
    artwork: titaniumLib.TitaniumNs.Blob,
    assetURL: java.lang.String,
    beatsPerMinute: scala.Double,
    bookmarkTime: java.lang.String,
    bubbleParent: scala.Boolean,
    comments: java.lang.String,
    composer: java.lang.String,
    dateAdded: stdLib.Date,
    discCount: scala.Double,
    discNumber: scala.Double,
    fireEvent: js.Function2[java.lang.String, js.Any, scala.Unit],
    genre: java.lang.String,
    genrePersistentID: scala.Double,
    getAlbumArtist: js.Function0[java.lang.String],
    getAlbumArtistPersistentID: js.Function0[scala.Double],
    getAlbumPersistentID: js.Function0[scala.Double],
    getAlbumTitle: js.Function0[java.lang.String],
    getAlbumTrackCount: js.Function0[scala.Double],
    getAlbumTrackNumber: js.Function0[scala.Double],
    getApiName: js.Function0[java.lang.String],
    getArtist: js.Function0[java.lang.String],
    getArtwork: js.Function0[titaniumLib.TitaniumNs.Blob],
    getAssetURL: js.Function0[java.lang.String],
    getBeatsPerMinute: js.Function0[scala.Double],
    getBookmarkTime: js.Function0[java.lang.String],
    getBubbleParent: js.Function0[scala.Boolean],
    getComments: js.Function0[java.lang.String],
    getComposer: js.Function0[java.lang.String],
    getDateAdded: js.Function0[stdLib.Date],
    getDiscCount: js.Function0[scala.Double],
    getDiscNumber: js.Function0[scala.Double],
    getGenre: js.Function0[java.lang.String],
    getGenrePersistentID: js.Function0[scala.Double],
    getHasProtectedAsset: js.Function0[scala.Boolean],
    getIsCloudItem: js.Function0[scala.Boolean],
    getIsCompilation: js.Function0[scala.Boolean],
    getIsExplicit: js.Function0[scala.Boolean],
    getLastPlayedDate: js.Function0[stdLib.Date],
    getLyrics: js.Function0[java.lang.String],
    getMediaType: js.Function0[scala.Double],
    getPersistentID: js.Function0[java.lang.String],
    getPlayCount: js.Function0[scala.Double],
    getPlaybackDuration: js.Function0[scala.Double],
    getPlaybackStoreID: js.Function0[scala.Double],
    getPodcastPersistentID: js.Function0[scala.Double],
    getPodcastTitle: js.Function0[java.lang.String],
    getRating: js.Function0[scala.Double],
    getReleaseDate: js.Function0[stdLib.Date],
    getSkipCount: js.Function0[scala.Double],
    getTitle: js.Function0[java.lang.String],
    getUserGrouping: js.Function0[java.lang.String],
    hasProtectedAsset: scala.Boolean,
    isCloudItem: scala.Boolean,
    isCompilation: scala.Boolean,
    isExplicit: scala.Boolean,
    lastPlayedDate: stdLib.Date,
    lyrics: java.lang.String,
    mediaType: scala.Double,
    persistentID: java.lang.String,
    playCount: scala.Double,
    playbackDuration: scala.Double,
    playbackStoreID: scala.Double,
    podcastPersistentID: scala.Double,
    podcastTitle: java.lang.String,
    rating: scala.Double,
    releaseDate: stdLib.Date,
    removeEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    setBubbleParent: js.Function1[scala.Boolean, scala.Unit],
    skipCount: scala.Double,
    title: java.lang.String,
    userGrouping: java.lang.String,
    getLifecycleContainer: js.Function0[titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup] = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null
  ): Item = {
    val __obj = js.Dynamic.literal(addEventListener = addEventListener, albumArtist = albumArtist, albumArtistPersistentID = albumArtistPersistentID, albumPersistentID = albumPersistentID, albumTitle = albumTitle, albumTrackCount = albumTrackCount, albumTrackNumber = albumTrackNumber, apiName = apiName, applyProperties = applyProperties, artist = artist, artwork = artwork, assetURL = assetURL, beatsPerMinute = beatsPerMinute, bookmarkTime = bookmarkTime, bubbleParent = bubbleParent, comments = comments, composer = composer, dateAdded = dateAdded, discCount = discCount, discNumber = discNumber, fireEvent = fireEvent, genre = genre, genrePersistentID = genrePersistentID, getAlbumArtist = getAlbumArtist, getAlbumArtistPersistentID = getAlbumArtistPersistentID, getAlbumPersistentID = getAlbumPersistentID, getAlbumTitle = getAlbumTitle, getAlbumTrackCount = getAlbumTrackCount, getAlbumTrackNumber = getAlbumTrackNumber, getApiName = getApiName, getArtist = getArtist, getArtwork = getArtwork, getAssetURL = getAssetURL, getBeatsPerMinute = getBeatsPerMinute, getBookmarkTime = getBookmarkTime, getBubbleParent = getBubbleParent, getComments = getComments, getComposer = getComposer, getDateAdded = getDateAdded, getDiscCount = getDiscCount, getDiscNumber = getDiscNumber, getGenre = getGenre, getGenrePersistentID = getGenrePersistentID, getHasProtectedAsset = getHasProtectedAsset, getIsCloudItem = getIsCloudItem, getIsCompilation = getIsCompilation, getIsExplicit = getIsExplicit, getLastPlayedDate = getLastPlayedDate, getLyrics = getLyrics, getMediaType = getMediaType, getPersistentID = getPersistentID, getPlayCount = getPlayCount, getPlaybackDuration = getPlaybackDuration, getPlaybackStoreID = getPlaybackStoreID, getPodcastPersistentID = getPodcastPersistentID, getPodcastTitle = getPodcastTitle, getRating = getRating, getReleaseDate = getReleaseDate, getSkipCount = getSkipCount, getTitle = getTitle, getUserGrouping = getUserGrouping, hasProtectedAsset = hasProtectedAsset, isCloudItem = isCloudItem, isCompilation = isCompilation, isExplicit = isExplicit, lastPlayedDate = lastPlayedDate, lyrics = lyrics, mediaType = mediaType, persistentID = persistentID, playCount = playCount, playbackDuration = playbackDuration, playbackStoreID = playbackStoreID, podcastPersistentID = podcastPersistentID, podcastTitle = podcastTitle, rating = rating, releaseDate = releaseDate, removeEventListener = removeEventListener, setBubbleParent = setBubbleParent, skipCount = skipCount, title = title, userGrouping = userGrouping)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(getLifecycleContainer)
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[Item]
  }
}

