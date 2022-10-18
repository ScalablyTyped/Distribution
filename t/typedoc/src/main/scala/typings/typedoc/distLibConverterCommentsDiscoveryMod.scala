package typings.typedoc

import typings.typedoc.distLibModelsReflectionsKindMod.ReflectionKind
import typings.typedoc.distLibUtilsMod.Logger
import typings.typedoc.distLibUtilsOptionsDeclarationMod.CommentStyle
import typings.typescript.mod.CommentRange
import typings.typescript.mod.JSDocSignature
import typings.typescript.mod.SignatureDeclaration
import typings.typescript.mod.SourceFile
import typings.typescript.mod.Symbol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibConverterCommentsDiscoveryMod {
  
  @JSImport("typedoc/dist/lib/converter/comments/discovery", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def discoverComment(symbol: Symbol, kind: ReflectionKind, logger: Logger, commentStyle: CommentStyle): js.UndefOr[js.Tuple2[SourceFile, js.Array[CommentRange]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("discoverComment")(symbol.asInstanceOf[js.Any], kind.asInstanceOf[js.Any], logger.asInstanceOf[js.Any], commentStyle.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Tuple2[SourceFile, js.Array[CommentRange]]]]
  
  inline def discoverSignatureComment(declaration: JSDocSignature, commentStyle: CommentStyle): js.UndefOr[js.Tuple2[SourceFile, js.Array[CommentRange]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("discoverSignatureComment")(declaration.asInstanceOf[js.Any], commentStyle.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Tuple2[SourceFile, js.Array[CommentRange]]]]
  inline def discoverSignatureComment(declaration: SignatureDeclaration, commentStyle: CommentStyle): js.UndefOr[js.Tuple2[SourceFile, js.Array[CommentRange]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("discoverSignatureComment")(declaration.asInstanceOf[js.Any], commentStyle.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Tuple2[SourceFile, js.Array[CommentRange]]]]
}
