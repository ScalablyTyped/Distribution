package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JsxSelfClosingElement
  extends PrimaryExpression
     with JsxChild
     with JsxOpeningLikeElement {
  var attributes: JsxAttributes = js.native
  @JSName("kind")
  var kind_JsxSelfClosingElement: typings.typescript.mod.SyntaxKind.JsxSelfClosingElement = js.native
  var tagName: JsxTagNameExpression = js.native
  var typeArguments: js.UndefOr[NodeArray[TypeNode]] = js.native
}

