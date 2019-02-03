package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.TypeAnnotationSyntax")
@js.native
class TypeAnnotationSyntax protected () extends SyntaxNode {
  def this(colonToken: ISyntaxToken, `type`: ITypeSyntax, parsedInStrictMode: scala.Boolean) = this()
  var colonToken: ISyntaxToken = js.native
  var `type`: ITypeSyntax = js.native
  def update(colonToken: ISyntaxToken, `type`: ITypeSyntax): TypeAnnotationSyntax = js.native
  def withColonToken(colonToken: ISyntaxToken): TypeAnnotationSyntax = js.native
  def withType(`type`: ITypeSyntax): TypeAnnotationSyntax = js.native
}

/* static members */
@JSGlobal("TypeScript.TypeAnnotationSyntax")
@js.native
object TypeAnnotationSyntax extends js.Object {
  def create1(`type`: typescriptDashServicesLib.TypeScriptNs.ITypeSyntax): typescriptDashServicesLib.TypeScriptNs.TypeAnnotationSyntax = js.native
}

