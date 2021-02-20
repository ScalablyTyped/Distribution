package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Behaviors extends StObject {
  
  var behaviors: scala.Double = js.native
  
  var layout: scala.Double = js.native
  
  var none: scala.Double = js.native
  
  var states: scala.Double = js.native
}
object Behaviors {
  
  @scala.inline
  def apply(behaviors: scala.Double, layout: scala.Double, none: scala.Double, states: scala.Double): Behaviors = {
    val __obj = js.Dynamic.literal(behaviors = behaviors.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], states = states.asInstanceOf[js.Any])
    __obj.asInstanceOf[Behaviors]
  }
  
  @scala.inline
  implicit class BehaviorsMutableBuilder[Self <: Behaviors] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBehaviors(value: scala.Double): Self = StObject.set(x, "behaviors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayout(value: scala.Double): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStates(value: scala.Double): Self = StObject.set(x, "states", value.asInstanceOf[js.Any])
  }
}
