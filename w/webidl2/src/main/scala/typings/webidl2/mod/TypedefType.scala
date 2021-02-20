package typings.webidl2.mod

import typings.webidl2.webidl2Strings.typedef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypedefType
  extends AbstractBase
     with IDLRootType {
  
  /** An IDL Type describing what typedef's type. */
  var idlType: IDLTypeDescription = js.native
  
  /** The typedef's name. */
  var name: String = js.native
  
  @JSName("parent")
  var parent_TypedefType: Null = js.native
  
  @JSName("type")
  var type_TypedefType: typedef = js.native
}
object TypedefType {
  
  @scala.inline
  def apply(
    extAttrs: js.Array[ExtendedAttribute],
    idlType: IDLTypeDescription,
    name: String,
    parent: Null,
    `type`: typedef
  ): TypedefType = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], idlType = idlType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypedefType]
  }
  
  @scala.inline
  implicit class TypedefTypeMutableBuilder[Self <: TypedefType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdlType(value: IDLTypeDescription): Self = StObject.set(x, "idlType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: Null): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typedef): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
