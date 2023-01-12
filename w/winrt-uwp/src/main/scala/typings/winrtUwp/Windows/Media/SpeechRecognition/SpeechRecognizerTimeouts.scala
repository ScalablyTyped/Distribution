package typings.winrtUwp.Windows.Media.SpeechRecognition

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The timespan that a speech recognizer ignores silence or unrecognizable sounds (babble) and continues listening for speech input. */
trait SpeechRecognizerTimeouts extends StObject {
  
  /** Gets and sets the length of time that a SpeechRecognizer continues to listen while receiving unrecognizable sounds (babble) before it assumes speech input has ended and finalizes the recognition operation. */
  var babbleTimeout: Double
  
  /** Gets and sets the length of time, after recognition results have been generated, that a SpeechRecognizer detects silence and assumes speech input has ended. */
  var endSilenceTimeout: Double
  
  /** Gets and sets the length of time, before any recognition results have been generated, that a SpeechRecognizer detects silence and assumes speech input has ended. */
  var initialSilenceTimeout: Double
}
object SpeechRecognizerTimeouts {
  
  inline def apply(babbleTimeout: Double, endSilenceTimeout: Double, initialSilenceTimeout: Double): SpeechRecognizerTimeouts = {
    val __obj = js.Dynamic.literal(babbleTimeout = babbleTimeout.asInstanceOf[js.Any], endSilenceTimeout = endSilenceTimeout.asInstanceOf[js.Any], initialSilenceTimeout = initialSilenceTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeechRecognizerTimeouts]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpeechRecognizerTimeouts] (val x: Self) extends AnyVal {
    
    inline def setBabbleTimeout(value: Double): Self = StObject.set(x, "babbleTimeout", value.asInstanceOf[js.Any])
    
    inline def setEndSilenceTimeout(value: Double): Self = StObject.set(x, "endSilenceTimeout", value.asInstanceOf[js.Any])
    
    inline def setInitialSilenceTimeout(value: Double): Self = StObject.set(x, "initialSilenceTimeout", value.asInstanceOf[js.Any])
  }
}
