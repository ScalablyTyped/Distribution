package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "createObjectLiteral")
@js.native
object createObjectLiteral extends js.Object {
  
  /** @deprecated Use `factory.createObjectLiteral` or the factory supplied by your transformation context instead. */
  def apply(): ObjectLiteralExpression = js.native
  def apply(properties: js.UndefOr[scala.Nothing], multiLine: Boolean): ObjectLiteralExpression = js.native
  def apply(properties: js.Array[ObjectLiteralElementLike]): ObjectLiteralExpression = js.native
  def apply(properties: js.Array[ObjectLiteralElementLike], multiLine: Boolean): ObjectLiteralExpression = js.native
}
