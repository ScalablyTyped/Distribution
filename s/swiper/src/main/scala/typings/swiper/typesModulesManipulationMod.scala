package typings.swiper

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesModulesManipulationMod {
  
  trait ManipulationEvents extends StObject
  
  @js.native
  trait ManipulationMethods extends StObject {
    
    def addSlide(index: Double, slides: String): Unit = js.native
    def addSlide(index: Double, slides: js.Array[HTMLElement | String]): Unit = js.native
    /**
      * Add new slides to the required index. slides could be HTMLElement or HTML string with new slide or array with such slides, for example:
      *
      * @example
      * ```js
      * addSlide(1, '<div class="swiper-slide">Slide 10"</div>')
      *
      * addSlide(1, [
      *  '<div class="swiper-slide">Slide 10"</div>',
      *  '<div class="swiper-slide">Slide 11"</div>'
      * ]);
      * ```
      */
    def addSlide(index: Double, slides: HTMLElement): Unit = js.native
    
    def appendSlide(slides: String): Unit = js.native
    def appendSlide(slides: js.Array[HTMLElement | String]): Unit = js.native
    /**
      * Add new slides to the end. slides could be
      * HTMLElement or HTML string with new slide or
      * array with such slides, for example:
      *
      * @example
      * ```js
      * appendSlide('<div class="swiper-slide">Slide 10"</div>')
      *
      * appendSlide([
      *  '<div class="swiper-slide">Slide 10"</div>',
      *  '<div class="swiper-slide">Slide 11"</div>'
      * ]);
      * ```
      */
    def appendSlide(slides: HTMLElement): Unit = js.native
    
    def prependSlide(slides: String): Unit = js.native
    def prependSlide(slides: js.Array[HTMLElement | String]): Unit = js.native
    /**
      * Add new slides to the beginning. slides could be
      * HTMLElement or HTML string with new slide or array with such slides, for example:
      *
      * @example
      * ```js
      * prependSlide('<div class="swiper-slide">Slide 0"</div>')
      *
      * prependSlide([
      *  '<div class="swiper-slide">Slide 1"</div>',
      *  '<div class="swiper-slide">Slide 2"</div>'
      * ]);
      * ```
      */
    def prependSlide(slides: HTMLElement): Unit = js.native
    
    /**
      * Remove all slides
      */
    def removeAllSlides(): Unit = js.native
    
    def removeSlide(slideIndex: js.Array[Double]): Unit = js.native
    /**
      * Remove selected slides. slideIndex could be a number with slide index to remove or array with indexes.
      *
      * @example
      * ```js
      * removeSlide(0); // remove first slide
      * removeSlide([0, 1]); // remove first and second slides
      * removeAllSlides();    // Remove all slides
      * ```
      */
    def removeSlide(slideIndex: Double): Unit = js.native
  }
  
  trait ManipulationOptions extends StObject
}
