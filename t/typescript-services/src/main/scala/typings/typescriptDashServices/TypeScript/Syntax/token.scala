package typings.typescriptDashServices.TypeScript.Syntax

import typings.typescriptDashServices.TypeScript.ISyntaxToken
import typings.typescriptDashServices.TypeScript.ITokenInfo
import typings.typescriptDashServices.TypeScript.SyntaxKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Syntax.token")
@js.native
object token extends js.Object {
  def apply(kind: SyntaxKind): ISyntaxToken = js.native
  def apply(kind: SyntaxKind, info: ITokenInfo): ISyntaxToken = js.native
}

