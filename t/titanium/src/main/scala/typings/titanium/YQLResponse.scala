package typings.titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Properties passed to a yql callback to report a success or failure.
  */
@js.native
trait YQLResponse extends ErrorResponse {
  
  /**
    * The data payload received from the YQL.
    */
  var data: js.UndefOr[js.Any] = js.native
  
  /**
    * Error message, if any returned. Use `error` instead
    * @deprecated
    */
  var message: js.UndefOr[String] = js.native
}
object YQLResponse {
  
  @scala.inline
  def apply(): YQLResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[YQLResponse]
  }
  
  @scala.inline
  implicit class YQLResponseMutableBuilder[Self <: YQLResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
