package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Decrement extends StObject {
  
  var decrement: scala.Double
  
  var delete: scala.Double
  
  var increment: scala.Double
  
  var none: scala.Double
  
  var set: scala.Double
}
object Decrement {
  
  inline def apply(
    decrement: scala.Double,
    delete: scala.Double,
    increment: scala.Double,
    none: scala.Double,
    set: scala.Double
  ): Decrement = {
    val __obj = js.Dynamic.literal(decrement = decrement.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], increment = increment.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], set = set.asInstanceOf[js.Any])
    __obj.asInstanceOf[Decrement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Decrement] (val x: Self) extends AnyVal {
    
    inline def setDecrement(value: scala.Double): Self = StObject.set(x, "decrement", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: scala.Double): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setIncrement(value: scala.Double): Self = StObject.set(x, "increment", value.asInstanceOf[js.Any])
    
    inline def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    inline def setSet(value: scala.Double): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
  }
}
