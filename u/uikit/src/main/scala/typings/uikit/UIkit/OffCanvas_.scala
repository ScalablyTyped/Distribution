package typings.uikit.UIkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Create a smooth off-canvas sidebar that slides in and out of the page
  * Documentation: {@link http://getuikit.org/docs/offcanvas.html}
  * <h2>Events:</h2>
  * <table class="uk-table uk-table-striped uk-text-nowrap">
  * <tr>
  * <th>Name</th>
  * <th>Parameter</th>
  * <th>Description</th>
  * </tr>
  * <tr>
  * <td><code>show.uk.offcanvas</code></td>
  * <td>event, panel, bar</td>
  * <td>On offcanvas show</td>
  * </tr>
  * <tr>
  * <td><code>hide.uk.offcanvas</code></td>
  * <td>event, panel, bar</td>
  * <td>On offcanvas hide</td>
  * </tr>
  * </table>
  */
@js.native
trait OffCanvas_ extends js.Object {
  /**
    * Hide any active offcanvas. Set force to true, if you don't want any
    * animation
    * @param  force When seted to true do not run animations.
    * @default false
    */
  def hide(): Unit = js.native
  def hide(force: Boolean): Unit = js.native
  /**
    * Show an off-canvas matching the passed CSS selector
    * @param  selector A CSS selector
    */
  def show(selector: String): Unit = js.native
}

