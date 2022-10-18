package typings.typedoc

import typings.std.Set
import typings.typedoc.distLibModelsMod.Comment
import typings.typedoc.distLibModelsReflectionsKindMod.ReflectionKind
import typings.typedoc.distLibUtilsMod.Logger
import typings.typedoc.distLibUtilsOptionsDeclarationMod.CommentStyle
import typings.typescript.mod.JSDocCallbackTag
import typings.typescript.mod.JSDocEnumTag
import typings.typescript.mod.JSDocPropertyLikeTag
import typings.typescript.mod.JSDocSignature
import typings.typescript.mod.JSDocTemplateTag
import typings.typescript.mod.JSDocTypedefTag
import typings.typescript.mod.SignatureDeclaration
import typings.typescript.mod.Symbol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibConverterCommentsMod {
  
  @JSImport("typedoc/dist/lib/converter/comments", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getComment(
    symbol: Symbol,
    kind: ReflectionKind,
    config: CommentParserConfig,
    logger: Logger,
    commentStyle: CommentStyle
  ): js.UndefOr[Comment] = (^.asInstanceOf[js.Dynamic].applyDynamic("getComment")(symbol.asInstanceOf[js.Any], kind.asInstanceOf[js.Any], config.asInstanceOf[js.Any], logger.asInstanceOf[js.Any], commentStyle.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Comment]]
  
  inline def getJsDocComment(declaration: JSDocCallbackTag, config: CommentParserConfig, logger: Logger): js.UndefOr[Comment] = (^.asInstanceOf[js.Dynamic].applyDynamic("getJsDocComment")(declaration.asInstanceOf[js.Any], config.asInstanceOf[js.Any], logger.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Comment]]
  inline def getJsDocComment(declaration: JSDocEnumTag, config: CommentParserConfig, logger: Logger): js.UndefOr[Comment] = (^.asInstanceOf[js.Dynamic].applyDynamic("getJsDocComment")(declaration.asInstanceOf[js.Any], config.asInstanceOf[js.Any], logger.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Comment]]
  inline def getJsDocComment(declaration: JSDocPropertyLikeTag, config: CommentParserConfig, logger: Logger): js.UndefOr[Comment] = (^.asInstanceOf[js.Dynamic].applyDynamic("getJsDocComment")(declaration.asInstanceOf[js.Any], config.asInstanceOf[js.Any], logger.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Comment]]
  inline def getJsDocComment(declaration: JSDocTemplateTag, config: CommentParserConfig, logger: Logger): js.UndefOr[Comment] = (^.asInstanceOf[js.Dynamic].applyDynamic("getJsDocComment")(declaration.asInstanceOf[js.Any], config.asInstanceOf[js.Any], logger.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Comment]]
  inline def getJsDocComment(declaration: JSDocTypedefTag, config: CommentParserConfig, logger: Logger): js.UndefOr[Comment] = (^.asInstanceOf[js.Dynamic].applyDynamic("getJsDocComment")(declaration.asInstanceOf[js.Any], config.asInstanceOf[js.Any], logger.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Comment]]
  
  inline def getSignatureComment(
    declaration: JSDocSignature,
    config: CommentParserConfig,
    logger: Logger,
    commentStyle: CommentStyle
  ): js.UndefOr[Comment] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSignatureComment")(declaration.asInstanceOf[js.Any], config.asInstanceOf[js.Any], logger.asInstanceOf[js.Any], commentStyle.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Comment]]
  inline def getSignatureComment(
    declaration: SignatureDeclaration,
    config: CommentParserConfig,
    logger: Logger,
    commentStyle: CommentStyle
  ): js.UndefOr[Comment] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSignatureComment")(declaration.asInstanceOf[js.Any], config.asInstanceOf[js.Any], logger.asInstanceOf[js.Any], commentStyle.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Comment]]
  
  trait CommentParserConfig extends StObject {
    
    var blockTags: Set[String]
    
    var inlineTags: Set[String]
    
    var modifierTags: Set[String]
  }
  object CommentParserConfig {
    
    inline def apply(blockTags: Set[String], inlineTags: Set[String], modifierTags: Set[String]): CommentParserConfig = {
      val __obj = js.Dynamic.literal(blockTags = blockTags.asInstanceOf[js.Any], inlineTags = inlineTags.asInstanceOf[js.Any], modifierTags = modifierTags.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommentParserConfig]
    }
    
    extension [Self <: CommentParserConfig](x: Self) {
      
      inline def setBlockTags(value: Set[String]): Self = StObject.set(x, "blockTags", value.asInstanceOf[js.Any])
      
      inline def setInlineTags(value: Set[String]): Self = StObject.set(x, "inlineTags", value.asInstanceOf[js.Any])
      
      inline def setModifierTags(value: Set[String]): Self = StObject.set(x, "modifierTags", value.asInstanceOf[js.Any])
    }
  }
}
