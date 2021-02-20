package typings.webidl2.mod

import typings.webidl2.webidl2Strings.number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValueDescriptionNumber
  extends AbstractValueDescription
     with ValueDescription {
  
  @JSName("type")
  var type_ValueDescriptionNumber: number = js.native
  
  var value: String = js.native
}
object ValueDescriptionNumber {
  
  @scala.inline
  def apply(
    extAttrs: js.Array[ExtendedAttribute],
    parent: Argument | ConstantMemberType | FieldType,
    `type`: number,
    value: String
  ): ValueDescriptionNumber = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueDescriptionNumber]
  }
  
  @scala.inline
  implicit class ValueDescriptionNumberMutableBuilder[Self <: ValueDescriptionNumber] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: number): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
