package typings.typedoc.mod.TypeScript

import typings.typescript.mod.DotDotDotToken
import typings.typescript.mod.Expression
import typings.typescript.mod.JsxExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createJsxExpression")
@js.native
object createJsxExpression extends js.Object {
  
  /** @deprecated Use `factory.createJsxExpression` or the factory supplied by your transformation context instead. */
  def apply(): JsxExpression = js.native
  def apply(dotDotDotToken: js.UndefOr[scala.Nothing], expression: Expression): JsxExpression = js.native
  def apply(dotDotDotToken: DotDotDotToken): JsxExpression = js.native
  def apply(dotDotDotToken: DotDotDotToken, expression: Expression): JsxExpression = js.native
}
