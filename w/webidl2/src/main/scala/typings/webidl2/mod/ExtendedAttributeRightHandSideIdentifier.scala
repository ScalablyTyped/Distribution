package typings.webidl2.mod

import typings.webidl2.webidl2Strings.identifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtendedAttributeRightHandSideIdentifier
  extends StObject
     with ExtendedAttributeRightHandSideBase {
  
  var `type`: identifier
  
  var value: String
}
object ExtendedAttributeRightHandSideIdentifier {
  
  inline def apply(value: String): ExtendedAttributeRightHandSideIdentifier = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("identifier")
    __obj.asInstanceOf[ExtendedAttributeRightHandSideIdentifier]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExtendedAttributeRightHandSideIdentifier] (val x: Self) extends AnyVal {
    
    inline def setType(value: identifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
