package typings.videoJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Call extends js.Object {
  /**
    * Returns an array containing everything that has been logged to the history.
    *
    * This array is a shallow clone of the internal history record. However, its
    * contents are _not_ cloned; so, mutating objects inside this array will
    * mutate them in history.
    *
    * @return
    */
  def apply(): js.Array[_] = js.native
  /**
    * Clears the internal history tracking, but does not prevent further history
    * tracking.
    */
  def clear(): Unit = js.native
  /**
    * Disable history tracking if it is currently enabled.
    */
  def disable(): Unit = js.native
  /**
    * Enable history tracking if it is currently disabled.
    */
  def enable(): Unit = js.native
}

