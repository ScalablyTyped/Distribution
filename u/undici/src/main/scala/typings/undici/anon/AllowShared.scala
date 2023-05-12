package typings.undici.anon

import typings.undici.undiciBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowShared extends StObject {
  
  var allowShared: `false`
}
object AllowShared {
  
  inline def apply(): AllowShared = {
    val __obj = js.Dynamic.literal(allowShared = false)
    __obj.asInstanceOf[AllowShared]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AllowShared] (val x: Self) extends AnyVal {
    
    inline def setAllowShared(value: `false`): Self = StObject.set(x, "allowShared", value.asInstanceOf[js.Any])
  }
}
