package typings.yjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sanitize extends StObject {
  
  var sanitize: js.UndefOr[Boolean] = js.undefined
}
object Sanitize {
  
  inline def apply(): Sanitize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Sanitize]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Sanitize] (val x: Self) extends AnyVal {
    
    inline def setSanitize(value: Boolean): Self = StObject.set(x, "sanitize", value.asInstanceOf[js.Any])
    
    inline def setSanitizeUndefined: Self = StObject.set(x, "sanitize", js.undefined)
  }
}
