package typings.webextensionPolyfill

import typings.webextensionPolyfill.namespacesEventsMod.Events.Event
import typings.webextensionPolyfill.namespacesExtensionTypesMod.ExtensionTypes.DateType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object namespacesHistoryMod {
  
  object History {
    
    trait AddUrlDetailsType extends StObject {
      
      /**
        * The title of the page.
        * Optional.
        */
      var title: js.UndefOr[String] = js.undefined
      
      /**
        * The $(topic:transition-types)[transition type] for this visit from its referrer.
        * Optional.
        */
      var transition: js.UndefOr[TransitionType] = js.undefined
      
      /**
        * The URL to add. Must be a valid URL that can be added to history.
        */
      var url: String
      
      /**
        * The date when this visit occurred.
        * Optional.
        */
      var visitTime: js.UndefOr[DateType] = js.undefined
    }
    object AddUrlDetailsType {
      
      inline def apply(url: String): AddUrlDetailsType = {
        val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
        __obj.asInstanceOf[AddUrlDetailsType]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: AddUrlDetailsType] (val x: Self) extends AnyVal {
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
        
        inline def setTransition(value: TransitionType): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
        
        inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
        
        inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
        
        inline def setVisitTime(value: DateType): Self = StObject.set(x, "visitTime", value.asInstanceOf[js.Any])
        
        inline def setVisitTimeUndefined: Self = StObject.set(x, "visitTime", js.undefined)
      }
    }
    
    trait DeleteRangeRangeType extends StObject {
      
      /**
        * Items added to history before this date.
        */
      var endTime: DateType
      
      /**
        * Items added to history after this date.
        */
      var startTime: DateType
    }
    object DeleteRangeRangeType {
      
      inline def apply(endTime: DateType, startTime: DateType): DeleteRangeRangeType = {
        val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
        __obj.asInstanceOf[DeleteRangeRangeType]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: DeleteRangeRangeType] (val x: Self) extends AnyVal {
        
        inline def setEndTime(value: DateType): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
        
        inline def setStartTime(value: DateType): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      }
    }
    
    trait DeleteUrlDetailsType extends StObject {
      
      /**
        * The URL to remove.
        */
      var url: String
    }
    object DeleteUrlDetailsType {
      
      inline def apply(url: String): DeleteUrlDetailsType = {
        val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
        __obj.asInstanceOf[DeleteUrlDetailsType]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: DeleteUrlDetailsType] (val x: Self) extends AnyVal {
        
        inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      }
    }
    
    trait GetVisitsDetailsType extends StObject {
      
      /**
        * The URL for which to retrieve visit information.  It must be in the format as returned from a call to history.search.
        */
      var url: String
    }
    object GetVisitsDetailsType {
      
      inline def apply(url: String): GetVisitsDetailsType = {
        val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
        __obj.asInstanceOf[GetVisitsDetailsType]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: GetVisitsDetailsType] (val x: Self) extends AnyVal {
        
        inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * An object encapsulating one result of a history query.
      */
    trait HistoryItem extends StObject {
      
      /**
        * The unique identifier for the item.
        */
      var id: String
      
      /**
        * When this page was last loaded, represented in milliseconds since the epoch.
        * Optional.
        */
      var lastVisitTime: js.UndefOr[Double] = js.undefined
      
      /**
        * The title of the page when it was last loaded.
        * Optional.
        */
      var title: js.UndefOr[String] = js.undefined
      
      /**
        * The number of times the user has navigated to this page by typing in the address.
        * Optional.
        */
      var typedCount: js.UndefOr[Double] = js.undefined
      
      /**
        * The URL navigated to by a user.
        * Optional.
        */
      var url: js.UndefOr[String] = js.undefined
      
      /**
        * The number of times the user has navigated to this page.
        * Optional.
        */
      var visitCount: js.UndefOr[Double] = js.undefined
    }
    object HistoryItem {
      
      inline def apply(id: String): HistoryItem = {
        val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
        __obj.asInstanceOf[HistoryItem]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: HistoryItem] (val x: Self) extends AnyVal {
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setLastVisitTime(value: Double): Self = StObject.set(x, "lastVisitTime", value.asInstanceOf[js.Any])
        
        inline def setLastVisitTimeUndefined: Self = StObject.set(x, "lastVisitTime", js.undefined)
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
        
        inline def setTypedCount(value: Double): Self = StObject.set(x, "typedCount", value.asInstanceOf[js.Any])
        
        inline def setTypedCountUndefined: Self = StObject.set(x, "typedCount", js.undefined)
        
        inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
        
        inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
        
        inline def setVisitCount(value: Double): Self = StObject.set(x, "visitCount", value.asInstanceOf[js.Any])
        
        inline def setVisitCountUndefined: Self = StObject.set(x, "visitCount", js.undefined)
      }
    }
    
    trait OnTitleChangedChangedType extends StObject {
      
      /**
        * The new title for the URL.
        */
      var title: String
      
      /**
        * The URL for which the title has changed
        */
      var url: String
    }
    object OnTitleChangedChangedType {
      
      inline def apply(title: String, url: String): OnTitleChangedChangedType = {
        val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
        __obj.asInstanceOf[OnTitleChangedChangedType]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: OnTitleChangedChangedType] (val x: Self) extends AnyVal {
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      }
    }
    
    trait OnVisitRemovedRemovedType extends StObject {
      
      /**
        * True if all history was removed.  If true, then urls will be empty.
        */
      var allHistory: Boolean
      
      var urls: js.Array[String]
    }
    object OnVisitRemovedRemovedType {
      
      inline def apply(allHistory: Boolean, urls: js.Array[String]): OnVisitRemovedRemovedType = {
        val __obj = js.Dynamic.literal(allHistory = allHistory.asInstanceOf[js.Any], urls = urls.asInstanceOf[js.Any])
        __obj.asInstanceOf[OnVisitRemovedRemovedType]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: OnVisitRemovedRemovedType] (val x: Self) extends AnyVal {
        
        inline def setAllHistory(value: Boolean): Self = StObject.set(x, "allHistory", value.asInstanceOf[js.Any])
        
        inline def setUrls(value: js.Array[String]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
        
        inline def setUrlsVarargs(value: String*): Self = StObject.set(x, "urls", js.Array(value*))
      }
    }
    
    trait SearchQueryType extends StObject {
      
      /**
        * Limit results to those visited before this date.
        * Optional.
        */
      var endTime: js.UndefOr[DateType] = js.undefined
      
      /**
        * The maximum number of results to retrieve.  Defaults to 100.
        * Optional.
        */
      var maxResults: js.UndefOr[Double] = js.undefined
      
      /**
        * Limit results to those visited after this date. If not specified, this defaults to 24 hours in the past.
        * Optional.
        */
      var startTime: js.UndefOr[DateType] = js.undefined
      
      /**
        * A free-text query to the history service.  Leave empty to retrieve all pages.
        */
      var text: String
    }
    object SearchQueryType {
      
      inline def apply(text: String): SearchQueryType = {
        val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
        __obj.asInstanceOf[SearchQueryType]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: SearchQueryType] (val x: Self) extends AnyVal {
        
        inline def setEndTime(value: DateType): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
        
        inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
        
        inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
        
        inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
        
        inline def setStartTime(value: DateType): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
        
        inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
        
        inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      }
    }
    
    trait Static extends StObject {
      
      /**
        * Adds a URL to the history with a default visitTime of the current time and a default $(topic:transition-types)
        * [transition type] of "link".
        *
        * @param details
        */
      def addUrl(details: AddUrlDetailsType): js.Promise[Unit]
      
      /**
        * Deletes all items from the history.
        */
      def deleteAll(): js.Promise[Unit]
      
      /**
        * Removes all items within the specified date range from the history.  Pages will not be removed from the history unless
        * all visits fall within the range.
        *
        * @param range
        */
      def deleteRange(range: DeleteRangeRangeType): js.Promise[Unit]
      
      /**
        * Removes all occurrences of the given URL from the history.
        *
        * @param details
        */
      def deleteUrl(details: DeleteUrlDetailsType): js.Promise[Unit]
      
      /**
        * Retrieves information about visits to a URL.
        *
        * @param details
        */
      def getVisits(details: GetVisitsDetailsType): js.Promise[js.Array[VisitItem]]
      
      /**
        * Fired when the title of a URL is changed in the browser history.
        *
        * @param changed
        */
      var onTitleChanged: Event[js.Function1[/* changed */ OnTitleChangedChangedType, Unit]]
      
      /**
        * Fired when one or more URLs are removed from the history service.  When all visits have been removed the URL is purged
        * from history.
        *
        * @param removed
        */
      var onVisitRemoved: Event[js.Function1[/* removed */ OnVisitRemovedRemovedType, Unit]]
      
      /**
        * Fired when a URL is visited, providing the HistoryItem data for that URL.  This event fires before the page has loaded.
        *
        * @param result
        */
      var onVisited: Event[js.Function1[/* result */ HistoryItem, Unit]]
      
      /**
        * Searches the history for the last visit time of each page matching the query.
        *
        * @param query
        */
      def search(query: SearchQueryType): js.Promise[js.Array[HistoryItem]]
    }
    object Static {
      
      inline def apply(
        addUrl: AddUrlDetailsType => js.Promise[Unit],
        deleteAll: () => js.Promise[Unit],
        deleteRange: DeleteRangeRangeType => js.Promise[Unit],
        deleteUrl: DeleteUrlDetailsType => js.Promise[Unit],
        getVisits: GetVisitsDetailsType => js.Promise[js.Array[VisitItem]],
        onTitleChanged: Event[js.Function1[/* changed */ OnTitleChangedChangedType, Unit]],
        onVisitRemoved: Event[js.Function1[/* removed */ OnVisitRemovedRemovedType, Unit]],
        onVisited: Event[js.Function1[/* result */ HistoryItem, Unit]],
        search: SearchQueryType => js.Promise[js.Array[HistoryItem]]
      ): Static = {
        val __obj = js.Dynamic.literal(addUrl = js.Any.fromFunction1(addUrl), deleteAll = js.Any.fromFunction0(deleteAll), deleteRange = js.Any.fromFunction1(deleteRange), deleteUrl = js.Any.fromFunction1(deleteUrl), getVisits = js.Any.fromFunction1(getVisits), onTitleChanged = onTitleChanged.asInstanceOf[js.Any], onVisitRemoved = onVisitRemoved.asInstanceOf[js.Any], onVisited = onVisited.asInstanceOf[js.Any], search = js.Any.fromFunction1(search))
        __obj.asInstanceOf[Static]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Static] (val x: Self) extends AnyVal {
        
        inline def setAddUrl(value: AddUrlDetailsType => js.Promise[Unit]): Self = StObject.set(x, "addUrl", js.Any.fromFunction1(value))
        
        inline def setDeleteAll(value: () => js.Promise[Unit]): Self = StObject.set(x, "deleteAll", js.Any.fromFunction0(value))
        
        inline def setDeleteRange(value: DeleteRangeRangeType => js.Promise[Unit]): Self = StObject.set(x, "deleteRange", js.Any.fromFunction1(value))
        
        inline def setDeleteUrl(value: DeleteUrlDetailsType => js.Promise[Unit]): Self = StObject.set(x, "deleteUrl", js.Any.fromFunction1(value))
        
        inline def setGetVisits(value: GetVisitsDetailsType => js.Promise[js.Array[VisitItem]]): Self = StObject.set(x, "getVisits", js.Any.fromFunction1(value))
        
        inline def setOnTitleChanged(value: Event[js.Function1[/* changed */ OnTitleChangedChangedType, Unit]]): Self = StObject.set(x, "onTitleChanged", value.asInstanceOf[js.Any])
        
        inline def setOnVisitRemoved(value: Event[js.Function1[/* removed */ OnVisitRemovedRemovedType, Unit]]): Self = StObject.set(x, "onVisitRemoved", value.asInstanceOf[js.Any])
        
        inline def setOnVisited(value: Event[js.Function1[/* result */ HistoryItem, Unit]]): Self = StObject.set(x, "onVisited", value.asInstanceOf[js.Any])
        
        inline def setSearch(value: SearchQueryType => js.Promise[js.Array[HistoryItem]]): Self = StObject.set(x, "search", js.Any.fromFunction1(value))
      }
    }
    
    /**
      * The $(topic:transition-types)[transition type] for this visit from its referrer.
      */
    /* Rewritten from type alias, can be one of: 
      - typings.webextensionPolyfill.webextensionPolyfillStrings.link
      - typings.webextensionPolyfill.webextensionPolyfillStrings.typed
      - typings.webextensionPolyfill.webextensionPolyfillStrings.auto_bookmark
      - typings.webextensionPolyfill.webextensionPolyfillStrings.auto_subframe
      - typings.webextensionPolyfill.webextensionPolyfillStrings.manual_subframe
      - typings.webextensionPolyfill.webextensionPolyfillStrings.generated
      - typings.webextensionPolyfill.webextensionPolyfillStrings.auto_toplevel
      - typings.webextensionPolyfill.webextensionPolyfillStrings.form_submit
      - typings.webextensionPolyfill.webextensionPolyfillStrings.reload
      - typings.webextensionPolyfill.webextensionPolyfillStrings.keyword
      - typings.webextensionPolyfill.webextensionPolyfillStrings.keyword_generated
    */
    trait TransitionType extends StObject
    object TransitionType {
      
      inline def auto_bookmark: typings.webextensionPolyfill.webextensionPolyfillStrings.auto_bookmark = "auto_bookmark".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.auto_bookmark]
      
      inline def auto_subframe: typings.webextensionPolyfill.webextensionPolyfillStrings.auto_subframe = "auto_subframe".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.auto_subframe]
      
      inline def auto_toplevel: typings.webextensionPolyfill.webextensionPolyfillStrings.auto_toplevel = "auto_toplevel".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.auto_toplevel]
      
      inline def form_submit: typings.webextensionPolyfill.webextensionPolyfillStrings.form_submit = "form_submit".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.form_submit]
      
      inline def generated: typings.webextensionPolyfill.webextensionPolyfillStrings.generated = "generated".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.generated]
      
      inline def keyword: typings.webextensionPolyfill.webextensionPolyfillStrings.keyword = "keyword".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.keyword]
      
      inline def keyword_generated: typings.webextensionPolyfill.webextensionPolyfillStrings.keyword_generated = "keyword_generated".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.keyword_generated]
      
      inline def link: typings.webextensionPolyfill.webextensionPolyfillStrings.link = "link".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.link]
      
      inline def manual_subframe: typings.webextensionPolyfill.webextensionPolyfillStrings.manual_subframe = "manual_subframe".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.manual_subframe]
      
      inline def reload: typings.webextensionPolyfill.webextensionPolyfillStrings.reload = "reload".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.reload]
      
      inline def typed: typings.webextensionPolyfill.webextensionPolyfillStrings.typed = "typed".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.typed]
    }
    
    /**
      * An object encapsulating one visit to a URL.
      */
    trait VisitItem extends StObject {
      
      /**
        * The unique identifier for the item.
        */
      var id: String
      
      /**
        * The visit ID of the referrer.
        */
      var referringVisitId: String
      
      /**
        * The $(topic:transition-types)[transition type] for this visit from its referrer.
        */
      var transition: TransitionType
      
      /**
        * The unique identifier for this visit.
        */
      var visitId: String
      
      /**
        * When this visit occurred, represented in milliseconds since the epoch.
        * Optional.
        */
      var visitTime: js.UndefOr[Double] = js.undefined
    }
    object VisitItem {
      
      inline def apply(id: String, referringVisitId: String, transition: TransitionType, visitId: String): VisitItem = {
        val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], referringVisitId = referringVisitId.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any], visitId = visitId.asInstanceOf[js.Any])
        __obj.asInstanceOf[VisitItem]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: VisitItem] (val x: Self) extends AnyVal {
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setReferringVisitId(value: String): Self = StObject.set(x, "referringVisitId", value.asInstanceOf[js.Any])
        
        inline def setTransition(value: TransitionType): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
        
        inline def setVisitId(value: String): Self = StObject.set(x, "visitId", value.asInstanceOf[js.Any])
        
        inline def setVisitTime(value: Double): Self = StObject.set(x, "visitTime", value.asInstanceOf[js.Any])
        
        inline def setVisitTimeUndefined: Self = StObject.set(x, "visitTime", js.undefined)
      }
    }
  }
}
