package typings.typesettable

import typings.typesettable.measurersMod.AbstractMeasurer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wrapperMod {
  
  @JSImport("typesettable/build/src/wrappers/wrapper", "Wrapper")
  @js.native
  class Wrapper () extends StObject {
    
    var _allowBreakingWords: js.Any = js.native
    
    var _breakingCharacter: String = js.native
    
    var _maxLines: js.Any = js.native
    
    var _textTrimming: js.Any = js.native
    
    var _tokenizer: js.Any = js.native
    
    /* private */ def addEllipsis(line: js.Any, width: js.Any, measurer: js.Any): js.Any = js.native
    
    def allowBreakingWords(): Boolean = js.native
    def allowBreakingWords(allow: Boolean): Wrapper = js.native
    
    /* private */ def breakLineToFitWidth(state: js.Any, line: js.Any, hasNextLine: js.Any, measurer: js.Any): js.Any = js.native
    
    /**
      * Breaks single token to fit current line.
      * If token contains only whitespaces then they will not be populated to next line.
      */
    /* private */ def breakTokenToFitInWidth(token: js.Any, line: js.Any, availableWidth: js.Any, measurer: js.Any, breakingCharacter: js.Any): js.Any = js.native
    
    /* private */ def canFitToken(token: js.Any, width: js.Any, measurer: js.Any): js.Any = js.native
    
    /* private */ def finishWrapping(token: js.Any, state: js.Any, measurer: js.Any): js.Any = js.native
    
    def maxLines(): Double = js.native
    def maxLines(noLines: Double): Wrapper = js.native
    
    def textTrimming(): String = js.native
    def textTrimming(option: String): Wrapper = js.native
    
    def wrap(text: String, measurer: AbstractMeasurer, width: Double): IWrappingResult = js.native
    def wrap(text: String, measurer: AbstractMeasurer, width: Double, height: Double): IWrappingResult = js.native
    
    /* private */ def wrapNextToken(token: js.Any, state: js.Any, measurer: js.Any): js.Any = js.native
  }
  
  @js.native
  trait IWrappingResult extends StObject {
    
    var noBrokeWords: Double = js.native
    
    var noLines: Double = js.native
    
    var originalText: String = js.native
    
    var truncatedText: String = js.native
    
    var wrappedText: String = js.native
  }
  object IWrappingResult {
    
    @scala.inline
    def apply(
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
    implicit class IWrappingResultMutableBuilder[Self <: IWrappingResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNoBrokeWords(value: Double): Self = StObject.set(x, "noBrokeWords", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoLines(value: Double): Self = StObject.set(x, "noLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalText(value: String): Self = StObject.set(x, "originalText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTruncatedText(value: String): Self = StObject.set(x, "truncatedText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrappedText(value: String): Self = StObject.set(x, "wrappedText", value.asInstanceOf[js.Any])
    }
  }
}
