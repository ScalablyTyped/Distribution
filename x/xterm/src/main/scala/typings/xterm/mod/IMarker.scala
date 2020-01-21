package typings.xterm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMarker extends IDisposable {
  /**
    * A unique identifier for this marker.
    */
  val id: Double
  /**
    * Whether this marker is disposed.
    */
  val isDisposed: Boolean
  /**
    * The actual line index in the buffer at this point in time. This is set to
    * -1 if the marker has been disposed.
    */
  val line: Double
}

object IMarker {
  @scala.inline
  def apply(dispose: () => Unit, id: Double, isDisposed: Boolean, line: Double): IMarker = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), id = id.asInstanceOf[js.Any], isDisposed = isDisposed.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IMarker]
  }
}

