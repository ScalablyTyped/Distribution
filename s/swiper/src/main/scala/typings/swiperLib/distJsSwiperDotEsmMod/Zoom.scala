package typings
package swiperLib.distJsSwiperDotEsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("swiper/dist/js/swiper.esm", "Zoom")
@js.native
class Zoom () extends js.Object {
  /**
    * Whether the zoom module is enabled
    */
  var enabled: scala.Boolean = js.native
  /**
    * Current image scale ratio
    */
  var scale: scala.Double = js.native
  /**
    * Disable zoom module
    */
  def disable(): scala.Unit = js.native
  /**
    * Enable zoom module
    */
  def enable(): scala.Unit = js.native
  /**
    * Zoom in image of the currently active slide
    */
  def in(): scala.Unit = js.native
  /**
    * Zoom out image of the currently active slide
    */
  def out(): scala.Unit = js.native
  /**
    * Toggle image zoom of the currently active slide
    */
  def toggle(): scala.Unit = js.native
}

