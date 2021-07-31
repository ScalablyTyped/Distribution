package typings.webidl2.mod

import typings.webidl2.webidl2Strings.`null`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueDescriptionNull
  extends StObject
     with AbstractValueDescription
     with ValueDescription {
  
  @JSName("type")
  var type_ValueDescriptionNull: `null`
}
object ValueDescriptionNull {
  
  @scala.inline
  def apply(extAttrs: js.Array[ExtendedAttribute], parent: Argument | ConstantMemberType | FieldType): ValueDescriptionNull = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("null")
    __obj.asInstanceOf[ValueDescriptionNull]
  }
  
  @scala.inline
  implicit class ValueDescriptionNullMutableBuilder[Self <: ValueDescriptionNull] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: `null`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
