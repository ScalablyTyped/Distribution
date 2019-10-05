package typings.typescript.typescriptMod

import typings.typescript.typescriptMod.SyntaxKind.AnyKeyword
import typings.typescript.typescriptMod.SyntaxKind.BigIntKeyword
import typings.typescript.typescriptMod.SyntaxKind.BooleanKeyword
import typings.typescript.typescriptMod.SyntaxKind.NeverKeyword
import typings.typescript.typescriptMod.SyntaxKind.NullKeyword
import typings.typescript.typescriptMod.SyntaxKind.NumberKeyword
import typings.typescript.typescriptMod.SyntaxKind.ObjectKeyword
import typings.typescript.typescriptMod.SyntaxKind.StringKeyword
import typings.typescript.typescriptMod.SyntaxKind.SymbolKeyword
import typings.typescript.typescriptMod.SyntaxKind.ThisKeyword
import typings.typescript.typescriptMod.SyntaxKind.UndefinedKeyword
import typings.typescript.typescriptMod.SyntaxKind.UnknownKeyword
import typings.typescript.typescriptMod.SyntaxKind.VoidKeyword
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "createKeywordTypeNode")
@js.native
object createKeywordTypeNode extends js.Object {
  def apply(
    kind: AnyKeyword | UnknownKeyword | NumberKeyword | BigIntKeyword | ObjectKeyword | BooleanKeyword | StringKeyword | SymbolKeyword | ThisKeyword | VoidKeyword | UndefinedKeyword | NullKeyword | NeverKeyword
  ): KeywordTypeNode = js.native
}

