package typings.typedoc.mod.TypeScript

import typings.typescript.mod.ExpressionWithTypeArguments
import typings.typescript.mod.HeritageClause
import typings.typescript.mod.SyntaxKind.ExtendsKeyword
import typings.typescript.mod.SyntaxKind.ImplementsKeyword
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.createHeritageClause")
@js.native
object createHeritageClause extends js.Object {
  def apply(token: ExtendsKeyword, types: js.Array[ExpressionWithTypeArguments]): HeritageClause = js.native
  def apply(token: ImplementsKeyword, types: js.Array[ExpressionWithTypeArguments]): HeritageClause = js.native
}

