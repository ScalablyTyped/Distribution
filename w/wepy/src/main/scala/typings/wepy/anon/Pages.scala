package typings.wepy.anon

import typings.wepy.pageMod.PageConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pages extends StObject {
  
  var pages: js.Array[String]
  
  var window: PageConfig
}
object Pages {
  
  @scala.inline
  def apply(pages: js.Array[String], window: PageConfig): Pages = {
    val __obj = js.Dynamic.literal(pages = pages.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pages]
  }
  
  @scala.inline
  implicit class PagesMutableBuilder[Self <: Pages] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPages(value: js.Array[String]): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagesVarargs(value: String*): Self = StObject.set(x, "pages", js.Array(value :_*))
    
    @scala.inline
    def setWindow(value: PageConfig): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
  }
}
