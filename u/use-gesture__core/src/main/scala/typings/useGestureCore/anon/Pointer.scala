package typings.useGestureCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pointer extends StObject {
  
  var pointer: js.UndefOr[Buttons] = js.undefined
}
object Pointer {
  
  inline def apply(): Pointer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pointer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Pointer] (val x: Self) extends AnyVal {
    
    inline def setPointer(value: Buttons): Self = StObject.set(x, "pointer", value.asInstanceOf[js.Any])
    
    inline def setPointerUndefined: Self = StObject.set(x, "pointer", js.undefined)
  }
}
