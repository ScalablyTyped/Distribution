package typings.winrtUwp.Windows.Media.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the MediaStreamSource.Closed event. */
@JSGlobal("Windows.Media.Core.MediaStreamSourceClosedEventArgs")
@js.native
abstract class MediaStreamSourceClosedEventArgs () extends js.Object {
  /** Gets the object that represents the notification that the MediaStreamSource has been closed. */
  var request: MediaStreamSourceClosedRequest = js.native
}

