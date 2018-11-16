package typings
package titaniumLib.TitaniumNs.AppNs.iOSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * The SearchableItemAttributeSet module defines metadata properties for SearchItem and UserActivity objects.
			 */
@js.native
trait SearchableItemAttributeSet
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  				 * The date that the item was moved into the current location.
  				 */
  var addedDate: java.lang.String = js.native
  /**
  				 * The title for a collection of media.
  				 */
  var album: java.lang.String = js.native
  /**
  				 * An array of localized strings of alternate display names for this item.
  				 */
  var alternateNames: js.Array[java.lang.String] = js.native
  /**
  				 * The artist for the media.
  				 */
  var artist: java.lang.String = js.native
  /**
  				 * A class of entity for whom the resource is intended or useful.
  				 */
  var audiences: js.Array[java.lang.String] = js.native
  /**
  				 * The audio bit rate.
  				 */
  var audioBitRate: scala.Double = js.native
  /**
  				 * The number of channels in the audio data contained in the file.
  				 */
  var audioChannelCount: scala.Double = js.native
  /**
  				 * The name of the application that encoded the data contained in the audio file.
  				 */
  var audioEncodingApplication: java.lang.String = js.native
  /**
  				 * The sample rate of the audio data contained in the file.
  				 */
  var audioSampleRate: scala.Double = js.native
  /**
  				 * The track number of a song/composition when it is part of an album.
  				 */
  var audioTrackNumber: scala.Double = js.native
  /**
  				 * The codecs used to encode/decode the media.
  				 */
  var codecs: js.Array[java.lang.String] = js.native
  /**
  				 * Comment related to a file.
  				 */
  var comment: java.lang.String = js.native
  /**
  				 * The composer of the song/composition contained in the audio file.
  				 */
  var composer: java.lang.String = js.native
  /**
  				 * A list of contacts that are somehow associated with this document beyond what is captured as Author.
  				 */
  var contactKeywords: js.Array[java.lang.String] = js.native
  /**
  				 * Display of the search container
  				 */
  var containerDisplayName: java.lang.String = js.native
  /**
  				 * Identifier for the search container
  				 */
  var containerIdentifier: java.lang.String = js.native
  /**
  				 * Order the search container is displayed.
  				 */
  var containerOrder: scala.Double = js.native
  /**
  				 * Title displayed in the search container
  				 */
  var containerTitle: java.lang.String = js.native
  /**
  				 * The date that the contents of the item were created.
  				 */
  var contentCreationDate: java.lang.String = js.native
  /**
  				 * An account of the content of the resource.
  				 */
  var contentDescription: java.lang.String = js.native
  /**
  				 * The date that the contents of the item were last modified.
  				 */
  var contentModificationDate: java.lang.String = js.native
  /**
  				 * Whether or not the item has explicit content. Set to `1` for explicit or `0` for clean.
  				 */
  var contentRating: scala.Double = js.native
  /**
  				 * Used to indicate where the item was obtained from.
  				 */
  var contentSources: js.Array[java.lang.String] = js.native
  /**
  				 * UTI Type pedigree for an item.
  				 */
  var contentType: java.lang.String = js.native
  /**
  				 * Array of strings related to the content tree of the item.
  				 */
  var contentTypeTree: js.Array[java.lang.String] = js.native
  /**
  				 * File URL representing the content to be indexed.
  				 */
  var contentURL: java.lang.String = js.native
  /**
  				 * Used to designate the entity responsible for making contributions to the content of the resource.
  				 */
  var contributors: js.Array[java.lang.String] = js.native
  /**
  				 * Copyright of the content.
  				 */
  var copyright: java.lang.String = js.native
  /**
  				 * Used to designate the extent or scope of the content of the resource.
  				 */
  var coverage: js.Array[java.lang.String] = js.native
  /**
  				 * Application used to create the document content (e.g. "Word","Framemaker", etc.).
  				 */
  var creator: java.lang.String = js.native
  /**
  				 * The delivery type of the item.  Set to `0` for fast start and `1` for RTSP.
  				 */
  var deliveryType: scala.Double = js.native
  /**
  				 * Director of the item, for example, the movie director.
  				 */
  var director: java.lang.String = js.native
  /**
  				 * A localized string to be displayed in the UI for this item.
  				 */
  var displayName: java.lang.String = js.native
  /**
  				 * The date that the file was last downloaded / received.
  				 */
  var downloadedDate: java.lang.String = js.native
  /**
  				 * Duration in seconds of the content of the item (if appropriate).
  				 */
  var duration: scala.Double = js.native
  /**
  				 * The list of editor/editors that have worked on this item.
  				 */
  var editors: js.Array[java.lang.String] = js.native
  /**
  				 * Software used to convert the original content into a PDF stream.
  				 */
  var encodingApplications: js.Array[java.lang.String] = js.native
  /**
  				 * Size of the document in MB.
  				 */
  var fileSize: scala.Double = js.native
  /**
  				 * Array of font names used in the item.
  				 */
  var fontNames: js.Array[java.lang.String] = js.native
  /**
  				 * The fully formatted address of the item (obtained from MapKit).
  				 */
  var fullyFormattedAddress: java.lang.String = js.native
  /**
  				 * Used to indicates whether the MIDI sequence contained in the file is setup for use with a General MIDI device.
  				 */
  var generalMIDISequence: scala.Double = js.native
  /**
  				 * Genre of the item, for example, movie genre.
  				 */
  var genre: java.lang.String = js.native
  /**
  				 * Used to reference to the resource within a given context.
  				 */
  var identifier: java.lang.String = js.native
  /**
  				 * Information about the item.
  				 */
  var information: java.lang.String = js.native
  /**
  				 * Content type of the attribute set.
  				 */
  var itemContentType: java.lang.String = js.native
  /**
  				 * The musical key of the song/composition contained in an audio file.
  				 */
  var keySignature: java.lang.String = js.native
  /**
  				 * Represents keywords associated with this particular item. Example keywords might be Birthday etc.
  				 */
  var keywords: js.Array[java.lang.String] = js.native
  /**
  				 * Kind that the item represents.
  				 */
  var kind: java.lang.String = js.native
  /**
  				 * Used to designate the languages of the intellectual content of the resource.
  				 */
  var languages: js.Array[java.lang.String] = js.native
  /**
  				 * The date that the item was last used.
  				 */
  var lastUsedDate: java.lang.String = js.native
  /**
  				 * Whether or not the item is local. Set to `1` if true and `0` otherwise.
  				 */
  var local: scala.Double = js.native
  /**
  				 * The lyricist/text writer for song/composition contained in the audio file.
  				 */
  var lyricist: java.lang.String = js.native
  /**
  				 * Media types present in the content.
  				 */
  var mediaTypes: js.Array[java.lang.String] = js.native
  /**
  				 * The date that the last metadata attribute was changed.
  				 */
  var metadataModificationDate: java.lang.String = js.native
  /**
  				 * The musical genre of the song/composition contained in the audio file.
  				 */
  var musicalGenre: java.lang.String = js.native
  /**
  				 * Metadata attribute that stores the category of instrument.
  				 */
  var musicalInstrumentCategory: java.lang.String = js.native
  /**
  				 * Metadata attribute that stores the name of instrument.
  				 */
  var musicalInstrumentName: java.lang.String = js.native
  /**
  				 * Used to indicate company/Organization that created the document.
  				 */
  var organizations: js.Array[java.lang.String] = js.native
  /**
  				 * Original format of the movie.
  				 */
  var originalFormat: java.lang.String = js.native
  /**
  				 * Original source of the movie.
  				 */
  var originalSource: java.lang.String = js.native
  /**
  				 * Number of pages in the item.
  				 */
  var pageCount: scala.Double = js.native
  /**
  				 * Height in points (72 points per inch) of the document page.
  				 */
  var pageHeight: scala.Double = js.native
  /**
  				 * Width in points (72 points per inch) of the document page.
  				 */
  var pageWidth: scala.Double = js.native
  /**
  				 * The list of people who are visible in an image or movie or written about in a document.
  				 */
  var participants: js.Array[java.lang.String] = js.native
  /**
  				 * The complete path to the item.
  				 */
  var path: java.lang.String = js.native
  /**
  				 * Performers in the movie.
  				 */
  var performers: js.Array[java.lang.String] = js.native
  /**
  				 * User play count of this item.
  				 */
  var playCount: scala.Double = js.native
  /**
  				 * The postal code for the item according to guidelines established by the provider.
  				 */
  var postalCode: java.lang.String = js.native
  /**
  				 * Producer of the content.
  				 */
  var producer: java.lang.String = js.native
  /**
  				 * The list of projects that this item is part of.
  				 */
  var projects: js.Array[java.lang.String] = js.native
  /**
  				 * Used to designate the entity responsible for making the resource available.
  				 */
  var publishers: js.Array[java.lang.String] = js.native
  /**
  				 * User rating of this item out of 5 stars.
  				 */
  var rating: scala.Double = js.native
  /**
  				 * A description of the rating, for example, the number of reviewers.
  				 */
  var ratingDescription: java.lang.String = js.native
  /**
  				 * The recording date of the song/composition.
  				 */
  var recordingDate: java.lang.String = js.native
  /**
  				 * For activities this is the unique identifier for the item this activity is related to.
  				 */
  var relatedUniqueIdentifier: java.lang.String = js.native
  /**
  				 * Used to provide a link to information about rights held in and over resource.
  				 */
  var rights: js.Array[java.lang.String] = js.native
  /**
  				 * Used to indicate the role of the document creator.
  				 */
  var role: java.lang.String = js.native
  /**
  				 * Security (encryption) method used in the file.
  				 */
  var securityMethod: java.lang.String = js.native
  /**
  				 * Whether the content is prepared for streaming.  Set to `0` for not streamable and `1` for streamable.
  				 */
  var streamable: scala.Double = js.native
  /**
  				 * The sub-location (e.g., street number) for the item according to guidelines established by the provider.
  				 */
  var subThoroughfare: java.lang.String = js.native
  /**
  				 * Subject of the the item.
  				 */
  var subject: java.lang.String = js.native
  /**
  				 * Used to determine if navigation is supported.
  				 */
  var supportsNavigation: scala.Double = js.native
  /**
  				 * Used to indicate that using the phone number is appropriate.
  				 */
  var supportsPhoneCall: scala.Double = js.native
  /**
  				 * The tempo of the music contained in the audio file in Beats Per Minute.
  				 */
  var tempo: scala.Double = js.native
  /**
  				 * Theme of the the item.
  				 */
  var theme: java.lang.String = js.native
  /**
  				 * The location (e.g., street name) for the item according to guidelines established by the provider.
  				 */
  var thoroughfare: java.lang.String = js.native
  /**
  				 * Image data for thumbnail for this item.
  				 */
  var thumbnailData: java.lang.String | titaniumLib.TitaniumNs.Blob = js.native
  /**
  				 * File URL pointing to a thumbnail image for this item.
  				 */
  var thumbnailURL: java.lang.String = js.native
  /**
  				 * The time signature of the musical composition contained in the audio/MIDI file.
  				 */
  var timeSignature: java.lang.String = js.native
  /**
  				 * The title of the particular item.
  				 */
  var title: java.lang.String = js.native
  /**
  				 * The total bit rate (audio and video combined) of the media.
  				 */
  var totalBitRate: scala.Double = js.native
  /**
  				 * URL of the item.
  				 */
  var url: java.lang.String = js.native
  /**
  				 * A version specifier for this item.
  				 */
  var version: java.lang.String = js.native
  /**
  				 * The video bit rate.
  				 */
  var videoBitRate: scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.addedDate> property.
  				 */
  def getAddedDate(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.album> property.
  				 */
  def getAlbum(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.alternateNames> property.
  				 */
  def getAlternateNames(): js.Array[java.lang.String] = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.artist> property.
  				 */
  def getArtist(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.audiences> property.
  				 */
  def getAudiences(): js.Array[java.lang.String] = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.audioBitRate> property.
  				 */
  def getAudioBitRate(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.audioChannelCount> property.
  				 */
  def getAudioChannelCount(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.audioEncodingApplication> property.
  				 */
  def getAudioEncodingApplication(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.audioSampleRate> property.
  				 */
  def getAudioSampleRate(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.audioTrackNumber> property.
  				 */
  def getAudioTrackNumber(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.codecs> property.
  				 */
  def getCodecs(): js.Array[java.lang.String] = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.comment> property.
  				 */
  def getComment(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.composer> property.
  				 */
  def getComposer(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.contactKeywords> property.
  				 */
  def getContactKeywords(): js.Array[java.lang.String] = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.containerDisplayName> property.
  				 */
  def getContainerDisplayName(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.containerIdentifier> property.
  				 */
  def getContainerIdentifier(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.containerOrder> property.
  				 */
  def getContainerOrder(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.containerTitle> property.
  				 */
  def getContainerTitle(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.contentCreationDate> property.
  				 */
  def getContentCreationDate(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.contentDescription> property.
  				 */
  def getContentDescription(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.contentModificationDate> property.
  				 */
  def getContentModificationDate(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.contentRating> property.
  				 */
  def getContentRating(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.contentSources> property.
  				 */
  def getContentSources(): js.Array[java.lang.String] = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.contentType> property.
  				 */
  def getContentType(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.contentTypeTree> property.
  				 */
  def getContentTypeTree(): js.Array[java.lang.String] = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.contentURL> property.
  				 */
  def getContentURL(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.contributors> property.
  				 */
  def getContributors(): js.Array[java.lang.String] = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.copyright> property.
  				 */
  def getCopyright(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.coverage> property.
  				 */
  def getCoverage(): js.Array[java.lang.String] = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.creator> property.
  				 */
  def getCreator(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.deliveryType> property.
  				 */
  def getDeliveryType(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.director> property.
  				 */
  def getDirector(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.displayName> property.
  				 */
  def getDisplayName(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.downloadedDate> property.
  				 */
  def getDownloadedDate(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.duration> property.
  				 */
  def getDuration(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.editors> property.
  				 */
  def getEditors(): js.Array[java.lang.String] = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.encodingApplications> property.
  				 */
  def getEncodingApplications(): js.Array[java.lang.String] = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.fileSize> property.
  				 */
  def getFileSize(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.fontNames> property.
  				 */
  def getFontNames(): js.Array[java.lang.String] = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.fullyFormattedAddress> property.
  				 */
  def getFullyFormattedAddress(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.generalMIDISequence> property.
  				 */
  def getGeneralMIDISequence(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.genre> property.
  				 */
  def getGenre(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.identifier> property.
  				 */
  def getIdentifier(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.information> property.
  				 */
  def getInformation(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.keySignature> property.
  				 */
  def getKeySignature(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.keywords> property.
  				 */
  def getKeywords(): js.Array[java.lang.String] = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.kind> property.
  				 */
  def getKind(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.languages> property.
  				 */
  def getLanguages(): js.Array[java.lang.String] = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.lastUsedDate> property.
  				 */
  def getLastUsedDate(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.local> property.
  				 */
  def getLocal(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.lyricist> property.
  				 */
  def getLyricist(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.mediaTypes> property.
  				 */
  def getMediaTypes(): js.Array[java.lang.String] = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.metadataModificationDate> property.
  				 */
  def getMetadataModificationDate(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.musicalGenre> property.
  				 */
  def getMusicalGenre(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.musicalInstrumentCategory> property.
  				 */
  def getMusicalInstrumentCategory(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.musicalInstrumentName> property.
  				 */
  def getMusicalInstrumentName(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.organizations> property.
  				 */
  def getOrganizations(): js.Array[java.lang.String] = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.originalFormat> property.
  				 */
  def getOriginalFormat(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.originalSource> property.
  				 */
  def getOriginalSource(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.pageCount> property.
  				 */
  def getPageCount(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.pageHeight> property.
  				 */
  def getPageHeight(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.pageWidth> property.
  				 */
  def getPageWidth(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.participants> property.
  				 */
  def getParticipants(): js.Array[java.lang.String] = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.path> property.
  				 */
  def getPath(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.performers> property.
  				 */
  def getPerformers(): js.Array[java.lang.String] = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.playCount> property.
  				 */
  def getPlayCount(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.postalCode> property.
  				 */
  def getPostalCode(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.producer> property.
  				 */
  def getProducer(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.projects> property.
  				 */
  def getProjects(): js.Array[java.lang.String] = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.publishers> property.
  				 */
  def getPublishers(): js.Array[java.lang.String] = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.rating> property.
  				 */
  def getRating(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.ratingDescription> property.
  				 */
  def getRatingDescription(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.recordingDate> property.
  				 */
  def getRecordingDate(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.relatedUniqueIdentifier> property.
  				 */
  def getRelatedUniqueIdentifier(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.rights> property.
  				 */
  def getRights(): js.Array[java.lang.String] = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.role> property.
  				 */
  def getRole(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.securityMethod> property.
  				 */
  def getSecurityMethod(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.streamable> property.
  				 */
  def getStreamable(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.subThoroughfare> property.
  				 */
  def getSubThoroughfare(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.subject> property.
  				 */
  def getSubject(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.supportsNavigation> property.
  				 */
  def getSupportsNavigation(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.supportsPhoneCall> property.
  				 */
  def getSupportsPhoneCall(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.tempo> property.
  				 */
  def getTempo(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.theme> property.
  				 */
  def getTheme(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.thoroughfare> property.
  				 */
  def getThoroughfare(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.thumbnailData> property.
  				 */
  def getThumbnailData(): java.lang.String | titaniumLib.TitaniumNs.Blob = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.thumbnailURL> property.
  				 */
  def getThumbnailURL(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.timeSignature> property.
  				 */
  def getTimeSignature(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.title> property.
  				 */
  def getTitle(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.totalBitRate> property.
  				 */
  def getTotalBitRate(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.url> property.
  				 */
  def getUrl(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.version> property.
  				 */
  def getVersion(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.videoBitRate> property.
  				 */
  def getVideoBitRate(): scala.Double = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.addedDate> property.
  				 */
  def setAddedDate(addedDate: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.album> property.
  				 */
  def setAlbum(album: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.alternateNames> property.
  				 */
  def setAlternateNames(alternateNames: js.Array[java.lang.String]): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.artist> property.
  				 */
  def setArtist(artist: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.audiences> property.
  				 */
  def setAudiences(audiences: js.Array[java.lang.String]): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.audioBitRate> property.
  				 */
  def setAudioBitRate(audioBitRate: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.audioChannelCount> property.
  				 */
  def setAudioChannelCount(audioChannelCount: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.audioEncodingApplication> property.
  				 */
  def setAudioEncodingApplication(audioEncodingApplication: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.audioSampleRate> property.
  				 */
  def setAudioSampleRate(audioSampleRate: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.audioTrackNumber> property.
  				 */
  def setAudioTrackNumber(audioTrackNumber: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.codecs> property.
  				 */
  def setCodecs(codecs: js.Array[java.lang.String]): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.comment> property.
  				 */
  def setComment(comment: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.composer> property.
  				 */
  def setComposer(composer: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.contactKeywords> property.
  				 */
  def setContactKeywords(contactKeywords: js.Array[java.lang.String]): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.containerDisplayName> property.
  				 */
  def setContainerDisplayName(containerDisplayName: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.containerIdentifier> property.
  				 */
  def setContainerIdentifier(containerIdentifier: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.containerOrder> property.
  				 */
  def setContainerOrder(containerOrder: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.containerTitle> property.
  				 */
  def setContainerTitle(containerTitle: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.contentCreationDate> property.
  				 */
  def setContentCreationDate(contentCreationDate: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.contentDescription> property.
  				 */
  def setContentDescription(contentDescription: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.contentModificationDate> property.
  				 */
  def setContentModificationDate(contentModificationDate: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.contentRating> property.
  				 */
  def setContentRating(contentRating: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.contentSources> property.
  				 */
  def setContentSources(contentSources: js.Array[java.lang.String]): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.contentType> property.
  				 */
  def setContentType(contentType: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.contentTypeTree> property.
  				 */
  def setContentTypeTree(contentTypeTree: js.Array[java.lang.String]): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.contentURL> property.
  				 */
  def setContentURL(contentURL: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.contributors> property.
  				 */
  def setContributors(contributors: js.Array[java.lang.String]): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.copyright> property.
  				 */
  def setCopyright(copyright: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.coverage> property.
  				 */
  def setCoverage(coverage: js.Array[java.lang.String]): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.creator> property.
  				 */
  def setCreator(creator: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.deliveryType> property.
  				 */
  def setDeliveryType(deliveryType: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.director> property.
  				 */
  def setDirector(director: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.displayName> property.
  				 */
  def setDisplayName(displayName: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.downloadedDate> property.
  				 */
  def setDownloadedDate(downloadedDate: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.duration> property.
  				 */
  def setDuration(duration: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.editors> property.
  				 */
  def setEditors(editors: js.Array[java.lang.String]): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.encodingApplications> property.
  				 */
  def setEncodingApplications(encodingApplications: js.Array[java.lang.String]): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.fileSize> property.
  				 */
  def setFileSize(fileSize: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.fontNames> property.
  				 */
  def setFontNames(fontNames: js.Array[java.lang.String]): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.fullyFormattedAddress> property.
  				 */
  def setFullyFormattedAddress(fullyFormattedAddress: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.generalMIDISequence> property.
  				 */
  def setGeneralMIDISequence(generalMIDISequence: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.genre> property.
  				 */
  def setGenre(genre: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.identifier> property.
  				 */
  def setIdentifier(identifier: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.information> property.
  				 */
  def setInformation(information: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.keySignature> property.
  				 */
  def setKeySignature(keySignature: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.keywords> property.
  				 */
  def setKeywords(keywords: js.Array[java.lang.String]): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.kind> property.
  				 */
  def setKind(kind: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.languages> property.
  				 */
  def setLanguages(languages: js.Array[java.lang.String]): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.lastUsedDate> property.
  				 */
  def setLastUsedDate(lastUsedDate: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.local> property.
  				 */
  def setLocal(local: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.lyricist> property.
  				 */
  def setLyricist(lyricist: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.mediaTypes> property.
  				 */
  def setMediaTypes(mediaTypes: js.Array[java.lang.String]): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.metadataModificationDate> property.
  				 */
  def setMetadataModificationDate(metadataModificationDate: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.musicalGenre> property.
  				 */
  def setMusicalGenre(musicalGenre: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.musicalInstrumentCategory> property.
  				 */
  def setMusicalInstrumentCategory(musicalInstrumentCategory: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.musicalInstrumentName> property.
  				 */
  def setMusicalInstrumentName(musicalInstrumentName: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.organizations> property.
  				 */
  def setOrganizations(organizations: js.Array[java.lang.String]): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.originalFormat> property.
  				 */
  def setOriginalFormat(originalFormat: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.originalSource> property.
  				 */
  def setOriginalSource(originalSource: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.pageCount> property.
  				 */
  def setPageCount(pageCount: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.pageHeight> property.
  				 */
  def setPageHeight(pageHeight: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.pageWidth> property.
  				 */
  def setPageWidth(pageWidth: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.participants> property.
  				 */
  def setParticipants(participants: js.Array[java.lang.String]): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.path> property.
  				 */
  def setPath(path: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.performers> property.
  				 */
  def setPerformers(performers: js.Array[java.lang.String]): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.playCount> property.
  				 */
  def setPlayCount(playCount: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.postalCode> property.
  				 */
  def setPostalCode(postalCode: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.producer> property.
  				 */
  def setProducer(producer: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.projects> property.
  				 */
  def setProjects(projects: js.Array[java.lang.String]): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.publishers> property.
  				 */
  def setPublishers(publishers: js.Array[java.lang.String]): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.rating> property.
  				 */
  def setRating(rating: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.ratingDescription> property.
  				 */
  def setRatingDescription(ratingDescription: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.recordingDate> property.
  				 */
  def setRecordingDate(recordingDate: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.relatedUniqueIdentifier> property.
  				 */
  def setRelatedUniqueIdentifier(relatedUniqueIdentifier: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.rights> property.
  				 */
  def setRights(rights: js.Array[java.lang.String]): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.role> property.
  				 */
  def setRole(role: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.securityMethod> property.
  				 */
  def setSecurityMethod(securityMethod: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.streamable> property.
  				 */
  def setStreamable(streamable: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.subThoroughfare> property.
  				 */
  def setSubThoroughfare(subThoroughfare: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.subject> property.
  				 */
  def setSubject(subject: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.supportsNavigation> property.
  				 */
  def setSupportsNavigation(supportsNavigation: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.supportsPhoneCall> property.
  				 */
  def setSupportsPhoneCall(supportsPhoneCall: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.tempo> property.
  				 */
  def setTempo(tempo: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.theme> property.
  				 */
  def setTheme(theme: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.thoroughfare> property.
  				 */
  def setThoroughfare(thoroughfare: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.thumbnailData> property.
  				 */
  def setThumbnailData(thumbnailData: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.thumbnailData> property.
  				 */
  def setThumbnailData(thumbnailData: titaniumLib.TitaniumNs.Blob): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.thumbnailURL> property.
  				 */
  def setThumbnailURL(thumbnailURL: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.timeSignature> property.
  				 */
  def setTimeSignature(timeSignature: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.title> property.
  				 */
  def setTitle(title: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.totalBitRate> property.
  				 */
  def setTotalBitRate(totalBitRate: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.url> property.
  				 */
  def setUrl(url: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.version> property.
  				 */
  def setVersion(version: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItemAttributeSet.videoBitRate> property.
  				 */
  def setVideoBitRate(videoBitRate: scala.Double): scala.Unit = js.native
}

