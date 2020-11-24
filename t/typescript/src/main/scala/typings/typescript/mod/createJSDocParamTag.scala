package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "createJSDocParamTag")
@js.native
object createJSDocParamTag extends js.Object {
  
  /** @deprecated Use `factory.createJSDocParameterTag` or the factory supplied by your transformation context instead. */
  def apply(name: EntityName, isBracketed: Boolean): JSDocParameterTag = js.native
  def apply(
    name: EntityName,
    isBracketed: Boolean,
    typeExpression: js.UndefOr[scala.Nothing],
    comment: java.lang.String
  ): JSDocParameterTag = js.native
  def apply(name: EntityName, isBracketed: Boolean, typeExpression: JSDocTypeExpression): JSDocParameterTag = js.native
  def apply(
    name: EntityName,
    isBracketed: Boolean,
    typeExpression: JSDocTypeExpression,
    comment: java.lang.String
  ): JSDocParameterTag = js.native
}
