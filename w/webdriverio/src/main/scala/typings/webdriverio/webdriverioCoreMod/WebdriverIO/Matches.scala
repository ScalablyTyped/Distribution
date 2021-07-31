package typings.webdriverio.webdriverioCoreMod.WebdriverIO

import typings.node.Buffer
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class MatchesMutableBuilder[Self <: Matches] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: String | Buffer | JsonCompatible): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseHeaders(value: Record[String, String]): Self = StObject.set(x, "responseHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
  }
}
