package typings.webidl2.mod

import typings.webidl2.webidl2Strings.`string-list`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtendedAttributeRightHandSideStringList extends ExtendedAttributeRightHandSideList {
  
  var `type`: `string-list` = js.native
  
  var value: js.Array[ExtendedAttributeRightHandSideString] = js.native
}
object ExtendedAttributeRightHandSideStringList {
  
  @scala.inline
  def apply(`type`: `string-list`, value: js.Array[ExtendedAttributeRightHandSideString]): ExtendedAttributeRightHandSideStringList = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedAttributeRightHandSideStringList]
  }
  
  @scala.inline
  implicit class ExtendedAttributeRightHandSideStringListMutableBuilder[Self <: ExtendedAttributeRightHandSideStringList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: `string-list`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Array[ExtendedAttributeRightHandSideString]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueVarargs(value: ExtendedAttributeRightHandSideString*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
