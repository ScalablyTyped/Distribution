package typings
package swiperLib.distJsSwiperDotEsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("swiper/dist/js/swiper.esm", "Pagination")
@js.native
class Pagination ()
  extends swiperLib.swiperMod.SwiperModule {
  /**
    * Dom7 array-like collection of pagination bullets
    * HTML elements. To get specific slide HTMLElement
    * use `mySwiper.pagination.bullets[1]`.
    */
  var bullets: js.Array[swiperLib.swiperMod.DOM7Element] = js.native
  /**
    * HTMLElement of pagination container element
    */
  var el: stdLib.HTMLElement = js.native
  /**
    * Render pagination layout
    */
  def render(): scala.Unit = js.native
  /**
    * Update pagination state (enabled/disabled/active)
    */
  def update(): scala.Unit = js.native
}

