package typings.winrtUwp.global.Windows.Media

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.Rect
import typings.winrtUwp.Windows.Globalization.Language
import typings.winrtUwp.Windows.Graphics.Imaging.SoftwareBitmap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The Windows.Media.Ocr namespace provides classes for optical character recognition (OCR) that enable Windows Runtime apps to read and interpret text from images. */
object Ocr {
  
  /** Provides optical character recognition (OCR) functionality. */
  @JSGlobal("Windows.Media.Ocr.OcrEngine")
  @js.native
  abstract class OcrEngine ()
    extends StObject
       with typings.winrtUwp.Windows.Media.Ocr.OcrEngine {
    
    /**
      * Scans the specified image for text in the language specified by the RecognizerLanguage property.
      * @param bitmap Represents an uncompressed bitmap.
      * @return The result of the OCR that was initiated by the OcrEngine object.
      */
    /* CompleteClass */
    override def recognizeAsync(bitmap: SoftwareBitmap): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Media.Ocr.OcrResult] = js.native
    
    /** Gets the language being used for text recognition. */
    /* CompleteClass */
    var recognizerLanguage: Language = js.native
  }
  object OcrEngine {
    
    @JSGlobal("Windows.Media.Ocr.OcrEngine")
    @js.native
    val ^ : js.Any = js.native
    
    /** Returns a collection of all available OCR languages on the device. */
    /* static member */
    @JSGlobal("Windows.Media.Ocr.OcrEngine.availableRecognizerLanguages")
    @js.native
    def availableRecognizerLanguages: IVectorView[Language] = js.native
    inline def availableRecognizerLanguages_=(x: IVectorView[Language]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("availableRecognizerLanguages")(x.asInstanceOf[js.Any])
    
    /**
      * Returns true if a specified language can be resolved to any of the available OCR languages. See language matching for a further explanation of language resolving.
      * @param language The language being used for text recognition.
      * @return TRUE, if the specified language can be resolved to any of the available OCR languages; otherwise, FALSE.
      */
    /* static member */
    inline def isLanguageSupported(language: Language): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLanguageSupported")(language.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /** Gets the maximum image pixel dimensions supported by the OCR engine. */
    /* static member */
    @JSGlobal("Windows.Media.Ocr.OcrEngine.maxImageDimension")
    @js.native
    def maxImageDimension: Double = js.native
    inline def maxImageDimension_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxImageDimension")(x.asInstanceOf[js.Any])
    
    /**
      * Creates a new instance of the OcrEngine class.
      * @param language The language being used for text recognition.
      * @return If the specified language can be resolved to any of the OCR languages available on the device, returns new instance of OcrEngine class, otherwise returns null. See language matching for a further explanation of language resolving.
      */
    /* static member */
    inline def tryCreateFromLanguage(language: Language): typings.winrtUwp.Windows.Media.Ocr.OcrEngine = ^.asInstanceOf[js.Dynamic].applyDynamic("tryCreateFromLanguage")(language.asInstanceOf[js.Any]).asInstanceOf[typings.winrtUwp.Windows.Media.Ocr.OcrEngine]
    
    /**
      * Creates a new instance of the OcrEngine class.
      * @return If any language from GlobalizationPreferences.Languages can be resolved to any of the available OCR languages returns new instance of OcrEngine class, otherwise returns null.
      */
    /* static member */
    inline def tryCreateFromUserProfileLanguages(): typings.winrtUwp.Windows.Media.Ocr.OcrEngine = ^.asInstanceOf[js.Dynamic].applyDynamic("tryCreateFromUserProfileLanguages")().asInstanceOf[typings.winrtUwp.Windows.Media.Ocr.OcrEngine]
  }
  
  /** Represents a single line of text recognized by the OCR engine and returned as part of the OcrResult . */
  @JSGlobal("Windows.Media.Ocr.OcrLine")
  @js.native
  abstract class OcrLine ()
    extends StObject
       with typings.winrtUwp.Windows.Media.Ocr.OcrLine {
    
    /** Gets the text of the recognized line. */
    /* CompleteClass */
    var text: String = js.native
    
    /** Gets the collection of OcrWord objects that represents the words detected in the current line of text by the RecognizeAsync method. */
    /* CompleteClass */
    var words: IVectorView[typings.winrtUwp.Windows.Media.Ocr.OcrWord] = js.native
  }
  
  /** Contains the results of Optical Character Recognition (OCR). */
  @JSGlobal("Windows.Media.Ocr.OcrResult")
  @js.native
  abstract class OcrResult ()
    extends StObject
       with typings.winrtUwp.Windows.Media.Ocr.OcrResult {
    
    /** Gets the collection of OcrLine objects that represents the lines of text detected in the image by the RecognizeAsync method. */
    /* CompleteClass */
    var lines: IVectorView[typings.winrtUwp.Windows.Media.Ocr.OcrLine] = js.native
    
    /** Gets the recognized text. */
    /* CompleteClass */
    var text: String = js.native
    
    /** Gets the clockwise rotation of the recognized text, in degrees, around the center of the image. */
    /* CompleteClass */
    var textAngle: Double = js.native
  }
  
  /** Represents a single word in a line of text recognized by the OCR engine and returned as part of the OcrLine . */
  @JSGlobal("Windows.Media.Ocr.OcrWord")
  @js.native
  abstract class OcrWord ()
    extends StObject
       with typings.winrtUwp.Windows.Media.Ocr.OcrWord {
    
    /** Gets the position and size in pixels of the recognized word from the top left corner of image when the value of TextAngle property is 0 (zero). */
    /* CompleteClass */
    var boundingRect: Rect = js.native
    
    /** Gets the text of the recognized word. */
    /* CompleteClass */
    var text: String = js.native
  }
}
