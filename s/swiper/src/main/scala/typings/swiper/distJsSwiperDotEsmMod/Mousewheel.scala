package typings.swiper.distJsSwiperDotEsmMod

import typings.swiper.swiperMod.SwiperModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("swiper/dist/js/swiper.esm", "Mousewheel")
@js.native
class Mousewheel () extends SwiperModule {
  /**
    * Whether the mousewheel control is enabled
    */
  var enabled: Boolean = js.native
  /**
    * Disable mousewheel control
    */
  def disable(): Unit = js.native
  // Methods
  /**
    * Enable mousewheel control
    */
  def enable(): Unit = js.native
}

