package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JsxElement
  extends PrimaryExpression
     with JsxChild {
  var children: NodeArray[JsxChild] = js.native
  var closingElement: JsxClosingElement = js.native
  @JSName("kind")
  var kind_JsxElement: typings.typescript.typescriptMod.SyntaxKind.JsxElement = js.native
  var openingElement: JsxOpeningElement = js.native
}

