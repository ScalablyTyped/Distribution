package typings.winrtUwp.Windows.System.Display

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a display request. */
trait DisplayRequest extends js.Object {
  /** Activates a display request. */
  def requestActive(): Unit
  /** Deactivates a display request. */
  def requestRelease(): Unit
}

object DisplayRequest {
  @scala.inline
  def apply(requestActive: () => Unit, requestRelease: () => Unit): DisplayRequest = {
    val __obj = js.Dynamic.literal(requestActive = js.Any.fromFunction0(requestActive), requestRelease = js.Any.fromFunction0(requestRelease))
    __obj.asInstanceOf[DisplayRequest]
  }
}

