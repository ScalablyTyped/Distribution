package typings.titanium.Titanium.Media

import typings.std.Date
import typings.titanium.Titanium.Blob
import typings.titanium.Titanium.Proxy
import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * A representation of a media item returned by [openMusicLibrary](Titanium.Media.openMusicLibrary) or [queryMusicLibrary](Titanium.Media.queryMusicLibrary).
		 */
trait Item extends Proxy {
  /**
  			 * Artist credited for the album containing this item.
  			 */
  val albumArtist: String
  /**
  			 * The persistent identifier for an album artist.
  			 */
  val albumArtistPersistentID: Double
  /**
  			 * The key for the persistent identifier for an album.
  			 */
  val albumPersistentID: Double
  /**
  			 * Title of the album containing this item.
  			 */
  val albumTitle: String
  /**
  			 * Number of tracks for the album containing this item.
  			 */
  val albumTrackCount: Double
  /**
  			 * Track number for this item.
  			 */
  val albumTrackNumber: Double
  /**
  			 * Artist credited for this item.
  			 */
  val artist: String
  /**
  			 * Image for the item's artwork as a `Blob` object,  or `null` if no artwork is
  			 * available.
  			 */
  val artwork: Blob
  /**
  			 * A URL pointing to the media item.
  			 */
  val assetURL: String
  /**
  			 * The number of musical beats per minute for the media item, corresponding
  			 * to the "BPM" field in the Info tab in the "Get Info" dialog in iTunes.
  			 */
  val beatsPerMinute: Double
  /**
  			 * The user's place in the media item the most recent time it was played.
  			 */
  val bookmarkTime: String
  /**
  			 * Textual information about the media item, corresponding to the "Comments"
  			 * field in in the Info tab in the Get Info dialog in iTunes.
  			 */
  val comments: String
  /**
  			 * Composer of this item.
  			 */
  val composer: String
  /**
  			 * Date when the item was added to the music library.
  			 */
  val dateAdded: Date
  /**
  			 * Total number of discs for the album containing this item.
  			 */
  val discCount: Double
  /**
  			 * Disc number for this item in the album.
  			 */
  val discNumber: Double
  /**
  			 * Genre of this item.
  			 */
  val genre: String
  /**
  			 * The persistent identifier for a genre.
  			 */
  val genrePersistentID: Double
  /**
  			 * True if the item represents a protected asset.
  			 */
  val hasProtectedAsset: Boolean
  /**
  			 * True if the media item is an iCloud item.
  			 */
  val isCloudItem: Boolean
  /**
  			 * True if this item is part of a compilation album.
  			 */
  val isCompilation: Boolean
  /**
  			 * True if this item is marked as "Explicit".
  			 */
  val isExplicit: Boolean
  /**
  			 * The most recent calendar date on which the user played the media item.
  			 */
  val lastPlayedDate: Date
  /**
  			 * Lyrics for this item.
  			 */
  val lyrics: String
  /**
  			 * The type of the media.
  			 */
  val mediaType: Double
  /**
  			 * The key for the persistent identifier for the media item.
  			 */
  val persistentID: String
  /**
  			 * Number of times the item has been played.
  			 */
  val playCount: Double
  /**
  			 * Length (in seconds) of this item.
  			 */
  val playbackDuration: Double
  /**
  			 * Used to enqueue store tracks by their ID.
  			 */
  val playbackStoreID: Double
  /**
  			 * The persistent identifier for an audio podcast.
  			 */
  val podcastPersistentID: Double
  /**
  			 * Title of a podcast item.
  			 */
  val podcastTitle: String
  /**
  			 * Rating for this item.
  			 */
  val rating: Double
  /**
  			 * Date when this this item was released.
  			 */
  val releaseDate: Date
  /**
  			 * Number of times this item has been skipped.
  			 */
  val skipCount: Double
  /**
  			 * Title of this item.
  			 */
  val title: String
  /**
  			 * Corresponds to the "Grouping" field in the Info tab in the "Get Info"
  			 * dialog in iTunes.
  			 */
  val userGrouping: String
  /**
  			 * Gets the value of the <Titanium.Media.Item.albumArtist> property.
  			 */
  def getAlbumArtist(): String
  /**
  			 * Gets the value of the <Titanium.Media.Item.albumArtistPersistentID> property.
  			 */
  def getAlbumArtistPersistentID(): Double
  /**
  			 * Gets the value of the <Titanium.Media.Item.albumPersistentID> property.
  			 */
  def getAlbumPersistentID(): Double
  /**
  			 * Gets the value of the <Titanium.Media.Item.albumTitle> property.
  			 */
  def getAlbumTitle(): String
  /**
  			 * Gets the value of the <Titanium.Media.Item.albumTrackCount> property.
  			 */
  def getAlbumTrackCount(): Double
  /**
  			 * Gets the value of the <Titanium.Media.Item.albumTrackNumber> property.
  			 */
  def getAlbumTrackNumber(): Double
  /**
  			 * Gets the value of the <Titanium.Media.Item.artist> property.
  			 */
  def getArtist(): String
  /**
  			 * Gets the value of the <Titanium.Media.Item.artwork> property.
  			 */
  def getArtwork(): Blob
  /**
  			 * Gets the value of the <Titanium.Media.Item.assetURL> property.
  			 */
  def getAssetURL(): String
  /**
  			 * Gets the value of the <Titanium.Media.Item.beatsPerMinute> property.
  			 */
  def getBeatsPerMinute(): Double
  /**
  			 * Gets the value of the <Titanium.Media.Item.bookmarkTime> property.
  			 */
  def getBookmarkTime(): String
  /**
  			 * Gets the value of the <Titanium.Media.Item.comments> property.
  			 */
  def getComments(): String
  /**
  			 * Gets the value of the <Titanium.Media.Item.composer> property.
  			 */
  def getComposer(): String
  /**
  			 * Gets the value of the <Titanium.Media.Item.dateAdded> property.
  			 */
  def getDateAdded(): Date
  /**
  			 * Gets the value of the <Titanium.Media.Item.discCount> property.
  			 */
  def getDiscCount(): Double
  /**
  			 * Gets the value of the <Titanium.Media.Item.discNumber> property.
  			 */
  def getDiscNumber(): Double
  /**
  			 * Gets the value of the <Titanium.Media.Item.genre> property.
  			 */
  def getGenre(): String
  /**
  			 * Gets the value of the <Titanium.Media.Item.genrePersistentID> property.
  			 */
  def getGenrePersistentID(): Double
  /**
  			 * Gets the value of the <Titanium.Media.Item.hasProtectedAsset> property.
  			 */
  def getHasProtectedAsset(): Boolean
  /**
  			 * Gets the value of the <Titanium.Media.Item.isCloudItem> property.
  			 */
  def getIsCloudItem(): Boolean
  /**
  			 * Gets the value of the <Titanium.Media.Item.isCompilation> property.
  			 */
  def getIsCompilation(): Boolean
  /**
  			 * Gets the value of the <Titanium.Media.Item.isExplicit> property.
  			 */
  def getIsExplicit(): Boolean
  /**
  			 * Gets the value of the <Titanium.Media.Item.lastPlayedDate> property.
  			 */
  def getLastPlayedDate(): Date
  /**
  			 * Gets the value of the <Titanium.Media.Item.lyrics> property.
  			 */
  def getLyrics(): String
  /**
  			 * Gets the value of the <Titanium.Media.Item.mediaType> property.
  			 */
  def getMediaType(): Double
  /**
  			 * Gets the value of the <Titanium.Media.Item.persistentID> property.
  			 */
  def getPersistentID(): String
  /**
  			 * Gets the value of the <Titanium.Media.Item.playCount> property.
  			 */
  def getPlayCount(): Double
  /**
  			 * Gets the value of the <Titanium.Media.Item.playbackDuration> property.
  			 */
  def getPlaybackDuration(): Double
  /**
  			 * Gets the value of the <Titanium.Media.Item.playbackStoreID> property.
  			 */
  def getPlaybackStoreID(): Double
  /**
  			 * Gets the value of the <Titanium.Media.Item.podcastPersistentID> property.
  			 */
  def getPodcastPersistentID(): Double
  /**
  			 * Gets the value of the <Titanium.Media.Item.podcastTitle> property.
  			 */
  def getPodcastTitle(): String
  /**
  			 * Gets the value of the <Titanium.Media.Item.rating> property.
  			 */
  def getRating(): Double
  /**
  			 * Gets the value of the <Titanium.Media.Item.releaseDate> property.
  			 */
  def getReleaseDate(): Date
  /**
  			 * Gets the value of the <Titanium.Media.Item.skipCount> property.
  			 */
  def getSkipCount(): Double
  /**
  			 * Gets the value of the <Titanium.Media.Item.title> property.
  			 */
  def getTitle(): String
  /**
  			 * Gets the value of the <Titanium.Media.Item.userGrouping> property.
  			 */
  def getUserGrouping(): String
}

object Item {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    albumArtist: String,
    albumArtistPersistentID: Double,
    albumPersistentID: Double,
    albumTitle: String,
    albumTrackCount: Double,
    albumTrackNumber: Double,
    apiName: String,
    applyProperties: js.Any => Unit,
    artist: String,
    artwork: Blob,
    assetURL: String,
    beatsPerMinute: Double,
    bookmarkTime: String,
    bubbleParent: Boolean,
    comments: String,
    composer: String,
    dateAdded: Date,
    discCount: Double,
    discNumber: Double,
    fireEvent: (String, js.Any) => Unit,
    genre: String,
    genrePersistentID: Double,
    getAlbumArtist: () => String,
    getAlbumArtistPersistentID: () => Double,
    getAlbumPersistentID: () => Double,
    getAlbumTitle: () => String,
    getAlbumTrackCount: () => Double,
    getAlbumTrackNumber: () => Double,
    getApiName: () => String,
    getArtist: () => String,
    getArtwork: () => Blob,
    getAssetURL: () => String,
    getBeatsPerMinute: () => Double,
    getBookmarkTime: () => String,
    getBubbleParent: () => Boolean,
    getComments: () => String,
    getComposer: () => String,
    getDateAdded: () => Date,
    getDiscCount: () => Double,
    getDiscNumber: () => Double,
    getGenre: () => String,
    getGenrePersistentID: () => Double,
    getHasProtectedAsset: () => Boolean,
    getIsCloudItem: () => Boolean,
    getIsCompilation: () => Boolean,
    getIsExplicit: () => Boolean,
    getLastPlayedDate: () => Date,
    getLyrics: () => String,
    getMediaType: () => Double,
    getPersistentID: () => String,
    getPlayCount: () => Double,
    getPlaybackDuration: () => Double,
    getPlaybackStoreID: () => Double,
    getPodcastPersistentID: () => Double,
    getPodcastTitle: () => String,
    getRating: () => Double,
    getReleaseDate: () => Date,
    getSkipCount: () => Double,
    getTitle: () => String,
    getUserGrouping: () => String,
    hasProtectedAsset: Boolean,
    isCloudItem: Boolean,
    isCompilation: Boolean,
    isExplicit: Boolean,
    lastPlayedDate: Date,
    lyrics: String,
    mediaType: Double,
    persistentID: String,
    playCount: Double,
    playbackDuration: Double,
    playbackStoreID: Double,
    podcastPersistentID: Double,
    podcastTitle: String,
    rating: Double,
    releaseDate: Date,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    setBubbleParent: Boolean => Unit,
    skipCount: Double,
    title: String,
    userGrouping: String,
    getLifecycleContainer: () => Window | TabGroup = null,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): Item = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), albumArtist = albumArtist.asInstanceOf[js.Any], albumArtistPersistentID = albumArtistPersistentID.asInstanceOf[js.Any], albumPersistentID = albumPersistentID.asInstanceOf[js.Any], albumTitle = albumTitle.asInstanceOf[js.Any], albumTrackCount = albumTrackCount.asInstanceOf[js.Any], albumTrackNumber = albumTrackNumber.asInstanceOf[js.Any], apiName = apiName.asInstanceOf[js.Any], applyProperties = js.Any.fromFunction1(applyProperties), artist = artist.asInstanceOf[js.Any], artwork = artwork.asInstanceOf[js.Any], assetURL = assetURL.asInstanceOf[js.Any], beatsPerMinute = beatsPerMinute.asInstanceOf[js.Any], bookmarkTime = bookmarkTime.asInstanceOf[js.Any], bubbleParent = bubbleParent.asInstanceOf[js.Any], comments = comments.asInstanceOf[js.Any], composer = composer.asInstanceOf[js.Any], dateAdded = dateAdded.asInstanceOf[js.Any], discCount = discCount.asInstanceOf[js.Any], discNumber = discNumber.asInstanceOf[js.Any], fireEvent = js.Any.fromFunction2(fireEvent), genre = genre.asInstanceOf[js.Any], genrePersistentID = genrePersistentID.asInstanceOf[js.Any], getAlbumArtist = js.Any.fromFunction0(getAlbumArtist), getAlbumArtistPersistentID = js.Any.fromFunction0(getAlbumArtistPersistentID), getAlbumPersistentID = js.Any.fromFunction0(getAlbumPersistentID), getAlbumTitle = js.Any.fromFunction0(getAlbumTitle), getAlbumTrackCount = js.Any.fromFunction0(getAlbumTrackCount), getAlbumTrackNumber = js.Any.fromFunction0(getAlbumTrackNumber), getApiName = js.Any.fromFunction0(getApiName), getArtist = js.Any.fromFunction0(getArtist), getArtwork = js.Any.fromFunction0(getArtwork), getAssetURL = js.Any.fromFunction0(getAssetURL), getBeatsPerMinute = js.Any.fromFunction0(getBeatsPerMinute), getBookmarkTime = js.Any.fromFunction0(getBookmarkTime), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getComments = js.Any.fromFunction0(getComments), getComposer = js.Any.fromFunction0(getComposer), getDateAdded = js.Any.fromFunction0(getDateAdded), getDiscCount = js.Any.fromFunction0(getDiscCount), getDiscNumber = js.Any.fromFunction0(getDiscNumber), getGenre = js.Any.fromFunction0(getGenre), getGenrePersistentID = js.Any.fromFunction0(getGenrePersistentID), getHasProtectedAsset = js.Any.fromFunction0(getHasProtectedAsset), getIsCloudItem = js.Any.fromFunction0(getIsCloudItem), getIsCompilation = js.Any.fromFunction0(getIsCompilation), getIsExplicit = js.Any.fromFunction0(getIsExplicit), getLastPlayedDate = js.Any.fromFunction0(getLastPlayedDate), getLyrics = js.Any.fromFunction0(getLyrics), getMediaType = js.Any.fromFunction0(getMediaType), getPersistentID = js.Any.fromFunction0(getPersistentID), getPlayCount = js.Any.fromFunction0(getPlayCount), getPlaybackDuration = js.Any.fromFunction0(getPlaybackDuration), getPlaybackStoreID = js.Any.fromFunction0(getPlaybackStoreID), getPodcastPersistentID = js.Any.fromFunction0(getPodcastPersistentID), getPodcastTitle = js.Any.fromFunction0(getPodcastTitle), getRating = js.Any.fromFunction0(getRating), getReleaseDate = js.Any.fromFunction0(getReleaseDate), getSkipCount = js.Any.fromFunction0(getSkipCount), getTitle = js.Any.fromFunction0(getTitle), getUserGrouping = js.Any.fromFunction0(getUserGrouping), hasProtectedAsset = hasProtectedAsset.asInstanceOf[js.Any], isCloudItem = isCloudItem.asInstanceOf[js.Any], isCompilation = isCompilation.asInstanceOf[js.Any], isExplicit = isExplicit.asInstanceOf[js.Any], lastPlayedDate = lastPlayedDate.asInstanceOf[js.Any], lyrics = lyrics.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], persistentID = persistentID.asInstanceOf[js.Any], playCount = playCount.asInstanceOf[js.Any], playbackDuration = playbackDuration.asInstanceOf[js.Any], playbackStoreID = playbackStoreID.asInstanceOf[js.Any], podcastPersistentID = podcastPersistentID.asInstanceOf[js.Any], podcastTitle = podcastTitle.asInstanceOf[js.Any], rating = rating.asInstanceOf[js.Any], releaseDate = releaseDate.asInstanceOf[js.Any], removeEventListener = js.Any.fromFunction2(removeEventListener), setBubbleParent = js.Any.fromFunction1(setBubbleParent), skipCount = skipCount.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], userGrouping = userGrouping.asInstanceOf[js.Any])
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Item]
  }
}

