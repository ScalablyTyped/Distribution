package typings.webidl2.mod

import typings.webidl2.webidl2Strings.identifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtendedAttributeRightHandSideIdentifier extends ExtendedAttributeRightHandSideBase {
  
  var `type`: identifier = js.native
  
  var value: String = js.native
}
object ExtendedAttributeRightHandSideIdentifier {
  
  @scala.inline
  def apply(`type`: identifier, value: String): ExtendedAttributeRightHandSideIdentifier = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedAttributeRightHandSideIdentifier]
  }
  
  @scala.inline
  implicit class ExtendedAttributeRightHandSideIdentifierMutableBuilder[Self <: ExtendedAttributeRightHandSideIdentifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: identifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
