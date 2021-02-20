package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bit extends StObject {
  
  var bit: scala.Double = js.native
  
  var dateTime: scala.Double = js.native
  
  var float: scala.Double = js.native
  
  var guid: scala.Double = js.native
  
  var int: scala.Double = js.native
  
  var string: scala.Double = js.native
}
object Bit {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class BitMutableBuilder[Self <: Bit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBit(value: scala.Double): Self = StObject.set(x, "bit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateTime(value: scala.Double): Self = StObject.set(x, "dateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloat(value: scala.Double): Self = StObject.set(x, "float", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuid(value: scala.Double): Self = StObject.set(x, "guid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInt(value: scala.Double): Self = StObject.set(x, "int", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setString(value: scala.Double): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
  }
}
