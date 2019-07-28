package typings.swiper.distJsSwiperDotEsmMod

import typings.swiper.swiperMod.SwiperModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("swiper/dist/js/swiper.esm", "Zoom")
@js.native
class Zoom () extends SwiperModule {
  /**
    * Whether the zoom module is enabled
    */
  var enabled: Boolean = js.native
  /**
    * Current image scale ratio
    */
  var scale: Double = js.native
  /**
    * Disable zoom module
    */
  def disable(): Unit = js.native
  /**
    * Enable zoom module
    */
  def enable(): Unit = js.native
  /**
    * Zoom in image of the currently active slide
    */
  def in(): Unit = js.native
  /**
    * Zoom out image of the currently active slide
    */
  def out(): Unit = js.native
  /**
    * Toggle image zoom of the currently active slide
    */
  def toggle(): Unit = js.native
}

