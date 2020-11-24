package typings.tsutils.utilUtilMod

import typings.typescript.mod.Node
import typings.typescript.mod.SourceFile
import typings.typescript.mod.SyntaxKind
import typings.typescript.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tsutils/util/util", "getChildOfKind")
@js.native
object getChildOfKind extends js.Object {
  
  def apply[T /* <: SyntaxKind */](node: Node, kind: T): js.UndefOr[Token[T]] = js.native
  def apply[T /* <: SyntaxKind */](node: Node, kind: T, sourceFile: SourceFile): js.UndefOr[Token[T]] = js.native
}
