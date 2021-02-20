package typings.webrtc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConstrainNumberRange extends NumberRange {
  
  var exact: js.UndefOr[Double] = js.native
  
  var ideal: js.UndefOr[Double] = js.native
}
object ConstrainNumberRange {
  
  @scala.inline
  def apply(): ConstrainNumberRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConstrainNumberRange]
  }
  
  @scala.inline
  implicit class ConstrainNumberRangeMutableBuilder[Self <: ConstrainNumberRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExact(value: Double): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExactUndefined: Self = StObject.set(x, "exact", js.undefined)
    
    @scala.inline
    def setIdeal(value: Double): Self = StObject.set(x, "ideal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdealUndefined: Self = StObject.set(x, "ideal", js.undefined)
  }
}
