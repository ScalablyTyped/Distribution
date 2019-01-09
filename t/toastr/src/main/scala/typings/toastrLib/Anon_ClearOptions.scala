package typings
package toastrLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ClearOptions extends js.Object {
  /**
  		 * Clear all toasts
  		 */
  def apply(): scala.Unit = js.native
  /**
  		 * Clear specific toast
  		 *
  		 * @param toast Toast to clear
  		 */
  def apply(toast: jqueryLib.JQuery[stdLib.HTMLElement]): scala.Unit = js.native
  /**
  		 * Clear specific toast
  		 *
  		 * @param toast Toast to clear
  		 * @param clearOptions force clearing a toast, ignoring focus
  		 */
  def apply(toast: jqueryLib.JQuery[stdLib.HTMLElement], clearOptions: Anon_Force): scala.Unit = js.native
}

