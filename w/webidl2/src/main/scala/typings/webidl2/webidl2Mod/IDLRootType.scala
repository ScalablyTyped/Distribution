package typings.webidl2.webidl2Mod

import typings.webidl2.Anon_String
import typings.webidl2.webidl2Strings.`callback interface`
import typings.webidl2.webidl2Strings.`interface mixin`
import typings.webidl2.webidl2Strings.callback
import typings.webidl2.webidl2Strings.dictionary
import typings.webidl2.webidl2Strings.enum
import typings.webidl2.webidl2Strings.includes
import typings.webidl2.webidl2Strings.interface
import typings.webidl2.webidl2Strings.namespace
import typings.webidl2.webidl2Strings.typedef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.webidl2.webidl2Mod.InterfaceType
  - typings.webidl2.webidl2Mod.InterfaceMixinType
  - typings.webidl2.webidl2Mod.NamespaceType
  - typings.webidl2.webidl2Mod.CallbackType
  - typings.webidl2.webidl2Mod.DictionaryType
  - typings.webidl2.webidl2Mod.EnumType
  - typings.webidl2.webidl2Mod.TypedefType
  - typings.webidl2.webidl2Mod.IncludesType
*/
trait IDLRootType extends js.Object

object IDLRootType {
  @scala.inline
  def TypedefType(extAttrs: js.Array[ExtendedAttribute], idlType: IDLTypeDescription, name: String, `type`: typedef): IDLRootType = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], idlType = idlType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDLRootType]
  }
  @scala.inline
  def EnumType(extAttrs: js.Array[ExtendedAttribute], name: String, `type`: enum, values: js.Array[Anon_String]): IDLRootType = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDLRootType]
  }
  @scala.inline
  def InterfaceType(
    extAttrs: js.Array[ExtendedAttribute],
    members: js.Array[IDLInterfaceMemberType],
    name: String,
    partial: Boolean,
    `type`: interface | (`callback interface`),
    inheritance: String = null
  ): IDLRootType = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], partial = partial.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (inheritance != null) __obj.updateDynamic("inheritance")(inheritance.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDLRootType]
  }
  @scala.inline
  def DictionaryType(
    extAttrs: js.Array[ExtendedAttribute],
    members: js.Array[DictionaryMemberType],
    name: String,
    partial: Boolean,
    `type`: dictionary,
    inheritance: String = null
  ): IDLRootType = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], partial = partial.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (inheritance != null) __obj.updateDynamic("inheritance")(inheritance.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDLRootType]
  }
  @scala.inline
  def NamespaceType(
    extAttrs: js.Array[ExtendedAttribute],
    members: js.Array[IDLNamespaceMemberType],
    name: String,
    partial: Boolean,
    `type`: namespace
  ): IDLRootType = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], partial = partial.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDLRootType]
  }
  @scala.inline
  def IncludesType(extAttrs: js.Array[ExtendedAttribute], includes: String, target: String, `type`: includes): IDLRootType = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], includes = includes.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDLRootType]
  }
  @scala.inline
  def InterfaceMixinType(
    extAttrs: js.Array[ExtendedAttribute],
    members: js.Array[IDLInterfaceMemberType],
    name: String,
    partial: Boolean,
    `type`: `interface mixin`
  ): IDLRootType = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], partial = partial.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDLRootType]
  }
  @scala.inline
  def CallbackType(
    arguments: js.Array[Argument],
    extAttrs: js.Array[ExtendedAttribute],
    idlType: IDLTypeDescription,
    name: String,
    `type`: callback
  ): IDLRootType = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], extAttrs = extAttrs.asInstanceOf[js.Any], idlType = idlType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDLRootType]
  }
}

