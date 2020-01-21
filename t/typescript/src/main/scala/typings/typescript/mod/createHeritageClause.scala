package typings.typescript.mod

import typings.typescript.mod.SyntaxKind.ExtendsKeyword
import typings.typescript.mod.SyntaxKind.ImplementsKeyword
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "createHeritageClause")
@js.native
object createHeritageClause extends js.Object {
  def apply(token: ExtendsKeyword, types: js.Array[ExpressionWithTypeArguments]): HeritageClause = js.native
  def apply(token: ImplementsKeyword, types: js.Array[ExpressionWithTypeArguments]): HeritageClause = js.native
}

