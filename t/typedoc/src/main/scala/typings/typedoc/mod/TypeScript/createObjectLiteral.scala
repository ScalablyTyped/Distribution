package typings.typedoc.mod.TypeScript

import typings.typescript.mod.ObjectLiteralElementLike
import typings.typescript.mod.ObjectLiteralExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createObjectLiteral")
@js.native
object createObjectLiteral extends js.Object {
  
  /** @deprecated Use `factory.createObjectLiteral` or the factory supplied by your transformation context instead. */
  def apply(): ObjectLiteralExpression = js.native
  def apply(properties: js.UndefOr[scala.Nothing], multiLine: Boolean): ObjectLiteralExpression = js.native
  def apply(properties: js.Array[ObjectLiteralElementLike]): ObjectLiteralExpression = js.native
  def apply(properties: js.Array[ObjectLiteralElementLike], multiLine: Boolean): ObjectLiteralExpression = js.native
}
