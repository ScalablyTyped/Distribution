package typings.tokeyCore

import typings.tokeyCore.distTypesMod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreMod {
  
  @JSImport("@tokey/core/dist/core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def tokenize[T /* <: Token[Any] */](
    source: String,
    hasIsDelimiterIsStringDelimiterIsWhitespaceShouldAddTokenCreateTokenGetCommentStartTypeIsCommentEndGetUnclosedCommentOffset: TokyOptions[T]
  ): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("tokenize")(source.asInstanceOf[js.Any], hasIsDelimiterIsStringDelimiterIsWhitespaceShouldAddTokenCreateTokenGetCommentStartTypeIsCommentEndGetUnclosedCommentOffset.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  trait TokyOptions[T /* <: Token[Any] */] extends StObject {
    
    @JSName("createToken")
    def createToken_type(
      value: String,
      `type`: /* import warning: importer.ImportType#apply Failed type conversion: T['type'] */ js.Any,
      start: Double,
      end: Double
    ): T
    
    def getCommentStartType(ch: String, source: String, nextCharIndex: Double): String
    
    def getUnclosedComment(inComment: String): String
    
    def isCommentEnd(inComment: String, ch: String, source: String, nextCharIndex: Double, previousChar: String): Boolean
    
    def isDelimiter(char: String, previousChar: String): Boolean
    
    def isStringDelimiter(char: String, previousChar: String): Boolean
    
    def isWhitespace(char: String): Boolean
    
    var offset: js.UndefOr[Double] = js.undefined
    
    @JSName("shouldAddToken")
    def shouldAddToken_type(
      `type`: /* import warning: importer.ImportType#apply Failed type conversion: T['type'] */ js.Any,
      value: String
    ): Boolean
  }
  object TokyOptions {
    
    inline def apply[T /* <: Token[Any] */](
      createToken: (String, /* import warning: importer.ImportType#apply Failed type conversion: T['type'] */ js.Any, Double, Double) => T,
      getCommentStartType: (String, String, Double) => String,
      getUnclosedComment: String => String,
      isCommentEnd: (String, String, String, Double, String) => Boolean,
      isDelimiter: (String, String) => Boolean,
      isStringDelimiter: (String, String) => Boolean,
      isWhitespace: String => Boolean,
      shouldAddToken: (/* import warning: importer.ImportType#apply Failed type conversion: T['type'] */ js.Any, String) => Boolean
    ): TokyOptions[T] = {
      val __obj = js.Dynamic.literal(createToken = js.Any.fromFunction4(createToken), getCommentStartType = js.Any.fromFunction3(getCommentStartType), getUnclosedComment = js.Any.fromFunction1(getUnclosedComment), isCommentEnd = js.Any.fromFunction5(isCommentEnd), isDelimiter = js.Any.fromFunction2(isDelimiter), isStringDelimiter = js.Any.fromFunction2(isStringDelimiter), isWhitespace = js.Any.fromFunction1(isWhitespace), shouldAddToken = js.Any.fromFunction2(shouldAddToken))
      __obj.asInstanceOf[TokyOptions[T]]
    }
    
    extension [Self <: TokyOptions[?], T /* <: Token[Any] */](x: Self & TokyOptions[T]) {
      
      inline def setCreateToken(
        value: (String, /* import warning: importer.ImportType#apply Failed type conversion: T['type'] */ js.Any, Double, Double) => T
      ): Self = StObject.set(x, "createToken", js.Any.fromFunction4(value))
      
      inline def setGetCommentStartType(value: (String, String, Double) => String): Self = StObject.set(x, "getCommentStartType", js.Any.fromFunction3(value))
      
      inline def setGetUnclosedComment(value: String => String): Self = StObject.set(x, "getUnclosedComment", js.Any.fromFunction1(value))
      
      inline def setIsCommentEnd(value: (String, String, String, Double, String) => Boolean): Self = StObject.set(x, "isCommentEnd", js.Any.fromFunction5(value))
      
      inline def setIsDelimiter(value: (String, String) => Boolean): Self = StObject.set(x, "isDelimiter", js.Any.fromFunction2(value))
      
      inline def setIsStringDelimiter(value: (String, String) => Boolean): Self = StObject.set(x, "isStringDelimiter", js.Any.fromFunction2(value))
      
      inline def setIsWhitespace(value: String => Boolean): Self = StObject.set(x, "isWhitespace", js.Any.fromFunction1(value))
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setShouldAddToken(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: T['type'] */ js.Any, String) => Boolean
      ): Self = StObject.set(x, "shouldAddToken", js.Any.fromFunction2(value))
    }
  }
}
