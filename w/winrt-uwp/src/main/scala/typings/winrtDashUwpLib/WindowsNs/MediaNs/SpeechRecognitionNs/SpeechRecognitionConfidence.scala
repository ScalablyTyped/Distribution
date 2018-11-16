package typings
package winrtDashUwpLib.WindowsNs.MediaNs.SpeechRecognitionNs

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
  sealed trait high
    extends winrtDashUwpLib.WindowsNs.MediaNs.SpeechRecognitionNs.SpeechRecognitionConfidence
  
  /** The confidence level is low. */
  @js.native
  sealed trait low
    extends winrtDashUwpLib.WindowsNs.MediaNs.SpeechRecognitionNs.SpeechRecognitionConfidence
  
  /** The confidence level is medium. */
  @js.native
  sealed trait medium
    extends winrtDashUwpLib.WindowsNs.MediaNs.SpeechRecognitionNs.SpeechRecognitionConfidence
  
  /** The spoken phrase was not matched to any phrase in any active grammar. */
  @js.native
  sealed trait rejected
    extends winrtDashUwpLib.WindowsNs.MediaNs.SpeechRecognitionNs.SpeechRecognitionConfidence
  
  val high: high with java.lang.String = js.native
  val low: low with java.lang.String = js.native
  val medium: medium with java.lang.String = js.native
  val rejected: rejected with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.SpeechRecognitionNs.SpeechRecognitionConfidence with java.lang.String
  ] = js.native
}

