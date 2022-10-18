package typings.typedoc

import typings.typedoc.distLibConverterCommentsDeclarationReferenceMod.DeclarationReference
import typings.typedoc.distLibModelsCommentsCommentMod.CommentDisplayPart
import typings.typedoc.distLibModelsMod.Comment
import typings.typedoc.distLibModelsMod.Reflection
import typings.typedoc.distLibUtilsMod.Logger
import typings.typedoc.distLibUtilsOptionsDeclarationMod.ValidationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibConverterCommentsLinkResolverMod {
  
  @JSImport("typedoc/dist/lib/converter/comments/linkResolver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resolveLinks(
    comment: Comment,
    reflection: Reflection,
    validation: ValidationOptions,
    logger: Logger,
    attemptExternalResolve: js.Function1[/* ref */ DeclarationReference, js.UndefOr[String]]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveLinks")(comment.asInstanceOf[js.Any], reflection.asInstanceOf[js.Any], validation.asInstanceOf[js.Any], logger.asInstanceOf[js.Any], attemptExternalResolve.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def resolvePartLinks(
    reflection: Reflection,
    parts: js.Array[CommentDisplayPart],
    warn: js.Function0[Unit],
    validation: ValidationOptions,
    logger: Logger,
    attemptExternalResolve: js.Function1[/* ref */ DeclarationReference, js.UndefOr[String]]
  ): js.Array[CommentDisplayPart] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolvePartLinks")(reflection.asInstanceOf[js.Any], parts.asInstanceOf[js.Any], warn.asInstanceOf[js.Any], validation.asInstanceOf[js.Any], logger.asInstanceOf[js.Any], attemptExternalResolve.asInstanceOf[js.Any])).asInstanceOf[js.Array[CommentDisplayPart]]
}
