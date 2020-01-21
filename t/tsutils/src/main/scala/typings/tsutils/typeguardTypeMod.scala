package typings.tsutils

import typings.typescript.mod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tsutils/typeguard/type", JSImport.Namespace)
@js.native
object typeguardTypeMod extends js.Object {
  def isConditionalType(`type`: Type): /* is typescript.typescript.ConditionalType */ Boolean = js.native
  def isEnumType(`type`: Type): /* is typescript.typescript.EnumType */ Boolean = js.native
  def isGenericType(`type`: Type): /* is typescript.typescript.GenericType */ Boolean = js.native
  def isIndexedAccessType(`type`: Type): /* is typescript.typescript.IndexedAccessType */ Boolean = js.native
  def isIndexedAccessype(`type`: Type): /* is typescript.typescript.IndexType */ Boolean = js.native
  def isInstantiableType(`type`: Type): /* is typescript.typescript.InstantiableType */ Boolean = js.native
  def isInterfaceType(`type`: Type): /* is typescript.typescript.InterfaceType */ Boolean = js.native
  def isIntersectionType(`type`: Type): /* is typescript.typescript.IntersectionType */ Boolean = js.native
  def isLiteralType(`type`: Type): /* is typescript.typescript.LiteralType */ Boolean = js.native
  def isObjectType(`type`: Type): /* is typescript.typescript.ObjectType */ Boolean = js.native
  def isSubstitutionType(`type`: Type): /* is typescript.typescript.SubstitutionType */ Boolean = js.native
  def isTupleType(`type`: Type): /* is typescript.typescript.TupleType */ Boolean = js.native
  def isTupleTypeReference(`type`: Type): Boolean = js.native
  def isTypeParameter(`type`: Type): /* is typescript.typescript.TypeParameter */ Boolean = js.native
  def isTypeReference(`type`: Type): /* is typescript.typescript.TypeReference */ Boolean = js.native
  def isTypeVariable(`type`: Type): Boolean = js.native
  def isUnionOrIntersectionType(`type`: Type): /* is typescript.typescript.UnionOrIntersectionType */ Boolean = js.native
  def isUnionType(`type`: Type): /* is typescript.typescript.UnionType */ Boolean = js.native
  def isUniqueESSymbolType(`type`: Type): /* is typescript.typescript.UniqueESSymbolType */ Boolean = js.native
}

