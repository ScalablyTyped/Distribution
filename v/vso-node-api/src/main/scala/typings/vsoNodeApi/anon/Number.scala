package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Number extends StObject {
  
  var boolean: scala.Double
  
  var guid: scala.Double
  
  var none: scala.Double
  
  var number: scala.Double
  
  var string: scala.Double
  
  var uri: scala.Double
}
object Number {
  
  inline def apply(
    boolean: scala.Double,
    guid: scala.Double,
    none: scala.Double,
    number: scala.Double,
    string: scala.Double,
    uri: scala.Double
  ): Number = {
    val __obj = js.Dynamic.literal(boolean = boolean.asInstanceOf[js.Any], guid = guid.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[Number]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Number] (val x: Self) extends AnyVal {
    
    inline def setBoolean(value: scala.Double): Self = StObject.set(x, "boolean", value.asInstanceOf[js.Any])
    
    inline def setGuid(value: scala.Double): Self = StObject.set(x, "guid", value.asInstanceOf[js.Any])
    
    inline def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    inline def setNumber(value: scala.Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setString(value: scala.Double): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    
    inline def setUri(value: scala.Double): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
