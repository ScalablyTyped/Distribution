package typings.vueRuntimeCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Emits extends StObject {
  
  var emits: Unit
  
  var expose: Unit
  
  var slots: Unit
}
object Emits {
  
  inline def apply(emits: Unit, expose: Unit, slots: Unit): Emits = {
    val __obj = js.Dynamic.literal(emits = emits.asInstanceOf[js.Any], expose = expose.asInstanceOf[js.Any], slots = slots.asInstanceOf[js.Any])
    __obj.asInstanceOf[Emits]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Emits] (val x: Self) extends AnyVal {
    
    inline def setEmits(value: Unit): Self = StObject.set(x, "emits", value.asInstanceOf[js.Any])
    
    inline def setExpose(value: Unit): Self = StObject.set(x, "expose", value.asInstanceOf[js.Any])
    
    inline def setSlots(value: Unit): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
  }
}
