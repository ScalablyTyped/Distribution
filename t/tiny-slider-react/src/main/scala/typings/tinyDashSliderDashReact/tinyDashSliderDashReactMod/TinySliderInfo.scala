package typings.tinyDashSliderDashReact.tinyDashSliderDashReactMod

import typings.std.HTMLCollection
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TinySliderInfo extends js.Object {
  var cloneCount: Double
  var container: HTMLElement
  var controlsContainer: js.UndefOr[Boolean] = js.undefined
  var hasControls: Boolean
  var index: Double
  var indexCached: Double
  var items: Double
  var navContainer: js.UndefOr[HTMLElement] = js.undefined
  var navCurrentIndex: js.UndefOr[Double] = js.undefined
  var navCurrentIndexCached: js.UndefOr[Double] = js.undefined
  var navItems: js.UndefOr[HTMLCollection] = js.undefined
  var nextButton: js.UndefOr[HTMLElement] = js.undefined
  var prevButton: js.UndefOr[HTMLElement] = js.undefined
  var slideBy: Double
  var slideCount: Double
  var slideCountNew: Double
  var slideItems: HTMLCollection
  var visibleNavIndexes: js.UndefOr[Double] = js.undefined
  var visibleNavIndexesCached: js.UndefOr[Double] = js.undefined
}

object TinySliderInfo {
  @scala.inline
  def apply(
    cloneCount: Double,
    container: HTMLElement,
    hasControls: Boolean,
    index: Double,
    indexCached: Double,
    items: Double,
    slideBy: Double,
    slideCount: Double,
    slideCountNew: Double,
    slideItems: HTMLCollection,
    controlsContainer: js.UndefOr[Boolean] = js.undefined,
    navContainer: HTMLElement = null,
    navCurrentIndex: Int | Double = null,
    navCurrentIndexCached: Int | Double = null,
    navItems: HTMLCollection = null,
    nextButton: HTMLElement = null,
    prevButton: HTMLElement = null,
    visibleNavIndexes: Int | Double = null,
    visibleNavIndexesCached: Int | Double = null
  ): TinySliderInfo = {
    val __obj = js.Dynamic.literal(cloneCount = cloneCount.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], hasControls = hasControls.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], indexCached = indexCached.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], slideBy = slideBy.asInstanceOf[js.Any], slideCount = slideCount.asInstanceOf[js.Any], slideCountNew = slideCountNew.asInstanceOf[js.Any], slideItems = slideItems.asInstanceOf[js.Any])
    if (!js.isUndefined(controlsContainer)) __obj.updateDynamic("controlsContainer")(controlsContainer.asInstanceOf[js.Any])
    if (navContainer != null) __obj.updateDynamic("navContainer")(navContainer.asInstanceOf[js.Any])
    if (navCurrentIndex != null) __obj.updateDynamic("navCurrentIndex")(navCurrentIndex.asInstanceOf[js.Any])
    if (navCurrentIndexCached != null) __obj.updateDynamic("navCurrentIndexCached")(navCurrentIndexCached.asInstanceOf[js.Any])
    if (navItems != null) __obj.updateDynamic("navItems")(navItems.asInstanceOf[js.Any])
    if (nextButton != null) __obj.updateDynamic("nextButton")(nextButton.asInstanceOf[js.Any])
    if (prevButton != null) __obj.updateDynamic("prevButton")(prevButton.asInstanceOf[js.Any])
    if (visibleNavIndexes != null) __obj.updateDynamic("visibleNavIndexes")(visibleNavIndexes.asInstanceOf[js.Any])
    if (visibleNavIndexesCached != null) __obj.updateDynamic("visibleNavIndexesCached")(visibleNavIndexesCached.asInstanceOf[js.Any])
    __obj.asInstanceOf[TinySliderInfo]
  }
}

