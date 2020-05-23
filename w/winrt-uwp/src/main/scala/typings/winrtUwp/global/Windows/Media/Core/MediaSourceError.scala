package typings.winrtUwp.global.Windows.Media.Core

import typings.winrtUwp.Windows.WinRTError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an error that occurred with a MediaSource . */
@JSGlobal("Windows.Media.Core.MediaSourceError")
@js.native
abstract class MediaSourceError ()
  extends typings.winrtUwp.Windows.Media.Core.MediaSourceError {
  /** Gets the extended error code for the MediaSourceError . */
  /* CompleteClass */
  override var extendedError: WinRTError = js.native
}

