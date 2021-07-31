package typings.webdriverio.webdriverioCoreMod.WebdriverIO

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  def apply(): MockFilterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MockFilterOptions]
  }
  
  @scala.inline
  implicit class MockFilterOptionsMutableBuilder[Self <: MockFilterOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: (Record[String, String]) | (js.Function1[/* headers */ Record[String, String], Boolean])): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersFunction1(value: /* headers */ Record[String, String] => Boolean): Self = StObject.set(x, "headers", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setMethod(value: String | (js.Function1[/* method */ String, Boolean])): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodFunction1(value: /* method */ String => Boolean): Self = StObject.set(x, "method", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setPostData(value: String | (js.Function1[/* payload */ js.UndefOr[String], Boolean])): Self = StObject.set(x, "postData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostDataFunction1(value: /* payload */ js.UndefOr[String] => Boolean): Self = StObject.set(x, "postData", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPostDataUndefined: Self = StObject.set(x, "postData", js.undefined)
    
    @scala.inline
    def setRequestHeaders(value: (Record[String, String]) | (js.Function1[/* headers */ Record[String, String], Boolean])): Self = StObject.set(x, "requestHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestHeadersFunction1(value: /* headers */ Record[String, String] => Boolean): Self = StObject.set(x, "requestHeaders", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRequestHeadersUndefined: Self = StObject.set(x, "requestHeaders", js.undefined)
    
    @scala.inline
    def setResponseHeaders(value: (Record[String, String]) | (js.Function1[/* headers */ Record[String, String], Boolean])): Self = StObject.set(x, "responseHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseHeadersFunction1(value: /* headers */ Record[String, String] => Boolean): Self = StObject.set(x, "responseHeaders", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResponseHeadersUndefined: Self = StObject.set(x, "responseHeaders", js.undefined)
    
    @scala.inline
    def setStatusCode(value: Double | (js.Function1[/* statusCode */ Double, Boolean])): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCodeFunction1(value: /* statusCode */ Double => Boolean): Self = StObject.set(x, "statusCode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
  }
}
