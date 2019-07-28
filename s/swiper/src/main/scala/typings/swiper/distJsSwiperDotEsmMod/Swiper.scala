package typings.swiper.distJsSwiperDotEsmMod

import typings.swiper.swiperMod.SelectableElement
import typings.swiper.swiperMod.SwiperModule
import typings.swiper.swiperMod.SwiperOptions
import typings.swiper.swiperMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("swiper/dist/js/swiper.esm", "Swiper")
@js.native
class Swiper protected () extends default {
  /**
    * Constructs a new Swiper instance.
    *
    * @param container Where Swiper applies to.
    * @param options   Instance options.
    */
  def this(container: SelectableElement) = this()
  def this(container: SelectableElement, options: SwiperOptions) = this()
}

/* static members */
@JSImport("swiper/dist/js/swiper.esm", "Swiper")
@js.native
object Swiper extends js.Object {
  /**
    * Installs modules on Swiper in runtime.
    */
  def use(modules: js.Array[SwiperModule]): Unit = js.native
}

