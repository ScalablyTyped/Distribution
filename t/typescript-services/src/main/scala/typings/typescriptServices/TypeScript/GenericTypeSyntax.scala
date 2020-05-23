package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenericTypeSyntax extends SyntaxNode {
  var name: INameSyntax = js.native
  var typeArgumentList: TypeArgumentListSyntax = js.native
  def isType(): Boolean = js.native
  def update(name: INameSyntax, typeArgumentList: TypeArgumentListSyntax): GenericTypeSyntax = js.native
  def withName(name: INameSyntax): GenericTypeSyntax = js.native
  def withTypeArgumentList(typeArgumentList: TypeArgumentListSyntax): GenericTypeSyntax = js.native
}

