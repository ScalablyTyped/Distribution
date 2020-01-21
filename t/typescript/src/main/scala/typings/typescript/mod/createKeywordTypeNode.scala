package typings.typescript.mod

import typings.typescript.mod.SyntaxKind.AnyKeyword
import typings.typescript.mod.SyntaxKind.BigIntKeyword
import typings.typescript.mod.SyntaxKind.BooleanKeyword
import typings.typescript.mod.SyntaxKind.NeverKeyword
import typings.typescript.mod.SyntaxKind.NullKeyword
import typings.typescript.mod.SyntaxKind.NumberKeyword
import typings.typescript.mod.SyntaxKind.ObjectKeyword
import typings.typescript.mod.SyntaxKind.StringKeyword
import typings.typescript.mod.SyntaxKind.SymbolKeyword
import typings.typescript.mod.SyntaxKind.ThisKeyword
import typings.typescript.mod.SyntaxKind.UndefinedKeyword
import typings.typescript.mod.SyntaxKind.UnknownKeyword
import typings.typescript.mod.SyntaxKind.VoidKeyword
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

