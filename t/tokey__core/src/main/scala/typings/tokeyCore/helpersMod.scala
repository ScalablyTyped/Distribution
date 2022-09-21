package typings.tokeyCore

import typings.tokeyCore.anon.End
import typings.tokeyCore.anon.Start
import typings.tokeyCore.tokeyCoreStrings._empty
import typings.tokeyCore.tokeyCoreStrings.`line-comment`
import typings.tokeyCore.tokeyCoreStrings.`multi-comment`
import typings.tokeyCore.tokeyCoreStrings.`unclosed-comment`
import typings.tokeyCore.typesMod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersMod {
  
  @JSImport("@tokey/core/dist/helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createToken[Type /* <: String */](value: String, `type`: Type, start: Double, end: Double): End[Type] = (^.asInstanceOf[js.Dynamic].applyDynamic("createToken")(value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[End[Type]]
  
  inline def getJSCommentStartType(ch: String, source: String, nextCharIndex: Double): _empty | `line-comment` | `multi-comment` = (^.asInstanceOf[js.Dynamic].applyDynamic("getJSCommentStartType")(ch.asInstanceOf[js.Any], source.asInstanceOf[js.Any], nextCharIndex.asInstanceOf[js.Any])).asInstanceOf[_empty | `line-comment` | `multi-comment`]
  
  inline def getMultilineCommentStartType(ch: String, source: String, nextCharIndex: Double): _empty | `multi-comment` = (^.asInstanceOf[js.Dynamic].applyDynamic("getMultilineCommentStartType")(ch.asInstanceOf[js.Any], source.asInstanceOf[js.Any], nextCharIndex.asInstanceOf[js.Any])).asInstanceOf[_empty | `multi-comment`]
  
  inline def getText(tokens: js.Array[Token[Any]]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getText")(tokens.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getText(tokens: js.Array[Token[Any]], startIndex: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getText")(tokens.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getText(tokens: js.Array[Token[Any]], startIndex: Double, upToIndex: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getText")(tokens.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], upToIndex.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getText(tokens: js.Array[Token[Any]], startIndex: Double, upToIndex: Double, source: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getText")(tokens.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], upToIndex.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getText(tokens: js.Array[Token[Any]], startIndex: Double, upToIndex: Unit, source: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getText")(tokens.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], upToIndex.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getText(tokens: js.Array[Token[Any]], startIndex: Unit, upToIndex: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getText")(tokens.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], upToIndex.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getText(tokens: js.Array[Token[Any]], startIndex: Unit, upToIndex: Double, source: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getText")(tokens.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], upToIndex.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getText(tokens: js.Array[Token[Any]], startIndex: Unit, upToIndex: Unit, source: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getText")(tokens.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], upToIndex.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getUnclosedComment(commentType: String): `line-comment` | `unclosed-comment` = ^.asInstanceOf[js.Dynamic].applyDynamic("getUnclosedComment")(commentType.asInstanceOf[js.Any]).asInstanceOf[`line-comment` | `unclosed-comment`]
  
  inline def groupTokens[Tokens /* <: js.Array[Token[Any]] */, T /* <: String */](tokens: Tokens): Start[T, Tokens] = ^.asInstanceOf[js.Dynamic].applyDynamic("groupTokens")(tokens.asInstanceOf[js.Any]).asInstanceOf[Start[T, Tokens]]
  inline def groupTokens[Tokens /* <: js.Array[Token[Any]] */, T /* <: String */](tokens: Tokens, `type`: T): Start[T, Tokens] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupTokens")(tokens.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Start[T, Tokens]]
  inline def groupTokens[Tokens /* <: js.Array[Token[Any]] */, T /* <: String */](tokens: Tokens, `type`: T, source: String): Start[T, Tokens] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupTokens")(tokens.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[Start[T, Tokens]]
  inline def groupTokens[Tokens /* <: js.Array[Token[Any]] */, T /* <: String */](tokens: Tokens, `type`: Unit, source: String): Start[T, Tokens] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupTokens")(tokens.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[Start[T, Tokens]]
  
  inline def isComment(`type`: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isComment")(`type`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isCommentEnd(commentType: String, ch: String, _source: String, _nextCharIndex: Double, previousChar: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isCommentEnd")(commentType.asInstanceOf[js.Any], ch.asInstanceOf[js.Any], _source.asInstanceOf[js.Any], _nextCharIndex.asInstanceOf[js.Any], previousChar.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isString(`type`: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(`type`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isStringDelimiter(char: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStringDelimiter")(char.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isWhitespace(char: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWhitespace")(char.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def last[T](arr: js.Array[T]): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("last")(arr.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[T]]
  
  inline def trimTokens[Tokens /* <: js.Array[Token[Any]] */](tokens: Tokens, shouldTrimToken: js.Function1[/* token */ Token[Any], Boolean]): js.Array[Token[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("trimTokens")(tokens.asInstanceOf[js.Any], shouldTrimToken.asInstanceOf[js.Any])).asInstanceOf[js.Array[Token[Any]]]
}
