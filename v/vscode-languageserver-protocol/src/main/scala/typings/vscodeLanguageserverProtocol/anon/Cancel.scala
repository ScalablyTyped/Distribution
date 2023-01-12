package typings.vscodeLanguageserverProtocol.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cancel extends StObject {
  
  /**
    * The client will actively cancel the request.
    */
  var cancel: Boolean
  
  /**
    * The list of requests for which the client
    * will retry the request if it receives a
    * response with error code `ContentModified`
    */
  var retryOnContentModified: js.Array[String]
}
object Cancel {
  
  inline def apply(cancel: Boolean, retryOnContentModified: js.Array[String]): Cancel = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], retryOnContentModified = retryOnContentModified.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cancel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Cancel] (val x: Self) extends AnyVal {
    
    inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    inline def setRetryOnContentModified(value: js.Array[String]): Self = StObject.set(x, "retryOnContentModified", value.asInstanceOf[js.Any])
    
    inline def setRetryOnContentModifiedVarargs(value: String*): Self = StObject.set(x, "retryOnContentModified", js.Array(value*))
  }
}
