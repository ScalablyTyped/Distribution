package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Justification extends StObject {
  
  var justification: js.UndefOr[typings.vexflow.Vex.Flow.TextNote.Justification] = js.native
  
  var shift_x: js.UndefOr[Double] = js.native
  
  var shift_y: js.UndefOr[Double] = js.native
}
object Justification {
  
  @scala.inline
  def apply(): Justification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Justification]
  }
  
  @scala.inline
  implicit class JustificationMutableBuilder[Self <: Justification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJustification(value: typings.vexflow.Vex.Flow.TextNote.Justification): Self = StObject.set(x, "justification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJustificationUndefined: Self = StObject.set(x, "justification", js.undefined)
    
    @scala.inline
    def setShift_x(value: Double): Self = StObject.set(x, "shift_x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShift_xUndefined: Self = StObject.set(x, "shift_x", js.undefined)
    
    @scala.inline
    def setShift_y(value: Double): Self = StObject.set(x, "shift_y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShift_yUndefined: Self = StObject.set(x, "shift_y", js.undefined)
  }
}
