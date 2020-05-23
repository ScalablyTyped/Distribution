package typings.swiper.mod

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
    loadPrevNextAmount: js.UndefOr[Double] = js.undefined,
    loadedClass: String = null,
    loadingClass: String = null,
    preloaderClass: String = null
  ): LazyOptions = {
    val __obj = js.Dynamic.literal()
    if (elementClass != null) __obj.updateDynamic("elementClass")(elementClass.asInstanceOf[js.Any])
    if (!js.isUndefined(loadOnTransitionStart)) __obj.updateDynamic("loadOnTransitionStart")(loadOnTransitionStart.get.asInstanceOf[js.Any])
    if (!js.isUndefined(loadPrevNext)) __obj.updateDynamic("loadPrevNext")(loadPrevNext.get.asInstanceOf[js.Any])
    if (!js.isUndefined(loadPrevNextAmount)) __obj.updateDynamic("loadPrevNextAmount")(loadPrevNextAmount.get.asInstanceOf[js.Any])
    if (loadedClass != null) __obj.updateDynamic("loadedClass")(loadedClass.asInstanceOf[js.Any])
    if (loadingClass != null) __obj.updateDynamic("loadingClass")(loadingClass.asInstanceOf[js.Any])
    if (preloaderClass != null) __obj.updateDynamic("preloaderClass")(preloaderClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[LazyOptions]
  }
}

