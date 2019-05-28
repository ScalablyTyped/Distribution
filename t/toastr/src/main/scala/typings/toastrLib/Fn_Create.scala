package typings
package toastrLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Create extends js.Object {
  /**
  		 * Get the container by options.containerId.
  		 *
  		 * @param options Option values for the container
  		 */
  def apply(): jqueryLib.JQuery[stdLib.HTMLElement] = js.native
  def apply(options: ToastrOptions): jqueryLib.JQuery[stdLib.HTMLElement] = js.native
  /**
  		 * Get the container by options.containerId.
  		 * If it doesn't exist, it will be created according to options.
  		 *
  		 * @param options Option values for the container
  		 * @param create Use true to create a container, if it doesn't exist
  		 */
  def apply(options: ToastrOptions, create: scala.Boolean): jqueryLib.JQuery[stdLib.HTMLElement] = js.native
}

