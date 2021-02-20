package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AND extends StObject {
  
  var aND: scala.Double = js.native
  
  var nONE: scala.Double = js.native
  
  var oR: scala.Double = js.native
}
object AND {
  
  @scala.inline
  def apply(aND: scala.Double, nONE: scala.Double, oR: scala.Double): AND = {
    val __obj = js.Dynamic.literal(aND = aND.asInstanceOf[js.Any], nONE = nONE.asInstanceOf[js.Any], oR = oR.asInstanceOf[js.Any])
    __obj.asInstanceOf[AND]
  }
  
  @scala.inline
  implicit class ANDMutableBuilder[Self <: AND] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAND(value: scala.Double): Self = StObject.set(x, "aND", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNONE(value: scala.Double): Self = StObject.set(x, "nONE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOR(value: scala.Double): Self = StObject.set(x, "oR", value.asInstanceOf[js.Any])
  }
}
