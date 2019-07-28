package typings.swiper.distJsSwiperDotEsmMod

import typings.std.HTMLElement
import typings.swiper.swiperMod.SwiperModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("swiper/dist/js/swiper.esm", "Navigation")
@js.native
class Navigation () extends SwiperModule {
  /**
    * HTMLElement of "next" navigation button
    */
  var nextEl: HTMLElement = js.native
  /**
    * HTMLElement of "previous" navigation button
    */
  var prevEl: HTMLElement = js.native
  /**
    * Update navigation buttons state (enabled/disabled)
    */
  def update(): Unit = js.native
}

