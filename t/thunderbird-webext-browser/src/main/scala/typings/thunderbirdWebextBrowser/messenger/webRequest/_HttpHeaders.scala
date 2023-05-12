package typings.thunderbirdWebextBrowser.messenger.webRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _HttpHeaders extends StObject {
  
  /**
    * Value of the HTTP header if it cannot be represented by UTF-8, stored
    * as individual byte values (0..255).
    */
  var binaryValue: js.UndefOr[js.Array[Double]] = js.undefined
  
  /** Name of the HTTP header. */
  var name: String
  
  /** Value of the HTTP header if it can be represented by UTF-8. */
  var value: js.UndefOr[String] = js.undefined
}
object _HttpHeaders {
  
  inline def apply(name: String): _HttpHeaders = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[_HttpHeaders]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: _HttpHeaders] (val x: Self) extends AnyVal {
    
    inline def setBinaryValue(value: js.Array[Double]): Self = StObject.set(x, "binaryValue", value.asInstanceOf[js.Any])
    
    inline def setBinaryValueUndefined: Self = StObject.set(x, "binaryValue", js.undefined)
    
    inline def setBinaryValueVarargs(value: Double*): Self = StObject.set(x, "binaryValue", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
