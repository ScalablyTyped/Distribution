package typings.wordpressNotices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait URLAction
  extends StObject
     with BaseAction
     with Action {
  
  var url: String
}
object URLAction {
  
  inline def apply(label: String, url: String): URLAction = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[URLAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: URLAction] (val x: Self) extends AnyVal {
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
