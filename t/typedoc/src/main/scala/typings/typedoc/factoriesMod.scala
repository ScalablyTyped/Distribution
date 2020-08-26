package typings.typedoc

import typings.typedoc.abstractMod.ReflectionKind
import typings.typedoc.commentsMod.Comment
import typings.typedoc.contextMod.Context
import typings.typedoc.modelsMod.DeclarationReflection
import typings.typedoc.modelsMod.ReferenceType
import typings.typedoc.modelsMod.SignatureReflection
import typings.typedoc.modelsMod.TypeParameterType
import typings.typedoc.reflectionsMod.ParameterReflection
import typings.typescript.mod.Declaration
import typings.typescript.mod.Node
import typings.typescript.mod.ParameterDeclaration
import typings.typescript.mod.SignatureDeclaration
import typings.typescript.mod.Symbol
import typings.typescript.mod.TypeParameterDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/factories", JSImport.Namespace)
@js.native
object factoriesMod extends js.Object {
  def createComment(node: Node): js.UndefOr[Comment] = js.native
  def createDeclaration(context: Context, node: Declaration, kind: ReflectionKind): js.UndefOr[DeclarationReflection] = js.native
  def createDeclaration(context: Context, node: Declaration, kind: ReflectionKind, name: String): js.UndefOr[DeclarationReflection] = js.native
  def createParameter(context: Context, node: ParameterDeclaration): js.UndefOr[ParameterReflection] = js.native
  def createReferenceType(context: Context): js.UndefOr[ReferenceType] = js.native
  def createReferenceType(context: Context, symbol: js.UndefOr[scala.Nothing], includeParent: Boolean): js.UndefOr[ReferenceType] = js.native
  def createReferenceType(context: Context, symbol: Symbol): js.UndefOr[ReferenceType] = js.native
  def createReferenceType(context: Context, symbol: Symbol, includeParent: Boolean): js.UndefOr[ReferenceType] = js.native
  def createSignature(context: Context, node: SignatureDeclaration, name: String, kind: ReflectionKind): SignatureReflection = js.native
  def createTypeParameter(context: Context, node: TypeParameterDeclaration): js.UndefOr[TypeParameterType] = js.native
}

