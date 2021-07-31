package typings.winrtUwp.Windows.Media.SpeechRecognition

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SpeechRecognitionConstraintProbability extends StObject
/** Specifies the weighted value of a constraint for speech recognition. */
@JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognitionConstraintProbability")
@js.native
object SpeechRecognitionConstraintProbability extends StObject {
  
  /** The constraint has a low weighted value. */
  @js.native
  sealed trait default
    extends StObject
       with SpeechRecognitionConstraintProbability
  
  /** The constraint has a high weighted value. */
  @js.native
  sealed trait max
    extends StObject
       with SpeechRecognitionConstraintProbability
  
  /** The constraint has a medium weighted value. */
  @js.native
  sealed trait min
    extends StObject
       with SpeechRecognitionConstraintProbability
}
