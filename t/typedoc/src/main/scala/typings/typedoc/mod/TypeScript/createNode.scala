package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.createNode")
@js.native
object createNode extends js.Object {
  def apply(kind: typings.typescript.mod.SyntaxKind): Node = js.native
  def apply(kind: typings.typescript.mod.SyntaxKind, pos: js.UndefOr[scala.Nothing], end: Double): Node = js.native
  def apply(kind: typings.typescript.mod.SyntaxKind, pos: Double): Node = js.native
  def apply(kind: typings.typescript.mod.SyntaxKind, pos: Double, end: Double): Node = js.native
}

