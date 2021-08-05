package typings.wixUiTestUtils.anon

import typings.puppeteer.mod.ElementHandle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataHookPage extends StObject {
  
  var dataHook: String
  
  var page: typings.puppeteer.mod.Page
  
  var wrapper: js.UndefOr[ElementHandle[typings.std.Element] | Null] = js.undefined
}
object DataHookPage {
  
  inline def apply(dataHook: String, page: typings.puppeteer.mod.Page): DataHookPage = {
    val __obj = js.Dynamic.literal(dataHook = dataHook.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataHookPage]
  }
  
  extension [Self <: DataHookPage](x: Self) {
    
    inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
    
    inline def setPage(value: typings.puppeteer.mod.Page): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setWrapper(value: ElementHandle[typings.std.Element]): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
    
    inline def setWrapperNull: Self = StObject.set(x, "wrapper", null)
    
    inline def setWrapperUndefined: Self = StObject.set(x, "wrapper", js.undefined)
  }
}
