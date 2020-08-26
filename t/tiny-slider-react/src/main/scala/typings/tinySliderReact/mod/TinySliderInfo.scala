package typings.tinySliderReact.mod

import typings.std.HTMLCollection
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TinySliderInfo extends js.Object {
  var cloneCount: Double = js.native
  var container: HTMLElement = js.native
  var controlsContainer: js.UndefOr[Boolean] = js.native
  var hasControls: Boolean = js.native
  var index: Double = js.native
  var indexCached: Double = js.native
  var items: Double = js.native
  var navContainer: js.UndefOr[HTMLElement] = js.native
  var navCurrentIndex: js.UndefOr[Double] = js.native
  var navCurrentIndexCached: js.UndefOr[Double] = js.native
  var navItems: js.UndefOr[HTMLCollection] = js.native
  var nextButton: js.UndefOr[HTMLElement] = js.native
  var prevButton: js.UndefOr[HTMLElement] = js.native
  var slideBy: Double = js.native
  var slideCount: Double = js.native
  var slideCountNew: Double = js.native
  var slideItems: HTMLCollection = js.native
  var visibleNavIndexes: js.UndefOr[Double] = js.native
  var visibleNavIndexesCached: js.UndefOr[Double] = js.native
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
    slideItems: HTMLCollection
  ): TinySliderInfo = {
    val __obj = js.Dynamic.literal(cloneCount = cloneCount.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], hasControls = hasControls.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], indexCached = indexCached.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], slideBy = slideBy.asInstanceOf[js.Any], slideCount = slideCount.asInstanceOf[js.Any], slideCountNew = slideCountNew.asInstanceOf[js.Any], slideItems = slideItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[TinySliderInfo]
  }
  @scala.inline
  implicit class TinySliderInfoOps[Self <: TinySliderInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCloneCount(value: Double): Self = this.set("cloneCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setContainer(value: HTMLElement): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def setHasControls(value: Boolean): Self = this.set("hasControls", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndexCached(value: Double): Self = this.set("indexCached", value.asInstanceOf[js.Any])
    @scala.inline
    def setItems(value: Double): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setSlideBy(value: Double): Self = this.set("slideBy", value.asInstanceOf[js.Any])
    @scala.inline
    def setSlideCount(value: Double): Self = this.set("slideCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setSlideCountNew(value: Double): Self = this.set("slideCountNew", value.asInstanceOf[js.Any])
    @scala.inline
    def setSlideItems(value: HTMLCollection): Self = this.set("slideItems", value.asInstanceOf[js.Any])
    @scala.inline
    def setControlsContainer(value: Boolean): Self = this.set("controlsContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteControlsContainer: Self = this.set("controlsContainer", js.undefined)
    @scala.inline
    def setNavContainer(value: HTMLElement): Self = this.set("navContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavContainer: Self = this.set("navContainer", js.undefined)
    @scala.inline
    def setNavCurrentIndex(value: Double): Self = this.set("navCurrentIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavCurrentIndex: Self = this.set("navCurrentIndex", js.undefined)
    @scala.inline
    def setNavCurrentIndexCached(value: Double): Self = this.set("navCurrentIndexCached", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavCurrentIndexCached: Self = this.set("navCurrentIndexCached", js.undefined)
    @scala.inline
    def setNavItems(value: HTMLCollection): Self = this.set("navItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavItems: Self = this.set("navItems", js.undefined)
    @scala.inline
    def setNextButton(value: HTMLElement): Self = this.set("nextButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextButton: Self = this.set("nextButton", js.undefined)
    @scala.inline
    def setPrevButton(value: HTMLElement): Self = this.set("prevButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrevButton: Self = this.set("prevButton", js.undefined)
    @scala.inline
    def setVisibleNavIndexes(value: Double): Self = this.set("visibleNavIndexes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisibleNavIndexes: Self = this.set("visibleNavIndexes", js.undefined)
    @scala.inline
    def setVisibleNavIndexesCached(value: Double): Self = this.set("visibleNavIndexesCached", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisibleNavIndexesCached: Self = this.set("visibleNavIndexesCached", js.undefined)
  }
  
}

