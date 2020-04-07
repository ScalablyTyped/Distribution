package typings.typedoc.mod.TypeScript

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
import typings.typescript.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.createModifier")
@js.native
object createModifier extends js.Object {
  def apply[T /* <: AbstractKeyword | AsyncKeyword | ConstKeyword | DeclareKeyword | DefaultKeyword | ExportKeyword | PublicKeyword | PrivateKeyword | ProtectedKeyword | ReadonlyKeyword | StaticKeyword */](kind: T): Token[T] = js.native
}

