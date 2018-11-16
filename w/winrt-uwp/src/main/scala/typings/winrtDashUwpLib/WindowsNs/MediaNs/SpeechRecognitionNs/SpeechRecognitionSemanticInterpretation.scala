package typings
package winrtDashUwpLib.WindowsNs.MediaNs.SpeechRecognitionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the semantic properties of a recognized phrase in a Speech Recognition Grammar Specification (SRGS) grammar. */
@JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognitionSemanticInterpretation")
@js.native
abstract class SpeechRecognitionSemanticInterpretation () extends js.Object {
  /** Gets a dictionary of the semantic properties. */
  var properties: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[
    java.lang.String, 
    winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[_]
  ] = js.native
}

