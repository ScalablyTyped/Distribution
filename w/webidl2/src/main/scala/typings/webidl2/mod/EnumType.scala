package typings.webidl2.mod

import typings.webidl2.anon.Parent
import typings.webidl2.webidl2Strings.enum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumType
  extends AbstractBase
     with IDLRootType {
  
  /** The enum's name. */
  var name: String = js.native
  
  /** The container of this type. */
  @JSName("parent")
  var parent_EnumType: Null = js.native
  
  @JSName("type")
  var type_EnumType: enum = js.native
  
  /** An array of values (strings). */
  var values: js.Array[Parent] = js.native
}
object EnumType {
  
  @scala.inline
  def apply(
    extAttrs: js.Array[ExtendedAttribute],
    name: String,
    parent: Null,
    `type`: enum,
    values: js.Array[Parent]
  ): EnumType = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumType]
  }
  
  @scala.inline
  implicit class EnumTypeMutableBuilder[Self <: EnumType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: Null): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: enum): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: js.Array[Parent]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: Parent*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
