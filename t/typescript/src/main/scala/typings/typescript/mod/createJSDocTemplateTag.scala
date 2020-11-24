package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "createJSDocTemplateTag")
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
    comment: java.lang.String
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
    comment: java.lang.String
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
    comment: java.lang.String
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
    comment: java.lang.String
  ): JSDocTemplateTag = js.native
}
