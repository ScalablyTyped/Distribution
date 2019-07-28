package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.VoiceCommandsNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IMapView
import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import typings.winrtDashUwp.WindowsNs.MediaNs.SpeechRecognitionNs.SpeechRecognitionResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The command given to Cortana, using either speech or text, and routed to a background app. */
@JSGlobal("Windows.ApplicationModel.VoiceCommands.VoiceCommand")
@js.native
abstract class VoiceCommand () extends js.Object {
  /** Gets the value of the Name attribute for the Command element declared in the Voice Command Definition (VCD) file. */
  var commandName: String = js.native
  /** Gets a dictionary containing the semantic properties of the recognized phrase in the voice command. */
  var properties: IMapView[String, IVectorView[_]] = js.native
  /** Gets the SpeechRecognitionResult object representing the results returned by the voice command. */
  var speechRecognitionResult: SpeechRecognitionResult = js.native
}

