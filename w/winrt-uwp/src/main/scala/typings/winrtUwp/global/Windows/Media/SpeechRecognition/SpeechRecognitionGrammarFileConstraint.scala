package typings.winrtUwp.global.Windows.Media.SpeechRecognition

import typings.winrtUwp.Windows.Storage.StorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A constraint for a SpeechRecognizer object based on a Speech Recognition Grammar Specification (SRGS) file. */
@JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognitionGrammarFileConstraint")
@js.native
class SpeechRecognitionGrammarFileConstraint protected ()
  extends typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionGrammarFileConstraint {
  /**
    * Creates an instance of the SpeechRecognitionGrammarFileConstraint class from a file object.
    * @param file An object representing a SRGS grammar file.
    */
  def this(file: StorageFile) = this()
  /**
    * Creates an instance of the SpeechRecognitionGrammarFileConstraint class from a file object and a tag.
    * @param file An object representing a SRGS grammar file.
    * @param tag The tag to assign to the constraint.
    */
  def this(file: StorageFile, tag: String) = this()
}

