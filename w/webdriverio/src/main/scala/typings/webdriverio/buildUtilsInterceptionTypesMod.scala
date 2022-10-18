package typings.webdriverio

import typings.node.bufferMod.global.Buffer
import typings.puppeteerCore.libCjsPuppeteerCommonConnectionMod.CDPSession
import typings.std.Record
import typings.wdioTypes.mod.JsonCompatible
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildUtilsInterceptionTypesMod {
  
  trait CustomThrottle
    extends StObject
       with ThrottleOptions {
    
    var downloadThroughput: Double
    
    var latency: Double
    
    var offline: Boolean
    
    var uploadThroughput: Double
  }
  object CustomThrottle {
    
    inline def apply(downloadThroughput: Double, latency: Double, offline: Boolean, uploadThroughput: Double): CustomThrottle = {
      val __obj = js.Dynamic.literal(downloadThroughput = downloadThroughput.asInstanceOf[js.Any], latency = latency.asInstanceOf[js.Any], offline = offline.asInstanceOf[js.Any], uploadThroughput = uploadThroughput.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomThrottle]
    }
    
    extension [Self <: CustomThrottle](x: Self) {
      
      inline def setDownloadThroughput(value: Double): Self = StObject.set(x, "downloadThroughput", value.asInstanceOf[js.Any])
      
      inline def setLatency(value: Double): Self = StObject.set(x, "latency", value.asInstanceOf[js.Any])
      
      inline def setOffline(value: Boolean): Self = StObject.set(x, "offline", value.asInstanceOf[js.Any])
      
      inline def setUploadThroughput(value: Double): Self = StObject.set(x, "uploadThroughput", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.webdriverio.webdriverioStrings.Failed
    - typings.webdriverio.webdriverioStrings.Aborted
    - typings.webdriverio.webdriverioStrings.TimedOut
    - typings.webdriverio.webdriverioStrings.AccessDenied
    - typings.webdriverio.webdriverioStrings.ConnectionClosed
    - typings.webdriverio.webdriverioStrings.ConnectionReset
    - typings.webdriverio.webdriverioStrings.ConnectionRefused
    - typings.webdriverio.webdriverioStrings.ConnectionAborted
    - typings.webdriverio.webdriverioStrings.ConnectionFailed
    - typings.webdriverio.webdriverioStrings.NameNotResolved
    - typings.webdriverio.webdriverioStrings.InternetDisconnected
    - typings.webdriverio.webdriverioStrings.AddressUnreachable
    - typings.webdriverio.webdriverioStrings.BlockedByClient
    - typings.webdriverio.webdriverioStrings.BlockedByResponse
  */
  trait ErrorCode extends StObject
  object ErrorCode {
    
    inline def Aborted: typings.webdriverio.webdriverioStrings.Aborted = "Aborted".asInstanceOf[typings.webdriverio.webdriverioStrings.Aborted]
    
    inline def AccessDenied: typings.webdriverio.webdriverioStrings.AccessDenied = "AccessDenied".asInstanceOf[typings.webdriverio.webdriverioStrings.AccessDenied]
    
    inline def AddressUnreachable: typings.webdriverio.webdriverioStrings.AddressUnreachable = "AddressUnreachable".asInstanceOf[typings.webdriverio.webdriverioStrings.AddressUnreachable]
    
    inline def BlockedByClient: typings.webdriverio.webdriverioStrings.BlockedByClient = "BlockedByClient".asInstanceOf[typings.webdriverio.webdriverioStrings.BlockedByClient]
    
    inline def BlockedByResponse: typings.webdriverio.webdriverioStrings.BlockedByResponse = "BlockedByResponse".asInstanceOf[typings.webdriverio.webdriverioStrings.BlockedByResponse]
    
    inline def ConnectionAborted: typings.webdriverio.webdriverioStrings.ConnectionAborted = "ConnectionAborted".asInstanceOf[typings.webdriverio.webdriverioStrings.ConnectionAborted]
    
    inline def ConnectionClosed: typings.webdriverio.webdriverioStrings.ConnectionClosed = "ConnectionClosed".asInstanceOf[typings.webdriverio.webdriverioStrings.ConnectionClosed]
    
    inline def ConnectionFailed: typings.webdriverio.webdriverioStrings.ConnectionFailed = "ConnectionFailed".asInstanceOf[typings.webdriverio.webdriverioStrings.ConnectionFailed]
    
    inline def ConnectionRefused: typings.webdriverio.webdriverioStrings.ConnectionRefused = "ConnectionRefused".asInstanceOf[typings.webdriverio.webdriverioStrings.ConnectionRefused]
    
    inline def ConnectionReset: typings.webdriverio.webdriverioStrings.ConnectionReset = "ConnectionReset".asInstanceOf[typings.webdriverio.webdriverioStrings.ConnectionReset]
    
    inline def Failed: typings.webdriverio.webdriverioStrings.Failed = "Failed".asInstanceOf[typings.webdriverio.webdriverioStrings.Failed]
    
    inline def InternetDisconnected: typings.webdriverio.webdriverioStrings.InternetDisconnected = "InternetDisconnected".asInstanceOf[typings.webdriverio.webdriverioStrings.InternetDisconnected]
    
    inline def NameNotResolved: typings.webdriverio.webdriverioStrings.NameNotResolved = "NameNotResolved".asInstanceOf[typings.webdriverio.webdriverioStrings.NameNotResolved]
    
    inline def TimedOut: typings.webdriverio.webdriverioStrings.TimedOut = "TimedOut".asInstanceOf[typings.webdriverio.webdriverioStrings.TimedOut]
  }
  
  trait Matches
    extends StObject
       with Request {
    
    /**
      * body response of actual resource
      */
    var body: String | Buffer | JsonCompatible
    
    /**
      * HTTP response headers.
      */
    var responseHeaders: Record[String, String]
    
    /**
      * HTTP response status code.
      */
    var statusCode: Double
  }
  object Matches {
    
    inline def apply(
      body: String | Buffer | JsonCompatible,
      headers: Record[String, String],
      initialPriority: ResourcePriority,
      method: String,
      referrerPolicy: ReferrerPolicy,
      responseHeaders: Record[String, String],
      statusCode: Double,
      url: String
    ): Matches = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], initialPriority = initialPriority.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], referrerPolicy = referrerPolicy.asInstanceOf[js.Any], responseHeaders = responseHeaders.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Matches]
    }
    
    extension [Self <: Matches](x: Self) {
      
      inline def setBody(value: String | Buffer | JsonCompatible): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setResponseHeaders(value: Record[String, String]): Self = StObject.set(x, "responseHeaders", value.asInstanceOf[js.Any])
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.webdriverio.webdriverioStrings.blockable
    - typings.webdriverio.webdriverioStrings.`optionally-blockable`
    - typings.webdriverio.webdriverioStrings.none
  */
  trait MixedContentType extends StObject
  object MixedContentType {
    
    inline def blockable: typings.webdriverio.webdriverioStrings.blockable = "blockable".asInstanceOf[typings.webdriverio.webdriverioStrings.blockable]
    
    inline def none: typings.webdriverio.webdriverioStrings.none = "none".asInstanceOf[typings.webdriverio.webdriverioStrings.none]
    
    inline def `optionally-blockable`: typings.webdriverio.webdriverioStrings.`optionally-blockable` = "optionally-blockable".asInstanceOf[typings.webdriverio.webdriverioStrings.`optionally-blockable`]
  }
  
  trait MockFilterOptions extends StObject {
    
    var headers: js.UndefOr[
        (Record[String, String]) | (js.Function1[/* headers */ Record[String, String], Boolean])
      ] = js.undefined
    
    var method: js.UndefOr[String | (js.Function1[/* method */ String, Boolean])] = js.undefined
    
    var postData: js.UndefOr[String | (js.Function1[/* payload */ js.UndefOr[String], Boolean])] = js.undefined
    
    var requestHeaders: js.UndefOr[
        (Record[String, String]) | (js.Function1[/* headers */ Record[String, String], Boolean])
      ] = js.undefined
    
    var responseHeaders: js.UndefOr[
        (Record[String, String]) | (js.Function1[/* headers */ Record[String, String], Boolean])
      ] = js.undefined
    
    var statusCode: js.UndefOr[Double | (js.Function1[/* statusCode */ Double, Boolean])] = js.undefined
  }
  object MockFilterOptions {
    
    inline def apply(): MockFilterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MockFilterOptions]
    }
    
    extension [Self <: MockFilterOptions](x: Self) {
      
      inline def setHeaders(value: (Record[String, String]) | (js.Function1[/* headers */ Record[String, String], Boolean])): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersFunction1(value: /* headers */ Record[String, String] => Boolean): Self = StObject.set(x, "headers", js.Any.fromFunction1(value))
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setMethod(value: String | (js.Function1[/* method */ String, Boolean])): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodFunction1(value: /* method */ String => Boolean): Self = StObject.set(x, "method", js.Any.fromFunction1(value))
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setPostData(value: String | (js.Function1[/* payload */ js.UndefOr[String], Boolean])): Self = StObject.set(x, "postData", value.asInstanceOf[js.Any])
      
      inline def setPostDataFunction1(value: /* payload */ js.UndefOr[String] => Boolean): Self = StObject.set(x, "postData", js.Any.fromFunction1(value))
      
      inline def setPostDataUndefined: Self = StObject.set(x, "postData", js.undefined)
      
      inline def setRequestHeaders(value: (Record[String, String]) | (js.Function1[/* headers */ Record[String, String], Boolean])): Self = StObject.set(x, "requestHeaders", value.asInstanceOf[js.Any])
      
      inline def setRequestHeadersFunction1(value: /* headers */ Record[String, String] => Boolean): Self = StObject.set(x, "requestHeaders", js.Any.fromFunction1(value))
      
      inline def setRequestHeadersUndefined: Self = StObject.set(x, "requestHeaders", js.undefined)
      
      inline def setResponseHeaders(value: (Record[String, String]) | (js.Function1[/* headers */ Record[String, String], Boolean])): Self = StObject.set(x, "responseHeaders", value.asInstanceOf[js.Any])
      
      inline def setResponseHeadersFunction1(value: /* headers */ Record[String, String] => Boolean): Self = StObject.set(x, "responseHeaders", js.Any.fromFunction1(value))
      
      inline def setResponseHeadersUndefined: Self = StObject.set(x, "responseHeaders", js.undefined)
      
      inline def setStatusCode(value: Double | (js.Function1[/* statusCode */ Double, Boolean])): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      inline def setStatusCodeFunction1(value: /* statusCode */ Double => Boolean): Self = StObject.set(x, "statusCode", js.Any.fromFunction1(value))
      
      inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
    }
  }
  
  type MockOverwrite = String | (Record[String, Any]) | MockOverwriteFunction
  
  type MockOverwriteFunction = js.Function2[
    /* request */ Matches, 
    /* client */ CDPSession, 
    js.Promise[String | (Record[String, Any])]
  ]
  
  trait MockResponseParams extends StObject {
    
    /**
      * fetch real response before responding with mocked data. Default: true
      */
    var fetchResponse: js.UndefOr[Boolean] = js.undefined
    
    var headers: js.UndefOr[
        (Record[String, String]) | (js.Function1[/* request */ Matches, Record[String, String]])
      ] = js.undefined
    
    var statusCode: js.UndefOr[Double | (js.Function1[/* request */ Matches, Double])] = js.undefined
  }
  object MockResponseParams {
    
    inline def apply(): MockResponseParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MockResponseParams]
    }
    
    extension [Self <: MockResponseParams](x: Self) {
      
      inline def setFetchResponse(value: Boolean): Self = StObject.set(x, "fetchResponse", value.asInstanceOf[js.Any])
      
      inline def setFetchResponseUndefined: Self = StObject.set(x, "fetchResponse", js.undefined)
      
      inline def setHeaders(value: (Record[String, String]) | (js.Function1[/* request */ Matches, Record[String, String]])): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersFunction1(value: /* request */ Matches => Record[String, String]): Self = StObject.set(x, "headers", js.Any.fromFunction1(value))
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setStatusCode(value: Double | (js.Function1[/* request */ Matches, Double])): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      inline def setStatusCodeFunction1(value: /* request */ Matches => Double): Self = StObject.set(x, "statusCode", js.Any.fromFunction1(value))
      
      inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.webdriverio.webdriverioStrings.`unsafe-url`
    - typings.webdriverio.webdriverioStrings.`no-referrer-when-downgrade`
    - typings.webdriverio.webdriverioStrings.`no-referrer`
    - typings.webdriverio.webdriverioStrings.origin
    - typings.webdriverio.webdriverioStrings.`origin-when-cross-origin`
    - typings.webdriverio.webdriverioStrings.`same-origin`
    - typings.webdriverio.webdriverioStrings.`strict-origin`
    - typings.webdriverio.webdriverioStrings.`strict-origin-when-cross-origin`
  */
  trait ReferrerPolicy extends StObject
  object ReferrerPolicy {
    
    inline def `no-referrer`: typings.webdriverio.webdriverioStrings.`no-referrer` = "no-referrer".asInstanceOf[typings.webdriverio.webdriverioStrings.`no-referrer`]
    
    inline def `no-referrer-when-downgrade`: typings.webdriverio.webdriverioStrings.`no-referrer-when-downgrade` = "no-referrer-when-downgrade".asInstanceOf[typings.webdriverio.webdriverioStrings.`no-referrer-when-downgrade`]
    
    inline def origin: typings.webdriverio.webdriverioStrings.origin = "origin".asInstanceOf[typings.webdriverio.webdriverioStrings.origin]
    
    inline def `origin-when-cross-origin`: typings.webdriverio.webdriverioStrings.`origin-when-cross-origin` = "origin-when-cross-origin".asInstanceOf[typings.webdriverio.webdriverioStrings.`origin-when-cross-origin`]
    
    inline def `same-origin`: typings.webdriverio.webdriverioStrings.`same-origin` = "same-origin".asInstanceOf[typings.webdriverio.webdriverioStrings.`same-origin`]
    
    inline def `strict-origin`: typings.webdriverio.webdriverioStrings.`strict-origin` = "strict-origin".asInstanceOf[typings.webdriverio.webdriverioStrings.`strict-origin`]
    
    inline def `strict-origin-when-cross-origin`: typings.webdriverio.webdriverioStrings.`strict-origin-when-cross-origin` = "strict-origin-when-cross-origin".asInstanceOf[typings.webdriverio.webdriverioStrings.`strict-origin-when-cross-origin`]
    
    inline def `unsafe-url`: typings.webdriverio.webdriverioStrings.`unsafe-url` = "unsafe-url".asInstanceOf[typings.webdriverio.webdriverioStrings.`unsafe-url`]
  }
  
  trait Request extends StObject {
    
    /**
      * True when the request has POST data. Note that postData might still be omitted when this flag is true when the data is too long.
      */
    var hasPostData: js.UndefOr[Boolean] = js.undefined
    
    /**
      * HTTP request headers.
      */
    var headers: Record[String, String]
    
    /**
      * Priority of the resource request at the time request is sent.
      */
    var initialPriority: ResourcePriority
    
    /**
      * Whether is loaded via link preload.
      */
    var isLinkPreload: js.UndefOr[Boolean] = js.undefined
    
    /**
      * HTTP request method.
      */
    var method: String
    
    /**
      * The mixed content export type of the request.
      */
    var mixedContentType: js.UndefOr[MixedContentType] = js.undefined
    
    /**
      * HTTP POST request data.
      */
    var postData: js.UndefOr[String] = js.undefined
    
    /**
      * The referrer policy of the request, as defined in https://www.w3.org/TR/referrer-policy/
      */
    var referrerPolicy: ReferrerPolicy
    
    /**
      * Request URL (without fragment).
      */
    var url: String
    
    /**
      * Fragment of the requested URL starting with hash, if present.
      */
    var urlFragment: js.UndefOr[String] = js.undefined
  }
  object Request {
    
    inline def apply(
      headers: Record[String, String],
      initialPriority: ResourcePriority,
      method: String,
      referrerPolicy: ReferrerPolicy,
      url: String
    ): Request = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], initialPriority = initialPriority.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], referrerPolicy = referrerPolicy.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Request]
    }
    
    extension [Self <: Request](x: Self) {
      
      inline def setHasPostData(value: Boolean): Self = StObject.set(x, "hasPostData", value.asInstanceOf[js.Any])
      
      inline def setHasPostDataUndefined: Self = StObject.set(x, "hasPostData", js.undefined)
      
      inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setInitialPriority(value: ResourcePriority): Self = StObject.set(x, "initialPriority", value.asInstanceOf[js.Any])
      
      inline def setIsLinkPreload(value: Boolean): Self = StObject.set(x, "isLinkPreload", value.asInstanceOf[js.Any])
      
      inline def setIsLinkPreloadUndefined: Self = StObject.set(x, "isLinkPreload", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMixedContentType(value: MixedContentType): Self = StObject.set(x, "mixedContentType", value.asInstanceOf[js.Any])
      
      inline def setMixedContentTypeUndefined: Self = StObject.set(x, "mixedContentType", js.undefined)
      
      inline def setPostData(value: String): Self = StObject.set(x, "postData", value.asInstanceOf[js.Any])
      
      inline def setPostDataUndefined: Self = StObject.set(x, "postData", js.undefined)
      
      inline def setReferrerPolicy(value: ReferrerPolicy): Self = StObject.set(x, "referrerPolicy", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlFragment(value: String): Self = StObject.set(x, "urlFragment", value.asInstanceOf[js.Any])
      
      inline def setUrlFragmentUndefined: Self = StObject.set(x, "urlFragment", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.webdriverio.webdriverioStrings.VeryLow
    - typings.webdriverio.webdriverioStrings.Low
    - typings.webdriverio.webdriverioStrings.Medium
    - typings.webdriverio.webdriverioStrings.High
    - typings.webdriverio.webdriverioStrings.VeryHigh
  */
  trait ResourcePriority extends StObject
  object ResourcePriority {
    
    inline def High: typings.webdriverio.webdriverioStrings.High = "High".asInstanceOf[typings.webdriverio.webdriverioStrings.High]
    
    inline def Low: typings.webdriverio.webdriverioStrings.Low = "Low".asInstanceOf[typings.webdriverio.webdriverioStrings.Low]
    
    inline def Medium: typings.webdriverio.webdriverioStrings.Medium = "Medium".asInstanceOf[typings.webdriverio.webdriverioStrings.Medium]
    
    inline def VeryHigh: typings.webdriverio.webdriverioStrings.VeryHigh = "VeryHigh".asInstanceOf[typings.webdriverio.webdriverioStrings.VeryHigh]
    
    inline def VeryLow: typings.webdriverio.webdriverioStrings.VeryLow = "VeryLow".asInstanceOf[typings.webdriverio.webdriverioStrings.VeryLow]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.webdriverio.buildUtilsInterceptionTypesMod.ThrottlePreset
    - typings.webdriverio.buildUtilsInterceptionTypesMod.CustomThrottle
  */
  trait ThrottleOptions extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.webdriverio.webdriverioStrings.offline
    - typings.webdriverio.webdriverioStrings.GPRS
    - typings.webdriverio.webdriverioStrings.Regular2G
    - typings.webdriverio.webdriverioStrings.Good2G
    - typings.webdriverio.webdriverioStrings.Regular3G
    - typings.webdriverio.webdriverioStrings.Good3G
    - typings.webdriverio.webdriverioStrings.Regular4G
    - typings.webdriverio.webdriverioStrings.DSL
    - typings.webdriverio.webdriverioStrings.WiFi
    - typings.webdriverio.webdriverioStrings.online
  */
  trait ThrottlePreset
    extends StObject
       with ThrottleOptions
  object ThrottlePreset {
    
    inline def DSL: typings.webdriverio.webdriverioStrings.DSL = "DSL".asInstanceOf[typings.webdriverio.webdriverioStrings.DSL]
    
    inline def GPRS: typings.webdriverio.webdriverioStrings.GPRS = "GPRS".asInstanceOf[typings.webdriverio.webdriverioStrings.GPRS]
    
    inline def Good2G: typings.webdriverio.webdriverioStrings.Good2G = "Good2G".asInstanceOf[typings.webdriverio.webdriverioStrings.Good2G]
    
    inline def Good3G: typings.webdriverio.webdriverioStrings.Good3G = "Good3G".asInstanceOf[typings.webdriverio.webdriverioStrings.Good3G]
    
    inline def Regular2G: typings.webdriverio.webdriverioStrings.Regular2G = "Regular2G".asInstanceOf[typings.webdriverio.webdriverioStrings.Regular2G]
    
    inline def Regular3G: typings.webdriverio.webdriverioStrings.Regular3G = "Regular3G".asInstanceOf[typings.webdriverio.webdriverioStrings.Regular3G]
    
    inline def Regular4G: typings.webdriverio.webdriverioStrings.Regular4G = "Regular4G".asInstanceOf[typings.webdriverio.webdriverioStrings.Regular4G]
    
    inline def WiFi: typings.webdriverio.webdriverioStrings.WiFi = "WiFi".asInstanceOf[typings.webdriverio.webdriverioStrings.WiFi]
    
    inline def offline: typings.webdriverio.webdriverioStrings.offline = "offline".asInstanceOf[typings.webdriverio.webdriverioStrings.offline]
    
    inline def online: typings.webdriverio.webdriverioStrings.online = "online".asInstanceOf[typings.webdriverio.webdriverioStrings.online]
  }
}
