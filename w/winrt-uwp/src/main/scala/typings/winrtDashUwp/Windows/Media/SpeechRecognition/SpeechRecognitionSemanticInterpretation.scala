package typings.winrtDashUwp.Windows.Media.SpeechRecognition

import typings.winrtDashUwp.Windows.Foundation.Collections.IMapView
import typings.winrtDashUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the semantic properties of a recognized phrase in a Speech Recognition Grammar Specification (SRGS) grammar. */
@JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognitionSemanticInterpretation")
@js.native
abstract class SpeechRecognitionSemanticInterpretation () extends js.Object {
  /** Gets a dictionary of the semantic properties. */
  var properties: IMapView[String, IVectorView[_]] = js.native
}

