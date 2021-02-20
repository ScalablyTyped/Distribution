package typings.webidl2.mod

import typings.webidl2.webidl2Strings.`identifier-list`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtendedAttributeRightHandSideIdentifierList extends ExtendedAttributeRightHandSideList {
  
  var `type`: `identifier-list` = js.native
  
  var value: js.Array[ExtendedAttributeRightHandSideIdentifier] = js.native
}
object ExtendedAttributeRightHandSideIdentifierList {
  
  @scala.inline
  def apply(`type`: `identifier-list`, value: js.Array[ExtendedAttributeRightHandSideIdentifier]): ExtendedAttributeRightHandSideIdentifierList = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedAttributeRightHandSideIdentifierList]
  }
  
  @scala.inline
  implicit class ExtendedAttributeRightHandSideIdentifierListMutableBuilder[Self <: ExtendedAttributeRightHandSideIdentifierList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: `identifier-list`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Array[ExtendedAttributeRightHandSideIdentifier]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueVarargs(value: ExtendedAttributeRightHandSideIdentifier*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
