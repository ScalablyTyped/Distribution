package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "createJSDocEnumTag")
@js.native
object createJSDocEnumTag extends js.Object {
  
  def apply(tagName: js.UndefOr[scala.Nothing], typeExpression: JSDocTypeExpression): JSDocEnumTag = js.native
  def apply(tagName: js.UndefOr[scala.Nothing], typeExpression: JSDocTypeExpression, comment: java.lang.String): JSDocEnumTag = js.native
  /** @deprecated Use `factory.createJSDocEnumTag` or the factory supplied by your transformation context instead. */
  def apply(tagName: Identifier, typeExpression: JSDocTypeExpression): JSDocEnumTag = js.native
  def apply(tagName: Identifier, typeExpression: JSDocTypeExpression, comment: java.lang.String): JSDocEnumTag = js.native
}
