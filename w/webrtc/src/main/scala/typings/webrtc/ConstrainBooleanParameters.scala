package typings.webrtc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConstrainBooleanParameters extends StObject {
  
  var exact: js.UndefOr[Boolean] = js.undefined
  
  var ideal: js.UndefOr[Boolean] = js.undefined
}
object ConstrainBooleanParameters {
  
  @scala.inline
  def apply(): ConstrainBooleanParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConstrainBooleanParameters]
  }
  
  @scala.inline
  implicit class ConstrainBooleanParametersMutableBuilder[Self <: ConstrainBooleanParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExact(value: Boolean): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExactUndefined: Self = StObject.set(x, "exact", js.undefined)
    
    @scala.inline
    def setIdeal(value: Boolean): Self = StObject.set(x, "ideal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdealUndefined: Self = StObject.set(x, "ideal", js.undefined)
  }
}
