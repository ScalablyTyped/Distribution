package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Lineshift extends StObject {
  
  var line_shift: Double
}
object Lineshift {
  
  inline def apply(line_shift: Double): Lineshift = {
    val __obj = js.Dynamic.literal(line_shift = line_shift.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lineshift]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Lineshift] (val x: Self) extends AnyVal {
    
    inline def setLine_shift(value: Double): Self = StObject.set(x, "line_shift", value.asInstanceOf[js.Any])
  }
}
