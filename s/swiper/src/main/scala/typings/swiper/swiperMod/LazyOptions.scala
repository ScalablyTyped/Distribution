package typings.swiper.swiperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LazyOptions extends js.Object {
  var elementClass: js.UndefOr[String] = js.undefined
  var loadOnTransitionStart: js.UndefOr[Boolean] = js.undefined
  var loadPrevNext: js.UndefOr[Boolean] = js.undefined
  var loadPrevNextAmount: js.UndefOr[Double] = js.undefined
  var loadedClass: js.UndefOr[String] = js.undefined
  var loadingClass: js.UndefOr[String] = js.undefined
  var preloaderClass: js.UndefOr[String] = js.undefined
}

object LazyOptions {
  @scala.inline
  def apply(
    elementClass: String = null,
    loadOnTransitionStart: js.UndefOr[Boolean] = js.undefined,
    loadPrevNext: js.UndefOr[Boolean] = js.undefined,
    loadPrevNextAmount: Int | Double = null,
    loadedClass: String = null,
    loadingClass: String = null,
    preloaderClass: String = null
  ): LazyOptions = {
    val __obj = js.Dynamic.literal()
    if (elementClass != null) __obj.updateDynamic("elementClass")(elementClass)
    if (!js.isUndefined(loadOnTransitionStart)) __obj.updateDynamic("loadOnTransitionStart")(loadOnTransitionStart)
    if (!js.isUndefined(loadPrevNext)) __obj.updateDynamic("loadPrevNext")(loadPrevNext)
    if (loadPrevNextAmount != null) __obj.updateDynamic("loadPrevNextAmount")(loadPrevNextAmount.asInstanceOf[js.Any])
    if (loadedClass != null) __obj.updateDynamic("loadedClass")(loadedClass)
    if (loadingClass != null) __obj.updateDynamic("loadingClass")(loadingClass)
    if (preloaderClass != null) __obj.updateDynamic("preloaderClass")(preloaderClass)
    __obj.asInstanceOf[LazyOptions]
  }
}

