package typings.swiper.distJsSwiperDotEsmMod

import typings.swiper.swiperMod.SwiperModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("swiper/dist/js/swiper.esm", "Lazy")
@js.native
class Lazy () extends SwiperModule {
  /**
    * Load/update lazy images based on current slider state (position)
    */
  def load(): Unit = js.native
  /**
    * Force to load lazy images in slide by specified index
    * @param number index number of slide to load lazy images in
    */
  def loadInSlide(index: Double): Unit = js.native
}

