package typings
package swiperLib.distJsSwiperDotEsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("swiper/dist/js/swiper.esm", "Swiper")
@js.native
class Swiper protected ()
  extends swiperLib.swiperMod.default {
  /**
    * Constructs a new Swiper instance.
    *
    * @param container Where Swiper applies to.
    * @param options   Instance options.
    */
  def this(container: swiperLib.swiperMod.SelectableElement) = this()
  def this(container: swiperLib.swiperMod.SelectableElement, options: swiperLib.swiperMod.SwiperOptions) = this()
}

@JSImport("swiper/dist/js/swiper.esm", "Swiper")
@js.native
object Swiper extends js.Object {
  /**
    * Installs modules on Swiper in runtime.
    */
  def use(modules: js.Array[swiperLib.swiperMod.SwiperModule]): scala.Unit = js.native
}

