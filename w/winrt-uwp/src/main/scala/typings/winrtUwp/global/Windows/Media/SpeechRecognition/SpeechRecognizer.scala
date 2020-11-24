package typings.winrtUwp.global.Windows.Media.SpeechRecognition

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Globalization.Language
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Enables speech recognition with either a default or a custom graphical user interface (GUI). */
@JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognizer")
@js.native
/** Creates a new instance of the SpeechRecognizer class. */
class SpeechRecognizer ()
  extends typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognizer {
  /**
    * Creates a new instance of the SpeechRecognizer class with a language specifier.
    * @param language The spoken language to use for recognition.
    */
  def this(language: Language) = this()
}
/* static members */
@JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognizer")
@js.native
object SpeechRecognizer extends js.Object {
  
  /** Gets the collection of languages supported by the custom grammars of the SpeechRecognitionGrammarFileConstraint and SpeechRecognitionListConstraint objects specified in the Constraints property. */
  var supportedGrammarLanguages: IVectorView[Language] = js.native
  
  /** Gets the collection of languages supported by the pre-defined, web-service grammars of the SpeechRecognitionTopicConstraint objects specified in the Constraints property. */
  var supportedTopicLanguages: IVectorView[Language] = js.native
  
  /** Gets the language of the device specified in Settings > Time & Language > Speech. */
  var systemSpeechLanguage: Language = js.native
}
