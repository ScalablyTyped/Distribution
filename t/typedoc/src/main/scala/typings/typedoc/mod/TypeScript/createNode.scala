package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createNode")
@js.native
object createNode extends js.Object {
  
  /** @deprecated Use an appropriate `factory` method instead. */
  def apply(kind: typings.typescript.mod.SyntaxKind): Node = js.native
  def apply(kind: typings.typescript.mod.SyntaxKind, pos: js.UndefOr[scala.Nothing], end: js.Any): Node = js.native
  def apply(kind: typings.typescript.mod.SyntaxKind, pos: js.Any): Node = js.native
  def apply(kind: typings.typescript.mod.SyntaxKind, pos: js.Any, end: js.Any): Node = js.native
}
