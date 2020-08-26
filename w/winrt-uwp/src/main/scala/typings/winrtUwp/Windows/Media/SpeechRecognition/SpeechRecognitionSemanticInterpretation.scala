package typings.winrtUwp.Windows.Media.SpeechRecognition

import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the semantic properties of a recognized phrase in a Speech Recognition Grammar Specification (SRGS) grammar. */
@js.native
trait SpeechRecognitionSemanticInterpretation extends js.Object {
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
  implicit class SpeechRecognitionSemanticInterpretationOps[Self <: SpeechRecognitionSemanticInterpretation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setProperties(value: IMapView[String, IVectorView[_]]): Self = this.set("properties", value.asInstanceOf[js.Any])
  }
  
}

