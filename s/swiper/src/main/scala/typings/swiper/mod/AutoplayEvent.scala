package typings.swiper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.swiper.swiperStrings.autoplayStart
  - typings.swiper.swiperStrings.autoplayStop
  - typings.swiper.swiperStrings.autoplay
*/
trait AutoplayEvent extends js.Object

object AutoplayEvent {
  @scala.inline
  def autoplay: typings.swiper.swiperStrings.autoplay = this.cast("autoplay")
  @scala.inline
  def autoplayStart: typings.swiper.swiperStrings.autoplayStart = this.cast("autoplayStart")
  @scala.inline
  def autoplayStop: typings.swiper.swiperStrings.autoplayStop = this.cast("autoplayStop")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

