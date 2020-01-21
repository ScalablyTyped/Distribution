package typings.tslint.mod

import typings.typescript.mod.Node
import typings.typescript.mod.SyntaxKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint", "childOfKind")
@js.native
object childOfKind extends js.Object {
  def apply(node: Node, kind: SyntaxKind): js.UndefOr[Node] = js.native
}

