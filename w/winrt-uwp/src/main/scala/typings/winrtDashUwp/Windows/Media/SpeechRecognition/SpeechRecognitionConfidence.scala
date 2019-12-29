package typings.winrtDashUwp.Windows.Media.SpeechRecognition

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SpeechRecognitionConfidence extends js.Object

/** Specifies confidence levels that indicate how accurately a spoken phrase was matched to a phrase in an active constraint. */
@JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognitionConfidence")
@js.native
object SpeechRecognitionConfidence extends js.Object {
  /** The confidence level is high. */
  @js.native
  sealed trait high extends SpeechRecognitionConfidence
  
  /** The confidence level is low. */
  @js.native
  sealed trait low extends SpeechRecognitionConfidence
  
  /** The confidence level is medium. */
  @js.native
  sealed trait medium extends SpeechRecognitionConfidence
  
  /** The spoken phrase was not matched to any phrase in any active grammar. */
  @js.native
  sealed trait rejected extends SpeechRecognitionConfidence
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SpeechRecognitionConfidence with Double] = js.native
  /* 0 */ @js.native
  object high extends TopLevel[high with Double]
  
  /* 2 */ @js.native
  object low extends TopLevel[low with Double]
  
  /* 1 */ @js.native
  object medium extends TopLevel[medium with Double]
  
  /* 3 */ @js.native
  object rejected extends TopLevel[rejected with Double]
  
}

