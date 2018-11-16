package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(typescriptDashServicesLib.TypeScriptNs.INameSyntax because Already inherited)*/
@JSGlobal("TypeScript.QualifiedNameSyntax")
@js.native
class QualifiedNameSyntax protected () extends SyntaxNode {
  def this(left: INameSyntax, dotToken: ISyntaxToken, right: ISyntaxToken, parsedInStrictMode: scala.Boolean) = this()
  var dotToken: ISyntaxToken = js.native
  var left: INameSyntax = js.native
  var right: ISyntaxToken = js.native
  def isName(): scala.Boolean = js.native
  def isType(): scala.Boolean = js.native
  def update(left: INameSyntax, dotToken: ISyntaxToken, right: ISyntaxToken): QualifiedNameSyntax = js.native
  def withDotToken(dotToken: ISyntaxToken): QualifiedNameSyntax = js.native
  def withLeft(left: INameSyntax): QualifiedNameSyntax = js.native
  def withRight(right: ISyntaxToken): QualifiedNameSyntax = js.native
}

@JSGlobal("TypeScript.QualifiedNameSyntax")
@js.native
object QualifiedNameSyntax extends js.Object {
  def create1(
    left: typescriptDashServicesLib.TypeScriptNs.INameSyntax,
    right: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken
  ): typescriptDashServicesLib.TypeScriptNs.QualifiedNameSyntax = js.native
}

