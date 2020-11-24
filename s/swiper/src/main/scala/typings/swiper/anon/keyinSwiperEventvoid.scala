package typings.swiper.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ key in swiper.swiper.SwiperEvent ]:? (): void} */
@js.native
trait keyinSwiperEventvoid extends js.Object {
  
  var autoplay: js.UndefOr[js.Function0[Unit]] = js.native
  
  var autoplayStart: js.UndefOr[js.Function0[Unit]] = js.native
  
  var autoplayStop: js.UndefOr[js.Function0[Unit]] = js.native
  
  var beforeDestroy: js.UndefOr[js.Function0[Unit]] = js.native
  
  var beforeLoopFix: js.UndefOr[js.Function0[Unit]] = js.native
  
  var click: js.UndefOr[js.Function0[Unit]] = js.native
  
  var doubleTap: js.UndefOr[js.Function0[Unit]] = js.native
  
  var fromEdge: js.UndefOr[js.Function0[Unit]] = js.native
  
  var hashChange: js.UndefOr[js.Function0[Unit]] = js.native
  
  var hashSet: js.UndefOr[js.Function0[Unit]] = js.native
  
  var imagesReady: js.UndefOr[js.Function0[Unit]] = js.native
  
  var init: js.UndefOr[js.Function0[Unit]] = js.native
  
  var lazyImageLoad: js.UndefOr[js.Function0[Unit]] = js.native
  
  var lazyImageReady: js.UndefOr[js.Function0[Unit]] = js.native
  
  var loopFix: js.UndefOr[js.Function0[Unit]] = js.native
  
  var observerUpdate: js.UndefOr[js.Function0[Unit]] = js.native
  
  var paginationRender: js.UndefOr[js.Function0[Unit]] = js.native
  
  var paginationUpdate: js.UndefOr[js.Function0[Unit]] = js.native
  
  var progress: js.UndefOr[js.Function0[Unit]] = js.native
  
  var reachBeginning: js.UndefOr[js.Function0[Unit]] = js.native
  
  var reachEnd: js.UndefOr[js.Function0[Unit]] = js.native
  
  var resize: js.UndefOr[js.Function0[Unit]] = js.native
  
  var setTransition: js.UndefOr[js.Function0[Unit]] = js.native
  
  var setTranslate: js.UndefOr[js.Function0[Unit]] = js.native
  
  var slideChange: js.UndefOr[js.Function0[Unit]] = js.native
  
  var slideChangeTransitionEnd: js.UndefOr[js.Function0[Unit]] = js.native
  
  var slideChangeTransitionStart: js.UndefOr[js.Function0[Unit]] = js.native
  
  var slideNextTransitionEnd: js.UndefOr[js.Function0[Unit]] = js.native
  
  var slideNextTransitionStart: js.UndefOr[js.Function0[Unit]] = js.native
  
  var slidePrevTransitionEnd: js.UndefOr[js.Function0[Unit]] = js.native
  
  var slidePrevTransitionStart: js.UndefOr[js.Function0[Unit]] = js.native
  
  var sliderMove: js.UndefOr[js.Function0[Unit]] = js.native
  
  var tap: js.UndefOr[js.Function0[Unit]] = js.native
  
  var touchEnd: js.UndefOr[js.Function0[Unit]] = js.native
  
  var touchMove: js.UndefOr[js.Function0[Unit]] = js.native
  
  var touchMoveOpposite: js.UndefOr[js.Function0[Unit]] = js.native
  
  var touchStart: js.UndefOr[js.Function0[Unit]] = js.native
  
  var transitionEnd: js.UndefOr[js.Function0[Unit]] = js.native
  
  var transitionStart: js.UndefOr[js.Function0[Unit]] = js.native
}
object keyinSwiperEventvoid {
  
  @scala.inline
  def apply(): keyinSwiperEventvoid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[keyinSwiperEventvoid]
  }
  
  @scala.inline
  implicit class keyinSwiperEventvoidOps[Self <: keyinSwiperEventvoid] (val x: Self) extends AnyVal {
    
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
    def setAutoplay(value: () => Unit): Self = this.set("autoplay", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteAutoplay: Self = this.set("autoplay", js.undefined)
    
    @scala.inline
    def setAutoplayStart(value: () => Unit): Self = this.set("autoplayStart", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteAutoplayStart: Self = this.set("autoplayStart", js.undefined)
    
    @scala.inline
    def setAutoplayStop(value: () => Unit): Self = this.set("autoplayStop", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteAutoplayStop: Self = this.set("autoplayStop", js.undefined)
    
    @scala.inline
    def setBeforeDestroy(value: () => Unit): Self = this.set("beforeDestroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteBeforeDestroy: Self = this.set("beforeDestroy", js.undefined)
    
    @scala.inline
    def setBeforeLoopFix(value: () => Unit): Self = this.set("beforeLoopFix", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteBeforeLoopFix: Self = this.set("beforeLoopFix", js.undefined)
    
    @scala.inline
    def setClick(value: () => Unit): Self = this.set("click", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteClick: Self = this.set("click", js.undefined)
    
    @scala.inline
    def setDoubleTap(value: () => Unit): Self = this.set("doubleTap", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteDoubleTap: Self = this.set("doubleTap", js.undefined)
    
    @scala.inline
    def setFromEdge(value: () => Unit): Self = this.set("fromEdge", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteFromEdge: Self = this.set("fromEdge", js.undefined)
    
    @scala.inline
    def setHashChange(value: () => Unit): Self = this.set("hashChange", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteHashChange: Self = this.set("hashChange", js.undefined)
    
    @scala.inline
    def setHashSet(value: () => Unit): Self = this.set("hashSet", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteHashSet: Self = this.set("hashSet", js.undefined)
    
    @scala.inline
    def setImagesReady(value: () => Unit): Self = this.set("imagesReady", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteImagesReady: Self = this.set("imagesReady", js.undefined)
    
    @scala.inline
    def setInit(value: () => Unit): Self = this.set("init", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteInit: Self = this.set("init", js.undefined)
    
    @scala.inline
    def setLazyImageLoad(value: () => Unit): Self = this.set("lazyImageLoad", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteLazyImageLoad: Self = this.set("lazyImageLoad", js.undefined)
    
    @scala.inline
    def setLazyImageReady(value: () => Unit): Self = this.set("lazyImageReady", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteLazyImageReady: Self = this.set("lazyImageReady", js.undefined)
    
    @scala.inline
    def setLoopFix(value: () => Unit): Self = this.set("loopFix", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteLoopFix: Self = this.set("loopFix", js.undefined)
    
    @scala.inline
    def setObserverUpdate(value: () => Unit): Self = this.set("observerUpdate", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteObserverUpdate: Self = this.set("observerUpdate", js.undefined)
    
    @scala.inline
    def setPaginationRender(value: () => Unit): Self = this.set("paginationRender", js.Any.fromFunction0(value))
    
    @scala.inline
    def deletePaginationRender: Self = this.set("paginationRender", js.undefined)
    
    @scala.inline
    def setPaginationUpdate(value: () => Unit): Self = this.set("paginationUpdate", js.Any.fromFunction0(value))
    
    @scala.inline
    def deletePaginationUpdate: Self = this.set("paginationUpdate", js.undefined)
    
    @scala.inline
    def setProgress(value: () => Unit): Self = this.set("progress", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteProgress: Self = this.set("progress", js.undefined)
    
    @scala.inline
    def setReachBeginning(value: () => Unit): Self = this.set("reachBeginning", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteReachBeginning: Self = this.set("reachBeginning", js.undefined)
    
    @scala.inline
    def setReachEnd(value: () => Unit): Self = this.set("reachEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteReachEnd: Self = this.set("reachEnd", js.undefined)
    
    @scala.inline
    def setResize(value: () => Unit): Self = this.set("resize", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteResize: Self = this.set("resize", js.undefined)
    
    @scala.inline
    def setSetTransition(value: () => Unit): Self = this.set("setTransition", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteSetTransition: Self = this.set("setTransition", js.undefined)
    
    @scala.inline
    def setSetTranslate(value: () => Unit): Self = this.set("setTranslate", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteSetTranslate: Self = this.set("setTranslate", js.undefined)
    
    @scala.inline
    def setSlideChange(value: () => Unit): Self = this.set("slideChange", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteSlideChange: Self = this.set("slideChange", js.undefined)
    
    @scala.inline
    def setSlideChangeTransitionEnd(value: () => Unit): Self = this.set("slideChangeTransitionEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteSlideChangeTransitionEnd: Self = this.set("slideChangeTransitionEnd", js.undefined)
    
    @scala.inline
    def setSlideChangeTransitionStart(value: () => Unit): Self = this.set("slideChangeTransitionStart", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteSlideChangeTransitionStart: Self = this.set("slideChangeTransitionStart", js.undefined)
    
    @scala.inline
    def setSlideNextTransitionEnd(value: () => Unit): Self = this.set("slideNextTransitionEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteSlideNextTransitionEnd: Self = this.set("slideNextTransitionEnd", js.undefined)
    
    @scala.inline
    def setSlideNextTransitionStart(value: () => Unit): Self = this.set("slideNextTransitionStart", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteSlideNextTransitionStart: Self = this.set("slideNextTransitionStart", js.undefined)
    
    @scala.inline
    def setSlidePrevTransitionEnd(value: () => Unit): Self = this.set("slidePrevTransitionEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteSlidePrevTransitionEnd: Self = this.set("slidePrevTransitionEnd", js.undefined)
    
    @scala.inline
    def setSlidePrevTransitionStart(value: () => Unit): Self = this.set("slidePrevTransitionStart", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteSlidePrevTransitionStart: Self = this.set("slidePrevTransitionStart", js.undefined)
    
    @scala.inline
    def setSliderMove(value: () => Unit): Self = this.set("sliderMove", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteSliderMove: Self = this.set("sliderMove", js.undefined)
    
    @scala.inline
    def setTap(value: () => Unit): Self = this.set("tap", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteTap: Self = this.set("tap", js.undefined)
    
    @scala.inline
    def setTouchEnd(value: () => Unit): Self = this.set("touchEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteTouchEnd: Self = this.set("touchEnd", js.undefined)
    
    @scala.inline
    def setTouchMove(value: () => Unit): Self = this.set("touchMove", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteTouchMove: Self = this.set("touchMove", js.undefined)
    
    @scala.inline
    def setTouchMoveOpposite(value: () => Unit): Self = this.set("touchMoveOpposite", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteTouchMoveOpposite: Self = this.set("touchMoveOpposite", js.undefined)
    
    @scala.inline
    def setTouchStart(value: () => Unit): Self = this.set("touchStart", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteTouchStart: Self = this.set("touchStart", js.undefined)
    
    @scala.inline
    def setTransitionEnd(value: () => Unit): Self = this.set("transitionEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteTransitionEnd: Self = this.set("transitionEnd", js.undefined)
    
    @scala.inline
    def setTransitionStart(value: () => Unit): Self = this.set("transitionStart", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteTransitionStart: Self = this.set("transitionStart", js.undefined)
  }
}
