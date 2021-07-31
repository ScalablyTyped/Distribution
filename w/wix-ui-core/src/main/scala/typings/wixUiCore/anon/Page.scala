package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Page extends StObject {
  
  var dataHook: String
  
  var page: js.Any
  
  var wrapper: js.UndefOr[js.Any] = js.undefined
}
object Page {
  
  @scala.inline
  def apply(dataHook: String, page: js.Any): Page = {
    val __obj = js.Dynamic.literal(dataHook = dataHook.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any])
    __obj.asInstanceOf[Page]
  }
  
  @scala.inline
  implicit class PageMutableBuilder[Self <: Page] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPage(value: js.Any): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapper(value: js.Any): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapperUndefined: Self = StObject.set(x, "wrapper", js.undefined)
  }
}
