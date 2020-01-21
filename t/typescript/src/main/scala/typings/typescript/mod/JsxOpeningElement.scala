package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JsxOpeningElement
  extends Expression
     with JsxOpeningLikeElement {
  var attributes: JsxAttributes = js.native
  @JSName("kind")
  var kind_JsxOpeningElement: typings.typescript.mod.SyntaxKind.JsxOpeningElement = js.native
  @JSName("parent")
  var parent_JsxOpeningElement: JsxElement = js.native
  var tagName: JsxTagNameExpression = js.native
  var typeArguments: js.UndefOr[NodeArray[TypeNode]] = js.native
}

