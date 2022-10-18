package typings.typedoc

import typings.std.Generator
import typings.typedoc.distLibConverterCommentsLexerMod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibConverterCommentsBlockLexerMod {
  
  @JSImport("typedoc/dist/lib/converter/comments/blockLexer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def lexBlockComment(file: String): Generator[Token, Unit, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("lexBlockComment")(file.asInstanceOf[js.Any]).asInstanceOf[Generator[Token, Unit, Unit]]
  inline def lexBlockComment(file: String, pos: Double): Generator[Token, Unit, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("lexBlockComment")(file.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[Generator[Token, Unit, Unit]]
  inline def lexBlockComment(file: String, pos: Double, end: Double): Generator[Token, Unit, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("lexBlockComment")(file.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Generator[Token, Unit, Unit]]
  inline def lexBlockComment(file: String, pos: Unit, end: Double): Generator[Token, Unit, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("lexBlockComment")(file.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Generator[Token, Unit, Unit]]
}
