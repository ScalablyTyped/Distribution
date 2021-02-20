package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Number extends StObject {
  
  var boolean: scala.Double = js.native
  
  var guid: scala.Double = js.native
  
  var none: scala.Double = js.native
  
  var number: scala.Double = js.native
  
  var string: scala.Double = js.native
  
  var uri: scala.Double = js.native
}
object Number {
  
  @scala.inline
  def apply(
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
  implicit class NumberMutableBuilder[Self <: Number] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoolean(value: scala.Double): Self = StObject.set(x, "boolean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuid(value: scala.Double): Self = StObject.set(x, "guid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumber(value: scala.Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setString(value: scala.Double): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUri(value: scala.Double): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
