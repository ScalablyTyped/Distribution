package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "createNode")
@js.native
object createNode extends js.Object {
  
  /** @deprecated Use an appropriate `factory` method instead. */
  def apply(kind: SyntaxKind): Node = js.native
  def apply(kind: SyntaxKind, pos: js.UndefOr[scala.Nothing], end: js.Any): Node = js.native
  def apply(kind: SyntaxKind, pos: js.Any): Node = js.native
  def apply(kind: SyntaxKind, pos: js.Any, end: js.Any): Node = js.native
}
