package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Behaviors extends StObject {
  
  var behaviors: scala.Double
  
  var layout: scala.Double
  
  var none: scala.Double
  
  var states: scala.Double
}
object Behaviors {
  
  inline def apply(behaviors: scala.Double, layout: scala.Double, none: scala.Double, states: scala.Double): Behaviors = {
    val __obj = js.Dynamic.literal(behaviors = behaviors.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], states = states.asInstanceOf[js.Any])
    __obj.asInstanceOf[Behaviors]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Behaviors] (val x: Self) extends AnyVal {
    
    inline def setBehaviors(value: scala.Double): Self = StObject.set(x, "behaviors", value.asInstanceOf[js.Any])
    
    inline def setLayout(value: scala.Double): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    inline def setStates(value: scala.Double): Self = StObject.set(x, "states", value.asInstanceOf[js.Any])
  }
}
