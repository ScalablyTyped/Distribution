package typings.webpagetest.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResponseOptions extends StObject {
  
  /** the request number [1] */
  var request: js.UndefOr[Double] = js.native
}
object ResponseOptions {
  
  @scala.inline
  def apply(): ResponseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponseOptions]
  }
  
  @scala.inline
  implicit class ResponseOptionsMutableBuilder[Self <: ResponseOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequest(value: Double): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
  }
}
