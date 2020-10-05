package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JsxExpression
  extends Expression
     with JsxChild {
  var dotDotDotToken: js.UndefOr[Token[typings.typescript.mod.SyntaxKind.DotDotDotToken]] = js.native
  var expression: js.UndefOr[Expression] = js.native
  @JSName("kind")
  var kind_JsxExpression: typings.typescript.mod.SyntaxKind.JsxExpression = js.native
  @JSName("parent")
  var parent_JsxExpression: JsxElement | JsxAttributeLike = js.native
}

