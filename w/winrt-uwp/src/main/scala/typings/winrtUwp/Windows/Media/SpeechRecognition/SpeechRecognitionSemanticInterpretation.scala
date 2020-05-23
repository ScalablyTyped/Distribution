package typings.winrtUwp.Windows.Media.SpeechRecognition

import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the semantic properties of a recognized phrase in a Speech Recognition Grammar Specification (SRGS) grammar. */
trait SpeechRecognitionSemanticInterpretation extends js.Object {
  /** Gets a dictionary of the semantic properties. */
  var properties: IMapView[String, IVectorView[_]]
}

object SpeechRecognitionSemanticInterpretation {
  @scala.inline
  def apply(properties: IMapView[String, IVectorView[_]]): SpeechRecognitionSemanticInterpretation = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeechRecognitionSemanticInterpretation]
  }
}

