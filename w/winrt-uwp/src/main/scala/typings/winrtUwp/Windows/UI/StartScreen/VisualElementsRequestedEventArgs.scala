package typings.winrtUwp.Windows.UI.StartScreen

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Passed to the SecondaryTile.VisualElementsRequested event handler to provide the visual elements details. */
@JSGlobal("Windows.UI.StartScreen.VisualElementsRequestedEventArgs")
@js.native
abstract class VisualElementsRequestedEventArgs () extends js.Object {
  /** Gets the VisualElementsRequest object for the event. */
  var request: VisualElementsRequest = js.native
}

