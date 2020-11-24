package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Identifier
import typings.typescript.mod.JSDocThisTag
import typings.typescript.mod.JSDocTypeExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createJSDocThisTag")
@js.native
object createJSDocThisTag extends js.Object {
  
  def apply(tagName: js.UndefOr[scala.Nothing], typeExpression: JSDocTypeExpression): JSDocThisTag = js.native
  def apply(tagName: js.UndefOr[scala.Nothing], typeExpression: JSDocTypeExpression, comment: String): JSDocThisTag = js.native
  /** @deprecated Use `factory.createJSDocThisTag` or the factory supplied by your transformation context instead. */
  def apply(tagName: Identifier, typeExpression: JSDocTypeExpression): JSDocThisTag = js.native
  def apply(tagName: Identifier, typeExpression: JSDocTypeExpression, comment: String): JSDocThisTag = js.native
}
