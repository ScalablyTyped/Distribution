package typings
package uikitLib.UIkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Create a fancy lightbox for images and videos utilizing the @see {@link modal|Modal Component}
  * Documentation {@link http://getuikit.org/docs/lightbox.html}
  * <h2>Events:</h2>
  * <table>
  * <tr>
  * <th>Name</th>
  * <th>Parameter</th>
  * <th>Description</th>
  * </tr>
  * <tr>
  * <td><code>showitem.uk.lightbox</code></td>
  * <td>event, data</td>
  * <td>On lightbox show</td>
  * </tr>
  * </table>
  */
@js.native
trait LightBox extends js.Object {
  /**
    * Init element manually
    */
  def apply(element: java.lang.String): LightBoxElement = js.native
  def apply(element: java.lang.String, options: LightBoxOptions): LightBoxElement = js.native
  def apply(element: jqueryLib.JQuery[stdLib.HTMLElement]): LightBoxElement = js.native
  def apply(element: jqueryLib.JQuery[stdLib.HTMLElement], options: LightBoxOptions): LightBoxElement = js.native
  /**
    * Create dynamic lightbox
    * @param  items Group of items on the lightbox
    * @return           The lightbox element to show
    */
  def create(items: js.Array[LightBoxItem]): LightBoxElement = js.native
}

