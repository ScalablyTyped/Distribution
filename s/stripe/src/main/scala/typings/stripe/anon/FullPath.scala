package typings.stripe.anon

import typings.stripe.stripeStrings.list
import typings.stripe.stripeStrings.search
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FullPath extends StObject {
  
  var fullPath: js.UndefOr[String] = js.undefined
  
  var method: String
  
  // Please note, methodType === 'search' is beta functionality and is subject to
  // change/removal at any time.
  var methodType: js.UndefOr[list | search] = js.undefined
  
  var path: js.UndefOr[String] = js.undefined
}
object FullPath {
  
  inline def apply(method: String): FullPath = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullPath]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FullPath] (val x: Self) extends AnyVal {
    
    inline def setFullPath(value: String): Self = StObject.set(x, "fullPath", value.asInstanceOf[js.Any])
    
    inline def setFullPathUndefined: Self = StObject.set(x, "fullPath", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodType(value: list | search): Self = StObject.set(x, "methodType", value.asInstanceOf[js.Any])
    
    inline def setMethodTypeUndefined: Self = StObject.set(x, "methodType", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
