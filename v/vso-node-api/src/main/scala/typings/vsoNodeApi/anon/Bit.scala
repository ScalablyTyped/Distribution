package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bit extends StObject {
  
  var bit: scala.Double
  
  var dateTime: scala.Double
  
  var float: scala.Double
  
  var guid: scala.Double
  
  var int: scala.Double
  
  var string: scala.Double
}
object Bit {
  
  inline def apply(
    bit: scala.Double,
    dateTime: scala.Double,
    float: scala.Double,
    guid: scala.Double,
    int: scala.Double,
    string: scala.Double
  ): Bit = {
    val __obj = js.Dynamic.literal(bit = bit.asInstanceOf[js.Any], dateTime = dateTime.asInstanceOf[js.Any], float = float.asInstanceOf[js.Any], guid = guid.asInstanceOf[js.Any], int = int.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bit]
  }
  
  extension [Self <: Bit](x: Self) {
    
    inline def setBit(value: scala.Double): Self = StObject.set(x, "bit", value.asInstanceOf[js.Any])
    
    inline def setDateTime(value: scala.Double): Self = StObject.set(x, "dateTime", value.asInstanceOf[js.Any])
    
    inline def setFloat(value: scala.Double): Self = StObject.set(x, "float", value.asInstanceOf[js.Any])
    
    inline def setGuid(value: scala.Double): Self = StObject.set(x, "guid", value.asInstanceOf[js.Any])
    
    inline def setInt(value: scala.Double): Self = StObject.set(x, "int", value.asInstanceOf[js.Any])
    
    inline def setString(value: scala.Double): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
  }
}
