package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AfterGatesAlways extends StObject {
  
  var afterGatesAlways: scala.Double = js.native
  
  var afterSuccessfulGates: scala.Double = js.native
  
  var beforeGates: scala.Double = js.native
}
object AfterGatesAlways {
  
  @scala.inline
  def apply(afterGatesAlways: scala.Double, afterSuccessfulGates: scala.Double, beforeGates: scala.Double): AfterGatesAlways = {
    val __obj = js.Dynamic.literal(afterGatesAlways = afterGatesAlways.asInstanceOf[js.Any], afterSuccessfulGates = afterSuccessfulGates.asInstanceOf[js.Any], beforeGates = beforeGates.asInstanceOf[js.Any])
    __obj.asInstanceOf[AfterGatesAlways]
  }
  
  @scala.inline
  implicit class AfterGatesAlwaysMutableBuilder[Self <: AfterGatesAlways] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfterGatesAlways(value: scala.Double): Self = StObject.set(x, "afterGatesAlways", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterSuccessfulGates(value: scala.Double): Self = StObject.set(x, "afterSuccessfulGates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeGates(value: scala.Double): Self = StObject.set(x, "beforeGates", value.asInstanceOf[js.Any])
  }
}
