package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Array extends StObject {
  
  var array: scala.Double
  
  var boolean: scala.Double
  
  var dateTime: scala.Double
  
  var dictionary: scala.Double
  
  var double: scala.Double
  
  var guid: scala.Double
  
  var integer: scala.Double
  
  var `object`: scala.Double
  
  var string: scala.Double
  
  var unknown: scala.Double
  
  var uri: scala.Double
}
object Array {
  
  inline def apply(
    array: scala.Double,
    boolean: scala.Double,
    dateTime: scala.Double,
    dictionary: scala.Double,
    double: scala.Double,
    guid: scala.Double,
    integer: scala.Double,
    `object`: scala.Double,
    string: scala.Double,
    unknown: scala.Double,
    uri: scala.Double
  ): Array = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], boolean = boolean.asInstanceOf[js.Any], dateTime = dateTime.asInstanceOf[js.Any], dictionary = dictionary.asInstanceOf[js.Any], double = double.asInstanceOf[js.Any], guid = guid.asInstanceOf[js.Any], integer = integer.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any], unknown = unknown.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Array]
  }
  
  extension [Self <: Array](x: Self) {
    
    inline def setArray(value: scala.Double): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
    
    inline def setBoolean(value: scala.Double): Self = StObject.set(x, "boolean", value.asInstanceOf[js.Any])
    
    inline def setDateTime(value: scala.Double): Self = StObject.set(x, "dateTime", value.asInstanceOf[js.Any])
    
    inline def setDictionary(value: scala.Double): Self = StObject.set(x, "dictionary", value.asInstanceOf[js.Any])
    
    inline def setDouble(value: scala.Double): Self = StObject.set(x, "double", value.asInstanceOf[js.Any])
    
    inline def setGuid(value: scala.Double): Self = StObject.set(x, "guid", value.asInstanceOf[js.Any])
    
    inline def setInteger(value: scala.Double): Self = StObject.set(x, "integer", value.asInstanceOf[js.Any])
    
    inline def setObject(value: scala.Double): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setString(value: scala.Double): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    
    inline def setUnknown(value: scala.Double): Self = StObject.set(x, "unknown", value.asInstanceOf[js.Any])
    
    inline def setUri(value: scala.Double): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
