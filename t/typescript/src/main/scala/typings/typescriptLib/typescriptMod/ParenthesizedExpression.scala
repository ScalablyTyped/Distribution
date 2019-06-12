package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParenthesizedExpression
  extends PrimaryExpression
     with JSDocContainer
     with _HasJSDoc {
  var expression: Expression = js.native
  @JSName("kind")
  var kind_ParenthesizedExpression: typescriptLib.typescriptMod.SyntaxKind.ParenthesizedExpression = js.native
}

