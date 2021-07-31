package typings.swiper

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CurrentX extends StObject {
    
    var currentX: Double
    
    var currentY: Double
    
    var diff: Double
    
    var startX: Double
    
    var startY: Double
  }
  object CurrentX {
    
    @scala.inline
    def apply(currentX: Double, currentY: Double, diff: Double, startX: Double, startY: Double): CurrentX = {
      val __obj = js.Dynamic.literal(currentX = currentX.asInstanceOf[js.Any], currentY = currentY.asInstanceOf[js.Any], diff = diff.asInstanceOf[js.Any], startX = startX.asInstanceOf[js.Any], startY = startY.asInstanceOf[js.Any])
      __obj.asInstanceOf[CurrentX]
    }
    
    @scala.inline
    implicit class CurrentXMutableBuilder[Self <: CurrentX] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrentX(value: Double): Self = StObject.set(x, "currentX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentY(value: Double): Self = StObject.set(x, "currentY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiff(value: Double): Self = StObject.set(x, "diff", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartX(value: Double): Self = StObject.set(x, "startX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartY(value: Double): Self = StObject.set(x, "startY", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {[ key in swiper.swiper.SwiperEvent ]:? (): void} */
  trait keyinSwiperEventvoid extends StObject {
    
    var autoplay: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var autoplayStart: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var autoplayStop: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var beforeDestroy: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var beforeLoopFix: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var click: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var doubleTap: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var fromEdge: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var hashChange: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var hashSet: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var imagesReady: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var init: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var lazyImageLoad: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var lazyImageReady: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var loopFix: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var observerUpdate: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var paginationRender: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var paginationUpdate: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var progress: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var reachBeginning: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var reachEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var resize: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var setTransition: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var setTranslate: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var slideChange: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var slideChangeTransitionEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var slideChangeTransitionStart: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var slideNextTransitionEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var slideNextTransitionStart: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var slidePrevTransitionEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var slidePrevTransitionStart: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var sliderMove: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var tap: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var touchEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var touchMove: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var touchMoveOpposite: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var touchStart: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var transitionEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var transitionStart: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object keyinSwiperEventvoid {
    
    @scala.inline
    def apply(): keyinSwiperEventvoid = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[keyinSwiperEventvoid]
    }
    
    @scala.inline
    implicit class keyinSwiperEventvoidMutableBuilder[Self <: keyinSwiperEventvoid] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoplay(value: () => Unit): Self = StObject.set(x, "autoplay", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAutoplayStart(value: () => Unit): Self = StObject.set(x, "autoplayStart", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAutoplayStartUndefined: Self = StObject.set(x, "autoplayStart", js.undefined)
      
      @scala.inline
      def setAutoplayStop(value: () => Unit): Self = StObject.set(x, "autoplayStop", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAutoplayStopUndefined: Self = StObject.set(x, "autoplayStop", js.undefined)
      
      @scala.inline
      def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
      
      @scala.inline
      def setBeforeDestroy(value: () => Unit): Self = StObject.set(x, "beforeDestroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setBeforeDestroyUndefined: Self = StObject.set(x, "beforeDestroy", js.undefined)
      
      @scala.inline
      def setBeforeLoopFix(value: () => Unit): Self = StObject.set(x, "beforeLoopFix", js.Any.fromFunction0(value))
      
      @scala.inline
      def setBeforeLoopFixUndefined: Self = StObject.set(x, "beforeLoopFix", js.undefined)
      
      @scala.inline
      def setClick(value: () => Unit): Self = StObject.set(x, "click", js.Any.fromFunction0(value))
      
      @scala.inline
      def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
      
      @scala.inline
      def setDoubleTap(value: () => Unit): Self = StObject.set(x, "doubleTap", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDoubleTapUndefined: Self = StObject.set(x, "doubleTap", js.undefined)
      
      @scala.inline
      def setFromEdge(value: () => Unit): Self = StObject.set(x, "fromEdge", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFromEdgeUndefined: Self = StObject.set(x, "fromEdge", js.undefined)
      
      @scala.inline
      def setHashChange(value: () => Unit): Self = StObject.set(x, "hashChange", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHashChangeUndefined: Self = StObject.set(x, "hashChange", js.undefined)
      
      @scala.inline
      def setHashSet(value: () => Unit): Self = StObject.set(x, "hashSet", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHashSetUndefined: Self = StObject.set(x, "hashSet", js.undefined)
      
      @scala.inline
      def setImagesReady(value: () => Unit): Self = StObject.set(x, "imagesReady", js.Any.fromFunction0(value))
      
      @scala.inline
      def setImagesReadyUndefined: Self = StObject.set(x, "imagesReady", js.undefined)
      
      @scala.inline
      def setInit(value: () => Unit): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
      
      @scala.inline
      def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
      
      @scala.inline
      def setLazyImageLoad(value: () => Unit): Self = StObject.set(x, "lazyImageLoad", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLazyImageLoadUndefined: Self = StObject.set(x, "lazyImageLoad", js.undefined)
      
      @scala.inline
      def setLazyImageReady(value: () => Unit): Self = StObject.set(x, "lazyImageReady", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLazyImageReadyUndefined: Self = StObject.set(x, "lazyImageReady", js.undefined)
      
      @scala.inline
      def setLoopFix(value: () => Unit): Self = StObject.set(x, "loopFix", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLoopFixUndefined: Self = StObject.set(x, "loopFix", js.undefined)
      
      @scala.inline
      def setObserverUpdate(value: () => Unit): Self = StObject.set(x, "observerUpdate", js.Any.fromFunction0(value))
      
      @scala.inline
      def setObserverUpdateUndefined: Self = StObject.set(x, "observerUpdate", js.undefined)
      
      @scala.inline
      def setPaginationRender(value: () => Unit): Self = StObject.set(x, "paginationRender", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPaginationRenderUndefined: Self = StObject.set(x, "paginationRender", js.undefined)
      
      @scala.inline
      def setPaginationUpdate(value: () => Unit): Self = StObject.set(x, "paginationUpdate", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPaginationUpdateUndefined: Self = StObject.set(x, "paginationUpdate", js.undefined)
      
      @scala.inline
      def setProgress(value: () => Unit): Self = StObject.set(x, "progress", js.Any.fromFunction0(value))
      
      @scala.inline
      def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
      
      @scala.inline
      def setReachBeginning(value: () => Unit): Self = StObject.set(x, "reachBeginning", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReachBeginningUndefined: Self = StObject.set(x, "reachBeginning", js.undefined)
      
      @scala.inline
      def setReachEnd(value: () => Unit): Self = StObject.set(x, "reachEnd", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReachEndUndefined: Self = StObject.set(x, "reachEnd", js.undefined)
      
      @scala.inline
      def setResize(value: () => Unit): Self = StObject.set(x, "resize", js.Any.fromFunction0(value))
      
      @scala.inline
      def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
      
      @scala.inline
      def setSetTransition(value: () => Unit): Self = StObject.set(x, "setTransition", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetTransitionUndefined: Self = StObject.set(x, "setTransition", js.undefined)
      
      @scala.inline
      def setSetTranslate(value: () => Unit): Self = StObject.set(x, "setTranslate", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetTranslateUndefined: Self = StObject.set(x, "setTranslate", js.undefined)
      
      @scala.inline
      def setSlideChange(value: () => Unit): Self = StObject.set(x, "slideChange", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSlideChangeTransitionEnd(value: () => Unit): Self = StObject.set(x, "slideChangeTransitionEnd", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSlideChangeTransitionEndUndefined: Self = StObject.set(x, "slideChangeTransitionEnd", js.undefined)
      
      @scala.inline
      def setSlideChangeTransitionStart(value: () => Unit): Self = StObject.set(x, "slideChangeTransitionStart", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSlideChangeTransitionStartUndefined: Self = StObject.set(x, "slideChangeTransitionStart", js.undefined)
      
      @scala.inline
      def setSlideChangeUndefined: Self = StObject.set(x, "slideChange", js.undefined)
      
      @scala.inline
      def setSlideNextTransitionEnd(value: () => Unit): Self = StObject.set(x, "slideNextTransitionEnd", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSlideNextTransitionEndUndefined: Self = StObject.set(x, "slideNextTransitionEnd", js.undefined)
      
      @scala.inline
      def setSlideNextTransitionStart(value: () => Unit): Self = StObject.set(x, "slideNextTransitionStart", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSlideNextTransitionStartUndefined: Self = StObject.set(x, "slideNextTransitionStart", js.undefined)
      
      @scala.inline
      def setSlidePrevTransitionEnd(value: () => Unit): Self = StObject.set(x, "slidePrevTransitionEnd", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSlidePrevTransitionEndUndefined: Self = StObject.set(x, "slidePrevTransitionEnd", js.undefined)
      
      @scala.inline
      def setSlidePrevTransitionStart(value: () => Unit): Self = StObject.set(x, "slidePrevTransitionStart", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSlidePrevTransitionStartUndefined: Self = StObject.set(x, "slidePrevTransitionStart", js.undefined)
      
      @scala.inline
      def setSliderMove(value: () => Unit): Self = StObject.set(x, "sliderMove", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSliderMoveUndefined: Self = StObject.set(x, "sliderMove", js.undefined)
      
      @scala.inline
      def setTap(value: () => Unit): Self = StObject.set(x, "tap", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTapUndefined: Self = StObject.set(x, "tap", js.undefined)
      
      @scala.inline
      def setTouchEnd(value: () => Unit): Self = StObject.set(x, "touchEnd", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTouchEndUndefined: Self = StObject.set(x, "touchEnd", js.undefined)
      
      @scala.inline
      def setTouchMove(value: () => Unit): Self = StObject.set(x, "touchMove", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTouchMoveOpposite(value: () => Unit): Self = StObject.set(x, "touchMoveOpposite", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTouchMoveOppositeUndefined: Self = StObject.set(x, "touchMoveOpposite", js.undefined)
      
      @scala.inline
      def setTouchMoveUndefined: Self = StObject.set(x, "touchMove", js.undefined)
      
      @scala.inline
      def setTouchStart(value: () => Unit): Self = StObject.set(x, "touchStart", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTouchStartUndefined: Self = StObject.set(x, "touchStart", js.undefined)
      
      @scala.inline
      def setTransitionEnd(value: () => Unit): Self = StObject.set(x, "transitionEnd", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTransitionEndUndefined: Self = StObject.set(x, "transitionEnd", js.undefined)
      
      @scala.inline
      def setTransitionStart(value: () => Unit): Self = StObject.set(x, "transitionStart", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTransitionStartUndefined: Self = StObject.set(x, "transitionStart", js.undefined)
    }
  }
}
