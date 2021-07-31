package typings.winrtUwp.Windows.Media.SpeechRecognition

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SpeechRecognitionConfidence extends StObject
/** Specifies confidence levels that indicate how accurately a spoken phrase was matched to a phrase in an active constraint. */
@JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognitionConfidence")
@js.native
object SpeechRecognitionConfidence extends StObject {
  
  /** The confidence level is high. */
  @js.native
  sealed trait high
    extends StObject
       with SpeechRecognitionConfidence
  
  /** The confidence level is low. */
  @js.native
  sealed trait low
    extends StObject
       with SpeechRecognitionConfidence
  
  /** The confidence level is medium. */
  @js.native
  sealed trait medium
    extends StObject
       with SpeechRecognitionConfidence
  
  /** The spoken phrase was not matched to any phrase in any active grammar. */
  @js.native
  sealed trait rejected
    extends StObject
       with SpeechRecognitionConfidence
}
