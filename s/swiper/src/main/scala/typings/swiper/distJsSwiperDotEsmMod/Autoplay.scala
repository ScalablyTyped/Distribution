package typings.swiper.distJsSwiperDotEsmMod

import typings.swiper.swiperMod.SwiperModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("swiper/dist/js/swiper.esm", "Autoplay")
@js.native
class Autoplay () extends SwiperModule {
  // Properties
  /**
    * Whether autoplay enabled and running
    */
  var running: Boolean = js.native
  // Methods
  /**
    * Start autoplay
    */
  def start(): Boolean = js.native
  /**
    * Stop autoplay
    */
  def stop(): Boolean = js.native
}

