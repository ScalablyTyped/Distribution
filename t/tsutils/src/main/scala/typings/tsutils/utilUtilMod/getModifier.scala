package typings.tsutils.utilUtilMod

import typings.typescript.mod.Modifier
import typings.typescript.mod.Node
import typings.typescript.mod.SyntaxKind.AbstractKeyword
import typings.typescript.mod.SyntaxKind.AsyncKeyword
import typings.typescript.mod.SyntaxKind.ConstKeyword
import typings.typescript.mod.SyntaxKind.DeclareKeyword
import typings.typescript.mod.SyntaxKind.DefaultKeyword
import typings.typescript.mod.SyntaxKind.ExportKeyword
import typings.typescript.mod.SyntaxKind.PrivateKeyword
import typings.typescript.mod.SyntaxKind.ProtectedKeyword
import typings.typescript.mod.SyntaxKind.PublicKeyword
import typings.typescript.mod.SyntaxKind.ReadonlyKeyword
import typings.typescript.mod.SyntaxKind.StaticKeyword
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tsutils/util/util", "getModifier")
@js.native
object getModifier extends js.Object {
  
  def apply(node: Node, kind: AbstractKeyword): js.UndefOr[Modifier] = js.native
  def apply(node: Node, kind: AsyncKeyword): js.UndefOr[Modifier] = js.native
  def apply(node: Node, kind: ConstKeyword): js.UndefOr[Modifier] = js.native
  def apply(node: Node, kind: DeclareKeyword): js.UndefOr[Modifier] = js.native
  def apply(node: Node, kind: DefaultKeyword): js.UndefOr[Modifier] = js.native
  def apply(node: Node, kind: ExportKeyword): js.UndefOr[Modifier] = js.native
  def apply(node: Node, kind: PrivateKeyword): js.UndefOr[Modifier] = js.native
  def apply(node: Node, kind: ProtectedKeyword): js.UndefOr[Modifier] = js.native
  def apply(node: Node, kind: PublicKeyword): js.UndefOr[Modifier] = js.native
  def apply(node: Node, kind: ReadonlyKeyword): js.UndefOr[Modifier] = js.native
  def apply(node: Node, kind: StaticKeyword): js.UndefOr[Modifier] = js.native
}
