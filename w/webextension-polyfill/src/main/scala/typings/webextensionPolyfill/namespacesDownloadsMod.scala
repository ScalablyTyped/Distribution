package typings.webextensionPolyfill

import typings.webextensionPolyfill.namespacesEventsMod.Events.Event
import typings.webextensionPolyfill.namespacesExtensionTypesMod.ExtensionTypes.DateType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object namespacesDownloadsMod {
  
  object Downloads {
    
    trait BooleanDelta extends StObject {
      
      /**
        * Optional.
        */
      var current: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Optional.
        */
      var previous: js.UndefOr[Boolean] = js.undefined
    }
    object BooleanDelta {
      
      inline def apply(): BooleanDelta = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[BooleanDelta]
      }
      
      extension [Self <: BooleanDelta](x: Self) {
        
        inline def setCurrent(value: Boolean): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
        
        inline def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
        
        inline def setPrevious(value: Boolean): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
        
        inline def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
      }
    }
    
    /**
      * <dl><dt>file</dt><dd>The download's filename is suspicious.</dd><dt>url</dt><dd>The download's URL is known to be
      * malicious.</dd><dt>content</dt><dd>The downloaded file is known to be malicious.</dd><dt>uncommon</dt><dd>
      * The download's URL is not commonly downloaded and could be dangerous.</dd><dt>safe</dt><dd>
      * The download presents no known danger to the user's computer.</dd></dl>These string constants will never change,
      * however the set of DangerTypes may change.
      */
    /* Rewritten from type alias, can be one of: 
      - typings.webextensionPolyfill.webextensionPolyfillStrings.file
      - typings.webextensionPolyfill.webextensionPolyfillStrings.url
      - typings.webextensionPolyfill.webextensionPolyfillStrings.content
      - typings.webextensionPolyfill.webextensionPolyfillStrings.uncommon
      - typings.webextensionPolyfill.webextensionPolyfillStrings.host
      - typings.webextensionPolyfill.webextensionPolyfillStrings.unwanted
      - typings.webextensionPolyfill.webextensionPolyfillStrings.safe
      - typings.webextensionPolyfill.webextensionPolyfillStrings.accepted
    */
    trait DangerType extends StObject
    object DangerType {
      
      inline def accepted: typings.webextensionPolyfill.webextensionPolyfillStrings.accepted = "accepted".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.accepted]
      
      inline def content: typings.webextensionPolyfill.webextensionPolyfillStrings.content = "content".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.content]
      
      inline def file: typings.webextensionPolyfill.webextensionPolyfillStrings.file = "file".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.file]
      
      inline def host: typings.webextensionPolyfill.webextensionPolyfillStrings.host = "host".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.host]
      
      inline def safe: typings.webextensionPolyfill.webextensionPolyfillStrings.safe = "safe".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.safe]
      
      inline def uncommon: typings.webextensionPolyfill.webextensionPolyfillStrings.uncommon = "uncommon".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.uncommon]
      
      inline def unwanted: typings.webextensionPolyfill.webextensionPolyfillStrings.unwanted = "unwanted".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.unwanted]
      
      inline def url: typings.webextensionPolyfill.webextensionPolyfillStrings.url = "url".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.url]
    }
    
    trait DoubleDelta extends StObject {
      
      /**
        * Optional.
        */
      var current: js.UndefOr[Double] = js.undefined
      
      /**
        * Optional.
        */
      var previous: js.UndefOr[Double] = js.undefined
    }
    object DoubleDelta {
      
      inline def apply(): DoubleDelta = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DoubleDelta]
      }
      
      extension [Self <: DoubleDelta](x: Self) {
        
        inline def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
        
        inline def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
        
        inline def setPrevious(value: Double): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
        
        inline def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
      }
    }
    
    trait DownloadItem extends StObject {
      
      /**
        * Optional.
        */
      var byExtensionId: js.UndefOr[String] = js.undefined
      
      /**
        * Optional.
        */
      var byExtensionName: js.UndefOr[String] = js.undefined
      
      /**
        * Number of bytes received so far from the host, without considering file compression.
        */
      var bytesReceived: Double
      
      var canResume: Boolean
      
      /**
        * The cookie store ID of the contextual identity.
        * Optional.
        */
      var cookieStoreId: js.UndefOr[String] = js.undefined
      
      /**
        * Indication of whether this download is thought to be safe or known to be suspicious.
        */
      var danger: DangerType
      
      /**
        * Number of milliseconds between the unix epoch and when this download ended.
        * Optional.
        */
      var endTime: js.UndefOr[String] = js.undefined
      
      /**
        * Number indicating why a download was interrupted.
        * Optional.
        */
      var error: js.UndefOr[InterruptReason] = js.undefined
      
      /**
        * Optional.
        */
      var estimatedEndTime: js.UndefOr[String] = js.undefined
      
      var exists: Boolean
      
      /**
        * Number of bytes in the whole file post-decompression, or -1 if unknown.
        */
      var fileSize: Double
      
      /**
        * Absolute local path.
        */
      var filename: String
      
      /**
        * An identifier that is persistent across browser sessions.
        */
      var id: Double
      
      /**
        * False if this download is recorded in the history, true if it is not recorded.
        */
      var incognito: Boolean
      
      /**
        * The file's MIME type.
        * Optional.
        */
      var mime: js.UndefOr[String] = js.undefined
      
      /**
        * True if the download has stopped reading data from the host, but kept the connection open.
        */
      var paused: Boolean
      
      /**
        * Optional.
        */
      var referrer: js.UndefOr[String] = js.undefined
      
      /**
        * Number of milliseconds between the unix epoch and when this download began.
        */
      var startTime: String
      
      /**
        * Indicates whether the download is progressing, interrupted, or complete.
        */
      var state: State
      
      /**
        * Number of bytes in the whole file, without considering file compression, or -1 if unknown.
        */
      var totalBytes: Double
      
      /**
        * Absolute URL.
        */
      var url: String
    }
    object DownloadItem {
      
      inline def apply(
        bytesReceived: Double,
        canResume: Boolean,
        danger: DangerType,
        exists: Boolean,
        fileSize: Double,
        filename: String,
        id: Double,
        incognito: Boolean,
        paused: Boolean,
        startTime: String,
        state: State,
        totalBytes: Double,
        url: String
      ): DownloadItem = {
        val __obj = js.Dynamic.literal(bytesReceived = bytesReceived.asInstanceOf[js.Any], canResume = canResume.asInstanceOf[js.Any], danger = danger.asInstanceOf[js.Any], exists = exists.asInstanceOf[js.Any], fileSize = fileSize.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], incognito = incognito.asInstanceOf[js.Any], paused = paused.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], totalBytes = totalBytes.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
        __obj.asInstanceOf[DownloadItem]
      }
      
      extension [Self <: DownloadItem](x: Self) {
        
        inline def setByExtensionId(value: String): Self = StObject.set(x, "byExtensionId", value.asInstanceOf[js.Any])
        
        inline def setByExtensionIdUndefined: Self = StObject.set(x, "byExtensionId", js.undefined)
        
        inline def setByExtensionName(value: String): Self = StObject.set(x, "byExtensionName", value.asInstanceOf[js.Any])
        
        inline def setByExtensionNameUndefined: Self = StObject.set(x, "byExtensionName", js.undefined)
        
        inline def setBytesReceived(value: Double): Self = StObject.set(x, "bytesReceived", value.asInstanceOf[js.Any])
        
        inline def setCanResume(value: Boolean): Self = StObject.set(x, "canResume", value.asInstanceOf[js.Any])
        
        inline def setCookieStoreId(value: String): Self = StObject.set(x, "cookieStoreId", value.asInstanceOf[js.Any])
        
        inline def setCookieStoreIdUndefined: Self = StObject.set(x, "cookieStoreId", js.undefined)
        
        inline def setDanger(value: DangerType): Self = StObject.set(x, "danger", value.asInstanceOf[js.Any])
        
        inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
        
        inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
        
        inline def setError(value: InterruptReason): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
        
        inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
        
        inline def setEstimatedEndTime(value: String): Self = StObject.set(x, "estimatedEndTime", value.asInstanceOf[js.Any])
        
        inline def setEstimatedEndTimeUndefined: Self = StObject.set(x, "estimatedEndTime", js.undefined)
        
        inline def setExists(value: Boolean): Self = StObject.set(x, "exists", value.asInstanceOf[js.Any])
        
        inline def setFileSize(value: Double): Self = StObject.set(x, "fileSize", value.asInstanceOf[js.Any])
        
        inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
        
        inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIncognito(value: Boolean): Self = StObject.set(x, "incognito", value.asInstanceOf[js.Any])
        
        inline def setMime(value: String): Self = StObject.set(x, "mime", value.asInstanceOf[js.Any])
        
        inline def setMimeUndefined: Self = StObject.set(x, "mime", js.undefined)
        
        inline def setPaused(value: Boolean): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
        
        inline def setReferrer(value: String): Self = StObject.set(x, "referrer", value.asInstanceOf[js.Any])
        
        inline def setReferrerUndefined: Self = StObject.set(x, "referrer", js.undefined)
        
        inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
        
        inline def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
        
        inline def setTotalBytes(value: Double): Self = StObject.set(x, "totalBytes", value.asInstanceOf[js.Any])
        
        inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * What to download and how.
      */
    trait DownloadOptionsType extends StObject {
      
      /**
        * When this flag is set to <code>true</code>, then the browser will allow downloads to proceed after encountering HTTP
        * errors such as <code>404 Not Found</code>.
        * Optional.
        */
      var allowHttpErrors: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Post body.
        * Optional.
        */
      var body: js.UndefOr[String] = js.undefined
      
      /**
        * Optional.
        */
      var conflictAction: js.UndefOr[FilenameConflictAction] = js.undefined
      
      /**
        * The cookie store ID of the contextual identity; requires "cookies" permission.
        * Optional.
        */
      var cookieStoreId: js.UndefOr[String] = js.undefined
      
      /**
        * A file path relative to the Downloads directory to contain the downloaded file.
        * Optional.
        */
      var filename: js.UndefOr[String] = js.undefined
      
      /**
        * Extra HTTP headers to send with the request if the URL uses the HTTP[s] protocol. Each header is represented as a
        * dictionary containing the keys <code>name</code> and either <code>value</code> or <code>binaryValue</code>,
        * restricted to those allowed by XMLHttpRequest.
        * Optional.
        */
      var headers: js.UndefOr[js.Array[DownloadOptionsTypeHeadersItemType]] = js.undefined
      
      /**
        * Whether to associate the download with a private browsing session.
        * Optional.
        */
      var incognito: js.UndefOr[Boolean] = js.undefined
      
      /**
        * The HTTP method to use if the URL uses the HTTP[S] protocol.
        * Optional.
        */
      var method: js.UndefOr[DownloadOptionsTypeMethodEnum] = js.undefined
      
      /**
        * Use a file-chooser to allow the user to select a filename. If the option is not specified,
        * the file chooser will be shown only if the Firefox "Always ask you where to save files" option is enabled (i.e.
        * the pref <code>browser.download.useDownloadDir</code> is set to <code>false</code>).
        * Optional.
        */
      var saveAs: js.UndefOr[Boolean] = js.undefined
      
      /**
        * The URL to download.
        */
      var url: String
    }
    object DownloadOptionsType {
      
      inline def apply(url: String): DownloadOptionsType = {
        val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
        __obj.asInstanceOf[DownloadOptionsType]
      }
      
      extension [Self <: DownloadOptionsType](x: Self) {
        
        inline def setAllowHttpErrors(value: Boolean): Self = StObject.set(x, "allowHttpErrors", value.asInstanceOf[js.Any])
        
        inline def setAllowHttpErrorsUndefined: Self = StObject.set(x, "allowHttpErrors", js.undefined)
        
        inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
        
        inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
        
        inline def setConflictAction(value: FilenameConflictAction): Self = StObject.set(x, "conflictAction", value.asInstanceOf[js.Any])
        
        inline def setConflictActionUndefined: Self = StObject.set(x, "conflictAction", js.undefined)
        
        inline def setCookieStoreId(value: String): Self = StObject.set(x, "cookieStoreId", value.asInstanceOf[js.Any])
        
        inline def setCookieStoreIdUndefined: Self = StObject.set(x, "cookieStoreId", js.undefined)
        
        inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
        
        inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
        
        inline def setHeaders(value: js.Array[DownloadOptionsTypeHeadersItemType]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
        
        inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
        
        inline def setHeadersVarargs(value: DownloadOptionsTypeHeadersItemType*): Self = StObject.set(x, "headers", js.Array(value*))
        
        inline def setIncognito(value: Boolean): Self = StObject.set(x, "incognito", value.asInstanceOf[js.Any])
        
        inline def setIncognitoUndefined: Self = StObject.set(x, "incognito", js.undefined)
        
        inline def setMethod(value: DownloadOptionsTypeMethodEnum): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
        
        inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
        
        inline def setSaveAs(value: Boolean): Self = StObject.set(x, "saveAs", value.asInstanceOf[js.Any])
        
        inline def setSaveAsUndefined: Self = StObject.set(x, "saveAs", js.undefined)
        
        inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      }
    }
    
    trait DownloadOptionsTypeHeadersItemType extends StObject {
      
      /**
        * Name of the HTTP header.
        */
      var name: String
      
      /**
        * Value of the HTTP header.
        */
      var value: String
    }
    object DownloadOptionsTypeHeadersItemType {
      
      inline def apply(name: String, value: String): DownloadOptionsTypeHeadersItemType = {
        val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
        __obj.asInstanceOf[DownloadOptionsTypeHeadersItemType]
      }
      
      extension [Self <: DownloadOptionsTypeHeadersItemType](x: Self) {
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * The HTTP method to use if the URL uses the HTTP[S] protocol.
      */
    /* Rewritten from type alias, can be one of: 
      - typings.webextensionPolyfill.webextensionPolyfillStrings.GET
      - typings.webextensionPolyfill.webextensionPolyfillStrings.POST
    */
    trait DownloadOptionsTypeMethodEnum extends StObject
    object DownloadOptionsTypeMethodEnum {
      
      inline def GET: typings.webextensionPolyfill.webextensionPolyfillStrings.GET = "GET".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.GET]
      
      inline def POST: typings.webextensionPolyfill.webextensionPolyfillStrings.POST = "POST".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.POST]
    }
    
    /**
      * Parameters that combine to specify a predicate that can be used to select a set of downloads.
      * Used for example in search() and erase()
      */
    trait DownloadQuery extends StObject {
      
      /**
        * Number of bytes received so far from the host, without considering file compression.
        * Optional.
        */
      var bytesReceived: js.UndefOr[Double] = js.undefined
      
      /**
        * The cookie store ID of the contextual identity.
        * Optional.
        */
      var cookieStoreId: js.UndefOr[String] = js.undefined
      
      /**
        * Indication of whether this download is thought to be safe or known to be suspicious.
        * Optional.
        */
      var danger: js.UndefOr[DangerType] = js.undefined
      
      /**
        * Optional.
        */
      var endTime: js.UndefOr[String] = js.undefined
      
      /**
        * Limits results to downloads that ended after the given ms since the epoch.
        * Optional.
        */
      var endedAfter: js.UndefOr[DownloadTime] = js.undefined
      
      /**
        * Limits results to downloads that ended before the given ms since the epoch.
        * Optional.
        */
      var endedBefore: js.UndefOr[DownloadTime] = js.undefined
      
      /**
        * Why a download was interrupted.
        * Optional.
        */
      var error: js.UndefOr[InterruptReason] = js.undefined
      
      /**
        * Optional.
        */
      var exists: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Number of bytes in the whole file post-decompression, or -1 if unknown.
        * Optional.
        */
      var fileSize: js.UndefOr[Double] = js.undefined
      
      /**
        * Absolute local path.
        * Optional.
        */
      var filename: js.UndefOr[String] = js.undefined
      
      /**
        * Limits results to <a href='#type-DownloadItem'>DownloadItems</a> whose <code>filename</code>
        * matches the given regular expression.
        * Optional.
        */
      var filenameRegex: js.UndefOr[String] = js.undefined
      
      /**
        * Optional.
        */
      var id: js.UndefOr[Double] = js.undefined
      
      /**
        * Setting this integer limits the number of results. Otherwise, all matching <a href='#type-DownloadItem'>DownloadItems</a>
        * will be returned.
        * Optional.
        */
      var limit: js.UndefOr[Double] = js.undefined
      
      /**
        * The file's MIME type.
        * Optional.
        */
      var mime: js.UndefOr[String] = js.undefined
      
      /**
        * Setting elements of this array to <a href='#type-DownloadItem'>DownloadItem</a> properties in order to sort the search
        * results. For example, setting <code>orderBy='startTime'</code> sorts the <a href='#type-DownloadItem'>DownloadItems</a>
        * by their start time in ascending order. To specify descending order, prefix <code>orderBy</code>
        * with a hyphen: '-startTime'.
        * Optional.
        */
      var orderBy: js.UndefOr[js.Array[String]] = js.undefined
      
      /**
        * True if the download has stopped reading data from the host, but kept the connection open.
        * Optional.
        */
      var paused: js.UndefOr[Boolean] = js.undefined
      
      /**
        * This array of search terms limits results to <a href='#type-DownloadItem'>DownloadItems</a> whose <code>filename</code>
        * or <code>url</code> contain all of the search terms that do not begin with a dash '-' and none of the search terms that
        * do begin with a dash.
        * Optional.
        */
      var query: js.UndefOr[js.Array[String]] = js.undefined
      
      /**
        * Optional.
        */
      var startTime: js.UndefOr[String] = js.undefined
      
      /**
        * Limits results to downloads that started after the given ms since the epoch.
        * Optional.
        */
      var startedAfter: js.UndefOr[DownloadTime] = js.undefined
      
      /**
        * Limits results to downloads that started before the given ms since the epoch.
        * Optional.
        */
      var startedBefore: js.UndefOr[DownloadTime] = js.undefined
      
      /**
        * Indicates whether the download is progressing, interrupted, or complete.
        * Optional.
        */
      var state: js.UndefOr[State] = js.undefined
      
      /**
        * Number of bytes in the whole file, without considering file compression, or -1 if unknown.
        * Optional.
        */
      var totalBytes: js.UndefOr[Double] = js.undefined
      
      /**
        * Limits results to downloads whose totalBytes is greater than the given integer.
        * Optional.
        */
      var totalBytesGreater: js.UndefOr[Double] = js.undefined
      
      /**
        * Limits results to downloads whose totalBytes is less than the given integer.
        * Optional.
        */
      var totalBytesLess: js.UndefOr[Double] = js.undefined
      
      /**
        * Absolute URL.
        * Optional.
        */
      var url: js.UndefOr[String] = js.undefined
      
      /**
        * Limits results to <a href='#type-DownloadItem'>DownloadItems</a> whose <code>url</code>
        * matches the given regular expression.
        * Optional.
        */
      var urlRegex: js.UndefOr[String] = js.undefined
    }
    object DownloadQuery {
      
      inline def apply(): DownloadQuery = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DownloadQuery]
      }
      
      extension [Self <: DownloadQuery](x: Self) {
        
        inline def setBytesReceived(value: Double): Self = StObject.set(x, "bytesReceived", value.asInstanceOf[js.Any])
        
        inline def setBytesReceivedUndefined: Self = StObject.set(x, "bytesReceived", js.undefined)
        
        inline def setCookieStoreId(value: String): Self = StObject.set(x, "cookieStoreId", value.asInstanceOf[js.Any])
        
        inline def setCookieStoreIdUndefined: Self = StObject.set(x, "cookieStoreId", js.undefined)
        
        inline def setDanger(value: DangerType): Self = StObject.set(x, "danger", value.asInstanceOf[js.Any])
        
        inline def setDangerUndefined: Self = StObject.set(x, "danger", js.undefined)
        
        inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
        
        inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
        
        inline def setEndedAfter(value: DownloadTime): Self = StObject.set(x, "endedAfter", value.asInstanceOf[js.Any])
        
        inline def setEndedAfterUndefined: Self = StObject.set(x, "endedAfter", js.undefined)
        
        inline def setEndedBefore(value: DownloadTime): Self = StObject.set(x, "endedBefore", value.asInstanceOf[js.Any])
        
        inline def setEndedBeforeUndefined: Self = StObject.set(x, "endedBefore", js.undefined)
        
        inline def setError(value: InterruptReason): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
        
        inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
        
        inline def setExists(value: Boolean): Self = StObject.set(x, "exists", value.asInstanceOf[js.Any])
        
        inline def setExistsUndefined: Self = StObject.set(x, "exists", js.undefined)
        
        inline def setFileSize(value: Double): Self = StObject.set(x, "fileSize", value.asInstanceOf[js.Any])
        
        inline def setFileSizeUndefined: Self = StObject.set(x, "fileSize", js.undefined)
        
        inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
        
        inline def setFilenameRegex(value: String): Self = StObject.set(x, "filenameRegex", value.asInstanceOf[js.Any])
        
        inline def setFilenameRegexUndefined: Self = StObject.set(x, "filenameRegex", js.undefined)
        
        inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
        
        inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
        
        inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
        
        inline def setMime(value: String): Self = StObject.set(x, "mime", value.asInstanceOf[js.Any])
        
        inline def setMimeUndefined: Self = StObject.set(x, "mime", js.undefined)
        
        inline def setOrderBy(value: js.Array[String]): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
        
        inline def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
        
        inline def setOrderByVarargs(value: String*): Self = StObject.set(x, "orderBy", js.Array(value*))
        
        inline def setPaused(value: Boolean): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
        
        inline def setPausedUndefined: Self = StObject.set(x, "paused", js.undefined)
        
        inline def setQuery(value: js.Array[String]): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
        
        inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
        
        inline def setQueryVarargs(value: String*): Self = StObject.set(x, "query", js.Array(value*))
        
        inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
        
        inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
        
        inline def setStartedAfter(value: DownloadTime): Self = StObject.set(x, "startedAfter", value.asInstanceOf[js.Any])
        
        inline def setStartedAfterUndefined: Self = StObject.set(x, "startedAfter", js.undefined)
        
        inline def setStartedBefore(value: DownloadTime): Self = StObject.set(x, "startedBefore", value.asInstanceOf[js.Any])
        
        inline def setStartedBeforeUndefined: Self = StObject.set(x, "startedBefore", js.undefined)
        
        inline def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
        
        inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
        
        inline def setTotalBytes(value: Double): Self = StObject.set(x, "totalBytes", value.asInstanceOf[js.Any])
        
        inline def setTotalBytesGreater(value: Double): Self = StObject.set(x, "totalBytesGreater", value.asInstanceOf[js.Any])
        
        inline def setTotalBytesGreaterUndefined: Self = StObject.set(x, "totalBytesGreater", js.undefined)
        
        inline def setTotalBytesLess(value: Double): Self = StObject.set(x, "totalBytesLess", value.asInstanceOf[js.Any])
        
        inline def setTotalBytesLessUndefined: Self = StObject.set(x, "totalBytesLess", js.undefined)
        
        inline def setTotalBytesUndefined: Self = StObject.set(x, "totalBytes", js.undefined)
        
        inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
        
        inline def setUrlRegex(value: String): Self = StObject.set(x, "urlRegex", value.asInstanceOf[js.Any])
        
        inline def setUrlRegexUndefined: Self = StObject.set(x, "urlRegex", js.undefined)
        
        inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      }
    }
    
    /**
      * A time specified as a Date object, a number or string representing milliseconds since the epoch, or an ISO 8601 string
      */
    type DownloadTime = String | DateType
    
    /* Rewritten from type alias, can be one of: 
      - typings.webextensionPolyfill.webextensionPolyfillStrings.uniquify
      - typings.webextensionPolyfill.webextensionPolyfillStrings.overwrite
      - typings.webextensionPolyfill.webextensionPolyfillStrings.prompt
    */
    trait FilenameConflictAction extends StObject
    object FilenameConflictAction {
      
      inline def overwrite: typings.webextensionPolyfill.webextensionPolyfillStrings.overwrite = "overwrite".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.overwrite]
      
      inline def prompt: typings.webextensionPolyfill.webextensionPolyfillStrings.prompt = "prompt".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.prompt]
      
      inline def uniquify: typings.webextensionPolyfill.webextensionPolyfillStrings.uniquify = "uniquify".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.uniquify]
    }
    
    trait GetFileIconOptionsType extends StObject {
      
      /**
        * The size of the icon.  The returned icon will be square with dimensions size * size pixels.
        * The default size for the icon is 32x32 pixels.
        * Optional.
        */
      var size: js.UndefOr[Double] = js.undefined
    }
    object GetFileIconOptionsType {
      
      inline def apply(): GetFileIconOptionsType = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[GetFileIconOptionsType]
      }
      
      extension [Self <: GetFileIconOptionsType](x: Self) {
        
        inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
        
        inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.webextensionPolyfill.webextensionPolyfillStrings.FILE_FAILED
      - typings.webextensionPolyfill.webextensionPolyfillStrings.FILE_ACCESS_DENIED
      - typings.webextensionPolyfill.webextensionPolyfillStrings.FILE_NO_SPACE
      - typings.webextensionPolyfill.webextensionPolyfillStrings.FILE_NAME_TOO_LONG
      - typings.webextensionPolyfill.webextensionPolyfillStrings.FILE_TOO_LARGE
      - typings.webextensionPolyfill.webextensionPolyfillStrings.FILE_VIRUS_INFECTED
      - typings.webextensionPolyfill.webextensionPolyfillStrings.FILE_TRANSIENT_ERROR
      - typings.webextensionPolyfill.webextensionPolyfillStrings.FILE_BLOCKED
      - typings.webextensionPolyfill.webextensionPolyfillStrings.FILE_SECURITY_CHECK_FAILED
      - typings.webextensionPolyfill.webextensionPolyfillStrings.FILE_TOO_SHORT
      - typings.webextensionPolyfill.webextensionPolyfillStrings.NETWORK_FAILED
      - typings.webextensionPolyfill.webextensionPolyfillStrings.NETWORK_TIMEOUT
      - typings.webextensionPolyfill.webextensionPolyfillStrings.NETWORK_DISCONNECTED
      - typings.webextensionPolyfill.webextensionPolyfillStrings.NETWORK_SERVER_DOWN
      - typings.webextensionPolyfill.webextensionPolyfillStrings.NETWORK_INVALID_REQUEST
      - typings.webextensionPolyfill.webextensionPolyfillStrings.SERVER_FAILED
      - typings.webextensionPolyfill.webextensionPolyfillStrings.SERVER_NO_RANGE
      - typings.webextensionPolyfill.webextensionPolyfillStrings.SERVER_BAD_CONTENT
      - typings.webextensionPolyfill.webextensionPolyfillStrings.SERVER_UNAUTHORIZED
      - typings.webextensionPolyfill.webextensionPolyfillStrings.SERVER_CERT_PROBLEM
      - typings.webextensionPolyfill.webextensionPolyfillStrings.SERVER_FORBIDDEN
      - typings.webextensionPolyfill.webextensionPolyfillStrings.USER_CANCELED
      - typings.webextensionPolyfill.webextensionPolyfillStrings.USER_SHUTDOWN
      - typings.webextensionPolyfill.webextensionPolyfillStrings.CRASH
    */
    trait InterruptReason extends StObject
    object InterruptReason {
      
      inline def CRASH: typings.webextensionPolyfill.webextensionPolyfillStrings.CRASH = "CRASH".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.CRASH]
      
      inline def FILE_ACCESS_DENIED: typings.webextensionPolyfill.webextensionPolyfillStrings.FILE_ACCESS_DENIED = "FILE_ACCESS_DENIED".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.FILE_ACCESS_DENIED]
      
      inline def FILE_BLOCKED: typings.webextensionPolyfill.webextensionPolyfillStrings.FILE_BLOCKED = "FILE_BLOCKED".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.FILE_BLOCKED]
      
      inline def FILE_FAILED: typings.webextensionPolyfill.webextensionPolyfillStrings.FILE_FAILED = "FILE_FAILED".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.FILE_FAILED]
      
      inline def FILE_NAME_TOO_LONG: typings.webextensionPolyfill.webextensionPolyfillStrings.FILE_NAME_TOO_LONG = "FILE_NAME_TOO_LONG".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.FILE_NAME_TOO_LONG]
      
      inline def FILE_NO_SPACE: typings.webextensionPolyfill.webextensionPolyfillStrings.FILE_NO_SPACE = "FILE_NO_SPACE".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.FILE_NO_SPACE]
      
      inline def FILE_SECURITY_CHECK_FAILED: typings.webextensionPolyfill.webextensionPolyfillStrings.FILE_SECURITY_CHECK_FAILED = "FILE_SECURITY_CHECK_FAILED".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.FILE_SECURITY_CHECK_FAILED]
      
      inline def FILE_TOO_LARGE: typings.webextensionPolyfill.webextensionPolyfillStrings.FILE_TOO_LARGE = "FILE_TOO_LARGE".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.FILE_TOO_LARGE]
      
      inline def FILE_TOO_SHORT: typings.webextensionPolyfill.webextensionPolyfillStrings.FILE_TOO_SHORT = "FILE_TOO_SHORT".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.FILE_TOO_SHORT]
      
      inline def FILE_TRANSIENT_ERROR: typings.webextensionPolyfill.webextensionPolyfillStrings.FILE_TRANSIENT_ERROR = "FILE_TRANSIENT_ERROR".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.FILE_TRANSIENT_ERROR]
      
      inline def FILE_VIRUS_INFECTED: typings.webextensionPolyfill.webextensionPolyfillStrings.FILE_VIRUS_INFECTED = "FILE_VIRUS_INFECTED".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.FILE_VIRUS_INFECTED]
      
      inline def NETWORK_DISCONNECTED: typings.webextensionPolyfill.webextensionPolyfillStrings.NETWORK_DISCONNECTED = "NETWORK_DISCONNECTED".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.NETWORK_DISCONNECTED]
      
      inline def NETWORK_FAILED: typings.webextensionPolyfill.webextensionPolyfillStrings.NETWORK_FAILED = "NETWORK_FAILED".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.NETWORK_FAILED]
      
      inline def NETWORK_INVALID_REQUEST: typings.webextensionPolyfill.webextensionPolyfillStrings.NETWORK_INVALID_REQUEST = "NETWORK_INVALID_REQUEST".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.NETWORK_INVALID_REQUEST]
      
      inline def NETWORK_SERVER_DOWN: typings.webextensionPolyfill.webextensionPolyfillStrings.NETWORK_SERVER_DOWN = "NETWORK_SERVER_DOWN".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.NETWORK_SERVER_DOWN]
      
      inline def NETWORK_TIMEOUT: typings.webextensionPolyfill.webextensionPolyfillStrings.NETWORK_TIMEOUT = "NETWORK_TIMEOUT".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.NETWORK_TIMEOUT]
      
      inline def SERVER_BAD_CONTENT: typings.webextensionPolyfill.webextensionPolyfillStrings.SERVER_BAD_CONTENT = "SERVER_BAD_CONTENT".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.SERVER_BAD_CONTENT]
      
      inline def SERVER_CERT_PROBLEM: typings.webextensionPolyfill.webextensionPolyfillStrings.SERVER_CERT_PROBLEM = "SERVER_CERT_PROBLEM".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.SERVER_CERT_PROBLEM]
      
      inline def SERVER_FAILED: typings.webextensionPolyfill.webextensionPolyfillStrings.SERVER_FAILED = "SERVER_FAILED".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.SERVER_FAILED]
      
      inline def SERVER_FORBIDDEN: typings.webextensionPolyfill.webextensionPolyfillStrings.SERVER_FORBIDDEN = "SERVER_FORBIDDEN".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.SERVER_FORBIDDEN]
      
      inline def SERVER_NO_RANGE: typings.webextensionPolyfill.webextensionPolyfillStrings.SERVER_NO_RANGE = "SERVER_NO_RANGE".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.SERVER_NO_RANGE]
      
      inline def SERVER_UNAUTHORIZED: typings.webextensionPolyfill.webextensionPolyfillStrings.SERVER_UNAUTHORIZED = "SERVER_UNAUTHORIZED".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.SERVER_UNAUTHORIZED]
      
      inline def USER_CANCELED: typings.webextensionPolyfill.webextensionPolyfillStrings.USER_CANCELED = "USER_CANCELED".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.USER_CANCELED]
      
      inline def USER_SHUTDOWN: typings.webextensionPolyfill.webextensionPolyfillStrings.USER_SHUTDOWN = "USER_SHUTDOWN".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.USER_SHUTDOWN]
    }
    
    trait OnChangedDownloadDeltaType extends StObject {
      
      /**
        * Optional.
        */
      var canResume: js.UndefOr[BooleanDelta] = js.undefined
      
      /**
        * Describes a change in a <a href='#type-DownloadItem'>DownloadItem</a>'s <code>danger</code>.
        * Optional.
        */
      var danger: js.UndefOr[StringDelta] = js.undefined
      
      /**
        * Describes a change in a <a href='#type-DownloadItem'>DownloadItem</a>'s <code>endTime</code>.
        * Optional.
        */
      var endTime: js.UndefOr[StringDelta] = js.undefined
      
      /**
        * Describes a change in a <a href='#type-DownloadItem'>DownloadItem</a>'s <code>error</code>.
        * Optional.
        */
      var error: js.UndefOr[StringDelta] = js.undefined
      
      /**
        * Optional.
        */
      var exists: js.UndefOr[BooleanDelta] = js.undefined
      
      /**
        * Describes a change in a <a href='#type-DownloadItem'>DownloadItem</a>'s <code>fileSize</code>.
        * Optional.
        */
      var fileSize: js.UndefOr[DoubleDelta] = js.undefined
      
      /**
        * Describes a change in a <a href='#type-DownloadItem'>DownloadItem</a>'s <code>filename</code>.
        * Optional.
        */
      var filename: js.UndefOr[StringDelta] = js.undefined
      
      /**
        * The <code>id</code> of the <a href='#type-DownloadItem'>DownloadItem</a> that changed.
        */
      var id: Double
      
      /**
        * Describes a change in a <a href='#type-DownloadItem'>DownloadItem</a>'s <code>mime</code>.
        * Optional.
        */
      var mime: js.UndefOr[StringDelta] = js.undefined
      
      /**
        * Describes a change in a <a href='#type-DownloadItem'>DownloadItem</a>'s <code>paused</code>.
        * Optional.
        */
      var paused: js.UndefOr[BooleanDelta] = js.undefined
      
      /**
        * Describes a change in a <a href='#type-DownloadItem'>DownloadItem</a>'s <code>startTime</code>.
        * Optional.
        */
      var startTime: js.UndefOr[StringDelta] = js.undefined
      
      /**
        * Describes a change in a <a href='#type-DownloadItem'>DownloadItem</a>'s <code>state</code>.
        * Optional.
        */
      var state: js.UndefOr[StringDelta] = js.undefined
      
      /**
        * Describes a change in a <a href='#type-DownloadItem'>DownloadItem</a>'s <code>totalBytes</code>.
        * Optional.
        */
      var totalBytes: js.UndefOr[DoubleDelta] = js.undefined
      
      /**
        * Describes a change in a <a href='#type-DownloadItem'>DownloadItem</a>'s <code>url</code>.
        * Optional.
        */
      var url: js.UndefOr[StringDelta] = js.undefined
    }
    object OnChangedDownloadDeltaType {
      
      inline def apply(id: Double): OnChangedDownloadDeltaType = {
        val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
        __obj.asInstanceOf[OnChangedDownloadDeltaType]
      }
      
      extension [Self <: OnChangedDownloadDeltaType](x: Self) {
        
        inline def setCanResume(value: BooleanDelta): Self = StObject.set(x, "canResume", value.asInstanceOf[js.Any])
        
        inline def setCanResumeUndefined: Self = StObject.set(x, "canResume", js.undefined)
        
        inline def setDanger(value: StringDelta): Self = StObject.set(x, "danger", value.asInstanceOf[js.Any])
        
        inline def setDangerUndefined: Self = StObject.set(x, "danger", js.undefined)
        
        inline def setEndTime(value: StringDelta): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
        
        inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
        
        inline def setError(value: StringDelta): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
        
        inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
        
        inline def setExists(value: BooleanDelta): Self = StObject.set(x, "exists", value.asInstanceOf[js.Any])
        
        inline def setExistsUndefined: Self = StObject.set(x, "exists", js.undefined)
        
        inline def setFileSize(value: DoubleDelta): Self = StObject.set(x, "fileSize", value.asInstanceOf[js.Any])
        
        inline def setFileSizeUndefined: Self = StObject.set(x, "fileSize", js.undefined)
        
        inline def setFilename(value: StringDelta): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
        
        inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
        
        inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setMime(value: StringDelta): Self = StObject.set(x, "mime", value.asInstanceOf[js.Any])
        
        inline def setMimeUndefined: Self = StObject.set(x, "mime", js.undefined)
        
        inline def setPaused(value: BooleanDelta): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
        
        inline def setPausedUndefined: Self = StObject.set(x, "paused", js.undefined)
        
        inline def setStartTime(value: StringDelta): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
        
        inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
        
        inline def setState(value: StringDelta): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
        
        inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
        
        inline def setTotalBytes(value: DoubleDelta): Self = StObject.set(x, "totalBytes", value.asInstanceOf[js.Any])
        
        inline def setTotalBytesUndefined: Self = StObject.set(x, "totalBytes", js.undefined)
        
        inline def setUrl(value: StringDelta): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
        
        inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      }
    }
    
    /**
      * <dl><dt>in_progress</dt><dd>The download is currently receiving data from the server.</dd><dt>interrupted</dt><dd>
      * An error broke the connection with the file host.</dd><dt>complete</dt><dd>The download completed successfully.</dd></dl>
      * These string constants will never change, however the set of States may change.
      */
    /* Rewritten from type alias, can be one of: 
      - typings.webextensionPolyfill.webextensionPolyfillStrings.in_progress
      - typings.webextensionPolyfill.webextensionPolyfillStrings.interrupted
      - typings.webextensionPolyfill.webextensionPolyfillStrings.complete
    */
    trait State extends StObject
    object State {
      
      inline def complete: typings.webextensionPolyfill.webextensionPolyfillStrings.complete = "complete".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.complete]
      
      inline def in_progress: typings.webextensionPolyfill.webextensionPolyfillStrings.in_progress = "in_progress".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.in_progress]
      
      inline def interrupted: typings.webextensionPolyfill.webextensionPolyfillStrings.interrupted = "interrupted".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.interrupted]
    }
    
    @js.native
    trait Static extends StObject {
      
      /**
        * Cancel a download. When <code>callback</code> is run, the download is cancelled, completed,
        * interrupted or doesn't exist anymore.
        *
        * @param downloadId The id of the download to cancel.
        */
      def cancel(downloadId: Double): js.Promise[Unit] = js.native
      
      /**
        * Download a URL. If the URL uses the HTTP[S] protocol, then the request will include all cookies currently set for its
        * hostname. If both <code>filename</code> and <code>saveAs</code> are specified, then the Save As dialog will be displayed,
        * pre-populated with the specified <code>filename</code>. If the download started successfully, <code>callback</code>
        * will be called with the new <a href='#type-DownloadItem'>DownloadItem</a>'s <code>downloadId</code>.
        * If there was an error starting the download, then <code>callback</code> will be called with <code>
        * downloadId=undefined</code> and <a href='extension.html#property-lastError'>chrome.extension.lastError</a>
        * will contain a descriptive string. The error strings are not guaranteed to remain backwards compatible between releases.
        * You must not parse it.
        *
        * @param options What to download and how.
        */
      def download(options: DownloadOptionsType): js.Promise[Double] = js.native
      
      /**
        * Erase matching <a href='#type-DownloadItem'>DownloadItems</a> from history
        *
        * @param query
        */
      def erase(query: DownloadQuery): js.Promise[js.Array[Double]] = js.native
      
      /**
        * Retrieve an icon for the specified download. For new downloads, file icons are available after the <a
        * href='#event-onCreated'>onCreated</a> event has been received. The image returned by this function while a download is
        * in progress may be different from the image returned after the download is complete.
        * Icon retrieval is done by querying the underlying operating system or toolkit depending on the platform.
        * The icon that is returned will therefore depend on a number of factors including state of the download, platform,
        * registered file types and visual theme. If a file icon cannot be determined, <a href='extension.
        * html#property-lastError'>chrome.extension.lastError</a> will contain an error message.
        *
        * @param downloadId The identifier for the download.
        * @param options Optional.
        */
      def getFileIcon(downloadId: Double): js.Promise[String] = js.native
      def getFileIcon(downloadId: Double, options: GetFileIconOptionsType): js.Promise[String] = js.native
      
      /**
        * When any of a <a href='#type-DownloadItem'>DownloadItem</a>'s properties except <code>bytesReceived</code> changes,
        * this event fires with the <code>downloadId</code> and an object containing the properties that changed.
        *
        * @param downloadDelta
        */
      var onChanged: Event[js.Function1[/* downloadDelta */ OnChangedDownloadDeltaType, Unit]] = js.native
      
      /**
        * This event fires with the <a href='#type-DownloadItem'>DownloadItem</a> object when a download begins.
        *
        * @param downloadItem
        */
      var onCreated: Event[js.Function1[/* downloadItem */ DownloadItem, Unit]] = js.native
      
      /**
        * Fires with the <code>downloadId</code> when a download is erased from history.
        *
        * @param downloadId The <code>id</code> of the <a href='#type-DownloadItem'>DownloadItem</a> that was erased.
        */
      var onErased: Event[js.Function1[/* downloadId */ Double, Unit]] = js.native
      
      /**
        * Open the downloaded file.
        *
        * @param downloadId
        */
      def open(downloadId: Double): js.Promise[Unit] = js.native
      
      /**
        * Pause the download. If the request was successful the download is in a paused state. Otherwise <a href='extension.
        * html#property-lastError'>chrome.extension.lastError</a> contains an error message.
        * The request will fail if the download is not active.
        *
        * @param downloadId The id of the download to pause.
        */
      def pause(downloadId: Double): js.Promise[Unit] = js.native
      
      /**
        * @param downloadId
        */
      def removeFile(downloadId: Double): js.Promise[Unit] = js.native
      
      /**
        * Resume a paused download. If the request was successful the download is in progress and unpaused.
        * Otherwise <a href='extension.html#property-lastError'>chrome.extension.lastError</a> contains an error message.
        * The request will fail if the download is not active.
        *
        * @param downloadId The id of the download to resume.
        */
      def resume(downloadId: Double): js.Promise[Unit] = js.native
      
      /**
        * Find <a href='#type-DownloadItem'>DownloadItems</a>. Set <code>query</code> to the empty object to get all <a
        * href='#type-DownloadItem'>DownloadItems</a>. To get a specific <a href='#type-DownloadItem'>DownloadItem</a>,
        * set only the <code>id</code> field.
        *
        * @param query
        */
      def search(query: DownloadQuery): js.Promise[js.Array[DownloadItem]] = js.native
      
      /**
        * Show the downloaded file in its folder in a file manager.
        *
        * @param downloadId
        */
      def show(downloadId: Double): js.Promise[Boolean] = js.native
      
      def showDefaultFolder(): Unit = js.native
    }
    
    trait StringDelta extends StObject {
      
      /**
        * Optional.
        */
      var current: js.UndefOr[String] = js.undefined
      
      /**
        * Optional.
        */
      var previous: js.UndefOr[String] = js.undefined
    }
    object StringDelta {
      
      inline def apply(): StringDelta = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[StringDelta]
      }
      
      extension [Self <: StringDelta](x: Self) {
        
        inline def setCurrent(value: String): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
        
        inline def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
        
        inline def setPrevious(value: String): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
        
        inline def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
      }
    }
  }
}
