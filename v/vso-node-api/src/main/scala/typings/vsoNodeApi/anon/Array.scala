package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Array extends StObject {
  
  var array: scala.Double = js.native
  
  var boolean: scala.Double = js.native
  
  var dateTime: scala.Double = js.native
  
  var dictionary: scala.Double = js.native
  
  var double: scala.Double = js.native
  
  var guid: scala.Double = js.native
  
  var integer: scala.Double = js.native
  
  var `object`: scala.Double = js.native
  
  var string: scala.Double = js.native
  
  var unknown: scala.Double = js.native
  
  var uri: scala.Double = js.native
}
object Array {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class ArrayMutableBuilder[Self <: Array] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArray(value: scala.Double): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoolean(value: scala.Double): Self = StObject.set(x, "boolean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateTime(value: scala.Double): Self = StObject.set(x, "dateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDictionary(value: scala.Double): Self = StObject.set(x, "dictionary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDouble(value: scala.Double): Self = StObject.set(x, "double", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuid(value: scala.Double): Self = StObject.set(x, "guid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInteger(value: scala.Double): Self = StObject.set(x, "integer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObject(value: scala.Double): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setString(value: scala.Double): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnknown(value: scala.Double): Self = StObject.set(x, "unknown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUri(value: scala.Double): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
