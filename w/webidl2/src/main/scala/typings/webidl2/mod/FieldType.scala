package typings.webidl2.mod

import typings.webidl2.webidl2Strings.field
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldType extends AbstractBase {
  
  /** A default value, absent if there is none. */
  var default: ValueDescription | Null = js.native
  
  /** An IDL Type describing what field's type. */
  var idlType: IDLTypeDescription = js.native
  
  /** The name of the field. */
  var name: String = js.native
  
  @JSName("parent")
  var parent_FieldType: DictionaryType = js.native
  
  /** Boolean indicating whether this is a required field. */
  var required: Boolean = js.native
  
  @JSName("type")
  var type_FieldType: field = js.native
}
object FieldType {
  
  @scala.inline
  def apply(
    extAttrs: js.Array[ExtendedAttribute],
    idlType: IDLTypeDescription,
    name: String,
    parent: DictionaryType,
    required: Boolean,
    `type`: field
  ): FieldType = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], idlType = idlType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
