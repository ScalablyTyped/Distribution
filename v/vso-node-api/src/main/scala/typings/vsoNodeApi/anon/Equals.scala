package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Equals extends StObject {
  
  @JSName("equals")
  var equals_FEquals: scala.Double
  
  var notEquals: scala.Double
}
object Equals {
  
  inline def apply(equals_ : scala.Double, notEquals: scala.Double): Equals = {
    val __obj = js.Dynamic.literal(notEquals = notEquals.asInstanceOf[js.Any])
    __obj.updateDynamic("equals")(equals_.asInstanceOf[js.Any])
    __obj.asInstanceOf[Equals]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Equals] (val x: Self) extends AnyVal {
    
    inline def setEquals_(value: scala.Double): Self = StObject.set(x, "equals", value.asInstanceOf[js.Any])
    
    inline def setNotEquals(value: scala.Double): Self = StObject.set(x, "notEquals", value.asInstanceOf[js.Any])
  }
}
