package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModuleBlock
  extends Statement
     with BlockLike
     with NamespaceBody {
  @JSName("kind")
  var kind_ModuleBlock: typescriptLib.typescriptMod.SyntaxKind.ModuleBlock = js.native
  @JSName("parent")
  var parent_ModuleBlock: ModuleDeclaration = js.native
  var statements: NodeArray[Statement] = js.native
}

