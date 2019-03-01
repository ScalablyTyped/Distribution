package typings
package swiperLib.distJsSwiperDotEsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("swiper/dist/js/swiper.esm", "Navigation")
@js.native
class Navigation ()
  extends swiperLib.swiperMod.SwiperModule {
  /**
    * HTMLElement of "next" navigation button
    */
  var nextEl: stdLib.HTMLElement = js.native
  /**
    * HTMLElement of "previous" navigation button
    */
  var prevEl: stdLib.HTMLElement = js.native
  /**
    * Update navigation buttons state (enabled/disabled)
    */
  def update(): scala.Unit = js.native
}

