package typings.swiper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.swiper.swiperStrings.lazyImageLoad
  - typings.swiper.swiperStrings.lazyImageReady
*/
trait LazyLoadingEvent extends js.Object

object LazyLoadingEvent {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def lazyImageLoad: typings.swiper.swiperStrings.lazyImageLoad = this.cast("lazyImageLoad")
  @scala.inline
  def lazyImageReady: typings.swiper.swiperStrings.lazyImageReady = this.cast("lazyImageReady")
}

