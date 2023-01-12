package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Octaveshift extends StObject {
  
  var octave_shift: js.UndefOr[Double] = js.undefined
}
object Octaveshift {
  
  inline def apply(): Octaveshift = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Octaveshift]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Octaveshift] (val x: Self) extends AnyVal {
    
    inline def setOctave_shift(value: Double): Self = StObject.set(x, "octave_shift", value.asInstanceOf[js.Any])
    
    inline def setOctave_shiftUndefined: Self = StObject.set(x, "octave_shift", js.undefined)
  }
}
