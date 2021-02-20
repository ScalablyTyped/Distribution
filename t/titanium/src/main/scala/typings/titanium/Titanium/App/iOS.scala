package typings.titanium.Titanium.App

import typings.titanium.ProxyEventMap
import typings.titanium.Titanium.Blob
import typings.titanium.Titanium.Module
import typings.titanium.Titanium.Proxy
import typings.titanium.titaniumStrings.change
import typings.titanium.titaniumStrings.completed
import typings.titanium.titaniumStrings.founditems
import typings.titanium.titaniumStrings.useractivitydeleted
import typings.titanium.titaniumStrings.useractivitywascontinued
import typings.titanium.titaniumStrings.useractivitywillsave
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The top-level App iOS module, available only to iOS devices, that includes the facilities to
  * create and manage local notifications and background services.
  */
object iOS {
  
  /**
    * A service that runs when the application is placed in the background.
    */
  @js.native
  trait BackgroundService extends Proxy {
    
    /**
      * Gets the value of the <Titanium.App.iOS.BackgroundService.url> property.
      * @deprecated Access <Titanium.App.iOS.BackgroundService.url> instead.
      */
    def getUrl(): String = js.native
    
    /**
      * Sets the value of the <Titanium.App.iOS.BackgroundService.url> property.
      * @deprecated Set the value using <Titanium.App.iOS.BackgroundService.url> instead.
      */
    def setUrl(url: String): Unit = js.native
    
    /**
      * Stops the service from running during the current background session to conserve resources.
      */
    def stop(): Unit = js.native
    
    /**
      * Unregisters the background service.
      */
    def unregister(): Unit = js.native
    
    /**
      * A local URL to a JavaScript file containing the code to run in the background.
      */
    var url: String = js.native
  }
  
  /**
    * A local notification to alert the user of new or pending application information.
    */
  @js.native
  trait LocalNotification extends Proxy {
    
    /**
      * Cancels the pending notification.
      * @deprecated Use [Titanium.App.iOS.UserNotificationCenter.removePendingNotifications](Titanium.App.iOS.UserNotificationCenter.removePendingNotifications) instead.
      */
    def cancel(): Unit = js.native
  }
  
  /**
    * A search query object manages the criteria to apply when searching app content that you have previously
    * indexed by using the Core Spotlight APIs.
    */
  @js.native
  trait SearchQuery extends Proxy {
    
    /**
      * Adds the specified callback as an event listener for the named event.
      */
    @JSName("addEventListener")
    def addEventListener_completed(
      name: completed,
      callback: js.ThisFunction1[/* this */ this.type, /* event */ SearchQueryCompletedEvent, Unit]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_founditems(
      name: founditems,
      callback: js.ThisFunction1[/* this */ this.type, /* event */ SearchQueryFounditemsEvent, Unit]
    ): Unit = js.native
    
    /**
      * An array of strings that represent the attributes of indexed items.
      */
    var attributes: js.Array[String] = js.native
    
    /**
      * Cancels a query operation.
      */
    def cancel(): Unit = js.native
    
    /**
      * Fires a synthesized event to any registered listeners.
      */
    @JSName("fireEvent")
    def fireEvent_completed(name: completed): Unit = js.native
    @JSName("fireEvent")
    def fireEvent_completed(name: completed, event: SearchQueryCompletedEvent): Unit = js.native
    @JSName("fireEvent")
    def fireEvent_founditems(name: founditems): Unit = js.native
    @JSName("fireEvent")
    def fireEvent_founditems(name: founditems, event: SearchQueryFounditemsEvent): Unit = js.native
    
    /**
      * A Boolean value that indicates if the query has been cancelled (`true`) or not (`false`).
      */
    def isCancelled(): Boolean = js.native
    
    /**
      * A formatted string that defines the matching criteria to apply to indexed items.
      */
    var queryString: String = js.native
    
    /**
      * Removes the specified callback as an event listener for the named event.
      */
    @JSName("removeEventListener")
    def removeEventListener_completed(
      name: completed,
      callback: js.ThisFunction1[/* this */ this.type, /* event */ SearchQueryCompletedEvent, Unit]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_founditems(
      name: founditems,
      callback: js.ThisFunction1[/* this */ this.type, /* event */ SearchQueryFounditemsEvent, Unit]
    ): Unit = js.native
    
    /**
      * Asynchronously queries the index for items that match the query object's specifications.
      */
    def start(): Unit = js.native
  }
  
  /**
    * Base event for class Titanium.App.iOS.SearchQuery
    */
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ @js.native
  trait SearchQueryBaseEvent extends StObject {
    
    /**
      * Source object that fired the event.
      */
    var source: SearchQuery = js.native
  }
  object SearchQueryBaseEvent {
    
    @scala.inline
    def apply(source: SearchQuery): SearchQueryBaseEvent = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchQueryBaseEvent]
    }
    
    @scala.inline
    implicit class SearchQueryBaseEventMutableBuilder[Self <: SearchQueryBaseEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSource(value: SearchQuery): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Fired when the query completes to inform you about it's success.
    * To receive items, use the `founditems` event.
    */
  @js.native
  trait SearchQueryCompletedEvent extends SearchQueryBaseEvent {
    
    /**
      * Error message, if any returned. Undefined otherwise.
      */
    var error: String = js.native
    
    /**
      * Indicates if the operation succeeded. Returns true if download succeeded, false otherwise.
      */
    var success: Boolean = js.native
  }
  object SearchQueryCompletedEvent {
    
    @scala.inline
    def apply(error: String, source: SearchQuery, success: Boolean): SearchQueryCompletedEvent = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchQueryCompletedEvent]
    }
    
    @scala.inline
    implicit class SearchQueryCompletedEventMutableBuilder[Self <: SearchQueryCompletedEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SearchQueryEventMap extends ProxyEventMap {
    
    var completed: SearchQueryCompletedEvent = js.native
    
    var founditems: SearchQueryFounditemsEvent = js.native
  }
  object SearchQueryEventMap {
    
    @scala.inline
    def apply(completed: SearchQueryCompletedEvent, founditems: SearchQueryFounditemsEvent): SearchQueryEventMap = {
      val __obj = js.Dynamic.literal(completed = completed.asInstanceOf[js.Any], founditems = founditems.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchQueryEventMap]
    }
    
    @scala.inline
    implicit class SearchQueryEventMapMutableBuilder[Self <: SearchQueryEventMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompleted(value: SearchQueryCompletedEvent): Self = StObject.set(x, "completed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFounditems(value: SearchQueryFounditemsEvent): Self = StObject.set(x, "founditems", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Fired when the query finds a new batch of matching items.
    */
  @js.native
  trait SearchQueryFounditemsEvent extends SearchQueryBaseEvent {
    
    /**
      * The number of items that are currently fetched.
      */
    var foundItemsCount: Double = js.native
    
    /**
      * An array of indexed items that match the specified query.
      */
    var items: js.Array[SearchableItem] = js.native
  }
  object SearchQueryFounditemsEvent {
    
    @scala.inline
    def apply(foundItemsCount: Double, items: js.Array[SearchableItem], source: SearchQuery): SearchQueryFounditemsEvent = {
      val __obj = js.Dynamic.literal(foundItemsCount = foundItemsCount.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchQueryFounditemsEvent]
    }
    
    @scala.inline
    implicit class SearchQueryFounditemsEventMutableBuilder[Self <: SearchQueryFounditemsEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFoundItemsCount(value: Double): Self = StObject.set(x, "foundItemsCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItems(value: js.Array[SearchableItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsVarargs(value: SearchableItem*): Self = StObject.set(x, "items", js.Array(value :_*))
    }
  }
  
  /**
    * The SearchableIndex module is used to add or remove Ti.App.iOS.SearchableItem objects from the device search index.
    */
  @js.native
  trait SearchableIndex extends Proxy {
    
    /**
      * Adds an array of Titanium.App.iOS.SearchableItem objects to the default search index.
      */
    def addToDefaultSearchableIndex(Array: js.Array[SearchableItem], callback: js.Function1[/* param0 */ js.Any, Unit]): Unit = js.native
    
    /**
      * Removes search items based on an array of domain identifiers.
      */
    def deleteAllSearchableItemByDomainIdenifiers(Array: js.Array[String], callback: js.Function1[/* param0 */ js.Any, Unit]): Unit = js.native
    
    /**
      * Removes all search items added by the application.
      */
    def deleteAllSearchableItems(callback: js.Function1[/* param0 */ js.Any, Unit]): Unit = js.native
    
    /**
      * Removes search items based on an array of identifiers.
      */
    def deleteSearchableItemsByIdentifiers(Array: js.Array[String], callback: js.Function1[/* param0 */ js.Any, Unit]): Unit = js.native
    
    /**
      * Indicates whether indexing is supported by the device.
      */
    def isSupported(): Boolean = js.native
  }
  
  /**
    * Used to create a unique object containing all of the search information that will appear in the device search index.
    */
  @js.native
  trait SearchableItem extends Proxy {
    
    /**
      * Set of metadata properties to display for the item.
      */
    var attributeSet: SearchableItemAttributeSet = js.native
    
    /**
      * Identifier that represents the "domain" or owner of this item.
      */
    var domainIdentifier: String = js.native
    
    /**
      * Searchable items have an expiration date or time to live.  By default it is set to one month.
      */
    var expirationDate: String = js.native
    
    /**
      * Gets the value of the <Titanium.App.iOS.SearchableItem.domainIdentifier> property.
      * @deprecated Access <Titanium.App.iOS.SearchableItem.domainIdentifier> instead.
      */
    def getDomainIdentifier(): String = js.native
    
    /**
      * Gets the value of the <Titanium.App.iOS.SearchableItem.expirationDate> property.
      * @deprecated Access <Titanium.App.iOS.SearchableItem.expirationDate> instead.
      */
    def getExpirationDate(): String = js.native
    
    /**
      * Gets the value of the <Titanium.App.iOS.SearchableItem.uniqueIdentifier> property.
      * @deprecated Access <Titanium.App.iOS.SearchableItem.uniqueIdentifier> instead.
      */
    def getUniqueIdentifier(): String = js.native
    
    /**
      * Sets the value of the <Titanium.App.iOS.SearchableItem.domainIdentifier> property.
      * @deprecated Set the value using <Titanium.App.iOS.SearchableItem.domainIdentifier> instead.
      */
    def setDomainIdentifier(domainIdentifier: String): Unit = js.native
    
    /**
      * Sets the value of the <Titanium.App.iOS.SearchableItem.expirationDate> property.
      * @deprecated Set the value using <Titanium.App.iOS.SearchableItem.expirationDate> instead.
      */
    def setExpirationDate(expirationDate: String): Unit = js.native
    
    /**
      * Sets the value of the <Titanium.App.iOS.SearchableItem.uniqueIdentifier> property.
      * @deprecated Set the value using <Titanium.App.iOS.SearchableItem.uniqueIdentifier> instead.
      */
    def setUniqueIdentifier(uniqueIdentifier: String): Unit = js.native
    
    /**
      * Unique identifier to your application group.
      */
    var uniqueIdentifier: String = js.native
  }
  
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
  }
  
  /**
    * The UserActivity module is used to enable device Handoff and to create User Activities.
    */
  @js.native
  trait UserActivity extends Proxy {
    
    /**
      * Name of the activity type.
      */
    var activityType: String = js.native
    
    /**
      * Adds a Titanium.App.iOS.SearchableItemAttributeSet to the user activity.
      */
    def addContentAttributeSet(contentAttributeSet: SearchableItemAttributeSet): Unit = js.native
    
    /**
      * Adds the specified callback as an event listener for the named event.
      */
    @JSName("addEventListener")
    def addEventListener_useractivitydeleted(
      name: useractivitydeleted,
      callback: js.ThisFunction1[/* this */ this.type, /* event */ UserActivityUseractivitydeletedEvent, Unit]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_useractivitywascontinued(
      name: useractivitywascontinued,
      callback: js.ThisFunction1[/* this */ this.type, /* event */ UserActivityUseractivitywascontinuedEvent, Unit]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_useractivitywillsave(
      name: useractivitywillsave,
      callback: js.ThisFunction1[/* this */ this.type, /* event */ UserActivityUseractivitywillsaveEvent, Unit]
    ): Unit = js.native
    
    /**
      * Marks the activity as currently in use by the user.
      */
    def becomeCurrent(): Unit = js.native
    
    /**
      * Deletes all user activities created by your app.
      */
    def deleteAllSavedUserActivities(): Unit = js.native
    
    /**
      * Deletes user activities created by your app that have the specified persistent identifiers.
      */
    def deleteSavedUserActivitiesForPersistentIdentifiers(persistentIdentifiers: js.Array[String]): Unit = js.native
    
    /**
      * Set to true if this user activity should be eligible to be handed off to another device
      */
    var eligibleForHandoff: Boolean = js.native
    
    /**
      * A Boolean value that determines whether Siri can suggest the user activity as a shortcut to the user.
      */
    var eligibleForPrediction: Boolean = js.native
    
    /**
      * Set to `true` if the user activity can be publicly accessed by all iOS users.
      */
    var eligibleForPublicIndexing: Boolean = js.native
    
    /**
      * Set to true if the user activity should be added to the on-device index.
      */
    var eligibleForSearch: Boolean = js.native
    
    /**
      * Absolute date after which the activity is no longer eligible to be indexed or handed off.
      */
    var expirationDate: String = js.native
    
    /**
      * Fires a synthesized event to any registered listeners.
      */
    @JSName("fireEvent")
    def fireEvent_useractivitydeleted(name: useractivitydeleted): Unit = js.native
    @JSName("fireEvent")
    def fireEvent_useractivitydeleted(name: useractivitydeleted, event: UserActivityUseractivitydeletedEvent): Unit = js.native
    @JSName("fireEvent")
    def fireEvent_useractivitywascontinued(name: useractivitywascontinued): Unit = js.native
    @JSName("fireEvent")
    def fireEvent_useractivitywascontinued(name: useractivitywascontinued, event: UserActivityUseractivitywascontinuedEvent): Unit = js.native
    @JSName("fireEvent")
    def fireEvent_useractivitywillsave(name: useractivitywillsave): Unit = js.native
    @JSName("fireEvent")
    def fireEvent_useractivitywillsave(name: useractivitywillsave, event: UserActivityUseractivitywillsaveEvent): Unit = js.native
    
    /**
      * Gets the value of the <Titanium.App.iOS.UserActivity.activityType> property.
      * @deprecated Access <Titanium.App.iOS.UserActivity.activityType> instead.
      */
    def getActivityType(): String = js.native
    
    /**
      * Gets the value of the <Titanium.App.iOS.UserActivity.eligibleForHandoff> property.
      * @deprecated Access <Titanium.App.iOS.UserActivity.eligibleForHandoff> instead.
      */
    def getEligibleForHandoff(): Boolean = js.native
    
    /**
      * Gets the value of the <Titanium.App.iOS.UserActivity.eligibleForPrediction> property.
      * @deprecated Access <Titanium.App.iOS.UserActivity.eligibleForPrediction> instead.
      */
    def getEligibleForPrediction(): Boolean = js.native
    
    /**
      * Gets the value of the <Titanium.App.iOS.UserActivity.eligibleForPublicIndexing> property.
      * @deprecated Access <Titanium.App.iOS.UserActivity.eligibleForPublicIndexing> instead.
      */
    def getEligibleForPublicIndexing(): Boolean = js.native
    
    /**
      * Gets the value of the <Titanium.App.iOS.UserActivity.eligibleForSearch> property.
      * @deprecated Access <Titanium.App.iOS.UserActivity.eligibleForSearch> instead.
      */
    def getEligibleForSearch(): Boolean = js.native
    
    /**
      * Gets the value of the <Titanium.App.iOS.UserActivity.expirationDate> property.
      * @deprecated Access <Titanium.App.iOS.UserActivity.expirationDate> instead.
      */
    def getExpirationDate(): String = js.native
    
    /**
      * Gets the value of the <Titanium.App.iOS.UserActivity.keywords> property.
      * @deprecated Access <Titanium.App.iOS.UserActivity.keywords> instead.
      */
    def getKeywords(): js.Array[String] = js.native
    
    /**
      * Gets the value of the <Titanium.App.iOS.UserActivity.needsSave> property.
      * @deprecated Access <Titanium.App.iOS.UserActivity.needsSave> instead.
      */
    def getNeedsSave(): Boolean = js.native
    
    /**
      * Gets the value of the <Titanium.App.iOS.UserActivity.persistentIdentifier> property.
      * @deprecated Access <Titanium.App.iOS.UserActivity.persistentIdentifier> instead.
      */
    def getPersistentIdentifier(): String = js.native
    
    /**
      * Gets the value of the <Titanium.App.iOS.UserActivity.requiredUserInfoKeys> property.
      * @deprecated Access <Titanium.App.iOS.UserActivity.requiredUserInfoKeys> instead.
      */
    def getRequiredUserInfoKeys(): js.Array[String] = js.native
    
    /**
      * Gets the value of the <Titanium.App.iOS.UserActivity.supported> property.
      * @deprecated Use [Titanium.App.iOS.UserActivity.isSupported](Titanium.App.iOS.UserActivity.isSupported) instead.
      */
    def getSupported(): Boolean = js.native
    
    /**
      * Gets the value of the <Titanium.App.iOS.UserActivity.title> property.
      * @deprecated Access <Titanium.App.iOS.UserActivity.title> instead.
      */
    def getTitle(): String = js.native
    
    /**
      * Gets the value of the <Titanium.App.iOS.UserActivity.userInfo> property.
      * @deprecated Access <Titanium.App.iOS.UserActivity.userInfo> instead.
      */
    def getUserInfo(): js.Any = js.native
    
    /**
      * Gets the value of the <Titanium.App.iOS.UserActivity.webpageURL> property.
      * @deprecated Access <Titanium.App.iOS.UserActivity.webpageURL> instead.
      */
    def getWebpageURL(): String = js.native
    
    /**
      * Invalidates an activity when it is no longer eligible for continuation.
      */
    def invalidate(): Unit = js.native
    
    /**
      * Determines if user activities are supported (`true`) or not (`false`) by the device.
      */
    def isSupported(): Boolean = js.native
    
    /**
      * An array of string keywords representing words or phrases that might help the user to find the activity in the application history.
      */
    var keywords: js.Array[String] = js.native
    
    /**
      * Set to true everytime you have updated the user activity and need the changes to be saved before handing it off to another device.
      */
    var needsSave: Boolean = js.native
    
    /**
      * A value used to identify the user activity.
      */
    var persistentIdentifier: String = js.native
    
    /**
      * Removes the specified callback as an event listener for the named event.
      */
    @JSName("removeEventListener")
    def removeEventListener_useractivitydeleted(
      name: useractivitydeleted,
      callback: js.ThisFunction1[/* this */ this.type, /* event */ UserActivityUseractivitydeletedEvent, Unit]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_useractivitywascontinued(
      name: useractivitywascontinued,
      callback: js.ThisFunction1[/* this */ this.type, /* event */ UserActivityUseractivitywascontinuedEvent, Unit]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_useractivitywillsave(
      name: useractivitywillsave,
      callback: js.ThisFunction1[/* this */ this.type, /* event */ UserActivityUseractivitywillsaveEvent, Unit]
    ): Unit = js.native
    
    /**
      * An array of String keys from the userInfo property which represent the minimal information about the user activity that should be stored for later restoration.
      */
    var requiredUserInfoKeys: js.Array[String] = js.native
    
    /**
      * Marks the activity as currently **not** in use and ineligible to be continued.
      */
    def resignCurrent(): Unit = js.native
    
    /**
      * Sets the value of the <Titanium.App.iOS.UserActivity.activityType> property.
      * @deprecated Set the value using <Titanium.App.iOS.UserActivity.activityType> instead.
      */
    def setActivityType(activityType: String): Unit = js.native
    
    /**
      * Sets the value of the <Titanium.App.iOS.UserActivity.eligibleForHandoff> property.
      * @deprecated Set the value using <Titanium.App.iOS.UserActivity.eligibleForHandoff> instead.
      */
    def setEligibleForHandoff(eligibleForHandoff: Boolean): Unit = js.native
    
    /**
      * Sets the value of the <Titanium.App.iOS.UserActivity.eligibleForPrediction> property.
      * @deprecated Set the value using <Titanium.App.iOS.UserActivity.eligibleForPrediction> instead.
      */
    def setEligibleForPrediction(eligibleForPrediction: Boolean): Unit = js.native
    
    /**
      * Sets the value of the <Titanium.App.iOS.UserActivity.eligibleForPublicIndexing> property.
      * @deprecated Set the value using <Titanium.App.iOS.UserActivity.eligibleForPublicIndexing> instead.
      */
    def setEligibleForPublicIndexing(eligibleForPublicIndexing: Boolean): Unit = js.native
    
    /**
      * Sets the value of the <Titanium.App.iOS.UserActivity.eligibleForSearch> property.
      * @deprecated Set the value using <Titanium.App.iOS.UserActivity.eligibleForSearch> instead.
      */
    def setEligibleForSearch(eligibleForSearch: Boolean): Unit = js.native
    
    /**
      * Sets the value of the <Titanium.App.iOS.UserActivity.expirationDate> property.
      * @deprecated Set the value using <Titanium.App.iOS.UserActivity.expirationDate> instead.
      */
    def setExpirationDate(expirationDate: String): Unit = js.native
    
    /**
      * Sets the value of the <Titanium.App.iOS.UserActivity.keywords> property.
      * @deprecated Set the value using <Titanium.App.iOS.UserActivity.keywords> instead.
      */
    def setKeywords(keywords: js.Array[String]): Unit = js.native
    
    /**
      * Sets the value of the <Titanium.App.iOS.UserActivity.needsSave> property.
      * @deprecated Set the value using <Titanium.App.iOS.UserActivity.needsSave> instead.
      */
    def setNeedsSave(needsSave: Boolean): Unit = js.native
    
    /**
      * Sets the value of the <Titanium.App.iOS.UserActivity.persistentIdentifier> property.
      * @deprecated Set the value using <Titanium.App.iOS.UserActivity.persistentIdentifier> instead.
      */
    def setPersistentIdentifier(persistentIdentifier: String): Unit = js.native
    
    /**
      * Sets the value of the <Titanium.App.iOS.UserActivity.requiredUserInfoKeys> property.
      * @deprecated Set the value using <Titanium.App.iOS.UserActivity.requiredUserInfoKeys> instead.
      */
    def setRequiredUserInfoKeys(requiredUserInfoKeys: js.Array[String]): Unit = js.native
    
    /**
      * Sets the value of the <Titanium.App.iOS.UserActivity.supported> property.
      * @deprecated Use [Titanium.App.iOS.UserActivity.isSupported](Titanium.App.iOS.UserActivity.isSupported) instead.
      */
    def setSupported(supported: Boolean): Unit = js.native
    
    /**
      * Sets the value of the <Titanium.App.iOS.UserActivity.title> property.
      * @deprecated Set the value using <Titanium.App.iOS.UserActivity.title> instead.
      */
    def setTitle(title: String): Unit = js.native
    
    /**
      * Sets the value of the <Titanium.App.iOS.UserActivity.userInfo> property.
      * @deprecated Set the value using <Titanium.App.iOS.UserActivity.userInfo> instead.
      */
    def setUserInfo(userInfo: js.Any): Unit = js.native
    
    /**
      * Sets the value of the <Titanium.App.iOS.UserActivity.webpageURL> property.
      * @deprecated Set the value using <Titanium.App.iOS.UserActivity.webpageURL> instead.
      */
    def setWebpageURL(webpageURL: String): Unit = js.native
    
    /**
      * Determines if user activities are supported (`true`) or not (`false`) by the device.
      * @deprecated Use [Titanium.App.iOS.UserActivity.isSupported](Titanium.App.iOS.UserActivity.isSupported) instead.
      */
    var supported: Boolean = js.native
    
    /**
      * An optional, user-visible title for this activity such as a document name or web page title.
      */
    var title: String = js.native
    
    /**
      * The userInfo dictionary contains application-specific state needed to continue an activity on another device.
      */
    var userInfo: js.Any = js.native
    
    /**
      * When no suitable application is installed on a resuming device and the `webpageURL` property is set,
      * the user activity will instead be continued in a web browser by loading the specified URL.
      */
    var webpageURL: String = js.native
  }
  
  /**
    * Base event for class Titanium.App.iOS.UserActivity
    */
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ @js.native
  trait UserActivityBaseEvent extends StObject {
    
    /**
      * Source object that fired the event.
      */
    var source: UserActivity = js.native
  }
  object UserActivityBaseEvent {
    
    @scala.inline
    def apply(source: UserActivity): UserActivityBaseEvent = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserActivityBaseEvent]
    }
    
    @scala.inline
    implicit class UserActivityBaseEventMutableBuilder[Self <: UserActivityBaseEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSource(value: UserActivity): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UserActivityEventMap extends ProxyEventMap {
    
    var useractivitydeleted: UserActivityUseractivitydeletedEvent = js.native
    
    var useractivitywascontinued: UserActivityUseractivitywascontinuedEvent = js.native
    
    var useractivitywillsave: UserActivityUseractivitywillsaveEvent = js.native
  }
  object UserActivityEventMap {
    
    @scala.inline
    def apply(
      useractivitydeleted: UserActivityUseractivitydeletedEvent,
      useractivitywascontinued: UserActivityUseractivitywascontinuedEvent,
      useractivitywillsave: UserActivityUseractivitywillsaveEvent
    ): UserActivityEventMap = {
      val __obj = js.Dynamic.literal(useractivitydeleted = useractivitydeleted.asInstanceOf[js.Any], useractivitywascontinued = useractivitywascontinued.asInstanceOf[js.Any], useractivitywillsave = useractivitywillsave.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserActivityEventMap]
    }
    
    @scala.inline
    implicit class UserActivityEventMapMutableBuilder[Self <: UserActivityEventMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUseractivitydeleted(value: UserActivityUseractivitydeletedEvent): Self = StObject.set(x, "useractivitydeleted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseractivitywascontinued(value: UserActivityUseractivitywascontinuedEvent): Self = StObject.set(x, "useractivitywascontinued", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseractivitywillsave(value: UserActivityUseractivitywillsaveEvent): Self = StObject.set(x, "useractivitywillsave", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Fired when the user activity get deleted using the <Titanium.App.iOS.UserActivity.deleteAllSavedUserActivities> or
    * <Titanium.App.iOS.UserActivity.deleteSavedUserActivitiesForPersistentIdentifiers> methods.
    */
  type UserActivityUseractivitydeletedEvent = UserActivityBaseEvent
  
  /**
    * Fired when the user activity was continued on another device.
    */
  @js.native
  trait UserActivityUseractivitywascontinuedEvent extends UserActivityBaseEvent {
    
    /**
      * The activityType of the User Activity triggering the event.
      */
    var activityType: String = js.native
    
    /**
      * The title of the User Activity if defined.
      */
    var title: String = js.native
    
    /**
      * Dictionary object containing the userInfo data of the User Activity.
      */
    var userInfo: js.Any = js.native
    
    /**
      * The webpageURL of the User Activity if defined.
      */
    var webpageURL: String = js.native
  }
  object UserActivityUseractivitywascontinuedEvent {
    
    @scala.inline
    def apply(activityType: String, source: UserActivity, title: String, userInfo: js.Any, webpageURL: String): UserActivityUseractivitywascontinuedEvent = {
      val __obj = js.Dynamic.literal(activityType = activityType.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], userInfo = userInfo.asInstanceOf[js.Any], webpageURL = webpageURL.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserActivityUseractivitywascontinuedEvent]
    }
    
    @scala.inline
    implicit class UserActivityUseractivitywascontinuedEventMutableBuilder[Self <: UserActivityUseractivitywascontinuedEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActivityType(value: String): Self = StObject.set(x, "activityType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserInfo(value: js.Any): Self = StObject.set(x, "userInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebpageURL(value: String): Self = StObject.set(x, "webpageURL", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Fired if the activity context needs to be saved before being continued on another device.
    * To fire the event, set the UserActiviy object's `needsSave ` property to `true`.
    * The receiver should update the activity with current activity state.
    * After the event is fired, iOS will reset the `needsSave` property to false.
    */
  @js.native
  trait UserActivityUseractivitywillsaveEvent extends UserActivityBaseEvent {
    
    /**
      * The activityType of the User Activity triggering the event.
      */
    var activityType: String = js.native
    
    /**
      * The title of the User Activity if defined.
      */
    var title: String = js.native
    
    /**
      * Dictionary object containing the userInfo data of the User Activity.
      */
    var userInfo: js.Any = js.native
    
    /**
      * The webpageURL of the User Activity if defined.
      */
    var webpageURL: String = js.native
  }
  object UserActivityUseractivitywillsaveEvent {
    
    @scala.inline
    def apply(activityType: String, source: UserActivity, title: String, userInfo: js.Any, webpageURL: String): UserActivityUseractivitywillsaveEvent = {
      val __obj = js.Dynamic.literal(activityType = activityType.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], userInfo = userInfo.asInstanceOf[js.Any], webpageURL = webpageURL.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserActivityUseractivitywillsaveEvent]
    }
    
    @scala.inline
    implicit class UserActivityUseractivitywillsaveEventMutableBuilder[Self <: UserActivityUseractivitywillsaveEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActivityType(value: String): Self = StObject.set(x, "activityType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserInfo(value: js.Any): Self = StObject.set(x, "userInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebpageURL(value: String): Self = StObject.set(x, "webpageURL", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * The UserDefaults module is used for storing application-related data in property/value pairs
    * that persist beyond application sessions and device power cycles. UserDefaults allows the suiteName
    * of the UserDefaults to be specified at creation time.
    */
  @js.native
  trait UserDefaults extends Proxy {
    
    /**
      * Adds the specified callback as an event listener for the named event.
      */
    @JSName("addEventListener")
    def addEventListener_change(
      name: change,
      callback: js.ThisFunction1[/* this */ this.type, /* event */ UserDefaultsChangeEvent, Unit]
    ): Unit = js.native
    
    /**
      * Fires a synthesized event to any registered listeners.
      */
    @JSName("fireEvent")
    def fireEvent_change(name: change): Unit = js.native
    @JSName("fireEvent")
    def fireEvent_change(name: change, event: UserDefaultsChangeEvent): Unit = js.native
    
    /**
      * Gets the value of the <Titanium.App.iOS.UserDefaults.suiteName> property.
      * @deprecated Access <Titanium.App.iOS.UserDefaults.suiteName> instead.
      */
    def getSuiteName(): String = js.native
    
    /**
      * Removes the specified callback as an event listener for the named event.
      */
    @JSName("removeEventListener")
    def removeEventListener_change(
      name: change,
      callback: js.ThisFunction1[/* this */ this.type, /* event */ UserDefaultsChangeEvent, Unit]
    ): Unit = js.native
    
    /**
      * Sets the value of the <Titanium.App.iOS.UserDefaults.suiteName> property.
      * @deprecated Set the value using <Titanium.App.iOS.UserDefaults.suiteName> instead.
      */
    def setSuiteName(suiteName: String): Unit = js.native
    
    /**
      * Sets the name of the suite to be used to access UserDefaults.
      */
    var suiteName: String = js.native
  }
  
  /**
    * Base event for class Titanium.App.iOS.UserDefaults
    */
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ @js.native
  trait UserDefaultsBaseEvent extends StObject {
    
    /**
      * Source object that fired the event.
      */
    var source: UserDefaults = js.native
  }
  object UserDefaultsBaseEvent {
    
    @scala.inline
    def apply(source: UserDefaults): UserDefaultsBaseEvent = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserDefaultsBaseEvent]
    }
    
    @scala.inline
    implicit class UserDefaultsBaseEventMutableBuilder[Self <: UserDefaultsBaseEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSource(value: UserDefaults): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Fired when a property is changed.
    */
  type UserDefaultsChangeEvent = UserDefaultsBaseEvent
  
  @js.native
  trait UserDefaultsEventMap extends ProxyEventMap {
    
    var change: UserDefaultsChangeEvent = js.native
  }
  object UserDefaultsEventMap {
    
    @scala.inline
    def apply(change: UserDefaultsChangeEvent): UserDefaultsEventMap = {
      val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserDefaultsEventMap]
    }
    
    @scala.inline
    implicit class UserDefaultsEventMapMutableBuilder[Self <: UserDefaultsEventMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChange(value: UserDefaultsChangeEvent): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * An action the user selects in response to an interactive notification.
    */
  @js.native
  trait UserNotificationAction extends Proxy {
    
    /**
      * Selects how to activate the application.
      */
    var activationMode: Double = js.native
    
    /**
      * Set to true if the action requires the device to be unlocked. On the Apple Watch actions never require authentication.
      */
    var authenticationRequired: Boolean = js.native
    
    /**
      * Custom behavior the user notification supports.
      */
    var behavior: Double = js.native
    
    /**
      * Set to true if the action causes destructive behavior to the user's data or the application.
      */
    var destructive: Boolean = js.native
    
    /**
      * Gets the value of the <Titanium.App.iOS.UserNotificationAction.activationMode> property.
      * @deprecated Access <Titanium.App.iOS.UserNotificationAction.activationMode> instead.
      */
    def getActivationMode(): Double = js.native
    
    /**
      * Gets the value of the <Titanium.App.iOS.UserNotificationAction.behavior> property.
      * @deprecated Access <Titanium.App.iOS.UserNotificationAction.behavior> instead.
      */
    def getBehavior(): Double = js.native
    
    /**
      * Identifier for this action. Used to identify the action the user pressed.
      */
    var identifier: String = js.native
    
    /**
      * Sets the value of the <Titanium.App.iOS.UserNotificationAction.activationMode> property.
      * @deprecated Set the value using <Titanium.App.iOS.UserNotificationAction.activationMode> instead.
      */
    def setActivationMode(activationMode: Double): Unit = js.native
    
    /**
      * Sets the value of the <Titanium.App.iOS.UserNotificationAction.behavior> property.
      * @deprecated Set the value using <Titanium.App.iOS.UserNotificationAction.behavior> instead.
      */
    def setBehavior(behavior: Double): Unit = js.native
    
    /**
      * Title of the button displayed in the notification.
      */
    var title: String = js.native
  }
  
  /**
    * A set of notification actions to associate with a notification.
    */
  @js.native
  trait UserNotificationCategory extends Proxy {
    
    /**
      * Array of notification actions to associate with the group.
      */
    var actionsForDefaultContext: js.Array[UserNotificationAction] = js.native
    
    /**
      * Array of notification actions to display for non-dialog-style notification.
      */
    var actionsForMinimalContext: js.Array[UserNotificationAction] = js.native
    
    /**
      * A format string for the summary description used when the system groups the category's notifications.
      */
    var categorySummaryFormat: String = js.native
    
    /**
      * The placeholder text to display when notification previews are disabled for the app.
      */
    var hiddenPreviewsBodyPlaceholder: String = js.native
    
    /**
      * Identifier for this category.
      */
    var identifier: String = js.native
    
    /**
      * The intents related to notifications of this category.
      */
    var intentIdentifiers: js.Array[String] = js.native
    
    /**
      * Options for how to handle notifications of this type.
      */
    var options: js.Array[Double] = js.native
  }
  
  /**
    * The top-level App iOS Notification Center module. It is used to control scheduled notifications
    * and receive details about the system-wide notification settings.
    */
  type UserNotificationCenter = Module
}
