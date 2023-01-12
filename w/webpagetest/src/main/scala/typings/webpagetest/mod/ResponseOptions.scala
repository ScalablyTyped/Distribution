package typings.webpagetest.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseOptions extends StObject {
  
  /** the request number [1] */
  var request: js.UndefOr[Double] = js.undefined
}
object ResponseOptions {
  
  inline def apply(): ResponseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponseOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseOptions] (val x: Self) extends AnyVal {
    
    inline def setRequest(value: Double): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
  }
}
