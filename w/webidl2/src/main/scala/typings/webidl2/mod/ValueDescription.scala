package typings.webidl2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.webidl2.mod.ValueDescriptionString
  - typings.webidl2.mod.ValueDescriptionNumber
  - typings.webidl2.mod.ValueDescriptionBoolean
  - typings.webidl2.mod.ValueDescriptionNull
  - typings.webidl2.mod.ValueDescriptionInfinity
  - typings.webidl2.mod.ValueDescriptionNaN
  - typings.webidl2.mod.ValueDescriptionSequence
  - typings.webidl2.mod.ValueDescriptionDictionary
*/
trait ValueDescription extends StObject
object ValueDescription {
  
  @scala.inline
  def ValueDescriptionBoolean(
    extAttrs: js.Array[ExtendedAttribute],
    parent: Argument | ConstantMemberType | FieldType,
    value: Boolean
  ): typings.webidl2.mod.ValueDescriptionBoolean = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("boolean")
    __obj.asInstanceOf[typings.webidl2.mod.ValueDescriptionBoolean]
  }
  
  @scala.inline
  def ValueDescriptionDictionary(extAttrs: js.Array[ExtendedAttribute], parent: Argument | ConstantMemberType | FieldType): typings.webidl2.mod.ValueDescriptionDictionary = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("dictionary")
    __obj.asInstanceOf[typings.webidl2.mod.ValueDescriptionDictionary]
  }
  
  @scala.inline
  def ValueDescriptionInfinity(
    extAttrs: js.Array[ExtendedAttribute],
    negative: Boolean,
    parent: Argument | ConstantMemberType | FieldType
  ): typings.webidl2.mod.ValueDescriptionInfinity = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], negative = negative.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Infinity")
    __obj.asInstanceOf[typings.webidl2.mod.ValueDescriptionInfinity]
  }
  
  @scala.inline
  def ValueDescriptionNaN(extAttrs: js.Array[ExtendedAttribute], parent: Argument | ConstantMemberType | FieldType): typings.webidl2.mod.ValueDescriptionNaN = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NaN")
    __obj.asInstanceOf[typings.webidl2.mod.ValueDescriptionNaN]
  }
  
  @scala.inline
  def ValueDescriptionNull(extAttrs: js.Array[ExtendedAttribute], parent: Argument | ConstantMemberType | FieldType): typings.webidl2.mod.ValueDescriptionNull = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("null")
    __obj.asInstanceOf[typings.webidl2.mod.ValueDescriptionNull]
  }
  
  @scala.inline
  def ValueDescriptionNumber(
    extAttrs: js.Array[ExtendedAttribute],
    parent: Argument | ConstantMemberType | FieldType,
    value: String
  ): typings.webidl2.mod.ValueDescriptionNumber = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("number")
    __obj.asInstanceOf[typings.webidl2.mod.ValueDescriptionNumber]
  }
  
  @scala.inline
  def ValueDescriptionSequence(
    extAttrs: js.Array[ExtendedAttribute],
    parent: Argument | ConstantMemberType | FieldType,
    value: js.Array[js.Any]
  ): typings.webidl2.mod.ValueDescriptionSequence = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("sequence")
    __obj.asInstanceOf[typings.webidl2.mod.ValueDescriptionSequence]
  }
  
  @scala.inline
  def ValueDescriptionString(
    extAttrs: js.Array[ExtendedAttribute],
    parent: Argument | ConstantMemberType | FieldType,
    value: String
  ): typings.webidl2.mod.ValueDescriptionString = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("string")
    __obj.asInstanceOf[typings.webidl2.mod.ValueDescriptionString]
  }
}
