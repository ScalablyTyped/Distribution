package typings.swiper.distJsSwiperDotEsmMod

import typings.std.HTMLElement
import typings.swiper.swiperMod.SwiperModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("swiper/dist/js/swiper.esm", "Virtual")
@js.native
class Virtual () extends SwiperModule {
  /**
    * Object with cached slides HTML elements
    */
  var cache: js.Object = js.native
  /**
    * Index of first rendered slide
    */
  var from: Double = js.native
  /**
    * Array with slide items passed by virtual.slides parameter
    */
  var slides: js.Array[_] = js.native
  /**
    * Index of last rendered slide
    */
  var to: Double = js.native
  def appendSlide(slide: String): Unit = js.native
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
  def appendSlide(slide: HTMLElement): Unit = js.native
  def prependSlide(slide: String): Unit = js.native
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
  def prependSlide(slide: HTMLElement): Unit = js.native
  /**
    * Update virutal slides state
    */
  def update(): Unit = js.native
}

