package typings.three.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NeedsUpdate extends StObject {
  
  var needsUpdate: Boolean
  
  var value: Any
}
object NeedsUpdate {
  
  inline def apply(needsUpdate: Boolean, value: Any): NeedsUpdate = {
    val __obj = js.Dynamic.literal(needsUpdate = needsUpdate.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[NeedsUpdate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NeedsUpdate] (val x: Self) extends AnyVal {
    
    inline def setNeedsUpdate(value: Boolean): Self = StObject.set(x, "needsUpdate", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
