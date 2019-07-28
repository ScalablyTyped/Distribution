package typings.winrtDashUwp.WindowsNs.MediaNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.ValueSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides a media processing background task access to the set of arguments supplied in the call to MediaProcessingTrigger::RequestAsync . */
@JSGlobal("Windows.Media.MediaProcessingTriggerDetails")
@js.native
abstract class MediaProcessingTriggerDetails () extends js.Object {
  /** Gets a value set containing the arguments supplied in the call to MediaProcessingTrigger::RequestAsync . */
  var arguments: ValueSet = js.native
}

