package typings.winrtUwp.global.Windows.Media

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Globalization.Language
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The Windows.Media.Ocr namespace provides classes for optical character recognition (OCR) that enable Windows Runtime apps to read and interpret text from images. */
@JSGlobal("Windows.Media.Ocr")
@js.native
object Ocr extends js.Object {
  
  /** Provides optical character recognition (OCR) functionality. */
  @js.native
  abstract class OcrEngine ()
    extends typings.winrtUwp.Windows.Media.Ocr.OcrEngine
  /* static members */
  @js.native
  object OcrEngine extends js.Object {
    
    /** Returns a collection of all available OCR languages on the device. */
    var availableRecognizerLanguages: IVectorView[Language] = js.native
    
    /**
      * Returns true if a specified language can be resolved to any of the available OCR languages. See language matching for a further explanation of language resolving.
      * @param language The language being used for text recognition.
      * @return TRUE, if the specified language can be resolved to any of the available OCR languages; otherwise, FALSE.
      */
    def isLanguageSupported(language: Language): Boolean = js.native
    
    /** Gets the maximum image pixel dimensions supported by the OCR engine. */
    var maxImageDimension: Double = js.native
    
    /**
      * Creates a new instance of the OcrEngine class.
      * @param language The language being used for text recognition.
      * @return If the specified language can be resolved to any of the OCR languages available on the device, returns new instance of OcrEngine class, otherwise returns null. See language matching for a further explanation of language resolving.
      */
    def tryCreateFromLanguage(language: Language): typings.winrtUwp.Windows.Media.Ocr.OcrEngine = js.native
    
    /**
      * Creates a new instance of the OcrEngine class.
      * @return If any language from GlobalizationPreferences.Languages can be resolved to any of the available OCR languages returns new instance of OcrEngine class, otherwise returns null.
      */
    def tryCreateFromUserProfileLanguages(): typings.winrtUwp.Windows.Media.Ocr.OcrEngine = js.native
  }
  
  /** Represents a single line of text recognized by the OCR engine and returned as part of the OcrResult . */
  @js.native
  abstract class OcrLine ()
    extends typings.winrtUwp.Windows.Media.Ocr.OcrLine
  
  /** Contains the results of Optical Character Recognition (OCR). */
  @js.native
  abstract class OcrResult ()
    extends typings.winrtUwp.Windows.Media.Ocr.OcrResult
  
  /** Represents a single word in a line of text recognized by the OCR engine and returned as part of the OcrLine . */
  @js.native
  abstract class OcrWord ()
    extends typings.winrtUwp.Windows.Media.Ocr.OcrWord
}
