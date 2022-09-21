package typings.typedoc.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Negative extends StObject {
  
  var negative: Boolean
  
  var value: String
}
object Negative {
  
  inline def apply(negative: Boolean, value: String): Negative = {
    val __obj = js.Dynamic.literal(negative = negative.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Negative]
  }
  
  extension [Self <: Negative](x: Self) {
    
    inline def setNegative(value: Boolean): Self = StObject.set(x, "negative", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
