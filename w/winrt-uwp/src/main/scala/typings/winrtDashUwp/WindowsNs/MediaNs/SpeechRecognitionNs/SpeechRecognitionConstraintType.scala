package typings.winrtDashUwp.WindowsNs.MediaNs.SpeechRecognitionNs

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
  sealed trait grammar extends SpeechRecognitionConstraintType
  
  /** A constraint based on a list of words or phrases. See SpeechRecognitionListConstraint . */
  @js.native
  sealed trait list extends SpeechRecognitionConstraintType
  
  /** A constraint based on a dictation topic. See SpeechRecognitionTopicConstraint . */
  @js.native
  sealed trait topic extends SpeechRecognitionConstraintType
  
  /** A constraint based on a VCD file. See SpeechRecognitionVoiceCommandDefinitionConstraint . */
  @js.native
  sealed trait voiceCommandDefinition extends SpeechRecognitionConstraintType
  
  /* 2 */ val grammar: typings.winrtDashUwp.WindowsNs.MediaNs.SpeechRecognitionNs.SpeechRecognitionConstraintType.grammar with Double = js.native
  /* 1 */ val list: typings.winrtDashUwp.WindowsNs.MediaNs.SpeechRecognitionNs.SpeechRecognitionConstraintType.list with Double = js.native
  /* 0 */ val topic: typings.winrtDashUwp.WindowsNs.MediaNs.SpeechRecognitionNs.SpeechRecognitionConstraintType.topic with Double = js.native
  /* 3 */ val voiceCommandDefinition: typings.winrtDashUwp.WindowsNs.MediaNs.SpeechRecognitionNs.SpeechRecognitionConstraintType.voiceCommandDefinition with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SpeechRecognitionConstraintType with Double] = js.native
}

