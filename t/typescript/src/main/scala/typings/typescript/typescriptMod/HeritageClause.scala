package typings.typescript.typescriptMod

import typings.typescript.typescriptMod.SyntaxKind.ExtendsKeyword
import typings.typescript.typescriptMod.SyntaxKind.ImplementsKeyword
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeritageClause extends Node {
  @JSName("kind")
  var kind_HeritageClause: typings.typescript.typescriptMod.SyntaxKind.HeritageClause = js.native
  @JSName("parent")
  var parent_HeritageClause: InterfaceDeclaration | ClassLikeDeclaration = js.native
  var token: ExtendsKeyword | ImplementsKeyword = js.native
  var types: NodeArray[ExpressionWithTypeArguments] = js.native
}

