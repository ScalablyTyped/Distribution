package typings.surveyKnockout.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnError extends StObject {
  
  var onError: String = js.native
  
  var root: String = js.native
  
  var small: String = js.native
}
object OnError {
  
  @scala.inline
  def apply(onError: String, root: String, small: String): OnError = {
    val __obj = js.Dynamic.literal(onError = onError.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], small = small.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnError]
  }
  
  @scala.inline
  implicit class OnErrorMutableBuilder[Self <: OnError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnError(value: String): Self = StObject.set(x, "onError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmall(value: String): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
  }
}
