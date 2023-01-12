package typings.surveyKnockout.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnError extends StObject {
  
  var onError: String
  
  var root: String
  
  var small: String
}
object OnError {
  
  inline def apply(onError: String, root: String, small: String): OnError = {
    val __obj = js.Dynamic.literal(onError = onError.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], small = small.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnError] (val x: Self) extends AnyVal {
    
    inline def setOnError(value: String): Self = StObject.set(x, "onError", value.asInstanceOf[js.Any])
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setSmall(value: String): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
  }
}
