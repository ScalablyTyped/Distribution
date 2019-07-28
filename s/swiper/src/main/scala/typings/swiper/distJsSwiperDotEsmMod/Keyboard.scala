package typings.swiper.distJsSwiperDotEsmMod

import typings.swiper.swiperMod.SwiperModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("swiper/dist/js/swiper.esm", "Keyboard")
@js.native
class Keyboard () extends SwiperModule {
  /**
    * Whether the keyboard control is enabled
    */
  var enabled: Boolean = js.native
  /**
    * Disable keyboard control
    */
  def disable(): Unit = js.native
  // Methods
  /**
    * Enable keyboard control
    */
  def enable(): Unit = js.native
}

