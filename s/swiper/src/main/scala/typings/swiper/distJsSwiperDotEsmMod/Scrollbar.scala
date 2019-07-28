package typings.swiper.distJsSwiperDotEsmMod

import typings.std.HTMLElement
import typings.swiper.swiperMod.SwiperModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("swiper/dist/js/swiper.esm", "Scrollbar")
@js.native
class Scrollbar () extends SwiperModule {
  /**
    * HTMLElement of Scrollbar draggable handler element
    */
  var dragEl: HTMLElement = js.native
  // Properties
  /**
    * HTMLElement of Scrollbar container element
    */
  var el: HTMLElement = js.native
  // Methods
  /**
    * Updates scrollbar track and handler sizes
    */
  def updateSize(): Unit = js.native
}

