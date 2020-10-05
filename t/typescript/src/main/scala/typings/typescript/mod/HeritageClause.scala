package typings.typescript.mod

import typings.typescript.mod.SyntaxKind.ExtendsKeyword
import typings.typescript.mod.SyntaxKind.ImplementsKeyword
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeritageClause extends Node {
  @JSName("kind")
  var kind_HeritageClause: typings.typescript.mod.SyntaxKind.HeritageClause = js.native
  @JSName("parent")
  var parent_HeritageClause: InterfaceDeclaration | ClassLikeDeclaration = js.native
  var token: ExtendsKeyword | ImplementsKeyword = js.native
  var types: NodeArray[ExpressionWithTypeArguments] = js.native
}

