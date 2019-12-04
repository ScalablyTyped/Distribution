package typings.typedoc

import typings.typedoc.distLibConverterContextMod.Context
import typings.typedoc.distLibModelsCommentsMod.Comment
import typings.typedoc.distLibModelsMod.DeclarationReflection
import typings.typedoc.distLibModelsMod.SignatureReflection
import typings.typedoc.distLibModelsMod.TypeParameterType
import typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionKind
import typings.typedoc.distLibModelsReflectionsMod.ParameterReflection
import typings.typedoc.distLibModelsTypesMod.ReferenceType
import typings.typescript.typescriptMod.Declaration
import typings.typescript.typescriptMod.Node
import typings.typescript.typescriptMod.ParameterDeclaration
import typings.typescript.typescriptMod.SignatureDeclaration
import typings.typescript.typescriptMod.Symbol
import typings.typescript.typescriptMod.TypeParameterDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/factories", JSImport.Namespace)
@js.native
object distLibConverterFactoriesMod extends js.Object {
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

