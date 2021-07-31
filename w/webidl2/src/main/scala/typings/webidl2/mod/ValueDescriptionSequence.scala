package typings.webidl2.mod

import typings.webidl2.webidl2Strings.sequence
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueDescriptionSequence
  extends StObject
     with AbstractValueDescription
     with ValueDescription {
  
  @JSName("type")
  var type_ValueDescriptionSequence: sequence
  
  var value: js.Array[js.Any]
}
object ValueDescriptionSequence {
  
  @scala.inline
  def apply(
    extAttrs: js.Array[ExtendedAttribute],
    parent: Argument | ConstantMemberType | FieldType,
    value: js.Array[js.Any]
  ): ValueDescriptionSequence = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("sequence")
    __obj.asInstanceOf[ValueDescriptionSequence]
  }
  
  @scala.inline
  implicit class ValueDescriptionSequenceMutableBuilder[Self <: ValueDescriptionSequence] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: sequence): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Array[js.Any]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueVarargs(value: js.Any*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
