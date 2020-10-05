package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntersectionTypeNode
  extends TypeNode
     with UnionOrIntersectionTypeNode {
  @JSName("kind")
  var kind_IntersectionTypeNode: typings.typescript.mod.SyntaxKind.IntersectionType = js.native
  var types: NodeArray[TypeNode] = js.native
}

