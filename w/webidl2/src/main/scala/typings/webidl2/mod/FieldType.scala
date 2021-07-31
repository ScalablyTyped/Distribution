package typings.webidl2.mod

import typings.webidl2.webidl2Strings.field
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldType
  extends StObject
     with AbstractBase {
  
  /** A default value, absent if there is none. */
  var default: ValueDescription | Null
  
  /** An IDL Type describing what field's type. */
  var idlType: IDLTypeDescription
  
  /** The name of the field. */
  var name: String
  
  @JSName("parent")
  var parent_FieldType: DictionaryType
  
  /** Boolean indicating whether this is a required field. */
  var required: Boolean
  
  @JSName("type")
  var type_FieldType: field
}
object FieldType {
  
  @scala.inline
  def apply(
    extAttrs: js.Array[ExtendedAttribute],
    idlType: IDLTypeDescription,
    name: String,
    parent: DictionaryType,
    required: Boolean
  ): FieldType = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], idlType = idlType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], default = null)
    __obj.updateDynamic("type")("field")
    __obj.asInstanceOf[FieldType]
  }
  
  @scala.inline
  implicit class FieldTypeMutableBuilder[Self <: FieldType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefault(value: ValueDescription): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultNull: Self = StObject.set(x, "default", null)
    
    @scala.inline
    def setIdlType(value: IDLTypeDescription): Self = StObject.set(x, "idlType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: DictionaryType): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: field): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
