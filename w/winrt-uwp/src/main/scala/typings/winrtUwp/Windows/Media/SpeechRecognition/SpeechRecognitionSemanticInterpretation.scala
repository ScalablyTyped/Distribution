package typings.winrtUwp.Windows.Media.SpeechRecognition

import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the semantic properties of a recognized phrase in a Speech Recognition Grammar Specification (SRGS) grammar. */
@js.native
trait SpeechRecognitionSemanticInterpretation extends StObject {
  
  /** Gets a dictionary of the semantic properties. */
  var properties: IMapView[String, IVectorView[_]] = js.native
}
object SpeechRecognitionSemanticInterpretation {
  
  @scala.inline
  def apply(properties: IMapView[String, IVectorView[_]]): SpeechRecognitionSemanticInterpretation = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeechRecognitionSemanticInterpretation]
  }
  
  @scala.inline
  implicit class SpeechRecognitionSemanticInterpretationMutableBuilder[Self <: SpeechRecognitionSemanticInterpretation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProperties(value: IMapView[String, IVectorView[_]]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
