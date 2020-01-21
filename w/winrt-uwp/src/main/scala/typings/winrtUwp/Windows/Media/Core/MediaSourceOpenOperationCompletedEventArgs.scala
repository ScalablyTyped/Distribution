package typings.winrtUwp.Windows.Media.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the MediaSource::MediaSourceOpenOperationCompleted event. */
@JSGlobal("Windows.Media.Core.MediaSourceOpenOperationCompletedEventArgs")
@js.native
abstract class MediaSourceOpenOperationCompletedEventArgs () extends js.Object {
  /** Represents the error that occurred while asynchronously opening the MediaSource . */
  var error: MediaSourceError = js.native
}

