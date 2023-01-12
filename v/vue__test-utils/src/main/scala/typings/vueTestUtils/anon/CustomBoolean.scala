package typings.vueTestUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomBoolean extends StObject {
  
  var custom: Boolean
}
object CustomBoolean {
  
  inline def apply(custom: Boolean): CustomBoolean = {
    val __obj = js.Dynamic.literal(custom = custom.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomBoolean]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomBoolean] (val x: Self) extends AnyVal {
    
    inline def setCustom(value: Boolean): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
  }
}
