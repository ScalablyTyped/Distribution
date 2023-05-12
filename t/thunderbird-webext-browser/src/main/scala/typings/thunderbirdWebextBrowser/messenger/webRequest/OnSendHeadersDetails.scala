package typings.thunderbirdWebextBrowser.messenger.webRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnSendHeadersDetails extends StObject {
  
  /** The cookie store ID of the contextual identity. */
  var cookieStoreId: js.UndefOr[String] = js.undefined
  
  /** URL of the page into which the requested resource will be loaded. */
  var documentUrl: js.UndefOr[String] = js.undefined
  
  /**
    * The value 0 indicates that the request happens in the main frame; a
    * positive value indicates the ID of a subframe in which the request
    * happens. If the document of a (sub-)frame is loaded (`type` is
    * `main_frame` or `sub_frame`), `frameId` indicates the ID of this
    * frame, not the ID of the outer frame. Frame IDs are unique within a
    * tab.
    */
  var frameId: Double
  
  /** True for private browsing requests. */
  var incognito: js.UndefOr[Boolean] = js.undefined
  
  /** Standard HTTP method. */
  var method: String
  
  /** URL of the resource that triggered this request. */
  var originUrl: js.UndefOr[String] = js.undefined
  
  /**
    * ID of frame that wraps the frame which sent the request. Set to -1 if
    * no parent frame exists.
    */
  var parentFrameId: Double
  
  /** The HTTP request headers that have been sent out with this request. */
  var requestHeaders: js.UndefOr[HttpHeaders] = js.undefined
  
  /**
    * The ID of the request. Request IDs are unique within a browser
    * session. As a result, they could be used to relate different events of
    * the same request.
    */
  var requestId: String
  
  /**
    * The ID of the tab in which the request takes place. Set to -1 if the
    * request isn't related to a tab.
    */
  var tabId: Double
  
  /**
    * Indicates if this request and its content window hierarchy is third
    * party.
    */
  var thirdParty: Boolean
  
  /**
    * The time when this signal is triggered, in milliseconds since the
    * epoch.
    */
  var timeStamp: Double
  
  /** How the requested resource will be used. */
  var `type`: ResourceType
  
  var url: String
  
  /** Tracking classification if the request has been classified. */
  var urlClassification: js.UndefOr[UrlClassification] = js.undefined
}
object OnSendHeadersDetails {
  
  inline def apply(
    frameId: Double,
    method: String,
    parentFrameId: Double,
    requestId: String,
    tabId: Double,
    thirdParty: Boolean,
    timeStamp: Double,
    `type`: ResourceType,
    url: String
  ): OnSendHeadersDetails = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], parentFrameId = parentFrameId.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any], thirdParty = thirdParty.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnSendHeadersDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnSendHeadersDetails] (val x: Self) extends AnyVal {
    
    inline def setCookieStoreId(value: String): Self = StObject.set(x, "cookieStoreId", value.asInstanceOf[js.Any])
    
    inline def setCookieStoreIdUndefined: Self = StObject.set(x, "cookieStoreId", js.undefined)
    
    inline def setDocumentUrl(value: String): Self = StObject.set(x, "documentUrl", value.asInstanceOf[js.Any])
    
    inline def setDocumentUrlUndefined: Self = StObject.set(x, "documentUrl", js.undefined)
    
    inline def setFrameId(value: Double): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
    
    inline def setIncognito(value: Boolean): Self = StObject.set(x, "incognito", value.asInstanceOf[js.Any])
    
    inline def setIncognitoUndefined: Self = StObject.set(x, "incognito", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setOriginUrl(value: String): Self = StObject.set(x, "originUrl", value.asInstanceOf[js.Any])
    
    inline def setOriginUrlUndefined: Self = StObject.set(x, "originUrl", js.undefined)
    
    inline def setParentFrameId(value: Double): Self = StObject.set(x, "parentFrameId", value.asInstanceOf[js.Any])
    
    inline def setRequestHeaders(value: HttpHeaders): Self = StObject.set(x, "requestHeaders", value.asInstanceOf[js.Any])
    
    inline def setRequestHeadersUndefined: Self = StObject.set(x, "requestHeaders", js.undefined)
    
    inline def setRequestHeadersVarargs(value: _HttpHeaders*): Self = StObject.set(x, "requestHeaders", js.Array(value*))
    
    inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
    
    inline def setThirdParty(value: Boolean): Self = StObject.set(x, "thirdParty", value.asInstanceOf[js.Any])
    
    inline def setTimeStamp(value: Double): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
    
    inline def setType(value: ResourceType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlClassification(value: UrlClassification): Self = StObject.set(x, "urlClassification", value.asInstanceOf[js.Any])
    
    inline def setUrlClassificationUndefined: Self = StObject.set(x, "urlClassification", js.undefined)
  }
}
