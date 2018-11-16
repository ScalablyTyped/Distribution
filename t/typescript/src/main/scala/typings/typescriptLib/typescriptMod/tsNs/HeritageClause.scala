package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeritageClause extends Node {
  @JSName("parent")
  var parent_HeritageClause: InterfaceDeclaration | ClassLikeDeclaration = js.native
  var token: SyntaxKind = js.native
  var types: NodeArray[ExpressionWithTypeArguments] = js.native
}

