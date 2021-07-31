package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnSocketOpenCallbackResult extends StObject {
  
  /**
    * 连接成功的 HTTP 响应 Header
    */
  var header: js.UndefOr[js.Any] = js.undefined
}
object OnSocketOpenCallbackResult {
  
  @scala.inline
  def apply(): OnSocketOpenCallbackResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnSocketOpenCallbackResult]
  }
  
  @scala.inline
  implicit class OnSocketOpenCallbackResultMutableBuilder[Self <: OnSocketOpenCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeader(value: js.Any): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
  }
}
