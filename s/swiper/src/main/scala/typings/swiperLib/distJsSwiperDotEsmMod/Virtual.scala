package typings
package swiperLib.distJsSwiperDotEsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("swiper/dist/js/swiper.esm", "Virtual")
@js.native
class Virtual ()
  extends swiperLib.swiperMod.SwiperModule {
  /**
    * Object with cached slides HTML elements
    */
  var cache: js.Object = js.native
  /**
    * Index of first rendered slide
    */
  var from: scala.Double = js.native
  /**
    * Array with slide items passed by virtual.slides parameter
    */
  var slides: js.Array[_] = js.native
  /**
    * Index of last rendered slide
    */
  var to: scala.Double = js.native
  def appendSlide(slide: java.lang.String): scala.Unit = js.native
  /*
    * Methods
    */
  /**
    * Add new slides to the end. slides could be HTMLElement or HTML string with new slide or array
    * with such slides, for example:
    *
    * @example
    * mySwiper.appendSlide('<div class="swiper-slide">Slide 10"</div>')
    * mySwiper.appendSlide([
    *   '<div class="swiper-slide">Slide 10"</div>',
    *   '<div class="swiper-slide">Slide 11"</div>'
    * ]);
    */
  def appendSlide(slide: stdLib.HTMLElement): scala.Unit = js.native
  def prependSlide(slide: java.lang.String): scala.Unit = js.native
  /**
    * Add new slides to the beginning. slides could be HTMLElement or HTML string with new slide or
    * array with such slides, for example:
    *
    * @example
    * mySwiper.prependSlide('<div class="swiper-slide">Slide 0"</div>')
    * mySwiper.prependSlide([
    * '<div class="swiper-slide">Slide 1"</div>',
    * '<div class="swiper-slide">Slide 2"</div>'
    * ]);
    */
  def prependSlide(slide: stdLib.HTMLElement): scala.Unit = js.native
  /**
    * Update virutal slides state
    */
  def update(): scala.Unit = js.native
}

