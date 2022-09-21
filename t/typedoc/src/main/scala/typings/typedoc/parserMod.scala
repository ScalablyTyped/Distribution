package typings.typedoc

import typings.std.Generator
import typings.typedoc.commentsMod.CommentParserConfig
import typings.typedoc.lexerMod.Token
import typings.typedoc.libUtilsMod.Logger
import typings.typedoc.minimalSourceFileMod.MinimalSourceFile
import typings.typedoc.modelsMod.Comment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parserMod {
  
  @JSImport("typedoc/dist/lib/converter/comments/parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseComment(
    tokens: Generator[Token, Unit, Unit],
    config: CommentParserConfig,
    file: MinimalSourceFile,
    logger: Logger
  ): Comment = (^.asInstanceOf[js.Dynamic].applyDynamic("parseComment")(tokens.asInstanceOf[js.Any], config.asInstanceOf[js.Any], file.asInstanceOf[js.Any], logger.asInstanceOf[js.Any])).asInstanceOf[Comment]
}
