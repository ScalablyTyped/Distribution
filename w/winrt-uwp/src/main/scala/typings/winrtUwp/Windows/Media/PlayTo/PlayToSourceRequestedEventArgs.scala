package typings.winrtUwp.Windows.Media.PlayTo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about the SourceRequested event. */
trait PlayToSourceRequestedEventArgs extends js.Object {
  /** Gets the media object to connect to a Play To target. */
  var sourceRequest: PlayToSourceRequest
}

object PlayToSourceRequestedEventArgs {
  @scala.inline
  def apply(sourceRequest: PlayToSourceRequest): PlayToSourceRequestedEventArgs = {
    val __obj = js.Dynamic.literal(sourceRequest = sourceRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayToSourceRequestedEventArgs]
  }
}

