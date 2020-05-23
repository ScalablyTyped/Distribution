package typings.winrtUwp.global.Windows.Media.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Media.Core.MediaSourceStateChangedEventArgs")
@js.native
abstract class MediaSourceStateChangedEventArgs ()
  extends typings.winrtUwp.Windows.Media.Core.MediaSourceStateChangedEventArgs {
  /** Gets the new current state of the MediaSource . */
  /* CompleteClass */
  override var newState: typings.winrtUwp.Windows.Media.Core.MediaSourceState = js.native
  /** Gets the previous state of the MediaSource before the state changed. */
  /* CompleteClass */
  override var oldState: typings.winrtUwp.Windows.Media.Core.MediaSourceState = js.native
}

