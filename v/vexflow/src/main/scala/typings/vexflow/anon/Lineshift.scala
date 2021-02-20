package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Lineshift extends StObject {
  
  var line_shift: Double = js.native
}
object Lineshift {
  
  @scala.inline
  def apply(line_shift: Double): Lineshift = {
    val __obj = js.Dynamic.literal(line_shift = line_shift.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lineshift]
  }
  
  @scala.inline
  implicit class LineshiftMutableBuilder[Self <: Lineshift] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLine_shift(value: Double): Self = StObject.set(x, "line_shift", value.asInstanceOf[js.Any])
  }
}
