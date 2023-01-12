package typings.wixUiTestUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataHookPage extends StObject {
  
  var dataHook: String
  
  var page: Any
  
  var wrapper: js.UndefOr[Any] = js.undefined
}
object DataHookPage {
  
  inline def apply(dataHook: String, page: Any): DataHookPage = {
    val __obj = js.Dynamic.literal(dataHook = dataHook.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataHookPage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataHookPage] (val x: Self) extends AnyVal {
    
    inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
    
    inline def setPage(value: Any): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setWrapper(value: Any): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
    
    inline def setWrapperUndefined: Self = StObject.set(x, "wrapper", js.undefined)
  }
}
