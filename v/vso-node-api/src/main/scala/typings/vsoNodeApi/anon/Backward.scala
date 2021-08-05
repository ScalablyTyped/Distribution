package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Backward extends StObject {
  
  var backward: scala.Double
  
  var forward: scala.Double
}
object Backward {
  
  inline def apply(backward: scala.Double, forward: scala.Double): Backward = {
    val __obj = js.Dynamic.literal(backward = backward.asInstanceOf[js.Any], forward = forward.asInstanceOf[js.Any])
    __obj.asInstanceOf[Backward]
  }
  
  extension [Self <: Backward](x: Self) {
    
    inline def setBackward(value: scala.Double): Self = StObject.set(x, "backward", value.asInstanceOf[js.Any])
    
    inline def setForward(value: scala.Double): Self = StObject.set(x, "forward", value.asInstanceOf[js.Any])
  }
}
