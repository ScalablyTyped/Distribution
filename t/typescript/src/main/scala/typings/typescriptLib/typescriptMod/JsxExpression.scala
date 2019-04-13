package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JsxExpression
  extends Expression
     with JsxChild {
  var dotDotDotToken: js.UndefOr[Token[SyntaxKind]] = js.native
  var expression: js.UndefOr[Expression] = js.native
  @JSName("parent")
  var parent_JsxExpression: JsxElement | JsxAttributeLike = js.native
}

