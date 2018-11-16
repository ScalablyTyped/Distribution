package typings
package toastrLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToastrDisplayMethod extends js.Object {
  /**
  	 * Create a toast
  	 *
  	 * @param message Message to display in toast
  	 */
  def apply(message: java.lang.String): jqueryLib.JQuery[stdLib.HTMLElement] = js.native
  /**
  	 * Create a toast
  	 *
  	 * @param message Message to display in toast
  	 * @param title Title to display on toast
  	 */
  def apply(message: java.lang.String, title: java.lang.String): jqueryLib.JQuery[stdLib.HTMLElement] = js.native
  /**
  	 * Create a toast
  	 *
  	 * @param message Message to display in toast
  	 * @param title Title to display on toast
  	 * @param overrides Option values for toast
  	 */
  def apply(message: java.lang.String, title: java.lang.String, overrides: ToastrOptions): jqueryLib.JQuery[stdLib.HTMLElement] = js.native
}

