package typings.typescript.mod

import typings.typescript.anon.ExpressionWithTypeArgumen
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "createJSDocImplementsTag")
@js.native
object createJSDocImplementsTag extends js.Object {
  
  def apply(tagName: js.UndefOr[scala.Nothing], className: ExpressionWithTypeArgumen): JSDocImplementsTag = js.native
  def apply(
    tagName: js.UndefOr[scala.Nothing],
    className: ExpressionWithTypeArgumen,
    comment: java.lang.String
  ): JSDocImplementsTag = js.native
  /** @deprecated Use `factory.createJSDocImplementsTag` or the factory supplied by your transformation context instead. */
  def apply(tagName: Identifier, className: ExpressionWithTypeArgumen): JSDocImplementsTag = js.native
  def apply(tagName: Identifier, className: ExpressionWithTypeArgumen, comment: java.lang.String): JSDocImplementsTag = js.native
}
