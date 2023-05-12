package typings.undici.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowSharedBoolean extends StObject {
  
  var allowShared: Boolean
}
object AllowSharedBoolean {
  
  inline def apply(allowShared: Boolean): AllowSharedBoolean = {
    val __obj = js.Dynamic.literal(allowShared = allowShared.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowSharedBoolean]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AllowSharedBoolean] (val x: Self) extends AnyVal {
    
    inline def setAllowShared(value: Boolean): Self = StObject.set(x, "allowShared", value.asInstanceOf[js.Any])
  }
}
