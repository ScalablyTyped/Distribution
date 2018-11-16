package typings
package winrtDashUwpLib.WindowsNs.MediaNs.SpeechRecognitionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SpeechRecognitionConstraintType extends js.Object

/** Specifies the type of pre-defined grammar constraint used for speech recognition. */
@JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognitionConstraintType")
@js.native
object SpeechRecognitionConstraintType extends js.Object {
  /** A constraint based on a SRGS grammar file. See SpeechRecognitionGrammarFileConstraint . */
  @js.native
  sealed trait grammar
    extends winrtDashUwpLib.WindowsNs.MediaNs.SpeechRecognitionNs.SpeechRecognitionConstraintType
  
  /** A constraint based on a list of words or phrases. See SpeechRecognitionListConstraint . */
  @js.native
  sealed trait list
    extends winrtDashUwpLib.WindowsNs.MediaNs.SpeechRecognitionNs.SpeechRecognitionConstraintType
  
  /** A constraint based on a dictation topic. See SpeechRecognitionTopicConstraint . */
  @js.native
  sealed trait topic
    extends winrtDashUwpLib.WindowsNs.MediaNs.SpeechRecognitionNs.SpeechRecognitionConstraintType
  
  /** A constraint based on a VCD file. See SpeechRecognitionVoiceCommandDefinitionConstraint . */
  @js.native
  sealed trait voiceCommandDefinition
    extends winrtDashUwpLib.WindowsNs.MediaNs.SpeechRecognitionNs.SpeechRecognitionConstraintType
  
  val grammar: grammar with java.lang.String = js.native
  val list: list with java.lang.String = js.native
  val topic: topic with java.lang.String = js.native
  val voiceCommandDefinition: voiceCommandDefinition with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.SpeechRecognitionNs.SpeechRecognitionConstraintType with java.lang.String
  ] = js.native
}

