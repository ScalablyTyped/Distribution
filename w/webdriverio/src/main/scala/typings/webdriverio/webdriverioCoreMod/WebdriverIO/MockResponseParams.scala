package typings.webdriverio.webdriverioCoreMod.WebdriverIO

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MockResponseParams extends StObject {
  
  /**
    * fetch real response before responding with mocked data. Default: true
    */
  var fetchResponse: js.UndefOr[Boolean] = js.undefined
  
  var headers: js.UndefOr[Record[String, String]] = js.undefined
  
  var statusCode: js.UndefOr[Double] = js.undefined
}
object MockResponseParams {
  
  @scala.inline
  def apply(): MockResponseParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MockResponseParams]
  }
  
  @scala.inline
  implicit class MockResponseParamsMutableBuilder[Self <: MockResponseParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFetchResponse(value: Boolean): Self = StObject.set(x, "fetchResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFetchResponseUndefined: Self = StObject.set(x, "fetchResponse", js.undefined)
    
    @scala.inline
    def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
  }
}
