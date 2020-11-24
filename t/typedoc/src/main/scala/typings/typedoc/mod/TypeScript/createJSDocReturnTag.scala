package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Identifier
import typings.typescript.mod.JSDocReturnTag
import typings.typescript.mod.JSDocTypeExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createJSDocReturnTag")
@js.native
object createJSDocReturnTag extends js.Object {
  
  /** @deprecated Use `factory.createJSDocReturnTag` or the factory supplied by your transformation context instead. */
  def apply(): JSDocReturnTag = js.native
  def apply(tagName: js.UndefOr[scala.Nothing], typeExpression: js.UndefOr[scala.Nothing], comment: String): JSDocReturnTag = js.native
  def apply(tagName: js.UndefOr[scala.Nothing], typeExpression: JSDocTypeExpression): JSDocReturnTag = js.native
  def apply(tagName: js.UndefOr[scala.Nothing], typeExpression: JSDocTypeExpression, comment: String): JSDocReturnTag = js.native
  def apply(tagName: Identifier): JSDocReturnTag = js.native
  def apply(tagName: Identifier, typeExpression: js.UndefOr[scala.Nothing], comment: String): JSDocReturnTag = js.native
  def apply(tagName: Identifier, typeExpression: JSDocTypeExpression): JSDocReturnTag = js.native
  def apply(tagName: Identifier, typeExpression: JSDocTypeExpression, comment: String): JSDocReturnTag = js.native
}
