package typings.undici.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StrictBoolean extends StObject {
  
  var strict: Boolean
}
object StrictBoolean {
  
  inline def apply(strict: Boolean): StrictBoolean = {
    val __obj = js.Dynamic.literal(strict = strict.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictBoolean]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StrictBoolean] (val x: Self) extends AnyVal {
    
    inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
  }
}
