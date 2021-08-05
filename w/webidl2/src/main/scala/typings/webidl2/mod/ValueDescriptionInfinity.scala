package typings.webidl2.mod

import typings.webidl2.webidl2Strings.Infinity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueDescriptionInfinity
  extends StObject
     with AbstractValueDescription
     with ValueDescription {
  
  var negative: Boolean
  
  @JSName("type")
  var type_ValueDescriptionInfinity: Infinity
}
object ValueDescriptionInfinity {
  
  inline def apply(
    extAttrs: js.Array[ExtendedAttribute],
    negative: Boolean,
    parent: Argument | ConstantMemberType | FieldType
  ): ValueDescriptionInfinity = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], negative = negative.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Infinity")
    __obj.asInstanceOf[ValueDescriptionInfinity]
  }
  
  extension [Self <: ValueDescriptionInfinity](x: Self) {
    
    inline def setNegative(value: Boolean): Self = StObject.set(x, "negative", value.asInstanceOf[js.Any])
    
    inline def setType(value: Infinity): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
