package typings.thunderbirdWebextBrowser.messenger

import typings.thunderbirdWebextBrowser.messenger.extensionTypes.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object downloads {
  
  trait BooleanDelta extends StObject {
    
    var current: js.UndefOr[Boolean] = js.undefined
    
    var previous: js.UndefOr[Boolean] = js.undefined
  }
  object BooleanDelta {
    
    inline def apply(): BooleanDelta = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BooleanDelta]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BooleanDelta] (val x: Self) extends AnyVal {
      
      inline def setCurrent(value: Boolean): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
      
      inline def setPrevious(value: Boolean): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
      
      inline def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.file
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.url
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.content
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.uncommon
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.host
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.unwanted
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.safe
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.accepted
  */
  trait DangerType extends StObject
  object DangerType {
    
    inline def accepted: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.accepted = "accepted".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.accepted]
    
    inline def content: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.content = "content".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.content]
    
    inline def file: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.file = "file".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.file]
    
    inline def host: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.host = "host".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.host]
    
    inline def safe: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.safe = "safe".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.safe]
    
    inline def uncommon: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.uncommon = "uncommon".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.uncommon]
    
    inline def unwanted: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.unwanted = "unwanted".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.unwanted]
    
    inline def url: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.url = "url".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.url]
  }
  
  trait DoubleDelta extends StObject {
    
    var current: js.UndefOr[Double] = js.undefined
    
    var previous: js.UndefOr[Double] = js.undefined
  }
  object DoubleDelta {
    
    inline def apply(): DoubleDelta = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DoubleDelta]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DoubleDelta] (val x: Self) extends AnyVal {
      
      inline def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
      
      inline def setPrevious(value: Double): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
      
      inline def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
    }
  }
  
  trait DownloadItem extends StObject {
    
    var byExtensionId: js.UndefOr[String] = js.undefined
    
    var byExtensionName: js.UndefOr[String] = js.undefined
    
    /**
      * Number of bytes received so far from the host, without considering
      * file compression.
      */
    var bytesReceived: Double
    
    var canResume: Boolean
    
    /** The cookie store ID of the contextual identity. */
    var cookieStoreId: js.UndefOr[String] = js.undefined
    
    /**
      * Indication of whether this download is thought to be safe or known to
      * be suspicious.
      */
    var danger: DangerType
    
    /**
      * Number of milliseconds between the unix epoch and when this download
      * ended.
      */
    var endTime: js.UndefOr[String] = js.undefined
    
    /** Number indicating why a download was interrupted. */
    var error: js.UndefOr[InterruptReason] = js.undefined
    
    var estimatedEndTime: js.UndefOr[String] = js.undefined
    
    var exists: Boolean
    
    /**
      * Number of bytes in the whole file post-decompression, or -1 if
      * unknown.
      */
    var fileSize: Double
    
    /** Absolute local path. */
    var filename: String
    
    /** An identifier that is persistent across browser sessions. */
    var id: Double
    
    /**
      * False if this download is recorded in the history, true if it is not
      * recorded.
      */
    var incognito: Boolean
    
    /** The file's MIME type. */
    var mime: js.UndefOr[String] = js.undefined
    
    /**
      * True if the download has stopped reading data from the host, but kept
      * the connection open.
      */
    var paused: Boolean
    
    var referrer: js.UndefOr[String] = js.undefined
    
    /**
      * Number of milliseconds between the unix epoch and when this download
      * began.
      */
    var startTime: String
    
    /**
      * Indicates whether the download is progressing, interrupted, or
      * complete.
      */
    var state: State
    
    /**
      * Number of bytes in the whole file, without considering file
      * compression, or -1 if unknown.
      */
    var totalBytes: Double
    
    /** Absolute URL. */
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DownloadItem] (val x: Self) extends AnyVal {
      
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
  
  trait DownloadOptions extends StObject {
    
    /**
      * When this flag is set to `true`, then the browser will allow downloads
      * to proceed after encountering HTTP errors such as `404 Not Found`.
      */
    var allowHttpErrors: js.UndefOr[Boolean] = js.undefined
    
    /** Post body. */
    var body: js.UndefOr[String] = js.undefined
    
    var conflictAction: js.UndefOr[FilenameConflictAction] = js.undefined
    
    /**
      * The cookie store ID of the contextual identity; requires "cookies"
      * permission.
      */
    var cookieStoreId: js.UndefOr[String] = js.undefined
    
    /**
      * A file path relative to the Downloads directory to contain the
      * downloaded file.
      */
    var filename: js.UndefOr[String] = js.undefined
    
    /**
      * Extra HTTP headers to send with the request if the URL uses the
      * HTTP[s] protocol. Each header is represented as a dictionary
      * containing the keys `name` and either `value` or `binaryValue`,
      * restricted to those allowed by XMLHttpRequest.
      */
    var headers: js.UndefOr[js.Array[DownloadOptionsHeaders]] = js.undefined
    
    /** Whether to associate the download with a private browsing session. */
    var incognito: js.UndefOr[Boolean] = js.undefined
    
    /** The HTTP method to use if the URL uses the HTTP[S] protocol. */
    var method: js.UndefOr[DownloadOptionsMethod] = js.undefined
    
    /**
      * Use a file-chooser to allow the user to select a filename. If the
      * option is not specified, the file chooser will be shown only if the
      * Firefox "Always ask you where to save files" option is enabled (i.e.
      * the pref `messenger.download.useDownloadDir` is set to `false`).
      */
    var saveAs: js.UndefOr[Boolean] = js.undefined
    
    /** The URL to download. */
    var url: String
  }
  object DownloadOptions {
    
    inline def apply(url: String): DownloadOptions = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[DownloadOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DownloadOptions] (val x: Self) extends AnyVal {
      
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
      
      inline def setHeaders(value: js.Array[DownloadOptionsHeaders]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHeadersVarargs(value: DownloadOptionsHeaders*): Self = StObject.set(x, "headers", js.Array(value*))
      
      inline def setIncognito(value: Boolean): Self = StObject.set(x, "incognito", value.asInstanceOf[js.Any])
      
      inline def setIncognitoUndefined: Self = StObject.set(x, "incognito", js.undefined)
      
      inline def setMethod(value: DownloadOptionsMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setSaveAs(value: Boolean): Self = StObject.set(x, "saveAs", value.asInstanceOf[js.Any])
      
      inline def setSaveAsUndefined: Self = StObject.set(x, "saveAs", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait DownloadOptionsHeaders extends StObject {
    
    /** Name of the HTTP header. */
    var name: String
    
    /** Value of the HTTP header. */
    var value: String
  }
  object DownloadOptionsHeaders {
    
    inline def apply(name: String, value: String): DownloadOptionsHeaders = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[DownloadOptionsHeaders]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DownloadOptionsHeaders] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.GET
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.POST
  */
  trait DownloadOptionsMethod extends StObject
  object DownloadOptionsMethod {
    
    inline def GET: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.GET = "GET".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.GET]
    
    inline def POST: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.POST = "POST".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.POST]
  }
  
  trait DownloadQuery extends StObject {
    
    /**
      * Number of bytes received so far from the host, without considering
      * file compression.
      */
    var bytesReceived: js.UndefOr[Double] = js.undefined
    
    /** The cookie store ID of the contextual identity. */
    var cookieStoreId: js.UndefOr[String] = js.undefined
    
    /**
      * Indication of whether this download is thought to be safe or known to
      * be suspicious.
      */
    var danger: js.UndefOr[DangerType] = js.undefined
    
    var endTime: js.UndefOr[String] = js.undefined
    
    /**
      * Limits results to downloads that ended after the given ms since the
      * epoch.
      */
    var endedAfter: js.UndefOr[DownloadTime] = js.undefined
    
    /**
      * Limits results to downloads that ended before the given ms since the
      * epoch.
      */
    var endedBefore: js.UndefOr[DownloadTime] = js.undefined
    
    /** Why a download was interrupted. */
    var error: js.UndefOr[InterruptReason] = js.undefined
    
    var exists: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Number of bytes in the whole file post-decompression, or -1 if
      * unknown.
      */
    var fileSize: js.UndefOr[Double] = js.undefined
    
    /** Absolute local path. */
    var filename: js.UndefOr[String] = js.undefined
    
    /**
      * Limits results to DownloadItems whose `filename` matches the given
      * regular expression.
      */
    var filenameRegex: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[Double] = js.undefined
    
    /**
      * Setting this integer limits the number of results. Otherwise, all
      * matching DownloadItems will be returned.
      */
    var limit: js.UndefOr[Double] = js.undefined
    
    /** The file's MIME type. */
    var mime: js.UndefOr[String] = js.undefined
    
    /**
      * Setting elements of this array to DownloadItem properties in order to
      * sort the search results. For example, setting `orderBy='startTime'`
      * sorts the DownloadItems by their start time in ascending order. To
      * specify descending order, prefix `orderBy` with a hyphen:
      * '-startTime'.
      */
    var orderBy: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * True if the download has stopped reading data from the host, but kept
      * the connection open.
      */
    var paused: js.UndefOr[Boolean] = js.undefined
    
    /**
      * This array of search terms limits results to DownloadItems whose
      * `filename` or `url` contain all of the search terms that do not begin
      * with a dash '-' and none of the search terms that do begin with a
      * dash.
      */
    var query: js.UndefOr[js.Array[String]] = js.undefined
    
    var startTime: js.UndefOr[String] = js.undefined
    
    /**
      * Limits results to downloads that started after the given ms since the
      * epoch.
      */
    var startedAfter: js.UndefOr[DownloadTime] = js.undefined
    
    /**
      * Limits results to downloads that started before the given ms since the
      * epoch.
      */
    var startedBefore: js.UndefOr[DownloadTime] = js.undefined
    
    /**
      * Indicates whether the download is progressing, interrupted, or
      * complete.
      */
    var state: js.UndefOr[State] = js.undefined
    
    /**
      * Number of bytes in the whole file, without considering file
      * compression, or -1 if unknown.
      */
    var totalBytes: js.UndefOr[Double] = js.undefined
    
    /**
      * Limits results to downloads whose totalBytes is greater than the given
      * integer.
      */
    var totalBytesGreater: js.UndefOr[Double] = js.undefined
    
    /**
      * Limits results to downloads whose totalBytes is less than the given
      * integer.
      */
    var totalBytesLess: js.UndefOr[Double] = js.undefined
    
    /** Absolute URL. */
    var url: js.UndefOr[String] = js.undefined
    
    /**
      * Limits results to DownloadItems whose `url` matches the given regular
      * expression.
      */
    var urlRegex: js.UndefOr[String] = js.undefined
  }
  object DownloadQuery {
    
    inline def apply(): DownloadQuery = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DownloadQuery]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DownloadQuery] (val x: Self) extends AnyVal {
      
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
  
  type DownloadTime = String | Date
  
  /* Rewritten from type alias, can be one of: 
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.uniquify
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.overwrite
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.prompt
  */
  trait FilenameConflictAction extends StObject
  object FilenameConflictAction {
    
    inline def overwrite: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.overwrite = "overwrite".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.overwrite]
    
    inline def prompt: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.prompt = "prompt".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.prompt]
    
    inline def uniquify: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.uniquify = "uniquify".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.uniquify]
  }
  
  trait GetFileIconOptions extends StObject {
    
    /**
      * The size of the icon. The returned icon will be square with dimensions
      * size \* size pixels. The default size for the icon is 32x32 pixels.
      */
    var size: js.UndefOr[Double] = js.undefined
  }
  object GetFileIconOptions {
    
    inline def apply(): GetFileIconOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetFileIconOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetFileIconOptions] (val x: Self) extends AnyVal {
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.FILE_FAILED
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.FILE_ACCESS_DENIED
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.FILE_NO_SPACE
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.FILE_NAME_TOO_LONG
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.FILE_TOO_LARGE
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.FILE_VIRUS_INFECTED
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.FILE_TRANSIENT_ERROR
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.FILE_BLOCKED
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.FILE_SECURITY_CHECK_FAILED
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.FILE_TOO_SHORT
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.NETWORK_FAILED
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.NETWORK_TIMEOUT
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.NETWORK_DISCONNECTED
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.NETWORK_SERVER_DOWN
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.NETWORK_INVALID_REQUEST
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.SERVER_FAILED
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.SERVER_NO_RANGE
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.SERVER_BAD_CONTENT
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.SERVER_UNAUTHORIZED
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.SERVER_CERT_PROBLEM
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.SERVER_FORBIDDEN
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.USER_CANCELED
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.USER_SHUTDOWN
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.CRASH
  */
  trait InterruptReason extends StObject
  object InterruptReason {
    
    inline def CRASH: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.CRASH = "CRASH".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.CRASH]
    
    inline def FILE_ACCESS_DENIED: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.FILE_ACCESS_DENIED = "FILE_ACCESS_DENIED".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.FILE_ACCESS_DENIED]
    
    inline def FILE_BLOCKED: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.FILE_BLOCKED = "FILE_BLOCKED".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.FILE_BLOCKED]
    
    inline def FILE_FAILED: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.FILE_FAILED = "FILE_FAILED".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.FILE_FAILED]
    
    inline def FILE_NAME_TOO_LONG: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.FILE_NAME_TOO_LONG = "FILE_NAME_TOO_LONG".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.FILE_NAME_TOO_LONG]
    
    inline def FILE_NO_SPACE: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.FILE_NO_SPACE = "FILE_NO_SPACE".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.FILE_NO_SPACE]
    
    inline def FILE_SECURITY_CHECK_FAILED: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.FILE_SECURITY_CHECK_FAILED = "FILE_SECURITY_CHECK_FAILED".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.FILE_SECURITY_CHECK_FAILED]
    
    inline def FILE_TOO_LARGE: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.FILE_TOO_LARGE = "FILE_TOO_LARGE".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.FILE_TOO_LARGE]
    
    inline def FILE_TOO_SHORT: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.FILE_TOO_SHORT = "FILE_TOO_SHORT".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.FILE_TOO_SHORT]
    
    inline def FILE_TRANSIENT_ERROR: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.FILE_TRANSIENT_ERROR = "FILE_TRANSIENT_ERROR".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.FILE_TRANSIENT_ERROR]
    
    inline def FILE_VIRUS_INFECTED: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.FILE_VIRUS_INFECTED = "FILE_VIRUS_INFECTED".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.FILE_VIRUS_INFECTED]
    
    inline def NETWORK_DISCONNECTED: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.NETWORK_DISCONNECTED = "NETWORK_DISCONNECTED".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.NETWORK_DISCONNECTED]
    
    inline def NETWORK_FAILED: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.NETWORK_FAILED = "NETWORK_FAILED".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.NETWORK_FAILED]
    
    inline def NETWORK_INVALID_REQUEST: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.NETWORK_INVALID_REQUEST = "NETWORK_INVALID_REQUEST".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.NETWORK_INVALID_REQUEST]
    
    inline def NETWORK_SERVER_DOWN: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.NETWORK_SERVER_DOWN = "NETWORK_SERVER_DOWN".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.NETWORK_SERVER_DOWN]
    
    inline def NETWORK_TIMEOUT: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.NETWORK_TIMEOUT = "NETWORK_TIMEOUT".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.NETWORK_TIMEOUT]
    
    inline def SERVER_BAD_CONTENT: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.SERVER_BAD_CONTENT = "SERVER_BAD_CONTENT".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.SERVER_BAD_CONTENT]
    
    inline def SERVER_CERT_PROBLEM: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.SERVER_CERT_PROBLEM = "SERVER_CERT_PROBLEM".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.SERVER_CERT_PROBLEM]
    
    inline def SERVER_FAILED: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.SERVER_FAILED = "SERVER_FAILED".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.SERVER_FAILED]
    
    inline def SERVER_FORBIDDEN: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.SERVER_FORBIDDEN = "SERVER_FORBIDDEN".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.SERVER_FORBIDDEN]
    
    inline def SERVER_NO_RANGE: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.SERVER_NO_RANGE = "SERVER_NO_RANGE".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.SERVER_NO_RANGE]
    
    inline def SERVER_UNAUTHORIZED: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.SERVER_UNAUTHORIZED = "SERVER_UNAUTHORIZED".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.SERVER_UNAUTHORIZED]
    
    inline def USER_CANCELED: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.USER_CANCELED = "USER_CANCELED".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.USER_CANCELED]
    
    inline def USER_SHUTDOWN: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.USER_SHUTDOWN = "USER_SHUTDOWN".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.USER_SHUTDOWN]
  }
  
  trait OnChangedDownloadDelta extends StObject {
    
    var canResume: js.UndefOr[BooleanDelta] = js.undefined
    
    /** Describes a change in a DownloadItem's `danger`. */
    var danger: js.UndefOr[StringDelta] = js.undefined
    
    /** Describes a change in a DownloadItem's `endTime`. */
    var endTime: js.UndefOr[StringDelta] = js.undefined
    
    /** Describes a change in a DownloadItem's `error`. */
    var error: js.UndefOr[StringDelta] = js.undefined
    
    var exists: js.UndefOr[BooleanDelta] = js.undefined
    
    /** Describes a change in a DownloadItem's `fileSize`. */
    var fileSize: js.UndefOr[DoubleDelta] = js.undefined
    
    /** Describes a change in a DownloadItem's `filename`. */
    var filename: js.UndefOr[StringDelta] = js.undefined
    
    /** The `id` of the DownloadItem that changed. */
    var id: Double
    
    /** Describes a change in a DownloadItem's `mime`. */
    var mime: js.UndefOr[StringDelta] = js.undefined
    
    /** Describes a change in a DownloadItem's `paused`. */
    var paused: js.UndefOr[BooleanDelta] = js.undefined
    
    /** Describes a change in a DownloadItem's `startTime`. */
    var startTime: js.UndefOr[StringDelta] = js.undefined
    
    /** Describes a change in a DownloadItem's `state`. */
    var state: js.UndefOr[StringDelta] = js.undefined
    
    /** Describes a change in a DownloadItem's `totalBytes`. */
    var totalBytes: js.UndefOr[DoubleDelta] = js.undefined
    
    /** Describes a change in a DownloadItem's `url`. */
    var url: js.UndefOr[StringDelta] = js.undefined
  }
  object OnChangedDownloadDelta {
    
    inline def apply(id: Double): OnChangedDownloadDelta = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnChangedDownloadDelta]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OnChangedDownloadDelta] (val x: Self) extends AnyVal {
      
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
  
  /* Rewritten from type alias, can be one of: 
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.in_progress
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.interrupted
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.complete
  */
  trait State extends StObject
  object State {
    
    inline def complete: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.complete = "complete".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.complete]
    
    inline def in_progress: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.in_progress = "in_progress".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.in_progress]
    
    inline def interrupted: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.interrupted = "interrupted".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.interrupted]
  }
  
  trait StringDelta extends StObject {
    
    var current: js.UndefOr[String] = js.undefined
    
    var previous: js.UndefOr[String] = js.undefined
  }
  object StringDelta {
    
    inline def apply(): StringDelta = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StringDelta]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StringDelta] (val x: Self) extends AnyVal {
      
      inline def setCurrent(value: String): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
      
      inline def setPrevious(value: String): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
      
      inline def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
    }
  }
}
