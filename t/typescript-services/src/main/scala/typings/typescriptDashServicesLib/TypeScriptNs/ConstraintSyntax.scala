package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.ConstraintSyntax")
@js.native
class ConstraintSyntax protected () extends SyntaxNode {
  def this(extendsKeyword: ISyntaxToken, `type`: ITypeSyntax, parsedInStrictMode: scala.Boolean) = this()
  var extendsKeyword: ISyntaxToken = js.native
  var `type`: ITypeSyntax = js.native
  def update(extendsKeyword: ISyntaxToken, `type`: ITypeSyntax): ConstraintSyntax = js.native
  def withExtendsKeyword(extendsKeyword: ISyntaxToken): ConstraintSyntax = js.native
  def withType(`type`: ITypeSyntax): ConstraintSyntax = js.native
}

@JSGlobal("TypeScript.ConstraintSyntax")
@js.native
object ConstraintSyntax extends js.Object {
  def create1(`type`: typescriptDashServicesLib.TypeScriptNs.ITypeSyntax): typescriptDashServicesLib.TypeScriptNs.ConstraintSyntax = js.native
}

