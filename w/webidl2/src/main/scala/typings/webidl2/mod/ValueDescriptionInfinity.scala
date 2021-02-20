package typings.webidl2.mod

import typings.webidl2.webidl2Strings.Infinity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValueDescriptionInfinity
  extends AbstractValueDescription
     with ValueDescription {
  
  var negative: Boolean = js.native
  
  @JSName("type")
  var type_ValueDescriptionInfinity: Infinity = js.native
}
object ValueDescriptionInfinity {
  
  @scala.inline
  def apply(
    extAttrs: js.Array[ExtendedAttribute],
    negative: Boolean,
    parent: Argument | ConstantMemberType | FieldType,
    `type`: Infinity
  ): ValueDescriptionInfinity = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], negative = negative.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueDescriptionInfinity]
  }
  
  @scala.inline
  implicit class ValueDescriptionInfinityMutableBuilder[Self <: ValueDescriptionInfinity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNegative(value: Boolean): Self = StObject.set(x, "negative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Infinity): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
