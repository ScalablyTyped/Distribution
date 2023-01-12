package typings.webix.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DecimalDelimiter extends StObject {
  
  var decimalDelimiter: String
  
  var decimalSize: Double
  
  var groupDelimiter: String
  
  var groupSize: Double
}
object DecimalDelimiter {
  
  inline def apply(decimalDelimiter: String, decimalSize: Double, groupDelimiter: String, groupSize: Double): DecimalDelimiter = {
    val __obj = js.Dynamic.literal(decimalDelimiter = decimalDelimiter.asInstanceOf[js.Any], decimalSize = decimalSize.asInstanceOf[js.Any], groupDelimiter = groupDelimiter.asInstanceOf[js.Any], groupSize = groupSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecimalDelimiter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DecimalDelimiter] (val x: Self) extends AnyVal {
    
    inline def setDecimalDelimiter(value: String): Self = StObject.set(x, "decimalDelimiter", value.asInstanceOf[js.Any])
    
    inline def setDecimalSize(value: Double): Self = StObject.set(x, "decimalSize", value.asInstanceOf[js.Any])
    
    inline def setGroupDelimiter(value: String): Self = StObject.set(x, "groupDelimiter", value.asInstanceOf[js.Any])
    
    inline def setGroupSize(value: Double): Self = StObject.set(x, "groupSize", value.asInstanceOf[js.Any])
  }
}
