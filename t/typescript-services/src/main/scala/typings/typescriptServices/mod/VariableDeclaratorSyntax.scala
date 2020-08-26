package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "VariableDeclaratorSyntax")
@js.native
class VariableDeclaratorSyntax protected ()
  extends typings.typescriptServices.TypeScript.VariableDeclaratorSyntax {
  def this(
    propertyName: ISyntaxToken,
    typeAnnotation: typings.typescriptServices.TypeScript.TypeAnnotationSyntax,
    equalsValueClause: typings.typescriptServices.TypeScript.EqualsValueClauseSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "VariableDeclaratorSyntax")
@js.native
object VariableDeclaratorSyntax extends js.Object {
  def create(propertyName: ISyntaxToken): typings.typescriptServices.TypeScript.VariableDeclaratorSyntax = js.native
  def create1(propertyName: ISyntaxToken): typings.typescriptServices.TypeScript.VariableDeclaratorSyntax = js.native
}

