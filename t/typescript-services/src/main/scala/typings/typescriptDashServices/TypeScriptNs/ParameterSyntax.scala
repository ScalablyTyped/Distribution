package typings.typescriptDashServices.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.ParameterSyntax")
@js.native
class ParameterSyntax protected () extends SyntaxNode {
  def this(
    dotDotDotToken: ISyntaxToken,
    modifiers: ISyntaxList,
    identifier: ISyntaxToken,
    questionToken: ISyntaxToken,
    typeAnnotation: TypeAnnotationSyntax,
    equalsValueClause: EqualsValueClauseSyntax,
    parsedInStrictMode: Boolean
  ) = this()
  var dotDotDotToken: ISyntaxToken = js.native
  var equalsValueClause: EqualsValueClauseSyntax = js.native
  var identifier: ISyntaxToken = js.native
  var modifiers: ISyntaxList = js.native
  var questionToken: ISyntaxToken = js.native
  var typeAnnotation: TypeAnnotationSyntax = js.native
  def update(
    dotDotDotToken: ISyntaxToken,
    modifiers: ISyntaxList,
    identifier: ISyntaxToken,
    questionToken: ISyntaxToken,
    typeAnnotation: TypeAnnotationSyntax,
    equalsValueClause: EqualsValueClauseSyntax
  ): ParameterSyntax = js.native
  def withDotDotDotToken(dotDotDotToken: ISyntaxToken): ParameterSyntax = js.native
  def withEqualsValueClause(equalsValueClause: EqualsValueClauseSyntax): ParameterSyntax = js.native
  def withIdentifier(identifier: ISyntaxToken): ParameterSyntax = js.native
  def withModifier(modifier: ISyntaxToken): ParameterSyntax = js.native
  def withModifiers(modifiers: ISyntaxList): ParameterSyntax = js.native
  def withQuestionToken(questionToken: ISyntaxToken): ParameterSyntax = js.native
  def withTypeAnnotation(typeAnnotation: TypeAnnotationSyntax): ParameterSyntax = js.native
}

/* static members */
@JSGlobal("TypeScript.ParameterSyntax")
@js.native
object ParameterSyntax extends js.Object {
  def create(identifier: ISyntaxToken): ParameterSyntax = js.native
  def create1(identifier: ISyntaxToken): ParameterSyntax = js.native
}

