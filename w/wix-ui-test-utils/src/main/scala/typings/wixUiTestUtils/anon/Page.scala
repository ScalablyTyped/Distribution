package typings.wixUiTestUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Page extends StObject {
  
  var dataHook: String
  
  var page: typings.puppeteer.mod.Page
}
object Page {
  
  @scala.inline
  def apply(dataHook: String, page: typings.puppeteer.mod.Page): Page = {
    val __obj = js.Dynamic.literal(dataHook = dataHook.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any])
    __obj.asInstanceOf[Page]
  }
  
  @scala.inline
  implicit class PageMutableBuilder[Self <: Page] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPage(value: typings.puppeteer.mod.Page): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
  }
}
