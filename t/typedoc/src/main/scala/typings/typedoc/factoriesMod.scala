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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object factoriesMod {
  
  @JSImport("typedoc/dist/lib/converter/factories", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createComment(node: Node): js.UndefOr[Comment] = ^.asInstanceOf[js.Dynamic].applyDynamic("createComment")(node.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Comment]]
  
  inline def createDeclaration(context: Context, node: Declaration, kind: ReflectionKind): js.UndefOr[DeclarationReflection] = (^.asInstanceOf[js.Dynamic].applyDynamic("createDeclaration")(context.asInstanceOf[js.Any], node.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[DeclarationReflection]]
  inline def createDeclaration(context: Context, node: Declaration, kind: ReflectionKind, name: String): js.UndefOr[DeclarationReflection] = (^.asInstanceOf[js.Dynamic].applyDynamic("createDeclaration")(context.asInstanceOf[js.Any], node.asInstanceOf[js.Any], kind.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[DeclarationReflection]]
  
  inline def createParameter(context: Context, node: ParameterDeclaration): js.UndefOr[ParameterReflection] = (^.asInstanceOf[js.Dynamic].applyDynamic("createParameter")(context.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ParameterReflection]]
  
  inline def createReferenceType(context: Context): js.UndefOr[ReferenceType] = ^.asInstanceOf[js.Dynamic].applyDynamic("createReferenceType")(context.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[ReferenceType]]
  inline def createReferenceType(context: Context, symbol: Unit, includeParent: Boolean): js.UndefOr[ReferenceType] = (^.asInstanceOf[js.Dynamic].applyDynamic("createReferenceType")(context.asInstanceOf[js.Any], symbol.asInstanceOf[js.Any], includeParent.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ReferenceType]]
  inline def createReferenceType(context: Context, symbol: Symbol): js.UndefOr[ReferenceType] = (^.asInstanceOf[js.Dynamic].applyDynamic("createReferenceType")(context.asInstanceOf[js.Any], symbol.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ReferenceType]]
  inline def createReferenceType(context: Context, symbol: Symbol, includeParent: Boolean): js.UndefOr[ReferenceType] = (^.asInstanceOf[js.Dynamic].applyDynamic("createReferenceType")(context.asInstanceOf[js.Any], symbol.asInstanceOf[js.Any], includeParent.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ReferenceType]]
  
  inline def createSignature(context: Context, node: SignatureDeclaration, name: String, kind: ReflectionKind): SignatureReflection = (^.asInstanceOf[js.Dynamic].applyDynamic("createSignature")(context.asInstanceOf[js.Any], node.asInstanceOf[js.Any], name.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[SignatureReflection]
  
  inline def createTypeParameter(context: Context, node: TypeParameterDeclaration): js.UndefOr[TypeParameterType] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTypeParameter")(context.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[TypeParameterType]]
}
