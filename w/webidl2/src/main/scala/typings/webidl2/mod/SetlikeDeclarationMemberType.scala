package typings.webidl2.mod

import typings.webidl2.webidl2Booleans.`false`
import typings.webidl2.webidl2Strings.setlike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetlikeDeclarationMemberType
  extends AbstractCollectionLikeMemberType
     with DeclarationMemberType {
  
  @JSName("type")
  var type_SetlikeDeclarationMemberType: setlike = js.native
}
object SetlikeDeclarationMemberType {
  
  @scala.inline
  def apply(
    arguments: js.Array[js.Any],
    async: `false`,
    extAttrs: js.Array[ExtendedAttribute],
    idlType: js.Array[IDLTypeDescription],
    parent: InterfaceMixinType | InterfaceType,
    readonly: Boolean,
    `type`: setlike
  ): SetlikeDeclarationMemberType = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], async = async.asInstanceOf[js.Any], extAttrs = extAttrs.asInstanceOf[js.Any], idlType = idlType.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetlikeDeclarationMemberType]
  }
  
  @scala.inline
  implicit class SetlikeDeclarationMemberTypeMutableBuilder[Self <: SetlikeDeclarationMemberType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: setlike): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
