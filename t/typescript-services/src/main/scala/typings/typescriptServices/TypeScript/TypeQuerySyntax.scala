package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeQuerySyntax extends SyntaxNode {
  var name: INameSyntax = js.native
  var typeOfKeyword: ISyntaxToken = js.native
  def isType(): Boolean = js.native
  def update(typeOfKeyword: ISyntaxToken, name: INameSyntax): TypeQuerySyntax = js.native
  def withName(name: INameSyntax): TypeQuerySyntax = js.native
  def withTypeOfKeyword(typeOfKeyword: ISyntaxToken): TypeQuerySyntax = js.native
}

