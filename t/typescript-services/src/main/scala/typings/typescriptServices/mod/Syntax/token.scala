package typings.typescriptServices.mod.Syntax

import typings.typescriptServices.TypeScript.ISyntaxToken
import typings.typescriptServices.TypeScript.ITokenInfo
import typings.typescriptServices.TypeScript.SyntaxKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Syntax.token")
@js.native
object token extends js.Object {
  def apply(kind: SyntaxKind): ISyntaxToken = js.native
  def apply(kind: SyntaxKind, info: ITokenInfo): ISyntaxToken = js.native
}

