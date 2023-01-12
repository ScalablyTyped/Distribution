package typings.webextensionPolyfill.namespacesWebRequestMod.WebRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpHeadersItemType extends StObject {
  
  /**
    * Value of the HTTP header if it cannot be represented by UTF-8, stored as individual byte values (0..255).
    * Optional.
    */
  var binaryValue: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * Name of the HTTP header.
    */
  var name: String
  
  /**
    * Value of the HTTP header if it can be represented by UTF-8.
    * Optional.
    */
  var value: js.UndefOr[String] = js.undefined
}
object HttpHeadersItemType {
  
  inline def apply(name: String): HttpHeadersItemType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpHeadersItemType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HttpHeadersItemType] (val x: Self) extends AnyVal {
    
    inline def setBinaryValue(value: js.Array[Double]): Self = StObject.set(x, "binaryValue", value.asInstanceOf[js.Any])
    
    inline def setBinaryValueUndefined: Self = StObject.set(x, "binaryValue", js.undefined)
    
    inline def setBinaryValueVarargs(value: Double*): Self = StObject.set(x, "binaryValue", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
