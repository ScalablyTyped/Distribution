package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Identifier
import typings.typescript.mod.JSDocTemplateTag
import typings.typescript.mod.JSDocTypeExpression
import typings.typescript.mod.TypeParameterDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createJSDocTemplateTag")
@js.native
object createJSDocTemplateTag extends js.Object {
  
  def apply(
    tagName: js.UndefOr[scala.Nothing],
    constraint: js.UndefOr[scala.Nothing],
    typeParameters: js.Array[TypeParameterDeclaration]
  ): JSDocTemplateTag = js.native
  def apply(
    tagName: js.UndefOr[scala.Nothing],
    constraint: js.UndefOr[scala.Nothing],
    typeParameters: js.Array[TypeParameterDeclaration],
    comment: String
  ): JSDocTemplateTag = js.native
  def apply(
    tagName: js.UndefOr[scala.Nothing],
    constraint: JSDocTypeExpression,
    typeParameters: js.Array[TypeParameterDeclaration]
  ): JSDocTemplateTag = js.native
  def apply(
    tagName: js.UndefOr[scala.Nothing],
    constraint: JSDocTypeExpression,
    typeParameters: js.Array[TypeParameterDeclaration],
    comment: String
  ): JSDocTemplateTag = js.native
  def apply(
    tagName: Identifier,
    constraint: js.UndefOr[scala.Nothing],
    typeParameters: js.Array[TypeParameterDeclaration]
  ): JSDocTemplateTag = js.native
  def apply(
    tagName: Identifier,
    constraint: js.UndefOr[scala.Nothing],
    typeParameters: js.Array[TypeParameterDeclaration],
    comment: String
  ): JSDocTemplateTag = js.native
  /** @deprecated Use `factory.createJSDocTemplateTag` or the factory supplied by your transformation context instead. */
  def apply(
    tagName: Identifier,
    constraint: JSDocTypeExpression,
    typeParameters: js.Array[TypeParameterDeclaration]
  ): JSDocTemplateTag = js.native
  def apply(
    tagName: Identifier,
    constraint: JSDocTypeExpression,
    typeParameters: js.Array[TypeParameterDeclaration],
    comment: String
  ): JSDocTemplateTag = js.native
}
