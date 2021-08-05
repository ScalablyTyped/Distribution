package typings.swiper

import typings.swiper.mod.AutoplayEvent
import typings.swiper.mod.CommonEvent
import typings.swiper.mod.HashNavigationEvent
import typings.swiper.mod.LazyLoadingEvent
import typings.swiper.mod.PaginationEvent
import typings.swiper.mod.SwiperEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object swiperStrings {
  
  @js.native
  sealed trait auto extends StObject
  inline def auto: auto = "auto".asInstanceOf[auto]
  
  @js.native
  sealed trait autoplay
    extends StObject
       with AutoplayEvent
       with SwiperEvent
  inline def autoplay: autoplay = "autoplay".asInstanceOf[autoplay]
  
  @js.native
  sealed trait autoplayStart
    extends StObject
       with AutoplayEvent
       with SwiperEvent
  inline def autoplayStart: autoplayStart = "autoplayStart".asInstanceOf[autoplayStart]
  
  @js.native
  sealed trait autoplayStop
    extends StObject
       with AutoplayEvent
       with SwiperEvent
  inline def autoplayStop: autoplayStop = "autoplayStop".asInstanceOf[autoplayStop]
  
  @js.native
  sealed trait beforeDestroy
    extends StObject
       with CommonEvent
       with SwiperEvent
  inline def beforeDestroy: beforeDestroy = "beforeDestroy".asInstanceOf[beforeDestroy]
  
  @js.native
  sealed trait beforeLoopFix
    extends StObject
       with CommonEvent
       with SwiperEvent
  inline def beforeLoopFix: beforeLoopFix = "beforeLoopFix".asInstanceOf[beforeLoopFix]
  
  @js.native
  sealed trait bullets extends StObject
  inline def bullets: bullets = "bullets".asInstanceOf[bullets]
  
  @js.native
  sealed trait click
    extends StObject
       with CommonEvent
       with SwiperEvent
  inline def click: click = "click".asInstanceOf[click]
  
  @js.native
  sealed trait column extends StObject
  inline def column: column = "column".asInstanceOf[column]
  
  @js.native
  sealed trait container extends StObject
  inline def container: container = "container".asInstanceOf[container]
  
  @js.native
  sealed trait coverflow extends StObject
  inline def coverflow: coverflow = "coverflow".asInstanceOf[coverflow]
  
  @js.native
  sealed trait cube extends StObject
  inline def cube: cube = "cube".asInstanceOf[cube]
  
  @js.native
  sealed trait custom extends StObject
  inline def custom: custom = "custom".asInstanceOf[custom]
  
  @js.native
  sealed trait doubleTap
    extends StObject
       with CommonEvent
       with SwiperEvent
  inline def doubleTap: doubleTap = "doubleTap".asInstanceOf[doubleTap]
  
  @js.native
  sealed trait fade extends StObject
  inline def fade: fade = "fade".asInstanceOf[fade]
  
  @js.native
  sealed trait flip extends StObject
  inline def flip: flip = "flip".asInstanceOf[flip]
  
  @js.native
  sealed trait fraction extends StObject
  inline def fraction: fraction = "fraction".asInstanceOf[fraction]
  
  @js.native
  sealed trait fromEdge
    extends StObject
       with CommonEvent
       with SwiperEvent
  inline def fromEdge: fromEdge = "fromEdge".asInstanceOf[fromEdge]
  
  @js.native
  sealed trait hashChange
    extends StObject
       with HashNavigationEvent
       with SwiperEvent
  inline def hashChange: hashChange = "hashChange".asInstanceOf[hashChange]
  
  @js.native
  sealed trait hashSet
    extends StObject
       with HashNavigationEvent
       with SwiperEvent
  inline def hashSet: hashSet = "hashSet".asInstanceOf[hashSet]
  
  @js.native
  sealed trait horizontal extends StObject
  inline def horizontal: horizontal = "horizontal".asInstanceOf[horizontal]
  
  @js.native
  sealed trait imagesReady
    extends StObject
       with CommonEvent
       with SwiperEvent
  inline def imagesReady: imagesReady = "imagesReady".asInstanceOf[imagesReady]
  
  @js.native
  sealed trait init
    extends StObject
       with CommonEvent
       with SwiperEvent
  inline def init: init = "init".asInstanceOf[init]
  
  @js.native
  sealed trait lazyImageLoad
    extends StObject
       with LazyLoadingEvent
       with SwiperEvent
  inline def lazyImageLoad: lazyImageLoad = "lazyImageLoad".asInstanceOf[lazyImageLoad]
  
  @js.native
  sealed trait lazyImageReady
    extends StObject
       with LazyLoadingEvent
       with SwiperEvent
  inline def lazyImageReady: lazyImageReady = "lazyImageReady".asInstanceOf[lazyImageReady]
  
  @js.native
  sealed trait loopFix
    extends StObject
       with CommonEvent
       with SwiperEvent
  inline def loopFix: loopFix = "loopFix".asInstanceOf[loopFix]
  
  @js.native
  sealed trait observerUpdate
    extends StObject
       with CommonEvent
       with SwiperEvent
  inline def observerUpdate: observerUpdate = "observerUpdate".asInstanceOf[observerUpdate]
  
  @js.native
  sealed trait paginationRender
    extends StObject
       with PaginationEvent
       with SwiperEvent
  inline def paginationRender: paginationRender = "paginationRender".asInstanceOf[paginationRender]
  
  @js.native
  sealed trait paginationUpdate
    extends StObject
       with PaginationEvent
       with SwiperEvent
  inline def paginationUpdate: paginationUpdate = "paginationUpdate".asInstanceOf[paginationUpdate]
  
  @js.native
  sealed trait progress
    extends StObject
       with CommonEvent
       with SwiperEvent
  inline def progress: progress = "progress".asInstanceOf[progress]
  
  @js.native
  sealed trait progressbar extends StObject
  inline def progressbar: progressbar = "progressbar".asInstanceOf[progressbar]
  
  @js.native
  sealed trait reachBeginning
    extends StObject
       with CommonEvent
       with SwiperEvent
  inline def reachBeginning: reachBeginning = "reachBeginning".asInstanceOf[reachBeginning]
  
  @js.native
  sealed trait reachEnd
    extends StObject
       with CommonEvent
       with SwiperEvent
  inline def reachEnd: reachEnd = "reachEnd".asInstanceOf[reachEnd]
  
  @js.native
  sealed trait resize
    extends StObject
       with CommonEvent
       with SwiperEvent
  inline def resize: resize = "resize".asInstanceOf[resize]
  
  @js.native
  sealed trait row extends StObject
  inline def row: row = "row".asInstanceOf[row]
  
  @js.native
  sealed trait setTransition
    extends StObject
       with CommonEvent
       with SwiperEvent
  inline def setTransition: setTransition = "setTransition".asInstanceOf[setTransition]
  
  @js.native
  sealed trait setTranslate
    extends StObject
       with CommonEvent
       with SwiperEvent
  inline def setTranslate: setTranslate = "setTranslate".asInstanceOf[setTranslate]
  
  @js.native
  sealed trait slide extends StObject
  inline def slide: slide = "slide".asInstanceOf[slide]
  
  @js.native
  sealed trait slideChange
    extends StObject
       with CommonEvent
       with SwiperEvent
  inline def slideChange: slideChange = "slideChange".asInstanceOf[slideChange]
  
  @js.native
  sealed trait slideChangeTransitionEnd
    extends StObject
       with CommonEvent
       with SwiperEvent
  inline def slideChangeTransitionEnd: slideChangeTransitionEnd = "slideChangeTransitionEnd".asInstanceOf[slideChangeTransitionEnd]
  
  @js.native
  sealed trait slideChangeTransitionStart
    extends StObject
       with CommonEvent
       with SwiperEvent
  inline def slideChangeTransitionStart: slideChangeTransitionStart = "slideChangeTransitionStart".asInstanceOf[slideChangeTransitionStart]
  
  @js.native
  sealed trait slideNextTransitionEnd
    extends StObject
       with CommonEvent
       with SwiperEvent
  inline def slideNextTransitionEnd: slideNextTransitionEnd = "slideNextTransitionEnd".asInstanceOf[slideNextTransitionEnd]
  
  @js.native
  sealed trait slideNextTransitionStart
    extends StObject
       with CommonEvent
       with SwiperEvent
  inline def slideNextTransitionStart: slideNextTransitionStart = "slideNextTransitionStart".asInstanceOf[slideNextTransitionStart]
  
  @js.native
  sealed trait slidePrevTransitionEnd
    extends StObject
       with CommonEvent
       with SwiperEvent
  inline def slidePrevTransitionEnd: slidePrevTransitionEnd = "slidePrevTransitionEnd".asInstanceOf[slidePrevTransitionEnd]
  
  @js.native
  sealed trait slidePrevTransitionStart
    extends StObject
       with CommonEvent
       with SwiperEvent
  inline def slidePrevTransitionStart: slidePrevTransitionStart = "slidePrevTransitionStart".asInstanceOf[slidePrevTransitionStart]
  
  @js.native
  sealed trait sliderMove
    extends StObject
       with CommonEvent
       with SwiperEvent
  inline def sliderMove: sliderMove = "sliderMove".asInstanceOf[sliderMove]
  
  @js.native
  sealed trait tap
    extends StObject
       with CommonEvent
       with SwiperEvent
  inline def tap: tap = "tap".asInstanceOf[tap]
  
  @js.native
  sealed trait touchEnd
    extends StObject
       with CommonEvent
       with SwiperEvent
  inline def touchEnd: touchEnd = "touchEnd".asInstanceOf[touchEnd]
  
  @js.native
  sealed trait touchMove
    extends StObject
       with CommonEvent
       with SwiperEvent
  inline def touchMove: touchMove = "touchMove".asInstanceOf[touchMove]
  
  @js.native
  sealed trait touchMoveOpposite
    extends StObject
       with CommonEvent
       with SwiperEvent
  inline def touchMoveOpposite: touchMoveOpposite = "touchMoveOpposite".asInstanceOf[touchMoveOpposite]
  
  @js.native
  sealed trait touchStart
    extends StObject
       with CommonEvent
       with SwiperEvent
  inline def touchStart: touchStart = "touchStart".asInstanceOf[touchStart]
  
  @js.native
  sealed trait transitionEnd
    extends StObject
       with CommonEvent
       with SwiperEvent
  inline def transitionEnd: transitionEnd = "transitionEnd".asInstanceOf[transitionEnd]
  
  @js.native
  sealed trait transitionStart
    extends StObject
       with CommonEvent
       with SwiperEvent
  inline def transitionStart: transitionStart = "transitionStart".asInstanceOf[transitionStart]
  
  @js.native
  sealed trait vertical extends StObject
  inline def vertical: vertical = "vertical".asInstanceOf[vertical]
  
  @js.native
  sealed trait wrapper extends StObject
  inline def wrapper: wrapper = "wrapper".asInstanceOf[wrapper]
}
