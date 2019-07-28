package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForOfStatement
  extends IterationStatement
     with ForInOrOfStatement
     with HasInitializer {
  var awaitModifier: js.UndefOr[AwaitKeywordToken] = js.native
  var expression: Expression = js.native
  var initializer: ForInitializer = js.native
  @JSName("kind")
  var kind_ForOfStatement: typings.typescript.typescriptMod.SyntaxKind.ForOfStatement = js.native
}

