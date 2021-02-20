package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Backward extends StObject {
  
  var backward: scala.Double = js.native
  
  var forward: scala.Double = js.native
}
object Backward {
  
  @scala.inline
  def apply(backward: scala.Double, forward: scala.Double): Backward = {
    val __obj = js.Dynamic.literal(backward = backward.asInstanceOf[js.Any], forward = forward.asInstanceOf[js.Any])
    __obj.asInstanceOf[Backward]
  }
  
  @scala.inline
  implicit class BackwardMutableBuilder[Self <: Backward] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackward(value: scala.Double): Self = StObject.set(x, "backward", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForward(value: scala.Double): Self = StObject.set(x, "forward", value.asInstanceOf[js.Any])
  }
}
