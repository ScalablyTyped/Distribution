package typings.typesettable

import typings.typesettable.buildSrcMeasurersMod.AbstractMeasurer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcWrappersWrapperMod {
  
  @JSImport("typesettable/build/src/wrappers/wrapper", "Wrapper")
  @js.native
  open class Wrapper () extends StObject {
    
    /* private */ var _allowBreakingWords: Any = js.native
    
    var _breakingCharacter: String = js.native
    
    /* private */ var _maxLines: Any = js.native
    
    /* private */ var _textTrimming: Any = js.native
    
    /* private */ var _tokenizer: Any = js.native
    
    /* private */ def addEllipsis(line: Any, width: Any, measurer: Any): Any = js.native
    
    def allowBreakingWords(): Boolean = js.native
    def allowBreakingWords(allow: Boolean): Wrapper = js.native
    
    /* private */ def breakLineToFitWidth(state: Any, line: Any, hasNextLine: Any, measurer: Any): Any = js.native
    
    /**
      * Breaks single token to fit current line.
      * If token contains only whitespaces then they will not be populated to next line.
      */
    /* private */ def breakTokenToFitInWidth(token: Any, line: Any, availableWidth: Any, measurer: Any, breakingCharacter: Any): Any = js.native
    
    /* private */ def canFitToken(token: Any, width: Any, measurer: Any): Any = js.native
    
    /* private */ def finishWrapping(token: Any, state: Any, measurer: Any): Any = js.native
    
    def maxLines(): Double = js.native
    def maxLines(noLines: Double): Wrapper = js.native
    
    def textTrimming(): String = js.native
    def textTrimming(option: String): Wrapper = js.native
    
    def wrap(text: String, measurer: AbstractMeasurer, width: Double): IWrappingResult = js.native
    def wrap(text: String, measurer: AbstractMeasurer, width: Double, height: Double): IWrappingResult = js.native
    
    /* private */ def wrapNextToken(token: Any, state: Any, measurer: Any): Any = js.native
  }
  
  trait IWrappingResult extends StObject {
    
    var noBrokeWords: Double
    
    var noLines: Double
    
    var originalText: String
    
    var truncatedText: String
    
    var wrappedText: String
  }
  object IWrappingResult {
    
    inline def apply(
      noBrokeWords: Double,
      noLines: Double,
      originalText: String,
      truncatedText: String,
      wrappedText: String
    ): IWrappingResult = {
      val __obj = js.Dynamic.literal(noBrokeWords = noBrokeWords.asInstanceOf[js.Any], noLines = noLines.asInstanceOf[js.Any], originalText = originalText.asInstanceOf[js.Any], truncatedText = truncatedText.asInstanceOf[js.Any], wrappedText = wrappedText.asInstanceOf[js.Any])
      __obj.asInstanceOf[IWrappingResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IWrappingResult] (val x: Self) extends AnyVal {
      
      inline def setNoBrokeWords(value: Double): Self = StObject.set(x, "noBrokeWords", value.asInstanceOf[js.Any])
      
      inline def setNoLines(value: Double): Self = StObject.set(x, "noLines", value.asInstanceOf[js.Any])
      
      inline def setOriginalText(value: String): Self = StObject.set(x, "originalText", value.asInstanceOf[js.Any])
      
      inline def setTruncatedText(value: String): Self = StObject.set(x, "truncatedText", value.asInstanceOf[js.Any])
      
      inline def setWrappedText(value: String): Self = StObject.set(x, "wrappedText", value.asInstanceOf[js.Any])
    }
  }
}
