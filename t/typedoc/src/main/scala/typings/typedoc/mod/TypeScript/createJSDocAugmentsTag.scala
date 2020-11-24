package typings.typedoc.mod.TypeScript

import typings.typescript.anon.ExpressionWithTypeArgumen
import typings.typescript.mod.Identifier
import typings.typescript.mod.JSDocAugmentsTag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createJSDocAugmentsTag")
@js.native
object createJSDocAugmentsTag extends js.Object {
  
  def apply(tagName: js.UndefOr[scala.Nothing], className: ExpressionWithTypeArgumen): JSDocAugmentsTag = js.native
  def apply(tagName: js.UndefOr[scala.Nothing], className: ExpressionWithTypeArgumen, comment: String): JSDocAugmentsTag = js.native
  /** @deprecated Use `factory.createJSDocAugmentsTag` or the factory supplied by your transformation context instead. */
  def apply(tagName: Identifier, className: ExpressionWithTypeArgumen): JSDocAugmentsTag = js.native
  def apply(tagName: Identifier, className: ExpressionWithTypeArgumen, comment: String): JSDocAugmentsTag = js.native
}
