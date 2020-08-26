package typings.winrtUwp.global.Windows.Media.SpeechRecognition

import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A constraint for a SpeechRecognizer object based on a list of words or phrases. When initialized, this object is added to the Constraints collection. */
@JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognitionListConstraint")
@js.native
class SpeechRecognitionListConstraint protected ()
  extends typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionListConstraint {
  /**
    * Creates an instance of the SpeechRecognitionListConstraint class from an array of words or phrases.
    * @param commands A string array of words or phrases that make up the constraint.
    */
  def this(commands: IIterable[String]) = this()
  /**
    * Creates an instance of the SpeechRecognitionListConstraint class from an array of words or phrases and a tag.
    * @param commands A string array of words or phrases that make up the constraint.
    * @param tag The tag to assign to the constraint.
    */
  def this(commands: IIterable[String], tag: String) = this()
}

