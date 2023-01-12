package typings.testcafe.mod.global

import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowFilterData extends StObject {
  
  /**
    * The window title.
    */
  var title: String
  
  /**
    * The window URL.
    */
  var url: URL
}
object WindowFilterData {
  
  inline def apply(title: String, url: URL): WindowFilterData = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowFilterData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WindowFilterData] (val x: Self) extends AnyVal {
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: URL): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
