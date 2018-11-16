package typings
package winrtDashUwpLib.WindowsNs.MediaNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the MediaStreamSource.Starting event. */
@JSGlobal("Windows.Media.Core.MediaStreamSourceStartingEventArgs")
@js.native
abstract class MediaStreamSourceStartingEventArgs () extends js.Object {
  /** Gets the object that represents the request to start accumulating MediaStreamSample data. */
  var request: MediaStreamSourceStartingRequest = js.native
}

