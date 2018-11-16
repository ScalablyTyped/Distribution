package typings
package winrtDashUwpLib.WindowsNs.MediaNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Media.Core.MediaSourceStateChangedEventArgs")
@js.native
abstract class MediaSourceStateChangedEventArgs () extends js.Object {
  /** Gets the new current state of the MediaSource . */
  var newState: MediaSourceState = js.native
  /** Gets the previous state of the MediaSource before the state changed. */
  var oldState: MediaSourceState = js.native
}

