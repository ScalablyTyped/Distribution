package typings.typedoc

import typings.typedoc.distLibConverterContextMod.Context
import typings.typedoc.distLibModelsMod.ParameterReflection
import typings.typedoc.distLibModelsMod.SignatureReflection
import typings.typedoc.distLibModelsMod.TypeParameterReflection
import typings.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.CallSignature
import typings.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.ConstructorSignature
import typings.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.GetSignature
import typings.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.SetSignature
import typings.typescript.mod.JSDocParameterTag
import typings.typescript.mod.JSDocSignature
import typings.typescript.mod.ParameterDeclaration
import typings.typescript.mod.Signature
import typings.typescript.mod.SignatureDeclaration
import typings.typescript.mod.TypeParameterDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibConverterFactoriesSignatureMod {
  
  @JSImport("typedoc/dist/lib/converter/factories/signature", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convertParameterNodes(
    context: Context,
    sigRef: SignatureReflection,
    parameters: js.Array[JSDocParameterTag | ParameterDeclaration]
  ): js.Array[ParameterReflection] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertParameterNodes")(context.asInstanceOf[js.Any], sigRef.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[js.Array[ParameterReflection]]
  
  inline def convertTypeParameterNodes(context: Context): js.UndefOr[js.Array[TypeParameterReflection]] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertTypeParameterNodes")(context.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Array[TypeParameterReflection]]]
  inline def convertTypeParameterNodes(context: Context, parameters: js.Array[TypeParameterDeclaration]): js.UndefOr[js.Array[TypeParameterReflection]] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertTypeParameterNodes")(context.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[TypeParameterReflection]]]
  
  inline def createSignature(context: Context, kind: CallSignature, signature: Signature): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createSignature")(context.asInstanceOf[js.Any], kind.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def createSignature(context: Context, kind: CallSignature, signature: Signature, declaration: JSDocSignature): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createSignature")(context.asInstanceOf[js.Any], kind.asInstanceOf[js.Any], signature.asInstanceOf[js.Any], declaration.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def createSignature(context: Context, kind: CallSignature, signature: Signature, declaration: SignatureDeclaration): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createSignature")(context.asInstanceOf[js.Any], kind.asInstanceOf[js.Any], signature.asInstanceOf[js.Any], declaration.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def createSignature(context: Context, kind: ConstructorSignature, signature: Signature): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createSignature")(context.asInstanceOf[js.Any], kind.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def createSignature(context: Context, kind: ConstructorSignature, signature: Signature, declaration: JSDocSignature): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createSignature")(context.asInstanceOf[js.Any], kind.asInstanceOf[js.Any], signature.asInstanceOf[js.Any], declaration.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def createSignature(
    context: Context,
    kind: ConstructorSignature,
    signature: Signature,
    declaration: SignatureDeclaration
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createSignature")(context.asInstanceOf[js.Any], kind.asInstanceOf[js.Any], signature.asInstanceOf[js.Any], declaration.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def createSignature(context: Context, kind: GetSignature, signature: Signature): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createSignature")(context.asInstanceOf[js.Any], kind.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def createSignature(context: Context, kind: GetSignature, signature: Signature, declaration: JSDocSignature): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createSignature")(context.asInstanceOf[js.Any], kind.asInstanceOf[js.Any], signature.asInstanceOf[js.Any], declaration.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def createSignature(context: Context, kind: GetSignature, signature: Signature, declaration: SignatureDeclaration): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createSignature")(context.asInstanceOf[js.Any], kind.asInstanceOf[js.Any], signature.asInstanceOf[js.Any], declaration.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def createSignature(context: Context, kind: SetSignature, signature: Signature): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createSignature")(context.asInstanceOf[js.Any], kind.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def createSignature(context: Context, kind: SetSignature, signature: Signature, declaration: JSDocSignature): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createSignature")(context.asInstanceOf[js.Any], kind.asInstanceOf[js.Any], signature.asInstanceOf[js.Any], declaration.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def createSignature(context: Context, kind: SetSignature, signature: Signature, declaration: SignatureDeclaration): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createSignature")(context.asInstanceOf[js.Any], kind.asInstanceOf[js.Any], signature.asInstanceOf[js.Any], declaration.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createTypeParamReflection(param: TypeParameterDeclaration, context: Context): TypeParameterReflection = (^.asInstanceOf[js.Dynamic].applyDynamic("createTypeParamReflection")(param.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[TypeParameterReflection]
}
