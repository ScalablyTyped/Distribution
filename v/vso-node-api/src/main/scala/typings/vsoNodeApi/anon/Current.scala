package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Current extends StObject {
  
  var current: scala.Double
  
  var future: scala.Double
  
  var past: scala.Double
}
object Current {
  
  @scala.inline
  def apply(current: scala.Double, future: scala.Double, past: scala.Double): Current = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], future = future.asInstanceOf[js.Any], past = past.asInstanceOf[js.Any])
    __obj.asInstanceOf[Current]
  }
  
  @scala.inline
  implicit class CurrentMutableBuilder[Self <: Current] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrent(value: scala.Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFuture(value: scala.Double): Self = StObject.set(x, "future", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPast(value: scala.Double): Self = StObject.set(x, "past", value.asInstanceOf[js.Any])
  }
}
