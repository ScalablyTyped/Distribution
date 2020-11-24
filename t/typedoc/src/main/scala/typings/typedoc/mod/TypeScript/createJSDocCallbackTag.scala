package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Identifier
import typings.typescript.mod.JSDocCallbackTag
import typings.typescript.mod.JSDocNamespaceDeclaration
import typings.typescript.mod.JSDocSignature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createJSDocCallbackTag")
@js.native
object createJSDocCallbackTag extends js.Object {
  
  def apply(tagName: js.UndefOr[scala.Nothing], typeExpression: JSDocSignature): JSDocCallbackTag = js.native
  def apply(
    tagName: js.UndefOr[scala.Nothing],
    typeExpression: JSDocSignature,
    fullName: js.UndefOr[scala.Nothing],
    comment: String
  ): JSDocCallbackTag = js.native
  def apply(tagName: js.UndefOr[scala.Nothing], typeExpression: JSDocSignature, fullName: Identifier): JSDocCallbackTag = js.native
  def apply(
    tagName: js.UndefOr[scala.Nothing],
    typeExpression: JSDocSignature,
    fullName: Identifier,
    comment: String
  ): JSDocCallbackTag = js.native
  def apply(
    tagName: js.UndefOr[scala.Nothing],
    typeExpression: JSDocSignature,
    fullName: JSDocNamespaceDeclaration
  ): JSDocCallbackTag = js.native
  def apply(
    tagName: js.UndefOr[scala.Nothing],
    typeExpression: JSDocSignature,
    fullName: JSDocNamespaceDeclaration,
    comment: String
  ): JSDocCallbackTag = js.native
  /** @deprecated Use `factory.createJSDocCallbackTag` or the factory supplied by your transformation context instead. */
  def apply(tagName: Identifier, typeExpression: JSDocSignature): JSDocCallbackTag = js.native
  def apply(
    tagName: Identifier,
    typeExpression: JSDocSignature,
    fullName: js.UndefOr[scala.Nothing],
    comment: String
  ): JSDocCallbackTag = js.native
  def apply(tagName: Identifier, typeExpression: JSDocSignature, fullName: Identifier): JSDocCallbackTag = js.native
  def apply(tagName: Identifier, typeExpression: JSDocSignature, fullName: Identifier, comment: String): JSDocCallbackTag = js.native
  def apply(tagName: Identifier, typeExpression: JSDocSignature, fullName: JSDocNamespaceDeclaration): JSDocCallbackTag = js.native
  def apply(
    tagName: Identifier,
    typeExpression: JSDocSignature,
    fullName: JSDocNamespaceDeclaration,
    comment: String
  ): JSDocCallbackTag = js.native
}
