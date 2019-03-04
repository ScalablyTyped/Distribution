package typings
package tinyDashSliderDashReactLib.tinyDashSliderDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TinySliderInfo extends js.Object {
  var cloneCount: scala.Double
  var container: reactLib.HTMLElement
  var controlsContainer: js.UndefOr[scala.Boolean] = js.undefined
  var hasControls: scala.Boolean
  var index: scala.Double
  var indexCached: scala.Double
  var items: scala.Double
  var navContainer: js.UndefOr[reactLib.HTMLElement] = js.undefined
  var navCurrentIndex: js.UndefOr[scala.Double] = js.undefined
  var navCurrentIndexCached: js.UndefOr[scala.Double] = js.undefined
  var navItems: js.UndefOr[stdLib.HTMLCollection] = js.undefined
  var nextButton: js.UndefOr[reactLib.HTMLElement] = js.undefined
  var prevButton: js.UndefOr[reactLib.HTMLElement] = js.undefined
  var slideBy: scala.Double
  var slideCount: scala.Double
  var slideCountNew: scala.Double
  var slideItems: stdLib.HTMLCollection
  var visibleNavIndexes: js.UndefOr[scala.Double] = js.undefined
  var visibleNavIndexesCached: js.UndefOr[scala.Double] = js.undefined
}

object TinySliderInfo {
  @scala.inline
  def apply(
    cloneCount: scala.Double,
    container: reactLib.HTMLElement,
    hasControls: scala.Boolean,
    index: scala.Double,
    indexCached: scala.Double,
    items: scala.Double,
    slideBy: scala.Double,
    slideCount: scala.Double,
    slideCountNew: scala.Double,
    slideItems: stdLib.HTMLCollection,
    controlsContainer: js.UndefOr[scala.Boolean] = js.undefined,
    navContainer: reactLib.HTMLElement = null,
    navCurrentIndex: scala.Int | scala.Double = null,
    navCurrentIndexCached: scala.Int | scala.Double = null,
    navItems: stdLib.HTMLCollection = null,
    nextButton: reactLib.HTMLElement = null,
    prevButton: reactLib.HTMLElement = null,
    visibleNavIndexes: scala.Int | scala.Double = null,
    visibleNavIndexesCached: scala.Int | scala.Double = null
  ): TinySliderInfo = {
    val __obj = js.Dynamic.literal(cloneCount = cloneCount, container = container, hasControls = hasControls, index = index, indexCached = indexCached, items = items, slideBy = slideBy, slideCount = slideCount, slideCountNew = slideCountNew, slideItems = slideItems)
    if (!js.isUndefined(controlsContainer)) __obj.updateDynamic("controlsContainer")(controlsContainer)
    if (navContainer != null) __obj.updateDynamic("navContainer")(navContainer)
    if (navCurrentIndex != null) __obj.updateDynamic("navCurrentIndex")(navCurrentIndex.asInstanceOf[js.Any])
    if (navCurrentIndexCached != null) __obj.updateDynamic("navCurrentIndexCached")(navCurrentIndexCached.asInstanceOf[js.Any])
    if (navItems != null) __obj.updateDynamic("navItems")(navItems)
    if (nextButton != null) __obj.updateDynamic("nextButton")(nextButton)
    if (prevButton != null) __obj.updateDynamic("prevButton")(prevButton)
    if (visibleNavIndexes != null) __obj.updateDynamic("visibleNavIndexes")(visibleNavIndexes.asInstanceOf[js.Any])
    if (visibleNavIndexesCached != null) __obj.updateDynamic("visibleNavIndexesCached")(visibleNavIndexesCached.asInstanceOf[js.Any])
    __obj.asInstanceOf[TinySliderInfo]
  }
}

