package typings.toastr

import typings.jquery.JQuery
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_ClearOptions extends js.Object {
  /**
  		 * Clear specific toast
  		 *
  		 * @param toast Toast to clear
  		 * @param clearOptions force clearing a toast, ignoring focus
  		 */
  def apply(): Unit = js.native
  def apply(toast: JQuery[HTMLElement]): Unit = js.native
  def apply(toast: JQuery[HTMLElement], clearOptions: Anon_Force): Unit = js.native
}

