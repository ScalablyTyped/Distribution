package typings.webidl2.mod

import typings.webidl2.webidl2Strings.boolean
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValueDescriptionBoolean
  extends AbstractValueDescription
     with ValueDescription {
  
  @JSName("type")
  var type_ValueDescriptionBoolean: boolean = js.native
  
  var value: Boolean = js.native
}
object ValueDescriptionBoolean {
  
  @scala.inline
  def apply(
    extAttrs: js.Array[ExtendedAttribute],
    parent: Argument | ConstantMemberType | FieldType,
    `type`: boolean,
    value: Boolean
  ): ValueDescriptionBoolean = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueDescriptionBoolean]
  }
  
  @scala.inline
  implicit class ValueDescriptionBooleanMutableBuilder[Self <: ValueDescriptionBoolean] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: boolean): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
