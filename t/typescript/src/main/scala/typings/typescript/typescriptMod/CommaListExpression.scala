package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list of comma-separated expressions. This node is only created by transformations.
  */
@js.native
trait CommaListExpression extends Expression {
  var elements: NodeArray[Expression] = js.native
  @JSName("kind")
  var kind_CommaListExpression: typings.typescript.typescriptMod.SyntaxKind.CommaListExpression = js.native
}

