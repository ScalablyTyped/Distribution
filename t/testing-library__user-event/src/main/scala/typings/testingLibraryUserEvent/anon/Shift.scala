package typings.testingLibraryUserEvent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Shift extends StObject {
  
  var shift: js.UndefOr[Boolean] = js.undefined
}
object Shift {
  
  inline def apply(): Shift = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Shift]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Shift] (val x: Self) extends AnyVal {
    
    inline def setShift(value: Boolean): Self = StObject.set(x, "shift", value.asInstanceOf[js.Any])
    
    inline def setShiftUndefined: Self = StObject.set(x, "shift", js.undefined)
  }
}
