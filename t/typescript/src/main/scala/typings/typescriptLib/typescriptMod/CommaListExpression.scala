package typings
package typescriptLib.typescriptMod

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
  var kind_CommaListExpression: typescriptLib.typescriptMod.SyntaxKind.CommaListExpression = js.native
}

