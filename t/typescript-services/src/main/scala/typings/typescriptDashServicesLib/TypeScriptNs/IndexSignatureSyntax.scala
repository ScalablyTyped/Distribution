package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(typescriptDashServicesLib.TypeScriptNs.ITypeMemberSyntax because Already inherited)*/
@JSGlobal("TypeScript.IndexSignatureSyntax")
@js.native
class IndexSignatureSyntax protected () extends SyntaxNode {
  def this(openBracketToken: ISyntaxToken, parameter: ParameterSyntax, closeBracketToken: ISyntaxToken, typeAnnotation: TypeAnnotationSyntax, parsedInStrictMode: scala.Boolean) = this()
  var closeBracketToken: ISyntaxToken = js.native
  var openBracketToken: ISyntaxToken = js.native
  var parameter: ParameterSyntax = js.native
  var typeAnnotation: TypeAnnotationSyntax = js.native
  def update(
    openBracketToken: ISyntaxToken,
    parameter: ParameterSyntax,
    closeBracketToken: ISyntaxToken,
    typeAnnotation: TypeAnnotationSyntax
  ): IndexSignatureSyntax = js.native
  def withCloseBracketToken(closeBracketToken: ISyntaxToken): IndexSignatureSyntax = js.native
  def withOpenBracketToken(openBracketToken: ISyntaxToken): IndexSignatureSyntax = js.native
  def withParameter(parameter: ParameterSyntax): IndexSignatureSyntax = js.native
  def withTypeAnnotation(typeAnnotation: TypeAnnotationSyntax): IndexSignatureSyntax = js.native
}

@JSGlobal("TypeScript.IndexSignatureSyntax")
@js.native
object IndexSignatureSyntax extends js.Object {
  def create(
    openBracketToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    parameter: typescriptDashServicesLib.TypeScriptNs.ParameterSyntax,
    closeBracketToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken
  ): typescriptDashServicesLib.TypeScriptNs.IndexSignatureSyntax = js.native
  def create1(parameter: typescriptDashServicesLib.TypeScriptNs.ParameterSyntax): typescriptDashServicesLib.TypeScriptNs.IndexSignatureSyntax = js.native
}

