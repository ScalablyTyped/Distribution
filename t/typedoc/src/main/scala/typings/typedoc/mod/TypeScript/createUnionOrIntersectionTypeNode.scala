package typings.typedoc.mod.TypeScript

import typings.typescript.mod.SyntaxKind.IntersectionType
import typings.typescript.mod.SyntaxKind.UnionType
import typings.typescript.mod.TypeNode
import typings.typescript.mod.UnionOrIntersectionTypeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.createUnionOrIntersectionTypeNode")
@js.native
object createUnionOrIntersectionTypeNode extends js.Object {
  def apply(kind: IntersectionType, types: js.Array[TypeNode]): UnionOrIntersectionTypeNode = js.native
  def apply(kind: UnionType, types: js.Array[TypeNode]): UnionOrIntersectionTypeNode = js.native
}

