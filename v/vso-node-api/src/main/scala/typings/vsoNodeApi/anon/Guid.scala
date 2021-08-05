package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Guid extends StObject {
  
  var boolean: scala.Double
  
  var dateTime: scala.Double
  
  var double: scala.Double
  
  var guid: scala.Double
  
  var history: scala.Double
  
  var html: scala.Double
  
  var identity: scala.Double
  
  var integer: scala.Double
  
  var picklistDouble: scala.Double
  
  var picklistInteger: scala.Double
  
  var picklistString: scala.Double
  
  var plainText: scala.Double
  
  var string: scala.Double
  
  var treePath: scala.Double
}
object Guid {
  
  inline def apply(
    boolean: scala.Double,
    dateTime: scala.Double,
    double: scala.Double,
    guid: scala.Double,
    history: scala.Double,
    html: scala.Double,
    identity: scala.Double,
    integer: scala.Double,
    picklistDouble: scala.Double,
    picklistInteger: scala.Double,
    picklistString: scala.Double,
    plainText: scala.Double,
    string: scala.Double,
    treePath: scala.Double
  ): Guid = {
    val __obj = js.Dynamic.literal(boolean = boolean.asInstanceOf[js.Any], dateTime = dateTime.asInstanceOf[js.Any], double = double.asInstanceOf[js.Any], guid = guid.asInstanceOf[js.Any], history = history.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], integer = integer.asInstanceOf[js.Any], picklistDouble = picklistDouble.asInstanceOf[js.Any], picklistInteger = picklistInteger.asInstanceOf[js.Any], picklistString = picklistString.asInstanceOf[js.Any], plainText = plainText.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any], treePath = treePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Guid]
  }
  
  extension [Self <: Guid](x: Self) {
    
    inline def setBoolean(value: scala.Double): Self = StObject.set(x, "boolean", value.asInstanceOf[js.Any])
    
    inline def setDateTime(value: scala.Double): Self = StObject.set(x, "dateTime", value.asInstanceOf[js.Any])
    
    inline def setDouble(value: scala.Double): Self = StObject.set(x, "double", value.asInstanceOf[js.Any])
    
    inline def setGuid(value: scala.Double): Self = StObject.set(x, "guid", value.asInstanceOf[js.Any])
    
    inline def setHistory(value: scala.Double): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    inline def setHtml(value: scala.Double): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    inline def setIdentity(value: scala.Double): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
    
    inline def setInteger(value: scala.Double): Self = StObject.set(x, "integer", value.asInstanceOf[js.Any])
    
    inline def setPicklistDouble(value: scala.Double): Self = StObject.set(x, "picklistDouble", value.asInstanceOf[js.Any])
    
    inline def setPicklistInteger(value: scala.Double): Self = StObject.set(x, "picklistInteger", value.asInstanceOf[js.Any])
    
    inline def setPicklistString(value: scala.Double): Self = StObject.set(x, "picklistString", value.asInstanceOf[js.Any])
    
    inline def setPlainText(value: scala.Double): Self = StObject.set(x, "plainText", value.asInstanceOf[js.Any])
    
    inline def setString(value: scala.Double): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    
    inline def setTreePath(value: scala.Double): Self = StObject.set(x, "treePath", value.asInstanceOf[js.Any])
  }
}
