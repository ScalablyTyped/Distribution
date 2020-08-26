package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.ISyntaxList
import typings.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.ParameterSyntax")
@js.native
class ParameterSyntax protected ()
  extends typings.typescriptServices.TypeScript.ParameterSyntax {
  def this(
    dotDotDotToken: ISyntaxToken,
    modifiers: ISyntaxList,
    identifier: ISyntaxToken,
    questionToken: ISyntaxToken,
    typeAnnotation: typings.typescriptServices.TypeScript.TypeAnnotationSyntax,
    equalsValueClause: typings.typescriptServices.TypeScript.EqualsValueClauseSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSGlobal("TypeScript.ParameterSyntax")
@js.native
object ParameterSyntax extends js.Object {
  def create(identifier: ISyntaxToken): typings.typescriptServices.TypeScript.ParameterSyntax = js.native
  def create1(identifier: ISyntaxToken): typings.typescriptServices.TypeScript.ParameterSyntax = js.native
}

