package typings.webdriverio.webdriverioCoreMod.WebdriverIO

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    * The mixed content type of the request.
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
  
  @scala.inline
  def apply(
    headers: Record[String, String],
    initialPriority: ResourcePriority,
    method: String,
    referrerPolicy: ReferrerPolicy,
    url: String
  ): Request = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], initialPriority = initialPriority.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], referrerPolicy = referrerPolicy.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
  
  @scala.inline
  implicit class RequestMutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHasPostData(value: Boolean): Self = StObject.set(x, "hasPostData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasPostDataUndefined: Self = StObject.set(x, "hasPostData", js.undefined)
    
    @scala.inline
    def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialPriority(value: ResourcePriority): Self = StObject.set(x, "initialPriority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLinkPreload(value: Boolean): Self = StObject.set(x, "isLinkPreload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLinkPreloadUndefined: Self = StObject.set(x, "isLinkPreload", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMixedContentType(value: MixedContentType): Self = StObject.set(x, "mixedContentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMixedContentTypeUndefined: Self = StObject.set(x, "mixedContentType", js.undefined)
    
    @scala.inline
    def setPostData(value: String): Self = StObject.set(x, "postData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostDataUndefined: Self = StObject.set(x, "postData", js.undefined)
    
    @scala.inline
    def setReferrerPolicy(value: ReferrerPolicy): Self = StObject.set(x, "referrerPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlFragment(value: String): Self = StObject.set(x, "urlFragment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlFragmentUndefined: Self = StObject.set(x, "urlFragment", js.undefined)
  }
}
