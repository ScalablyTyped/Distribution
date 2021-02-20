package typings.winrtUwp.Windows.Media

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.Rect
import typings.winrtUwp.Windows.Globalization.Language
import typings.winrtUwp.Windows.Graphics.Imaging.SoftwareBitmap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The Windows.Media.Ocr namespace provides classes for optical character recognition (OCR) that enable Windows Runtime apps to read and interpret text from images. */
object Ocr {
  
  /** Provides optical character recognition (OCR) functionality. */
  @js.native
  trait OcrEngine extends StObject {
    
    /**
      * Scans the specified image for text in the language specified by the RecognizerLanguage property.
      * @param bitmap Represents an uncompressed bitmap.
      * @return The result of the OCR that was initiated by the OcrEngine object.
      */
    def recognizeAsync(bitmap: SoftwareBitmap): IPromiseWithIAsyncOperation[OcrResult] = js.native
    
    /** Gets the language being used for text recognition. */
    var recognizerLanguage: Language = js.native
  }
  object OcrEngine {
    
    @scala.inline
    def apply(
      recognizeAsync: SoftwareBitmap => IPromiseWithIAsyncOperation[OcrResult],
      recognizerLanguage: Language
    ): OcrEngine = {
      val __obj = js.Dynamic.literal(recognizeAsync = js.Any.fromFunction1(recognizeAsync), recognizerLanguage = recognizerLanguage.asInstanceOf[js.Any])
      __obj.asInstanceOf[OcrEngine]
    }
    
    @scala.inline
    implicit class OcrEngineMutableBuilder[Self <: OcrEngine] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRecognizeAsync(value: SoftwareBitmap => IPromiseWithIAsyncOperation[OcrResult]): Self = StObject.set(x, "recognizeAsync", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRecognizerLanguage(value: Language): Self = StObject.set(x, "recognizerLanguage", value.asInstanceOf[js.Any])
    }
  }
  
  /** Represents a single line of text recognized by the OCR engine and returned as part of the OcrResult . */
  @js.native
  trait OcrLine extends StObject {
    
    /** Gets the text of the recognized line. */
    var text: String = js.native
    
    /** Gets the collection of OcrWord objects that represents the words detected in the current line of text by the RecognizeAsync method. */
    var words: IVectorView[OcrWord] = js.native
  }
  object OcrLine {
    
    @scala.inline
    def apply(text: String, words: IVectorView[OcrWord]): OcrLine = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], words = words.asInstanceOf[js.Any])
      __obj.asInstanceOf[OcrLine]
    }
    
    @scala.inline
    implicit class OcrLineMutableBuilder[Self <: OcrLine] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWords(value: IVectorView[OcrWord]): Self = StObject.set(x, "words", value.asInstanceOf[js.Any])
    }
  }
  
  /** Contains the results of Optical Character Recognition (OCR). */
  @js.native
  trait OcrResult extends StObject {
    
    /** Gets the collection of OcrLine objects that represents the lines of text detected in the image by the RecognizeAsync method. */
    var lines: IVectorView[OcrLine] = js.native
    
    /** Gets the recognized text. */
    var text: String = js.native
    
    /** Gets the clockwise rotation of the recognized text, in degrees, around the center of the image. */
    var textAngle: Double = js.native
  }
  object OcrResult {
    
    @scala.inline
    def apply(lines: IVectorView[OcrLine], text: String, textAngle: Double): OcrResult = {
      val __obj = js.Dynamic.literal(lines = lines.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], textAngle = textAngle.asInstanceOf[js.Any])
      __obj.asInstanceOf[OcrResult]
    }
    
    @scala.inline
    implicit class OcrResultMutableBuilder[Self <: OcrResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLines(value: IVectorView[OcrLine]): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAngle(value: Double): Self = StObject.set(x, "textAngle", value.asInstanceOf[js.Any])
    }
  }
  
  /** Represents a single word in a line of text recognized by the OCR engine and returned as part of the OcrLine . */
  @js.native
  trait OcrWord extends StObject {
    
    /** Gets the position and size in pixels of the recognized word from the top left corner of image when the value of TextAngle property is 0 (zero). */
    var boundingRect: Rect = js.native
    
    /** Gets the text of the recognized word. */
    var text: String = js.native
  }
  object OcrWord {
    
    @scala.inline
    def apply(boundingRect: Rect, text: String): OcrWord = {
      val __obj = js.Dynamic.literal(boundingRect = boundingRect.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[OcrWord]
    }
    
    @scala.inline
    implicit class OcrWordMutableBuilder[Self <: OcrWord] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBoundingRect(value: Rect): Self = StObject.set(x, "boundingRect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
}
