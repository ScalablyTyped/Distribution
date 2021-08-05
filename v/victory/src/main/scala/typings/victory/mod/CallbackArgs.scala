package typings.victory.mod

import typings.victory.anon.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is the first parameter of a callback when a callback is used to
  * resolve the value of a property instead of a concrete value.
  *
  * Note that additional properties here like `scale`, `x`, `y`, etc are resolved
  * values of properties from the VictoryXXXProps for each component.
  */
trait CallbackArgs extends StObject {
  
  var active: Boolean
  
  var datum: js.Any
  
  var horizontal: Boolean
  
  var scale: js.UndefOr[`1`] = js.undefined
  
  var x: Double
  
  var y: Double
}
object CallbackArgs {
  
  inline def apply(active: Boolean, datum: js.Any, horizontal: Boolean, x: Double, y: Double): CallbackArgs = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], datum = datum.asInstanceOf[js.Any], horizontal = horizontal.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallbackArgs]
  }
  
  extension [Self <: CallbackArgs](x: Self) {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setDatum(value: js.Any): Self = StObject.set(x, "datum", value.asInstanceOf[js.Any])
    
    inline def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    inline def setScale(value: `1`): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
