package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Octaveshift extends StObject {
  
  var octave_shift: js.UndefOr[Double] = js.native
}
object Octaveshift {
  
  @scala.inline
  def apply(): Octaveshift = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Octaveshift]
  }
  
  @scala.inline
  implicit class OctaveshiftMutableBuilder[Self <: Octaveshift] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOctave_shift(value: Double): Self = StObject.set(x, "octave_shift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOctave_shiftUndefined: Self = StObject.set(x, "octave_shift", js.undefined)
  }
}
