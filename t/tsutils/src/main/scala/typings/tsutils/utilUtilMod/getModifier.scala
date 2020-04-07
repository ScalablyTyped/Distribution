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
import scala.scalajs.js.annotation._

@JSImport("tsutils/util/util", "getModifier")
@js.native
object getModifier extends js.Object {
  def apply(
    node: Node,
    kind: AbstractKeyword | AsyncKeyword | ConstKeyword | DeclareKeyword | DefaultKeyword | ExportKeyword | PublicKeyword | PrivateKeyword | ProtectedKeyword | ReadonlyKeyword | StaticKeyword
  ): js.UndefOr[Modifier] = js.native
}

