package typings.winrtDashUwp.Windows.Media.PlayTo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about the SourceRequested event. */
@JSGlobal("Windows.Media.PlayTo.PlayToSourceRequestedEventArgs")
@js.native
abstract class PlayToSourceRequestedEventArgs () extends js.Object {
  /** Gets the media object to connect to a Play To target. */
  var sourceRequest: PlayToSourceRequest = js.native
}

