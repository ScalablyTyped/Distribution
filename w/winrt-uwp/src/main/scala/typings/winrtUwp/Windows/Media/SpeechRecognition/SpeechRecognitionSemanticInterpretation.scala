package typings.winrtUwp.Windows.Media.SpeechRecognition

import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the semantic properties of a recognized phrase in a Speech Recognition Grammar Specification (SRGS) grammar. */
trait SpeechRecognitionSemanticInterpretation extends StObject {
  
  /** Gets a dictionary of the semantic properties. */
  var properties: IMapView[String, IVectorView[Any]]
}
object SpeechRecognitionSemanticInterpretation {
  
  inline def apply(properties: IMapView[String, IVectorView[Any]]): SpeechRecognitionSemanticInterpretation = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeechRecognitionSemanticInterpretation]
  }
  
  extension [Self <: SpeechRecognitionSemanticInterpretation](x: Self) {
    
    inline def setProperties(value: IMapView[String, IVectorView[Any]]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
