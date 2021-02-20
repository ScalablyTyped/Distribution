package typings.webidl2.mod

import typings.webidl2.webidl2Booleans.`false`
import typings.webidl2.webidl2Strings.iterable
import typings.webidl2.webidl2Strings.maplike
import typings.webidl2.webidl2Strings.setlike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.webidl2.mod.IterableDeclarationMemberType
  - typings.webidl2.mod.MaplikeDeclarationMemberType
  - typings.webidl2.mod.SetlikeDeclarationMemberType
*/
trait DeclarationMemberType extends IDLInterfaceMemberType
object DeclarationMemberType {
  
  @scala.inline
  def IterableDeclarationMemberType(
    arguments: js.Array[Argument],
    async: Boolean,
    extAttrs: js.Array[ExtendedAttribute],
    idlType: js.Array[IDLTypeDescription] | (js.Tuple2[IDLTypeDescription, IDLTypeDescription]),
    parent: InterfaceMixinType | InterfaceType,
    readonly: `false`,
    `type`: iterable
  ): typings.webidl2.mod.IterableDeclarationMemberType = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], async = async.asInstanceOf[js.Any], extAttrs = extAttrs.asInstanceOf[js.Any], idlType = idlType.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.webidl2.mod.IterableDeclarationMemberType]
  }
  
  @scala.inline
  def MaplikeDeclarationMemberType(
    arguments: js.Array[js.Any],
    async: `false`,
    extAttrs: js.Array[ExtendedAttribute],
    idlType: js.Tuple2[IDLTypeDescription, IDLTypeDescription],
    parent: InterfaceMixinType | InterfaceType,
    readonly: Boolean,
    `type`: maplike
  ): typings.webidl2.mod.MaplikeDeclarationMemberType = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], async = async.asInstanceOf[js.Any], extAttrs = extAttrs.asInstanceOf[js.Any], idlType = idlType.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.webidl2.mod.MaplikeDeclarationMemberType]
  }
  
  @scala.inline
  def SetlikeDeclarationMemberType(
    arguments: js.Array[js.Any],
    async: `false`,
    extAttrs: js.Array[ExtendedAttribute],
    idlType: js.Array[IDLTypeDescription],
    parent: InterfaceMixinType | InterfaceType,
    readonly: Boolean,
    `type`: setlike
  ): typings.webidl2.mod.SetlikeDeclarationMemberType = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], async = async.asInstanceOf[js.Any], extAttrs = extAttrs.asInstanceOf[js.Any], idlType = idlType.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.webidl2.mod.SetlikeDeclarationMemberType]
  }
}
