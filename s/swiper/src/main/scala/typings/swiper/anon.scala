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
    
    inline def apply(currentX: Double, currentY: Double, diff: Double, startX: Double, startY: Double): CurrentX = {
      val __obj = js.Dynamic.literal(currentX = currentX.asInstanceOf[js.Any], currentY = currentY.asInstanceOf[js.Any], diff = diff.asInstanceOf[js.Any], startX = startX.asInstanceOf[js.Any], startY = startY.asInstanceOf[js.Any])
      __obj.asInstanceOf[CurrentX]
    }
    
    extension [Self <: CurrentX](x: Self) {
      
      inline def setCurrentX(value: Double): Self = StObject.set(x, "currentX", value.asInstanceOf[js.Any])
      
      inline def setCurrentY(value: Double): Self = StObject.set(x, "currentY", value.asInstanceOf[js.Any])
      
      inline def setDiff(value: Double): Self = StObject.set(x, "diff", value.asInstanceOf[js.Any])
      
      inline def setStartX(value: Double): Self = StObject.set(x, "startX", value.asInstanceOf[js.Any])
      
      inline def setStartY(value: Double): Self = StObject.set(x, "startY", value.asInstanceOf[js.Any])
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
    
    inline def apply(): keyinSwiperEventvoid = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[keyinSwiperEventvoid]
    }
    
    extension [Self <: keyinSwiperEventvoid](x: Self) {
      
      inline def setAutoplay(value: () => Unit): Self = StObject.set(x, "autoplay", js.Any.fromFunction0(value))
      
      inline def setAutoplayStart(value: () => Unit): Self = StObject.set(x, "autoplayStart", js.Any.fromFunction0(value))
      
      inline def setAutoplayStartUndefined: Self = StObject.set(x, "autoplayStart", js.undefined)
      
      inline def setAutoplayStop(value: () => Unit): Self = StObject.set(x, "autoplayStop", js.Any.fromFunction0(value))
      
      inline def setAutoplayStopUndefined: Self = StObject.set(x, "autoplayStop", js.undefined)
      
      inline def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
      
      inline def setBeforeDestroy(value: () => Unit): Self = StObject.set(x, "beforeDestroy", js.Any.fromFunction0(value))
      
      inline def setBeforeDestroyUndefined: Self = StObject.set(x, "beforeDestroy", js.undefined)
      
      inline def setBeforeLoopFix(value: () => Unit): Self = StObject.set(x, "beforeLoopFix", js.Any.fromFunction0(value))
      
      inline def setBeforeLoopFixUndefined: Self = StObject.set(x, "beforeLoopFix", js.undefined)
      
      inline def setClick(value: () => Unit): Self = StObject.set(x, "click", js.Any.fromFunction0(value))
      
      inline def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
      
      inline def setDoubleTap(value: () => Unit): Self = StObject.set(x, "doubleTap", js.Any.fromFunction0(value))
      
      inline def setDoubleTapUndefined: Self = StObject.set(x, "doubleTap", js.undefined)
      
      inline def setFromEdge(value: () => Unit): Self = StObject.set(x, "fromEdge", js.Any.fromFunction0(value))
      
      inline def setFromEdgeUndefined: Self = StObject.set(x, "fromEdge", js.undefined)
      
      inline def setHashChange(value: () => Unit): Self = StObject.set(x, "hashChange", js.Any.fromFunction0(value))
      
      inline def setHashChangeUndefined: Self = StObject.set(x, "hashChange", js.undefined)
      
      inline def setHashSet(value: () => Unit): Self = StObject.set(x, "hashSet", js.Any.fromFunction0(value))
      
      inline def setHashSetUndefined: Self = StObject.set(x, "hashSet", js.undefined)
      
      inline def setImagesReady(value: () => Unit): Self = StObject.set(x, "imagesReady", js.Any.fromFunction0(value))
      
      inline def setImagesReadyUndefined: Self = StObject.set(x, "imagesReady", js.undefined)
      
      inline def setInit(value: () => Unit): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
      
      inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
      
      inline def setLazyImageLoad(value: () => Unit): Self = StObject.set(x, "lazyImageLoad", js.Any.fromFunction0(value))
      
      inline def setLazyImageLoadUndefined: Self = StObject.set(x, "lazyImageLoad", js.undefined)
      
      inline def setLazyImageReady(value: () => Unit): Self = StObject.set(x, "lazyImageReady", js.Any.fromFunction0(value))
      
      inline def setLazyImageReadyUndefined: Self = StObject.set(x, "lazyImageReady", js.undefined)
      
      inline def setLoopFix(value: () => Unit): Self = StObject.set(x, "loopFix", js.Any.fromFunction0(value))
      
      inline def setLoopFixUndefined: Self = StObject.set(x, "loopFix", js.undefined)
      
      inline def setObserverUpdate(value: () => Unit): Self = StObject.set(x, "observerUpdate", js.Any.fromFunction0(value))
      
      inline def setObserverUpdateUndefined: Self = StObject.set(x, "observerUpdate", js.undefined)
      
      inline def setPaginationRender(value: () => Unit): Self = StObject.set(x, "paginationRender", js.Any.fromFunction0(value))
      
      inline def setPaginationRenderUndefined: Self = StObject.set(x, "paginationRender", js.undefined)
      
      inline def setPaginationUpdate(value: () => Unit): Self = StObject.set(x, "paginationUpdate", js.Any.fromFunction0(value))
      
      inline def setPaginationUpdateUndefined: Self = StObject.set(x, "paginationUpdate", js.undefined)
      
      inline def setProgress(value: () => Unit): Self = StObject.set(x, "progress", js.Any.fromFunction0(value))
      
      inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
      
      inline def setReachBeginning(value: () => Unit): Self = StObject.set(x, "reachBeginning", js.Any.fromFunction0(value))
      
      inline def setReachBeginningUndefined: Self = StObject.set(x, "reachBeginning", js.undefined)
      
      inline def setReachEnd(value: () => Unit): Self = StObject.set(x, "reachEnd", js.Any.fromFunction0(value))
      
      inline def setReachEndUndefined: Self = StObject.set(x, "reachEnd", js.undefined)
      
      inline def setResize(value: () => Unit): Self = StObject.set(x, "resize", js.Any.fromFunction0(value))
      
      inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
      
      inline def setSetTransition(value: () => Unit): Self = StObject.set(x, "setTransition", js.Any.fromFunction0(value))
      
      inline def setSetTransitionUndefined: Self = StObject.set(x, "setTransition", js.undefined)
      
      inline def setSetTranslate(value: () => Unit): Self = StObject.set(x, "setTranslate", js.Any.fromFunction0(value))
      
      inline def setSetTranslateUndefined: Self = StObject.set(x, "setTranslate", js.undefined)
      
      inline def setSlideChange(value: () => Unit): Self = StObject.set(x, "slideChange", js.Any.fromFunction0(value))
      
      inline def setSlideChangeTransitionEnd(value: () => Unit): Self = StObject.set(x, "slideChangeTransitionEnd", js.Any.fromFunction0(value))
      
      inline def setSlideChangeTransitionEndUndefined: Self = StObject.set(x, "slideChangeTransitionEnd", js.undefined)
      
      inline def setSlideChangeTransitionStart(value: () => Unit): Self = StObject.set(x, "slideChangeTransitionStart", js.Any.fromFunction0(value))
      
      inline def setSlideChangeTransitionStartUndefined: Self = StObject.set(x, "slideChangeTransitionStart", js.undefined)
      
      inline def setSlideChangeUndefined: Self = StObject.set(x, "slideChange", js.undefined)
      
      inline def setSlideNextTransitionEnd(value: () => Unit): Self = StObject.set(x, "slideNextTransitionEnd", js.Any.fromFunction0(value))
      
      inline def setSlideNextTransitionEndUndefined: Self = StObject.set(x, "slideNextTransitionEnd", js.undefined)
      
      inline def setSlideNextTransitionStart(value: () => Unit): Self = StObject.set(x, "slideNextTransitionStart", js.Any.fromFunction0(value))
      
      inline def setSlideNextTransitionStartUndefined: Self = StObject.set(x, "slideNextTransitionStart", js.undefined)
      
      inline def setSlidePrevTransitionEnd(value: () => Unit): Self = StObject.set(x, "slidePrevTransitionEnd", js.Any.fromFunction0(value))
      
      inline def setSlidePrevTransitionEndUndefined: Self = StObject.set(x, "slidePrevTransitionEnd", js.undefined)
      
      inline def setSlidePrevTransitionStart(value: () => Unit): Self = StObject.set(x, "slidePrevTransitionStart", js.Any.fromFunction0(value))
      
      inline def setSlidePrevTransitionStartUndefined: Self = StObject.set(x, "slidePrevTransitionStart", js.undefined)
      
      inline def setSliderMove(value: () => Unit): Self = StObject.set(x, "sliderMove", js.Any.fromFunction0(value))
      
      inline def setSliderMoveUndefined: Self = StObject.set(x, "sliderMove", js.undefined)
      
      inline def setTap(value: () => Unit): Self = StObject.set(x, "tap", js.Any.fromFunction0(value))
      
      inline def setTapUndefined: Self = StObject.set(x, "tap", js.undefined)
      
      inline def setTouchEnd(value: () => Unit): Self = StObject.set(x, "touchEnd", js.Any.fromFunction0(value))
      
      inline def setTouchEndUndefined: Self = StObject.set(x, "touchEnd", js.undefined)
      
      inline def setTouchMove(value: () => Unit): Self = StObject.set(x, "touchMove", js.Any.fromFunction0(value))
      
      inline def setTouchMoveOpposite(value: () => Unit): Self = StObject.set(x, "touchMoveOpposite", js.Any.fromFunction0(value))
      
      inline def setTouchMoveOppositeUndefined: Self = StObject.set(x, "touchMoveOpposite", js.undefined)
      
      inline def setTouchMoveUndefined: Self = StObject.set(x, "touchMove", js.undefined)
      
      inline def setTouchStart(value: () => Unit): Self = StObject.set(x, "touchStart", js.Any.fromFunction0(value))
      
      inline def setTouchStartUndefined: Self = StObject.set(x, "touchStart", js.undefined)
      
      inline def setTransitionEnd(value: () => Unit): Self = StObject.set(x, "transitionEnd", js.Any.fromFunction0(value))
      
      inline def setTransitionEndUndefined: Self = StObject.set(x, "transitionEnd", js.undefined)
      
      inline def setTransitionStart(value: () => Unit): Self = StObject.set(x, "transitionStart", js.Any.fromFunction0(value))
      
      inline def setTransitionStartUndefined: Self = StObject.set(x, "transitionStart", js.undefined)
    }
  }
}
