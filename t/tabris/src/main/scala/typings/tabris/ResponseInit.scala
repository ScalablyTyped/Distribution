package typings.tabris

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// ResponseInit
trait ResponseInit extends StObject {
  
  var headers: js.UndefOr[Headers | (js.Array[js.Tuple2[String, String]]) | StringDictionary[String]] = js.undefined
  
  var status: js.UndefOr[Double] = js.undefined
  
  var statusText: js.UndefOr[String] = js.undefined
}
object ResponseInit {
  
  @scala.inline
  def apply(): ResponseInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponseInit]
  }
  
  @scala.inline
  implicit class ResponseInitMutableBuilder[Self <: ResponseInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: Headers | (js.Array[js.Tuple2[String, String]]) | StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setHeadersVarargs(value: (js.Tuple2[String, String])*): Self = StObject.set(x, "headers", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusTextUndefined: Self = StObject.set(x, "statusText", js.undefined)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
