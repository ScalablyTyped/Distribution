package typings.webidl2.mod

import typings.webidl2.webidl2Strings.constructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConstructorMemberType
  extends AbstractBase
     with IDLInterfaceMemberType {
  
  /** An array of arguments for the constructor operation. */
  var arguments: js.Array[Argument] = js.native
  
  @JSName("parent")
  var parent_ConstructorMemberType: InterfaceType = js.native
  
  @JSName("type")
  var type_ConstructorMemberType: constructor = js.native
}
object ConstructorMemberType {
  
  @scala.inline
  def apply(
    arguments: js.Array[Argument],
    extAttrs: js.Array[ExtendedAttribute],
    parent: InterfaceType,
    `type`: constructor
  ): ConstructorMemberType = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], extAttrs = extAttrs.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConstructorMemberType]
  }
  
  @scala.inline
  implicit class ConstructorMemberTypeMutableBuilder[Self <: ConstructorMemberType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArguments(value: js.Array[Argument]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgumentsVarargs(value: Argument*): Self = StObject.set(x, "arguments", js.Array(value :_*))
    
    @scala.inline
    def setParent(value: InterfaceType): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: constructor): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
