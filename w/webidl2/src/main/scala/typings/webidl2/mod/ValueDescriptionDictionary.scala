package typings.webidl2.mod

import typings.webidl2.webidl2Strings.dictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValueDescriptionDictionary
  extends AbstractValueDescription
     with ValueDescription {
  
  @JSName("type")
  var type_ValueDescriptionDictionary: dictionary = js.native
}
object ValueDescriptionDictionary {
  
  @scala.inline
  def apply(
    extAttrs: js.Array[ExtendedAttribute],
    parent: Argument | ConstantMemberType | FieldType,
    `type`: dictionary
  ): ValueDescriptionDictionary = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueDescriptionDictionary]
  }
  
  @scala.inline
  implicit class ValueDescriptionDictionaryMutableBuilder[Self <: ValueDescriptionDictionary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: dictionary): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
