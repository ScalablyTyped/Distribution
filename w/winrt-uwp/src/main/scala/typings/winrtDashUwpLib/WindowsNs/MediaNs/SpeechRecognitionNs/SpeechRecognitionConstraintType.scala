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
  
  /* 2 */ val grammar: grammar with scala.Double = js.native
  /* 1 */ val list: list with scala.Double = js.native
  /* 0 */ val topic: topic with scala.Double = js.native
  /* 3 */ val voiceCommandDefinition: voiceCommandDefinition with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.SpeechRecognitionNs.SpeechRecognitionConstraintType with scala.Double
  ] = js.native
}

