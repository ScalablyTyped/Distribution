package typings.uuidApikey

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UUIDOptions extends StObject {
  
  var noDashes: Boolean
}
object UUIDOptions {
  
  inline def apply(noDashes: Boolean): UUIDOptions = {
    val __obj = js.Dynamic.literal(noDashes = noDashes.asInstanceOf[js.Any])
    __obj.asInstanceOf[UUIDOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UUIDOptions] (val x: Self) extends AnyVal {
    
    inline def setNoDashes(value: Boolean): Self = StObject.set(x, "noDashes", value.asInstanceOf[js.Any])
  }
}
