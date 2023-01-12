package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Double extends StObject {
  
  var boolean: scala.Double
  
  var dateTime: scala.Double
  
  var double: scala.Double
  
  var integer: scala.Double
  
  var plainText: scala.Double
  
  var string: scala.Double
  
  var treePath: scala.Double
}
object Double {
  
  inline def apply(
    boolean: scala.Double,
    dateTime: scala.Double,
    double: scala.Double,
    integer: scala.Double,
    plainText: scala.Double,
    string: scala.Double,
    treePath: scala.Double
  ): Double = {
    val __obj = js.Dynamic.literal(boolean = boolean.asInstanceOf[js.Any], dateTime = dateTime.asInstanceOf[js.Any], double = double.asInstanceOf[js.Any], integer = integer.asInstanceOf[js.Any], plainText = plainText.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any], treePath = treePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Double]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Double] (val x: Self) extends AnyVal {
    
    inline def setBoolean(value: scala.Double): Self = StObject.set(x, "boolean", value.asInstanceOf[js.Any])
    
    inline def setDateTime(value: scala.Double): Self = StObject.set(x, "dateTime", value.asInstanceOf[js.Any])
    
    inline def setDouble(value: scala.Double): Self = StObject.set(x, "double", value.asInstanceOf[js.Any])
    
    inline def setInteger(value: scala.Double): Self = StObject.set(x, "integer", value.asInstanceOf[js.Any])
    
    inline def setPlainText(value: scala.Double): Self = StObject.set(x, "plainText", value.asInstanceOf[js.Any])
    
    inline def setString(value: scala.Double): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    
    inline def setTreePath(value: scala.Double): Self = StObject.set(x, "treePath", value.asInstanceOf[js.Any])
  }
}
