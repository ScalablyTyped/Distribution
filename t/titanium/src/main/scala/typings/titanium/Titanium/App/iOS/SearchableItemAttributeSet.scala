package typings.titanium.Titanium.App.iOS

import typings.titanium.Titanium.Blob
import typings.titanium.Titanium.Proxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The SearchableItemAttributeSet module defines metadata properties for SearchItem and UserActivity objects.
  */
@js.native
trait SearchableItemAttributeSet extends Proxy {
  /**
    * The date that the item was moved into the current location.
    */
  var addedDate: String = js.native
  /**
    * The title for a collection of media.
    */
  var album: String = js.native
  /**
    * An array of localized strings of alternate display names for this item.
    */
  var alternateNames: js.Array[String] = js.native
  /**
    * The artist for the media.
    */
  var artist: String = js.native
  /**
    * A class of entity for whom the resource is intended or useful.
    */
  var audiences: js.Array[String] = js.native
  /**
    * The audio bit rate.
    */
  var audioBitRate: Double = js.native
  /**
    * The number of channels in the audio data contained in the file.
    */
  var audioChannelCount: Double = js.native
  /**
    * The name of the application that encoded the data contained in the audio file.
    */
  var audioEncodingApplication: String = js.native
  /**
    * The sample rate of the audio data contained in the file.
    */
  var audioSampleRate: Double = js.native
  /**
    * The track number of a song/composition when it is part of an album.
    */
  var audioTrackNumber: Double = js.native
  /**
    * The codecs used to encode/decode the media.
    */
  var codecs: js.Array[String] = js.native
  /**
    * Comment related to a file.
    */
  var comment: String = js.native
  /**
    * The composer of the song/composition contained in the audio file.
    */
  var composer: String = js.native
  /**
    * A list of contacts that are somehow associated with this document beyond what is captured as Author.
    */
  var contactKeywords: js.Array[String] = js.native
  /**
    * Display of the search container
    */
  var containerDisplayName: String = js.native
  /**
    * Identifier for the search container
    */
  var containerIdentifier: String = js.native
  /**
    * Order the search container is displayed.
    */
  var containerOrder: Double = js.native
  /**
    * Title displayed in the search container
    */
  var containerTitle: String = js.native
  /**
    * The date that the contents of the item were created.
    */
  var contentCreationDate: String = js.native
  /**
    * An account of the content of the resource.
    */
  var contentDescription: String = js.native
  /**
    * The date that the contents of the item were last modified.
    */
  var contentModificationDate: String = js.native
  /**
    * Whether or not the item has explicit content. Set to `1` for explicit or `0` for clean.
    */
  var contentRating: Double = js.native
  /**
    * Used to indicate where the item was obtained from.
    */
  var contentSources: js.Array[String] = js.native
  /**
    * UTI Type pedigree for an item.
    */
  var contentType: String = js.native
  /**
    * Array of strings related to the content tree of the item.
    */
  var contentTypeTree: js.Array[String] = js.native
  /**
    * File URL representing the content to be indexed.
    */
  var contentURL: String = js.native
  /**
    * Used to designate the entity responsible for making contributions to the content of the resource.
    */
  var contributors: js.Array[String] = js.native
  /**
    * Copyright of the content.
    */
  var copyright: String = js.native
  /**
    * Used to designate the extent or scope of the content of the resource.
    */
  var coverage: js.Array[String] = js.native
  /**
    * Application used to create the document content (e.g. "Word","Framemaker", etc.).
    */
  var creator: String = js.native
  /**
    * The delivery type of the item.  Set to `0` for fast start and `1` for RTSP.
    */
  var deliveryType: Double = js.native
  /**
    * Director of the item, for example, the movie director.
    */
  var director: String = js.native
  /**
    * A localized string to be displayed in the UI for this item.
    */
  var displayName: String = js.native
  /**
    * The date that the file was last downloaded / received.
    */
  var downloadedDate: String = js.native
  /**
    * Duration in seconds of the content of the item (if appropriate).
    */
  var duration: Double = js.native
  /**
    * The list of editor/editors that have worked on this item.
    */
  var editors: js.Array[String] = js.native
  /**
    * Software used to convert the original content into a PDF stream.
    */
  var encodingApplications: js.Array[String] = js.native
  /**
    * Size of the document in MB.
    */
  var fileSize: Double = js.native
  /**
    * Array of font names used in the item.
    */
  var fontNames: js.Array[String] = js.native
  /**
    * The fully formatted address of the item (obtained from MapKit).
    */
  var fullyFormattedAddress: String = js.native
  /**
    * Used to indicates whether the MIDI sequence contained in the file is setup for use with a General MIDI device.
    */
  var generalMIDISequence: Double = js.native
  /**
    * Genre of the item, for example, movie genre.
    */
  var genre: String = js.native
  /**
    * Used to reference to the resource within a given context.
    */
  var identifier: String = js.native
  /**
    * Information about the item.
    */
  var information: String = js.native
  /**
    * Content type of the attribute set.
    */
  var itemContentType: String = js.native
  /**
    * The musical key of the song/composition contained in an audio file.
    */
  var keySignature: String = js.native
  /**
    * Represents keywords associated with this particular item. Example keywords might be Birthday etc.
    */
  var keywords: js.Array[String] = js.native
  /**
    * Kind that the item represents.
    */
  var kind: String = js.native
  /**
    * Used to designate the languages of the intellectual content of the resource.
    */
  var languages: js.Array[String] = js.native
  /**
    * The date that the item was last used.
    */
  var lastUsedDate: String = js.native
  /**
    * Whether or not the item is local. Set to `1` if true and `0` otherwise.
    */
  var local: Double = js.native
  /**
    * The lyricist/text writer for song/composition contained in the audio file.
    */
  var lyricist: String = js.native
  /**
    * Media types present in the content.
    */
  var mediaTypes: js.Array[String] = js.native
  /**
    * The date that the last metadata attribute was changed.
    */
  var metadataModificationDate: String = js.native
  /**
    * The musical genre of the song/composition contained in the audio file.
    */
  var musicalGenre: String = js.native
  /**
    * Metadata attribute that stores the category of instrument.
    */
  var musicalInstrumentCategory: String = js.native
  /**
    * Metadata attribute that stores the name of instrument.
    */
  var musicalInstrumentName: String = js.native
  /**
    * Used to indicate company/Organization that created the document.
    */
  var organizations: js.Array[String] = js.native
  /**
    * Original format of the movie.
    */
  var originalFormat: String = js.native
  /**
    * Original source of the movie.
    */
  var originalSource: String = js.native
  /**
    * Number of pages in the item.
    */
  var pageCount: Double = js.native
  /**
    * Height in points (72 points per inch) of the document page.
    */
  var pageHeight: Double = js.native
  /**
    * Width in points (72 points per inch) of the document page.
    */
  var pageWidth: Double = js.native
  /**
    * The list of people who are visible in an image or movie or written about in a document.
    */
  var participants: js.Array[String] = js.native
  /**
    * The complete path to the item.
    */
  var path: String = js.native
  /**
    * Performers in the movie.
    */
  var performers: js.Array[String] = js.native
  /**
    * User play count of this item.
    */
  var playCount: Double = js.native
  /**
    * The postal code for the item according to guidelines established by the provider.
    */
  var postalCode: String = js.native
  /**
    * Producer of the content.
    */
  var producer: String = js.native
  /**
    * The list of projects that this item is part of.
    */
  var projects: js.Array[String] = js.native
  /**
    * Used to designate the entity responsible for making the resource available.
    */
  var publishers: js.Array[String] = js.native
  /**
    * User rating of this item out of 5 stars.
    */
  var rating: Double = js.native
  /**
    * A description of the rating, for example, the number of reviewers.
    */
  var ratingDescription: String = js.native
  /**
    * The recording date of the song/composition.
    */
  var recordingDate: String = js.native
  /**
    * For activities this is the unique identifier for the item this activity is related to.
    */
  var relatedUniqueIdentifier: String = js.native
  /**
    * Used to provide a link to information about rights held in and over resource.
    */
  var rights: js.Array[String] = js.native
  /**
    * Used to indicate the role of the document creator.
    */
  var role: String = js.native
  /**
    * Security (encryption) method used in the file.
    */
  var securityMethod: String = js.native
  /**
    * Whether the content is prepared for streaming.  Set to `0` for not streamable and `1` for streamable.
    */
  var streamable: Double = js.native
  /**
    * The sub-location (e.g., street number) for the item according to guidelines established by the provider.
    */
  var subThoroughfare: String = js.native
  /**
    * Subject of the the item.
    */
  var subject: String = js.native
  /**
    * Used to determine if navigation is supported.
    */
  var supportsNavigation: Double = js.native
  /**
    * Used to indicate that using the phone number is appropriate.
    */
  var supportsPhoneCall: Double = js.native
  /**
    * The tempo of the music contained in the audio file in Beats Per Minute.
    */
  var tempo: Double = js.native
  /**
    * Theme of the the item.
    */
  var theme: String = js.native
  /**
    * The location (e.g., street name) for the item according to guidelines established by the provider.
    */
  var thoroughfare: String = js.native
  /**
    * Image data for thumbnail for this item.
    */
  var thumbnailData: String | Blob = js.native
  /**
    * File URL pointing to a thumbnail image for this item.
    */
  var thumbnailURL: String = js.native
  /**
    * The time signature of the musical composition contained in the audio/MIDI file.
    */
  var timeSignature: String = js.native
  /**
    * The title of the particular item.
    */
  var title: String = js.native
  /**
    * The total bit rate (audio and video combined) of the media.
    */
  var totalBitRate: Double = js.native
  /**
    * URL of the item.
    */
  var url: String = js.native
  /**
    * A version specifier for this item.
    */
  var version: String = js.native
  /**
    * The video bit rate.
    */
  var videoBitRate: Double = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.addedDate> property.
    * @deprecated Access <Titanium.App.iOS.SearchableItemAttributeSet.addedDate> instead.
    */
  def getAddedDate(): String = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.album> property.
    * @deprecated Access <Titanium.App.iOS.SearchableItemAttributeSet.album> instead.
    */
  def getAlbum(): String = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.alternateNames> property.
    * @deprecated Access <Titanium.App.iOS.SearchableItemAttributeSet.alternateNames> instead.
    */
  def getAlternateNames(): js.Array[String] = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.artist> property.
    * @deprecated Access <Titanium.App.iOS.SearchableItemAttributeSet.artist> instead.
    */
  def getArtist(): String = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.audiences> property.
    * @deprecated Access <Titanium.App.iOS.SearchableItemAttributeSet.audiences> instead.
    */
  def getAudiences(): js.Array[String] = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.audioBitRate> property.
    * @deprecated Access <Titanium.App.iOS.SearchableItemAttributeSet.audioBitRate> instead.
    */
  def getAudioBitRate(): Double = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.audioChannelCount> property.
    * @deprecated Access <Titanium.App.iOS.SearchableItemAttributeSet.audioChannelCount> instead.
    */
  def getAudioChannelCount(): Double = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.audioEncodingApplication> property.
    * @deprecated Access <Titanium.App.iOS.SearchableItemAttributeSet.audioEncodingApplication> instead.
    */
  def getAudioEncodingApplication(): String = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.audioSampleRate> property.
    * @deprecated Access <Titanium.App.iOS.SearchableItemAttributeSet.audioSampleRate> instead.
    */
  def getAudioSampleRate(): Double = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.audioTrackNumber> property.
    * @deprecated Access <Titanium.App.iOS.SearchableItemAttributeSet.audioTrackNumber> instead.
    */
  def getAudioTrackNumber(): Double = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.codecs> property.
    * @deprecated Access <Titanium.App.iOS.SearchableItemAttributeSet.codecs> instead.
    */
  def getCodecs(): js.Array[String] = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.comment> property.
    * @deprecated Access <Titanium.App.iOS.SearchableItemAttributeSet.comment> instead.
    */
  def getComment(): String = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.composer> property.
    * @deprecated Access <Titanium.App.iOS.SearchableItemAttributeSet.composer> instead.
    */
  def getComposer(): String = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.contactKeywords> property.
    * @deprecated Access <Titanium.App.iOS.SearchableItemAttributeSet.contactKeywords> instead.
    */
  def getContactKeywords(): js.Array[String] = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.containerDisplayName> property.
    * @deprecated Access <Titanium.App.iOS.SearchableItemAttributeSet.containerDisplayName> instead.
    */
  def getContainerDisplayName(): String = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.containerIdentifier> property.
    * @deprecated Access <Titanium.App.iOS.SearchableItemAttributeSet.containerIdentifier> instead.
    */
  def getContainerIdentifier(): String = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.containerOrder> property.
    * @deprecated Access <Titanium.App.iOS.SearchableItemAttributeSet.containerOrder> instead.
    */
  def getContainerOrder(): Double = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.containerTitle> property.
    * @deprecated Access <Titanium.App.iOS.SearchableItemAttributeSet.containerTitle> instead.
    */
  def getContainerTitle(): String = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.contentCreationDate> property.
    * @deprecated Access <Titanium.App.iOS.SearchableItemAttributeSet.contentCreationDate> instead.
    */
  def getContentCreationDate(): String = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.contentDescription> property.
    * @deprecated Access <Titanium.App.iOS.SearchableItemAttributeSet.contentDescription> instead.
    */
  def getContentDescription(): String = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.contentModificationDate> property.
    * @deprecated Access <Titanium.App.iOS.SearchableItemAttributeSet.contentModificationDate> instead.
    */
  def getContentModificationDate(): String = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.contentRating> property.
    * @deprecated Access <Titanium.App.iOS.SearchableItemAttributeSet.contentRating> instead.
    */
  def getContentRating(): Double = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.contentSources> property.
    * @deprecated Access <Titanium.App.iOS.SearchableItemAttributeSet.contentSources> instead.
    */
  def getContentSources(): js.Array[String] = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.contentType> property.
    * @deprecated Access <Titanium.App.iOS.SearchableItemAttributeSet.contentType> instead.
    */
  def getContentType(): String = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.contentTypeTree> property.
    * @deprecated Access <Titanium.App.iOS.SearchableItemAttributeSet.contentTypeTree> instead.
    */
  def getContentTypeTree(): js.Array[String] = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.contentURL> property.
    * @deprecated Access <Titanium.App.iOS.SearchableItemAttributeSet.contentURL> instead.
    */
  def getContentURL(): String = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.contributors> property.
    * @deprecated Access <Titanium.App.iOS.SearchableItemAttributeSet.contributors> instead.
    */
  def getContributors(): js.Array[String] = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.copyright> property.
    * @deprecated Access <Titanium.App.iOS.SearchableItemAttributeSet.copyright> instead.
    */
  def getCopyright(): String = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.coverage> property.
    * @deprecated Access <Titanium.App.iOS.SearchableItemAttributeSet.coverage> instead.
    */
  def getCoverage(): js.Array[String] = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.creator> property.
    * @deprecated Access <Titanium.App.iOS.SearchableItemAttributeSet.creator> instead.
    */
  def getCreator(): String = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.deliveryType> property.
    * @deprecated Access <Titanium.App.iOS.SearchableItemAttributeSet.deliveryType> instead.
    */
  def getDeliveryType(): Double = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.director> property.
    * @deprecated Access <Titanium.App.iOS.SearchableItemAttributeSet.director> instead.
    */
  def getDirector(): String = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.displayName> property.
    * @deprecated Access <Titanium.App.iOS.SearchableItemAttributeSet.displayName> instead.
    */
  def getDisplayName(): String = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.downloadedDate> property.
    * @deprecated Access <Titanium.App.iOS.SearchableItemAttributeSet.downloadedDate> instead.
    */
  def getDownloadedDate(): String = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.duration> property.
    * @deprecated Access <Titanium.App.iOS.SearchableItemAttributeSet.duration> instead.
    */
  def getDuration(): Double = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.editors> property.
    * @deprecated Access <Titanium.App.iOS.SearchableItemAttributeSet.editors> instead.
    */
  def getEditors(): js.Array[String] = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.encodingApplications> property.
    * @deprecated Access <Titanium.App.iOS.SearchableItemAttributeSet.encodingApplications> instead.
    */
  def getEncodingApplications(): js.Array[String] = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.fileSize> property.
    * @deprecated Access <Titanium.App.iOS.SearchableItemAttributeSet.fileSize> instead.
    */
  def getFileSize(): Double = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.fontNames> property.
    * @deprecated Access <Titanium.App.iOS.SearchableItemAttributeSet.fontNames> instead.
    */
  def getFontNames(): js.Array[String] = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.fullyFormattedAddress> property.
    * @deprecated Access <Titanium.App.iOS.SearchableItemAttributeSet.fullyFormattedAddress> instead.
    */
  def getFullyFormattedAddress(): String = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.generalMIDISequence> property.
    * @deprecated Access <Titanium.App.iOS.SearchableItemAttributeSet.generalMIDISequence> instead.
    */
  def getGeneralMIDISequence(): Double = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.genre> property.
    * @deprecated Access <Titanium.App.iOS.SearchableItemAttributeSet.genre> instead.
    */
  def getGenre(): String = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.identifier> property.
    * @deprecated Access <Titanium.App.iOS.SearchableItemAttributeSet.identifier> instead.
    */
  def getIdentifier(): String = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.information> property.
    * @deprecated Access <Titanium.App.iOS.SearchableItemAttributeSet.information> instead.
    */
  def getInformation(): String = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.keySignature> property.
    * @deprecated Access <Titanium.App.iOS.SearchableItemAttributeSet.keySignature> instead.
    */
  def getKeySignature(): String = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.keywords> property.
    * @deprecated Access <Titanium.App.iOS.SearchableItemAttributeSet.keywords> instead.
    */
  def getKeywords(): js.Array[String] = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.kind> property.
    * @deprecated Access <Titanium.App.iOS.SearchableItemAttributeSet.kind> instead.
    */
  def getKind(): String = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.languages> property.
    * @deprecated Access <Titanium.App.iOS.SearchableItemAttributeSet.languages> instead.
    */
  def getLanguages(): js.Array[String] = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.lastUsedDate> property.
    * @deprecated Access <Titanium.App.iOS.SearchableItemAttributeSet.lastUsedDate> instead.
    */
  def getLastUsedDate(): String = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.local> property.
    * @deprecated Access <Titanium.App.iOS.SearchableItemAttributeSet.local> instead.
    */
  def getLocal(): Double = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.lyricist> property.
    * @deprecated Access <Titanium.App.iOS.SearchableItemAttributeSet.lyricist> instead.
    */
  def getLyricist(): String = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.mediaTypes> property.
    * @deprecated Access <Titanium.App.iOS.SearchableItemAttributeSet.mediaTypes> instead.
    */
  def getMediaTypes(): js.Array[String] = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.metadataModificationDate> property.
    * @deprecated Access <Titanium.App.iOS.SearchableItemAttributeSet.metadataModificationDate> instead.
    */
  def getMetadataModificationDate(): String = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.musicalGenre> property.
    * @deprecated Access <Titanium.App.iOS.SearchableItemAttributeSet.musicalGenre> instead.
    */
  def getMusicalGenre(): String = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.musicalInstrumentCategory> property.
    * @deprecated Access <Titanium.App.iOS.SearchableItemAttributeSet.musicalInstrumentCategory> instead.
    */
  def getMusicalInstrumentCategory(): String = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.musicalInstrumentName> property.
    * @deprecated Access <Titanium.App.iOS.SearchableItemAttributeSet.musicalInstrumentName> instead.
    */
  def getMusicalInstrumentName(): String = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.organizations> property.
    * @deprecated Access <Titanium.App.iOS.SearchableItemAttributeSet.organizations> instead.
    */
  def getOrganizations(): js.Array[String] = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.originalFormat> property.
    * @deprecated Access <Titanium.App.iOS.SearchableItemAttributeSet.originalFormat> instead.
    */
  def getOriginalFormat(): String = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.originalSource> property.
    * @deprecated Access <Titanium.App.iOS.SearchableItemAttributeSet.originalSource> instead.
    */
  def getOriginalSource(): String = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.pageCount> property.
    * @deprecated Access <Titanium.App.iOS.SearchableItemAttributeSet.pageCount> instead.
    */
  def getPageCount(): Double = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.pageHeight> property.
    * @deprecated Access <Titanium.App.iOS.SearchableItemAttributeSet.pageHeight> instead.
    */
  def getPageHeight(): Double = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.pageWidth> property.
    * @deprecated Access <Titanium.App.iOS.SearchableItemAttributeSet.pageWidth> instead.
    */
  def getPageWidth(): Double = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.participants> property.
    * @deprecated Access <Titanium.App.iOS.SearchableItemAttributeSet.participants> instead.
    */
  def getParticipants(): js.Array[String] = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.path> property.
    * @deprecated Access <Titanium.App.iOS.SearchableItemAttributeSet.path> instead.
    */
  def getPath(): String = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.performers> property.
    * @deprecated Access <Titanium.App.iOS.SearchableItemAttributeSet.performers> instead.
    */
  def getPerformers(): js.Array[String] = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.playCount> property.
    * @deprecated Access <Titanium.App.iOS.SearchableItemAttributeSet.playCount> instead.
    */
  def getPlayCount(): Double = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.postalCode> property.
    * @deprecated Access <Titanium.App.iOS.SearchableItemAttributeSet.postalCode> instead.
    */
  def getPostalCode(): String = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.producer> property.
    * @deprecated Access <Titanium.App.iOS.SearchableItemAttributeSet.producer> instead.
    */
  def getProducer(): String = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.projects> property.
    * @deprecated Access <Titanium.App.iOS.SearchableItemAttributeSet.projects> instead.
    */
  def getProjects(): js.Array[String] = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.publishers> property.
    * @deprecated Access <Titanium.App.iOS.SearchableItemAttributeSet.publishers> instead.
    */
  def getPublishers(): js.Array[String] = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.rating> property.
    * @deprecated Access <Titanium.App.iOS.SearchableItemAttributeSet.rating> instead.
    */
  def getRating(): Double = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.ratingDescription> property.
    * @deprecated Access <Titanium.App.iOS.SearchableItemAttributeSet.ratingDescription> instead.
    */
  def getRatingDescription(): String = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.recordingDate> property.
    * @deprecated Access <Titanium.App.iOS.SearchableItemAttributeSet.recordingDate> instead.
    */
  def getRecordingDate(): String = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.relatedUniqueIdentifier> property.
    * @deprecated Access <Titanium.App.iOS.SearchableItemAttributeSet.relatedUniqueIdentifier> instead.
    */
  def getRelatedUniqueIdentifier(): String = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.rights> property.
    * @deprecated Access <Titanium.App.iOS.SearchableItemAttributeSet.rights> instead.
    */
  def getRights(): js.Array[String] = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.role> property.
    * @deprecated Access <Titanium.App.iOS.SearchableItemAttributeSet.role> instead.
    */
  def getRole(): String = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.securityMethod> property.
    * @deprecated Access <Titanium.App.iOS.SearchableItemAttributeSet.securityMethod> instead.
    */
  def getSecurityMethod(): String = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.streamable> property.
    * @deprecated Access <Titanium.App.iOS.SearchableItemAttributeSet.streamable> instead.
    */
  def getStreamable(): Double = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.subThoroughfare> property.
    * @deprecated Access <Titanium.App.iOS.SearchableItemAttributeSet.subThoroughfare> instead.
    */
  def getSubThoroughfare(): String = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.subject> property.
    * @deprecated Access <Titanium.App.iOS.SearchableItemAttributeSet.subject> instead.
    */
  def getSubject(): String = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.supportsNavigation> property.
    * @deprecated Access <Titanium.App.iOS.SearchableItemAttributeSet.supportsNavigation> instead.
    */
  def getSupportsNavigation(): Double = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.supportsPhoneCall> property.
    * @deprecated Access <Titanium.App.iOS.SearchableItemAttributeSet.supportsPhoneCall> instead.
    */
  def getSupportsPhoneCall(): Double = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.tempo> property.
    * @deprecated Access <Titanium.App.iOS.SearchableItemAttributeSet.tempo> instead.
    */
  def getTempo(): Double = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.theme> property.
    * @deprecated Access <Titanium.App.iOS.SearchableItemAttributeSet.theme> instead.
    */
  def getTheme(): String = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.thoroughfare> property.
    * @deprecated Access <Titanium.App.iOS.SearchableItemAttributeSet.thoroughfare> instead.
    */
  def getThoroughfare(): String = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.thumbnailData> property.
    * @deprecated Access <Titanium.App.iOS.SearchableItemAttributeSet.thumbnailData> instead.
    */
  def getThumbnailData(): String | Blob = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.thumbnailURL> property.
    * @deprecated Access <Titanium.App.iOS.SearchableItemAttributeSet.thumbnailURL> instead.
    */
  def getThumbnailURL(): String = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.timeSignature> property.
    * @deprecated Access <Titanium.App.iOS.SearchableItemAttributeSet.timeSignature> instead.
    */
  def getTimeSignature(): String = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.title> property.
    * @deprecated Access <Titanium.App.iOS.SearchableItemAttributeSet.title> instead.
    */
  def getTitle(): String = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.totalBitRate> property.
    * @deprecated Access <Titanium.App.iOS.SearchableItemAttributeSet.totalBitRate> instead.
    */
  def getTotalBitRate(): Double = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.url> property.
    * @deprecated Access <Titanium.App.iOS.SearchableItemAttributeSet.url> instead.
    */
  def getUrl(): String = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.version> property.
    * @deprecated Access <Titanium.App.iOS.SearchableItemAttributeSet.version> instead.
    */
  def getVersion(): String = js.native
  /**
    * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.videoBitRate> property.
    * @deprecated Access <Titanium.App.iOS.SearchableItemAttributeSet.videoBitRate> instead.
    */
  def getVideoBitRate(): Double = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.addedDate> property.
    * @deprecated Set the value using <Titanium.App.iOS.SearchableItemAttributeSet.addedDate> instead.
    */
  def setAddedDate(addedDate: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.album> property.
    * @deprecated Set the value using <Titanium.App.iOS.SearchableItemAttributeSet.album> instead.
    */
  def setAlbum(album: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.alternateNames> property.
    * @deprecated Set the value using <Titanium.App.iOS.SearchableItemAttributeSet.alternateNames> instead.
    */
  def setAlternateNames(alternateNames: js.Array[String]): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.artist> property.
    * @deprecated Set the value using <Titanium.App.iOS.SearchableItemAttributeSet.artist> instead.
    */
  def setArtist(artist: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.audiences> property.
    * @deprecated Set the value using <Titanium.App.iOS.SearchableItemAttributeSet.audiences> instead.
    */
  def setAudiences(audiences: js.Array[String]): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.audioBitRate> property.
    * @deprecated Set the value using <Titanium.App.iOS.SearchableItemAttributeSet.audioBitRate> instead.
    */
  def setAudioBitRate(audioBitRate: Double): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.audioChannelCount> property.
    * @deprecated Set the value using <Titanium.App.iOS.SearchableItemAttributeSet.audioChannelCount> instead.
    */
  def setAudioChannelCount(audioChannelCount: Double): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.audioEncodingApplication> property.
    * @deprecated Set the value using <Titanium.App.iOS.SearchableItemAttributeSet.audioEncodingApplication> instead.
    */
  def setAudioEncodingApplication(audioEncodingApplication: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.audioSampleRate> property.
    * @deprecated Set the value using <Titanium.App.iOS.SearchableItemAttributeSet.audioSampleRate> instead.
    */
  def setAudioSampleRate(audioSampleRate: Double): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.audioTrackNumber> property.
    * @deprecated Set the value using <Titanium.App.iOS.SearchableItemAttributeSet.audioTrackNumber> instead.
    */
  def setAudioTrackNumber(audioTrackNumber: Double): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.codecs> property.
    * @deprecated Set the value using <Titanium.App.iOS.SearchableItemAttributeSet.codecs> instead.
    */
  def setCodecs(codecs: js.Array[String]): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.comment> property.
    * @deprecated Set the value using <Titanium.App.iOS.SearchableItemAttributeSet.comment> instead.
    */
  def setComment(comment: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.composer> property.
    * @deprecated Set the value using <Titanium.App.iOS.SearchableItemAttributeSet.composer> instead.
    */
  def setComposer(composer: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.contactKeywords> property.
    * @deprecated Set the value using <Titanium.App.iOS.SearchableItemAttributeSet.contactKeywords> instead.
    */
  def setContactKeywords(contactKeywords: js.Array[String]): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.containerDisplayName> property.
    * @deprecated Set the value using <Titanium.App.iOS.SearchableItemAttributeSet.containerDisplayName> instead.
    */
  def setContainerDisplayName(containerDisplayName: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.containerIdentifier> property.
    * @deprecated Set the value using <Titanium.App.iOS.SearchableItemAttributeSet.containerIdentifier> instead.
    */
  def setContainerIdentifier(containerIdentifier: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.containerOrder> property.
    * @deprecated Set the value using <Titanium.App.iOS.SearchableItemAttributeSet.containerOrder> instead.
    */
  def setContainerOrder(containerOrder: Double): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.containerTitle> property.
    * @deprecated Set the value using <Titanium.App.iOS.SearchableItemAttributeSet.containerTitle> instead.
    */
  def setContainerTitle(containerTitle: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.contentCreationDate> property.
    * @deprecated Set the value using <Titanium.App.iOS.SearchableItemAttributeSet.contentCreationDate> instead.
    */
  def setContentCreationDate(contentCreationDate: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.contentDescription> property.
    * @deprecated Set the value using <Titanium.App.iOS.SearchableItemAttributeSet.contentDescription> instead.
    */
  def setContentDescription(contentDescription: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.contentModificationDate> property.
    * @deprecated Set the value using <Titanium.App.iOS.SearchableItemAttributeSet.contentModificationDate> instead.
    */
  def setContentModificationDate(contentModificationDate: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.contentRating> property.
    * @deprecated Set the value using <Titanium.App.iOS.SearchableItemAttributeSet.contentRating> instead.
    */
  def setContentRating(contentRating: Double): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.contentSources> property.
    * @deprecated Set the value using <Titanium.App.iOS.SearchableItemAttributeSet.contentSources> instead.
    */
  def setContentSources(contentSources: js.Array[String]): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.contentType> property.
    * @deprecated Set the value using <Titanium.App.iOS.SearchableItemAttributeSet.contentType> instead.
    */
  def setContentType(contentType: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.contentTypeTree> property.
    * @deprecated Set the value using <Titanium.App.iOS.SearchableItemAttributeSet.contentTypeTree> instead.
    */
  def setContentTypeTree(contentTypeTree: js.Array[String]): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.contentURL> property.
    * @deprecated Set the value using <Titanium.App.iOS.SearchableItemAttributeSet.contentURL> instead.
    */
  def setContentURL(contentURL: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.contributors> property.
    * @deprecated Set the value using <Titanium.App.iOS.SearchableItemAttributeSet.contributors> instead.
    */
  def setContributors(contributors: js.Array[String]): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.copyright> property.
    * @deprecated Set the value using <Titanium.App.iOS.SearchableItemAttributeSet.copyright> instead.
    */
  def setCopyright(copyright: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.coverage> property.
    * @deprecated Set the value using <Titanium.App.iOS.SearchableItemAttributeSet.coverage> instead.
    */
  def setCoverage(coverage: js.Array[String]): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.creator> property.
    * @deprecated Set the value using <Titanium.App.iOS.SearchableItemAttributeSet.creator> instead.
    */
  def setCreator(creator: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.deliveryType> property.
    * @deprecated Set the value using <Titanium.App.iOS.SearchableItemAttributeSet.deliveryType> instead.
    */
  def setDeliveryType(deliveryType: Double): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.director> property.
    * @deprecated Set the value using <Titanium.App.iOS.SearchableItemAttributeSet.director> instead.
    */
  def setDirector(director: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.displayName> property.
    * @deprecated Set the value using <Titanium.App.iOS.SearchableItemAttributeSet.displayName> instead.
    */
  def setDisplayName(displayName: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.downloadedDate> property.
    * @deprecated Set the value using <Titanium.App.iOS.SearchableItemAttributeSet.downloadedDate> instead.
    */
  def setDownloadedDate(downloadedDate: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.duration> property.
    * @deprecated Set the value using <Titanium.App.iOS.SearchableItemAttributeSet.duration> instead.
    */
  def setDuration(duration: Double): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.editors> property.
    * @deprecated Set the value using <Titanium.App.iOS.SearchableItemAttributeSet.editors> instead.
    */
  def setEditors(editors: js.Array[String]): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.encodingApplications> property.
    * @deprecated Set the value using <Titanium.App.iOS.SearchableItemAttributeSet.encodingApplications> instead.
    */
  def setEncodingApplications(encodingApplications: js.Array[String]): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.fileSize> property.
    * @deprecated Set the value using <Titanium.App.iOS.SearchableItemAttributeSet.fileSize> instead.
    */
  def setFileSize(fileSize: Double): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.fontNames> property.
    * @deprecated Set the value using <Titanium.App.iOS.SearchableItemAttributeSet.fontNames> instead.
    */
  def setFontNames(fontNames: js.Array[String]): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.fullyFormattedAddress> property.
    * @deprecated Set the value using <Titanium.App.iOS.SearchableItemAttributeSet.fullyFormattedAddress> instead.
    */
  def setFullyFormattedAddress(fullyFormattedAddress: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.generalMIDISequence> property.
    * @deprecated Set the value using <Titanium.App.iOS.SearchableItemAttributeSet.generalMIDISequence> instead.
    */
  def setGeneralMIDISequence(generalMIDISequence: Double): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.genre> property.
    * @deprecated Set the value using <Titanium.App.iOS.SearchableItemAttributeSet.genre> instead.
    */
  def setGenre(genre: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.identifier> property.
    * @deprecated Set the value using <Titanium.App.iOS.SearchableItemAttributeSet.identifier> instead.
    */
  def setIdentifier(identifier: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.information> property.
    * @deprecated Set the value using <Titanium.App.iOS.SearchableItemAttributeSet.information> instead.
    */
  def setInformation(information: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.keySignature> property.
    * @deprecated Set the value using <Titanium.App.iOS.SearchableItemAttributeSet.keySignature> instead.
    */
  def setKeySignature(keySignature: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.keywords> property.
    * @deprecated Set the value using <Titanium.App.iOS.SearchableItemAttributeSet.keywords> instead.
    */
  def setKeywords(keywords: js.Array[String]): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.kind> property.
    * @deprecated Set the value using <Titanium.App.iOS.SearchableItemAttributeSet.kind> instead.
    */
  def setKind(kind: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.languages> property.
    * @deprecated Set the value using <Titanium.App.iOS.SearchableItemAttributeSet.languages> instead.
    */
  def setLanguages(languages: js.Array[String]): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.lastUsedDate> property.
    * @deprecated Set the value using <Titanium.App.iOS.SearchableItemAttributeSet.lastUsedDate> instead.
    */
  def setLastUsedDate(lastUsedDate: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.local> property.
    * @deprecated Set the value using <Titanium.App.iOS.SearchableItemAttributeSet.local> instead.
    */
  def setLocal(local: Double): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.lyricist> property.
    * @deprecated Set the value using <Titanium.App.iOS.SearchableItemAttributeSet.lyricist> instead.
    */
  def setLyricist(lyricist: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.mediaTypes> property.
    * @deprecated Set the value using <Titanium.App.iOS.SearchableItemAttributeSet.mediaTypes> instead.
    */
  def setMediaTypes(mediaTypes: js.Array[String]): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.metadataModificationDate> property.
    * @deprecated Set the value using <Titanium.App.iOS.SearchableItemAttributeSet.metadataModificationDate> instead.
    */
  def setMetadataModificationDate(metadataModificationDate: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.musicalGenre> property.
    * @deprecated Set the value using <Titanium.App.iOS.SearchableItemAttributeSet.musicalGenre> instead.
    */
  def setMusicalGenre(musicalGenre: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.musicalInstrumentCategory> property.
    * @deprecated Set the value using <Titanium.App.iOS.SearchableItemAttributeSet.musicalInstrumentCategory> instead.
    */
  def setMusicalInstrumentCategory(musicalInstrumentCategory: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.musicalInstrumentName> property.
    * @deprecated Set the value using <Titanium.App.iOS.SearchableItemAttributeSet.musicalInstrumentName> instead.
    */
  def setMusicalInstrumentName(musicalInstrumentName: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.organizations> property.
    * @deprecated Set the value using <Titanium.App.iOS.SearchableItemAttributeSet.organizations> instead.
    */
  def setOrganizations(organizations: js.Array[String]): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.originalFormat> property.
    * @deprecated Set the value using <Titanium.App.iOS.SearchableItemAttributeSet.originalFormat> instead.
    */
  def setOriginalFormat(originalFormat: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.originalSource> property.
    * @deprecated Set the value using <Titanium.App.iOS.SearchableItemAttributeSet.originalSource> instead.
    */
  def setOriginalSource(originalSource: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.pageCount> property.
    * @deprecated Set the value using <Titanium.App.iOS.SearchableItemAttributeSet.pageCount> instead.
    */
  def setPageCount(pageCount: Double): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.pageHeight> property.
    * @deprecated Set the value using <Titanium.App.iOS.SearchableItemAttributeSet.pageHeight> instead.
    */
  def setPageHeight(pageHeight: Double): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.pageWidth> property.
    * @deprecated Set the value using <Titanium.App.iOS.SearchableItemAttributeSet.pageWidth> instead.
    */
  def setPageWidth(pageWidth: Double): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.participants> property.
    * @deprecated Set the value using <Titanium.App.iOS.SearchableItemAttributeSet.participants> instead.
    */
  def setParticipants(participants: js.Array[String]): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.path> property.
    * @deprecated Set the value using <Titanium.App.iOS.SearchableItemAttributeSet.path> instead.
    */
  def setPath(path: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.performers> property.
    * @deprecated Set the value using <Titanium.App.iOS.SearchableItemAttributeSet.performers> instead.
    */
  def setPerformers(performers: js.Array[String]): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.playCount> property.
    * @deprecated Set the value using <Titanium.App.iOS.SearchableItemAttributeSet.playCount> instead.
    */
  def setPlayCount(playCount: Double): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.postalCode> property.
    * @deprecated Set the value using <Titanium.App.iOS.SearchableItemAttributeSet.postalCode> instead.
    */
  def setPostalCode(postalCode: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.producer> property.
    * @deprecated Set the value using <Titanium.App.iOS.SearchableItemAttributeSet.producer> instead.
    */
  def setProducer(producer: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.projects> property.
    * @deprecated Set the value using <Titanium.App.iOS.SearchableItemAttributeSet.projects> instead.
    */
  def setProjects(projects: js.Array[String]): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.publishers> property.
    * @deprecated Set the value using <Titanium.App.iOS.SearchableItemAttributeSet.publishers> instead.
    */
  def setPublishers(publishers: js.Array[String]): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.rating> property.
    * @deprecated Set the value using <Titanium.App.iOS.SearchableItemAttributeSet.rating> instead.
    */
  def setRating(rating: Double): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.ratingDescription> property.
    * @deprecated Set the value using <Titanium.App.iOS.SearchableItemAttributeSet.ratingDescription> instead.
    */
  def setRatingDescription(ratingDescription: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.recordingDate> property.
    * @deprecated Set the value using <Titanium.App.iOS.SearchableItemAttributeSet.recordingDate> instead.
    */
  def setRecordingDate(recordingDate: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.relatedUniqueIdentifier> property.
    * @deprecated Set the value using <Titanium.App.iOS.SearchableItemAttributeSet.relatedUniqueIdentifier> instead.
    */
  def setRelatedUniqueIdentifier(relatedUniqueIdentifier: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.rights> property.
    * @deprecated Set the value using <Titanium.App.iOS.SearchableItemAttributeSet.rights> instead.
    */
  def setRights(rights: js.Array[String]): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.role> property.
    * @deprecated Set the value using <Titanium.App.iOS.SearchableItemAttributeSet.role> instead.
    */
  def setRole(role: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.securityMethod> property.
    * @deprecated Set the value using <Titanium.App.iOS.SearchableItemAttributeSet.securityMethod> instead.
    */
  def setSecurityMethod(securityMethod: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.streamable> property.
    * @deprecated Set the value using <Titanium.App.iOS.SearchableItemAttributeSet.streamable> instead.
    */
  def setStreamable(streamable: Double): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.subThoroughfare> property.
    * @deprecated Set the value using <Titanium.App.iOS.SearchableItemAttributeSet.subThoroughfare> instead.
    */
  def setSubThoroughfare(subThoroughfare: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.subject> property.
    * @deprecated Set the value using <Titanium.App.iOS.SearchableItemAttributeSet.subject> instead.
    */
  def setSubject(subject: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.supportsNavigation> property.
    * @deprecated Set the value using <Titanium.App.iOS.SearchableItemAttributeSet.supportsNavigation> instead.
    */
  def setSupportsNavigation(supportsNavigation: Double): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.supportsPhoneCall> property.
    * @deprecated Set the value using <Titanium.App.iOS.SearchableItemAttributeSet.supportsPhoneCall> instead.
    */
  def setSupportsPhoneCall(supportsPhoneCall: Double): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.tempo> property.
    * @deprecated Set the value using <Titanium.App.iOS.SearchableItemAttributeSet.tempo> instead.
    */
  def setTempo(tempo: Double): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.theme> property.
    * @deprecated Set the value using <Titanium.App.iOS.SearchableItemAttributeSet.theme> instead.
    */
  def setTheme(theme: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.thoroughfare> property.
    * @deprecated Set the value using <Titanium.App.iOS.SearchableItemAttributeSet.thoroughfare> instead.
    */
  def setThoroughfare(thoroughfare: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.thumbnailData> property.
    * @deprecated Set the value using <Titanium.App.iOS.SearchableItemAttributeSet.thumbnailData> instead.
    */
  def setThumbnailData(thumbnailData: String): Unit = js.native
  def setThumbnailData(thumbnailData: Blob): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.thumbnailURL> property.
    * @deprecated Set the value using <Titanium.App.iOS.SearchableItemAttributeSet.thumbnailURL> instead.
    */
  def setThumbnailURL(thumbnailURL: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.timeSignature> property.
    * @deprecated Set the value using <Titanium.App.iOS.SearchableItemAttributeSet.timeSignature> instead.
    */
  def setTimeSignature(timeSignature: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.title> property.
    * @deprecated Set the value using <Titanium.App.iOS.SearchableItemAttributeSet.title> instead.
    */
  def setTitle(title: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.totalBitRate> property.
    * @deprecated Set the value using <Titanium.App.iOS.SearchableItemAttributeSet.totalBitRate> instead.
    */
  def setTotalBitRate(totalBitRate: Double): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.url> property.
    * @deprecated Set the value using <Titanium.App.iOS.SearchableItemAttributeSet.url> instead.
    */
  def setUrl(url: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.version> property.
    * @deprecated Set the value using <Titanium.App.iOS.SearchableItemAttributeSet.version> instead.
    */
  def setVersion(version: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.videoBitRate> property.
    * @deprecated Set the value using <Titanium.App.iOS.SearchableItemAttributeSet.videoBitRate> instead.
    */
  def setVideoBitRate(videoBitRate: Double): Unit = js.native
}

