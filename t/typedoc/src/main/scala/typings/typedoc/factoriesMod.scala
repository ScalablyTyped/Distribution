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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object factoriesMod {
  
  @JSImport("typedoc/dist/lib/converter/factories", "createComment")
  @js.native
  def createComment(node: Node): js.UndefOr[Comment] = js.native
  
  @JSImport("typedoc/dist/lib/converter/factories", "createDeclaration")
  @js.native
  def createDeclaration(context: Context, node: Declaration, kind: ReflectionKind): js.UndefOr[DeclarationReflection] = js.native
  @JSImport("typedoc/dist/lib/converter/factories", "createDeclaration")
  @js.native
  def createDeclaration(context: Context, node: Declaration, kind: ReflectionKind, name: String): js.UndefOr[DeclarationReflection] = js.native
  
  @JSImport("typedoc/dist/lib/converter/factories", "createParameter")
  @js.native
  def createParameter(context: Context, node: ParameterDeclaration): js.UndefOr[ParameterReflection] = js.native
  
  @JSImport("typedoc/dist/lib/converter/factories", "createReferenceType")
  @js.native
  def createReferenceType(context: Context): js.UndefOr[ReferenceType] = js.native
  @JSImport("typedoc/dist/lib/converter/factories", "createReferenceType")
  @js.native
  def createReferenceType(context: Context, symbol: js.UndefOr[scala.Nothing], includeParent: Boolean): js.UndefOr[ReferenceType] = js.native
  @JSImport("typedoc/dist/lib/converter/factories", "createReferenceType")
  @js.native
  def createReferenceType(context: Context, symbol: Symbol): js.UndefOr[ReferenceType] = js.native
  @JSImport("typedoc/dist/lib/converter/factories", "createReferenceType")
  @js.native
  def createReferenceType(context: Context, symbol: Symbol, includeParent: Boolean): js.UndefOr[ReferenceType] = js.native
  
  @JSImport("typedoc/dist/lib/converter/factories", "createSignature")
  @js.native
  def createSignature(context: Context, node: SignatureDeclaration, name: String, kind: ReflectionKind): SignatureReflection = js.native
  
  @JSImport("typedoc/dist/lib/converter/factories", "createTypeParameter")
  @js.native
  def createTypeParameter(context: Context, node: TypeParameterDeclaration): js.UndefOr[TypeParameterType] = js.native
}
