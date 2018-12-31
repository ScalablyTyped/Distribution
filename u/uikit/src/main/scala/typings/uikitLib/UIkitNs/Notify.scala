package typings
package uikitLib.UIkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Create toggleable notifications that fade out automatically
  * Documentation {@link http://getuikit.org/docs/notify.html}
  */
@js.native
trait Notify extends js.Object {
  /**
    * Show a notification
    * @param message The html message
    * @param [status] The status or options
    */
  def apply(message: java.lang.String): js.Any = js.native
  def apply(message: java.lang.String, status: java.lang.String): js.Any = js.native
  def apply(message: java.lang.String, status: NotifyOptions): js.Any = js.native
  /**
    * Show a notification
    * @param options Options
    */
  def apply(options: NotifyOptions): js.Any = js.native
}

