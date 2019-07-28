package typings.swiper.distJsSwiperDotEsmMod

import typings.std.HTMLElement
import typings.swiper.swiperMod.DOM7Element
import typings.swiper.swiperMod.SwiperModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("swiper/dist/js/swiper.esm", "Pagination")
@js.native
class Pagination () extends SwiperModule {
  /**
    * Dom7 array-like collection of pagination bullets
    * HTML elements. To get specific slide HTMLElement
    * use `mySwiper.pagination.bullets[1]`.
    */
  var bullets: js.Array[DOM7Element] = js.native
  /**
    * HTMLElement of pagination container element
    */
  var el: HTMLElement = js.native
  /**
    * Render pagination layout
    */
  def render(): Unit = js.native
  /**
    * Update pagination state (enabled/disabled/active)
    */
  def update(): Unit = js.native
}

