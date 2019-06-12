package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JsxFragment
  extends PrimaryExpression
     with JsxChild {
  var children: NodeArray[JsxChild] = js.native
  var closingFragment: JsxClosingFragment = js.native
  @JSName("kind")
  var kind_JsxFragment: typescriptLib.typescriptMod.SyntaxKind.JsxFragment = js.native
  var openingFragment: JsxOpeningFragment = js.native
}

