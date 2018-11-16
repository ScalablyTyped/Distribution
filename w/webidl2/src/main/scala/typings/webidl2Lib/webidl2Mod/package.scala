package typings
package webidl2Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object webidl2Mod {
  type IDLInterfaceMemberType = OperationMemberType | AttributeMemberType | ConstantMemberType | DeclarationMemberType
  type IDLNamespaceMemberType = OperationMemberType | AttributeMemberType
  type IDLRootType = InterfaceType | InterfaceMixinType | NamespaceType | CallbackType | DictionaryType | EnumType | TypedefType | ImplementsType | IncludesType
}
