package typings.webdriverio.anon

import typings.node.bufferMod.global.Buffer
import typings.std.Record
import typings.wdioTypes.mod.JsonCompatible
import typings.webdriverio.interceptionTypesMod.MixedContentType
import typings.webdriverio.interceptionTypesMod.ReferrerPolicy
import typings.webdriverio.interceptionTypesMod.ResourcePriority
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined webdriverio.webdriverio/build/utils/interception/types.Matches & {  mockedResponse :string | node.buffer.<global>.Buffer} */
trait MatchesmockedResponsestri extends StObject {
  
  /**
    * body response of actual resource
    */
  var body: String | Buffer | JsonCompatible
  
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
  
  var mockedResponse: String | Buffer
  
  /**
    * HTTP POST request data.
    */
  var postData: js.UndefOr[String] = js.undefined
  
  /**
    * The referrer policy of the request, as defined in https://www.w3.org/TR/referrer-policy/
    */
  var referrerPolicy: ReferrerPolicy
  
  /**
    * HTTP response headers.
    */
  var responseHeaders: Record[String, String]
  
  /**
    * HTTP response status code.
    */
  var statusCode: Double
  
  /**
    * Request URL (without fragment).
    */
  var url: String
  
  /**
    * Fragment of the requested URL starting with hash, if present.
    */
  var urlFragment: js.UndefOr[String] = js.undefined
}
object MatchesmockedResponsestri {
  
  inline def apply(
    body: String | Buffer | JsonCompatible,
    headers: Record[String, String],
    initialPriority: ResourcePriority,
    method: String,
    mockedResponse: String | Buffer,
    referrerPolicy: ReferrerPolicy,
    responseHeaders: Record[String, String],
    statusCode: Double,
    url: String
  ): MatchesmockedResponsestri = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], initialPriority = initialPriority.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], mockedResponse = mockedResponse.asInstanceOf[js.Any], referrerPolicy = referrerPolicy.asInstanceOf[js.Any], responseHeaders = responseHeaders.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchesmockedResponsestri]
  }
  
  extension [Self <: MatchesmockedResponsestri](x: Self) {
    
    inline def setBody(value: String | Buffer | JsonCompatible): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setHasPostData(value: Boolean): Self = StObject.set(x, "hasPostData", value.asInstanceOf[js.Any])
    
    inline def setHasPostDataUndefined: Self = StObject.set(x, "hasPostData", js.undefined)
    
    inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setInitialPriority(value: ResourcePriority): Self = StObject.set(x, "initialPriority", value.asInstanceOf[js.Any])
    
    inline def setIsLinkPreload(value: Boolean): Self = StObject.set(x, "isLinkPreload", value.asInstanceOf[js.Any])
    
    inline def setIsLinkPreloadUndefined: Self = StObject.set(x, "isLinkPreload", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMixedContentType(value: MixedContentType): Self = StObject.set(x, "mixedContentType", value.asInstanceOf[js.Any])
    
    inline def setMixedContentTypeUndefined: Self = StObject.set(x, "mixedContentType", js.undefined)
    
    inline def setMockedResponse(value: String | Buffer): Self = StObject.set(x, "mockedResponse", value.asInstanceOf[js.Any])
    
    inline def setPostData(value: String): Self = StObject.set(x, "postData", value.asInstanceOf[js.Any])
    
    inline def setPostDataUndefined: Self = StObject.set(x, "postData", js.undefined)
    
    inline def setReferrerPolicy(value: ReferrerPolicy): Self = StObject.set(x, "referrerPolicy", value.asInstanceOf[js.Any])
    
    inline def setResponseHeaders(value: Record[String, String]): Self = StObject.set(x, "responseHeaders", value.asInstanceOf[js.Any])
    
    inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlFragment(value: String): Self = StObject.set(x, "urlFragment", value.asInstanceOf[js.Any])
    
    inline def setUrlFragmentUndefined: Self = StObject.set(x, "urlFragment", js.undefined)
  }
}
