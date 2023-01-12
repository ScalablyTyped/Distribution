package typings.webidl2.mod

import typings.webidl2.webidl2Strings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtendedAttributeRightHandSideString
  extends StObject
     with ExtendedAttributeRightHandSideBase {
  
  var `type`: string
  
  var value: String
}
object ExtendedAttributeRightHandSideString {
  
  inline def apply(value: String): ExtendedAttributeRightHandSideString = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("string")
    __obj.asInstanceOf[ExtendedAttributeRightHandSideString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExtendedAttributeRightHandSideString] (val x: Self) extends AnyVal {
    
    inline def setType(value: string): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
