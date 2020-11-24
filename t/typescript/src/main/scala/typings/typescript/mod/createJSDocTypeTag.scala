package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "createJSDocTypeTag")
@js.native
object createJSDocTypeTag extends js.Object {
  
  def apply(tagName: js.UndefOr[scala.Nothing], typeExpression: JSDocTypeExpression): JSDocTypeTag = js.native
  def apply(tagName: js.UndefOr[scala.Nothing], typeExpression: JSDocTypeExpression, comment: java.lang.String): JSDocTypeTag = js.native
  /** @deprecated Use `factory.createJSDocTypeTag` or the factory supplied by your transformation context instead. */
  def apply(tagName: Identifier, typeExpression: JSDocTypeExpression): JSDocTypeTag = js.native
  def apply(tagName: Identifier, typeExpression: JSDocTypeExpression, comment: java.lang.String): JSDocTypeTag = js.native
}
