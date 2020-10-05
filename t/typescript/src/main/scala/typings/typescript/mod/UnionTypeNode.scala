package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnionTypeNode
  extends TypeNode
     with UnionOrIntersectionTypeNode {
  @JSName("kind")
  var kind_UnionTypeNode: typings.typescript.mod.SyntaxKind.UnionType = js.native
  var types: NodeArray[TypeNode] = js.native
}

