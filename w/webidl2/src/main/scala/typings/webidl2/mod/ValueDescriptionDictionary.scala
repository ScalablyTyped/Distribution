package typings.webidl2.mod

import typings.webidl2.webidl2Strings.dictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueDescriptionDictionary
  extends StObject
     with AbstractValueDescription
     with ValueDescription {
  
  @JSName("type")
  var type_ValueDescriptionDictionary: dictionary
}
object ValueDescriptionDictionary {
  
  inline def apply(extAttrs: js.Array[ExtendedAttribute], parent: Argument | ConstantMemberType | FieldType): ValueDescriptionDictionary = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("dictionary")
    __obj.asInstanceOf[ValueDescriptionDictionary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValueDescriptionDictionary] (val x: Self) extends AnyVal {
    
    inline def setType(value: dictionary): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
