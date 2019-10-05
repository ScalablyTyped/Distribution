package typings.tsutils.utilUtilMod

import typings.typescript.typescriptMod.Node
import typings.typescript.typescriptMod.SourceFile
import typings.typescript.typescriptMod.SyntaxKind
import typings.typescript.typescriptMod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tsutils/util/util", "getChildOfKind")
@js.native
object getChildOfKind extends js.Object {
  def apply[T /* <: SyntaxKind */](node: Node, kind: T): js.UndefOr[Token[T]] = js.native
  def apply[T /* <: SyntaxKind */](node: Node, kind: T, sourceFile: SourceFile): js.UndefOr[Token[T]] = js.native
}

