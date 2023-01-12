package typings.testcafeHammerhead

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestTimeout extends StObject {
  
  var ajax: js.UndefOr[Double] = js.undefined
  
  var page: js.UndefOr[Double] = js.undefined
}
object RequestTimeout {
  
  inline def apply(): RequestTimeout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestTimeout]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestTimeout] (val x: Self) extends AnyVal {
    
    inline def setAjax(value: Double): Self = StObject.set(x, "ajax", value.asInstanceOf[js.Any])
    
    inline def setAjaxUndefined: Self = StObject.set(x, "ajax", js.undefined)
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
  }
}
