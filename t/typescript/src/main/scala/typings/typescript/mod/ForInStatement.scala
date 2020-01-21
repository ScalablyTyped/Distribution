package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForInStatement
  extends IterationStatement
     with ForInOrOfStatement
     with HasInitializer {
  var expression: Expression = js.native
  var initializer: ForInitializer = js.native
  @JSName("kind")
  var kind_ForInStatement: typings.typescript.mod.SyntaxKind.ForInStatement = js.native
}

