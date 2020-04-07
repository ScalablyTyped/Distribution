package typings.tsutils.utilUtilMod

import typings.typescript.mod.ModifiersArray
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

@JSImport("tsutils/util/util", "hasModifier")
@js.native
object hasModifier extends js.Object {
  def apply(
    kinds: (AbstractKeyword | AsyncKeyword | ConstKeyword | DeclareKeyword | DefaultKeyword | ExportKeyword | PublicKeyword | PrivateKeyword | ProtectedKeyword | ReadonlyKeyword | StaticKeyword)*
  ): Boolean = js.native
  def apply(
    modifiers: ModifiersArray,
    kinds: (AbstractKeyword | AsyncKeyword | ConstKeyword | DeclareKeyword | DefaultKeyword | ExportKeyword | PublicKeyword | PrivateKeyword | ProtectedKeyword | ReadonlyKeyword | StaticKeyword)*
  ): Boolean = js.native
}

